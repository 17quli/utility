#!/bin/bash 
#20201118:    initial creation by Quan Lian 
set -x 
cd `dirname $0` 
source_db=$1
source_tbl=$2
sqoop_tbl=sqoop_$(echo "$source_tbl"|awk -F. '{print tolower($NF)}')
target_db=$3
target_tbl=$4
cdc_col=$5
excluded_columns=$6
logfile=./log/${source_db}_${source_tbl}.log
exec> >(tee -a $logfile)
exec 2>&1

source ./env.sh
source ./func.sh
ts=`date +%Y%m%d%H%M%S%N`
dfmt="%Y-%m-%d %H:%M:%S------"

test $# -eq 5 ||test $# -eq 6|| error_exit "Wrong # of arguments! Type `basename $0` <source_db> <source_tbl> <target_db> <target_tbl> <change_capture_column> <excluded_columns>"


map_column_hive=""
if [ -n "$excluded_columns" ] 
then
	map_column_hive=$(echo "$excluded_columns"|awk -F, '{for (i=1;i<=NF;i++) gsub($i,$i"=String");print $0}')	
	map_column_hive="--map-column-hive $map_column_hive"
fi
#test -n "$6" && map_column_hive=$(echo "$excluded_columns"|awk -F, '{for (i=1;i<=NF;i++) gsub($i,$i"=String");print $0}')
nc_excluded=$(echo "$excluded_columns"|awk -F, '{print NF}')
source_db_conf=./conf/${source_db}.db
password_file="`pwd -P`/conf/${source_db}.pwd"
impala_conf=./conf/`basename ${0} .sh`.conf
impala_db_conf=./conf/${target_db}.db
stgdir=./stg
sql_insert=./stg/sql_insert_${target_tbl}_${ts}.sql

cleanup(){
rm -f "$sql_insert"
}

trap cleanup EXIT


test -r $source_db_conf || error_exit "$source_db_conf is not a valid configuration file"
test -r $impala_conf || error_exit "$impala_conf is not a valid configuration file"
test -r $impala_db_conf || error_exit "$impala_db_conf is not a valid configuration file"
test -r $password_file || error_exit "$password_file is not a valid password file"
password_file="file://$password_file"
test -d $stgdir || error_exit "$stgdir is not a valid directory"
bindir=${stgdir}/${source_tbl}_${ts}
source $source_db_conf
source $impala_conf
source $impala_db_conf

test -n "$mappers"  &&  test "$mappers" -eq "$mappers"  2>/dev/null || error_exit "variable mappers not defined or not a valid number in $source_db_conf"
test -n "$connect" || error_exit "connection string not defined in $source_db_conf"
test -n "$username" || error_exit "username not defined in $source_db_conf"
#test -n "$password" || error_exit "password not defined in $source_db_conf"
test -n "$target_dir" || error_exit "target_dir not defined in $impala_db_conf"
test -n "$object_run_table" || error_exit "object_run_table not defined in $impala_db_conf"

db_split=`echo $target_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
target_env=$1
target_name=$2

object_run_key=`./get_object_run_key.sh $target_env` || error_exit "failed to get_object_run_key:return_code=$?,object_run_key=$object_run_key"
test "$object_run_key" -eq "$object_run_key"  2>/dev/null || error_exit "object_run_key is not a valid number:object_run_key=$object_run_key"

#init object_run entry
now=`date +"%Y-%m-%d %H:%M:%S.%N"`
./run_sqlb.sh "upsert into ${target_db}.${object_run_table} (object_run_key,target_object_name,start_time,object_prg_name,status) values($object_run_key,'$target_tbl','$now','`basename ${0}`','running')"

step="show create target table"
impala-shell -B --quiet -i $impala_uri  -q "show create table ${target_db}.${target_tbl}" -k --ssl --ca_cert=${ca_cert}>$sql_insert

sed -i -n "/\"CREATE TABLE ${target_db}.${target_tbl}/,/\"$/{p}" $sql_insert 
sed -i -n '2,/^\x29/{p}' $sql_insert 
sed -i '/\x29$/d' $sql_insert
nc_target_tbl=$(cat $sql_insert|wc -l)

sed -i 's/^ */CAST(/g' $sql_insert
sed -i 's/  */ AS /g' $sql_insert
sed -i 's/\(,*$\)/)\1/g' $sql_insert
sed -i "s/^CAST(insert_object_run_key AS /CAST($object_run_key AS /g" $sql_insert
sed -i "s/^CAST(batch_key AS /CAST($object_run_key AS /g" $sql_insert
sed -i "s/^CAST(record_effective_timestamp AS .*$/NULL, /g" $sql_insert
sed -i "s/^CAST(record_expiry_timestamp AS .*$/NULL, /g" $sql_insert
sed -i "s/^CAST(checksum AS .*$/NULL, /g" $sql_insert
sed -i "s/^CAST(record_active_flag AS .*$/NULL, /g" $sql_insert
sed -i "s/^CAST(record_deleted_flag AS .*$/NULL, /g" $sql_insert
sed -i "s/^CAST(update_object_run_key AS .*$/NULL /g" $sql_insert

#sed -i -e '/^CAST(record_effective_timestamp AS /d' -e '/^CAST(record_expiry_timestamp AS /d' -e '/^CAST(checksum AS /d' -e '/^CAST(record_active_flag AS /d' -e '/^CAST(record_deleted_flag AS /d' -e '/^CAST(update_object_run_key AS /d' -e '/^CAST(insert_object_run_key AS /d' -e '/^CAST(batch_key AS /d' $sql_insert


test -s "$sql_insert" || error_exit "$target_tbl failed $step" status "'failed $step'"

if [ "$cdc_col" = "fullreplacement" ]
then
	insert_mode="OVERWRITE"
else
	insert_mode="INTO"
fi

sed -i "1s/^/INSERT $insert_mode ${target_db}.${target_tbl} SELECT /" $sql_insert
echo " FROM  ${target_db}.${sqoop_tbl} ">>$sql_insert



rc_pre=$(./run_sqlb.sh "select count(1) from ${target_db}.${target_tbl}")
rc_pre=${rc_pre:=0}

tbl_target_dir=$target_dir/$sqoop_tbl

step="sqoop import"
now=`date +"%Y-%m-%d %H:%M:%S.%N"`
info "$step starts $sqoop_tbl from $source_tbl" task1_start_time "'$now'"


if [ "$cdc_col" = "fullreplacement" ] || [ "$cdc_col" = "fullcomparison" ]
then
	#full load
	if [ -n "$excluded_columns" ]
        then
		sqoop import  -Dorg.apache.sqoop.splitter.allow_text_splitter=true -D mapred.child.java.opts="-Djava.security.egd=file:/dev/../dev/urandom" --connect "$connect" -m $mappers --table $source_tbl --username $username --password-file $password_file  --hive-import --hive-database $target_db --hive-table $sqoop_tbl --hive-overwrite --hive-delims-replacement ' ' --null-string '\\N' --null-non-string '\\N' --bindir=$bindir --delete-compile-dir --outdir "$stgdir" --target-dir $tbl_target_dir --delete-target-dir $(echo "$map_column_hive")  --optionally-enclosed-by '\"' --escaped-by \\ || error_exit "failed to sqoop import from ${source_db}.${source_tbl} to ${target_db}.${target_tbl}:return_code=$?" status "'failed $step'"
	else
		sqoop import  -Dorg.apache.sqoop.splitter.allow_text_splitter=true -D mapred.child.java.opts="-Djava.security.egd=file:/dev/../dev/urandom" --connect "$connect" -m $mappers --table $source_tbl --username $username --password-file $password_file  --hive-import --hive-database $target_db --hive-table $sqoop_tbl --hive-overwrite --hive-delims-replacement ' ' --null-string '\\N' --null-non-string '\\N' --bindir=$bindir --delete-compile-dir --outdir "$stgdir" --target-dir $tbl_target_dir --delete-target-dir $(echo "$map_column_hive") --optionally-enclosed-by '\"' --escaped-by \\ || error_exit "failed to sqoop import from ${source_db}.${source_tbl} to ${target_db}.${target_tbl}:return_code=$?" status "'failed $step'"
	fi
else
	#change extract
	#create hive table definition
	./run_sqlb.sh "drop table if exists ${target_db}.${sqoop_tbl} purge;"
	if [ -n "$excluded_columns" ]
	then
		sqoop create-hive-table  --connect "$connect" --table $source_tbl --username $username --password-file $password_file  --hive-database $target_db --hive-table $sqoop_tbl $(echo "$map_column_hive") || error_exit "failed to create sqoop table from ${source_db}.${source_tbl}:return_code=$?" status "'failed $step'"
	else
		sqoop create-hive-table  --connect "$connect" --table $source_tbl --username $username --password-file $password_file  --hive-database $target_db --hive-table $sqoop_tbl $(echo "$map_column_hive")|| error_exit "failed to create sqoop table from ${source_db}.${source_tbl}:return_code=$?" status "'failed $step'"
	fi
	
	sqoop_table_location=$(./run_sqlb.sh "invalidate metadata ${target_db}.${sqoop_tbl}; desc formatted ${target_db}.${sqoop_tbl}"|grep "^Location:"|awk '{print $2}')
	test -n "$sqoop_table_location" || error_exit "sqoop table ${source_db}.${source_tbl} hdfs location is empty" status "'failed $step'"
	#incremental load
	lv=$(./run_sqlb.sh "select from_timestamp(max($cdc_col),'yyyy-MM-dd HH:mm:ss.SSS') from ${target_db}.${target_tbl}")
	test -n "$lv"||error_exit "failed to fetch last value from ${target_db}.${target_tbl}:last_value=$lv" status "'failed $step'"
	test "$lv" = "NULL" && lv='1800-1-1 00:00:00'
	if [ -n "$excluded_columns" ]
        then
		sqoop import  -Dorg.apache.sqoop.splitter.allow_text_splitter=true -Dmapred.child.java.opts="-Djava.security.egd=file:/dev/./urandom" --connect "$connect" -m $mappers --table $source_tbl --username $username --password-file  $password_file  --null-string '\\N' --null-non-string '\\N' --bindir=$bindir --fields-terminated-by '\0001' --delete-compile-dir --temporary-rootdir $target_dir --outdir "$stgdir" --target-dir $sqoop_table_location --incremental append --check-column $cdc_col --last-value "$lv" $(echo "$map_column_hive") --optionally-enclosed-by '\"' --escaped-by \\|| error_exit "failed to sqoop import from ${source_db}.${source_tbl} to ${target_db}.${sqoop_tbl}:return_code=$?" status "'failed $step'"
	else
		sqoop import  -Dorg.apache.sqoop.splitter.allow_text_splitter=true -Dmapred.child.java.opts="-Djava.security.egd=file:/dev/./urandom" --connect "$connect" -m $mappers --table $source_tbl --username $username --password-file  $password_file  --null-string '\\N' --null-non-string '\\N' --bindir=$bindir --fields-terminated-by '\0001' --delete-compile-dir --temporary-rootdir $target_dir --outdir "$stgdir" --target-dir $sqoop_table_location --incremental append --check-column $cdc_col --last-value "$lv" $(echo "$map_column_hive") --optionally-enclosed-by '\"' --escaped-by \\|| error_exit "failed to sqoop import from ${source_db}.${source_tbl} to ${target_db}.${sqoop_tbl}:return_code=$?" status "'failed $step'"
	fi
	echo "WHERE $cdc_col>'$lv'">>$sql_insert
fi
now=`date +"%Y-%m-%d %H:%M:%S.%N"`
info "$step ends $sqoop_tbl from $source_tbl" task1_end_time "'$now'"

step="validate sqoop table"
./run_sqlb.sh "set sync_ddl=1;invalidate metadata ${target_db}.${sqoop_tbl};"
rc_sqoop=$(./run_sqlb.sh "select count(1) from ${target_db}.${sqoop_tbl}")
test -n $rc_sqoop || error_exit "failed to count row for sqoop table $sqoop_tbl:rc_sqoop=$rc_sqoop" status "'failed $step'"

nc_sqoop_tbl=$(impala-shell -B --quiet -i $impala_uri  -q "show create table ${target_db}.${sqoop_tbl}" -k --ssl --ca_cert=${ca_cert} |sed -n "/\"CREATE TABLE ${target_db}.${sqoop_tbl}/,/\"$/{p}"|sed -n '2,/^\x29/{p}' |sed '/\x29$/d'|wc -l)
if [ "$cdc_col" = "fullcomparison" ]
then
	nc_target_tbl=`expr $nc_target_tbl - 7`
else
	nc_target_tbl=`expr $nc_target_tbl - 1`
fi
test "$nc_target_tbl" -gt "$nc_sqoop_tbl" 2>/dev/null && error_exit "$target_tbl has more columns than $sqoop_tbl:nc_sqoop_tbl=$nc_sqoop_tbl,nc_target_tbl_adjusted=$nc_target_tbl" status "'failed $step'"
test "$nc_target_tbl" -lt "$nc_sqoop_tbl" 2>/dev/null && info "$target_tbl has less columns than $sqoop_tbl:nc_sqoop_tbl+1=$nc_sqoop_tbl,nc_target_tbl=$nc_target_tbl,nc_excluded=$nc_excluded" 

step="insert target"
now=`date +"%Y-%m-%d %H:%M:%S.%N"`
info "$step starts $target_tbl" task2_start_time "'$now'"
echo ";">>$sql_insert
cat $sql_insert
./run_file.sh $sql_insert
now=`date +"%Y-%m-%d %H:%M:%S.%N"`
info "$step ends $target_tbl" task2_end_time "'$now'"

step="validate target table"
rc_post=$(./run_sqlb.sh "select count(1) from ${target_db}.${target_tbl}")
test -n $rc_post || error_exit "failed to count row for target table $target_tbl:rc_post=$rc_post" status "'failed $step'"
records_written=`expr $rc_post - $rc_pre`

info "row count for $target_db.$target_tbl:updated-$records_written,before-${rc_pre},after-${rc_post}" records_written "$records_written"

if [ "$insert_mode" = "OVERWRITE" ]
then
	test "$rc_sqoop" -eq "$rc_post" || error_exit "failed to insert $insert_mode ${target_db}.${target_tbl}:rc_sqoop=$rc_sqoop,rc_post=$rc_post" status "'failed $step'"
else	
	test "$records_written" -eq "$rc_sqoop" || error_exit "failed to insert $insert_mode ${target_db}.${target_tbl}:rc_sqoop=$rc_sqoop,records_written=$records_written" status "'failed $step'"
fi

step="update end_time"
now=`date +"%Y-%m-%d %H:%M:%S.%N"`
info "$step ends $target_tbl" end_time "'$now'"

step="update status"
info "$step ends $target_tbl" status "'succeeded'"

cleanup

