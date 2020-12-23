#!/bin/bash
#set -x
#20201028:	initial creation to replace show create table with desc to improve speed
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

conffile=./conf/`basename ${0} .sh`.conf
db=$1
sclist=./stg/show_create_table_${db}.lst
mtbl=./stg/`basename ${0} .sh`_tbl_${db}.lst
dt=`date -Iseconds`
dt=${dt:0:19}
ts=`date +%Y%m%d%H%M%S%N`
desc=./stg/`basename ${0} .sh`_${ts}.lst
dfmt="%Y-%m-%d %H:%M:%S------"
linea='----------------------------------------'
lineb=`printf "%s %s" "$db" "${linea:${#db}}"`
tbltypelist="MANAGED_TABLE EXTERNAL_TABLE"
vwtypelist="VIRTUAL_VIEW"


if [ $# -ne 1 ]
then
        echo "wrong # of arguments!" 
        echo "type $0 <database>" 
        exit 1
fi

>$mtbl
>$desc


echo `date +"$dfmt"`"truncate table dev_raw.mtable_stg" 
./run_db_sqlb.sh dev_raw "truncate table dev_raw.mtable_stg;" >/dev/null 2>&1

echo `date +"$dfmt"`"${lineb}desc formatted tables and write to $mtbl" 
./run_db_sqlb.sh $db "show tables" |while read table_name 
do
	./run_db_sqlb.sh $db "desc formatted \`$table_name\`">$desc
	if ! [ -s $desc ]
	then
		echo `date +"$dfmt"`"${lineb}$table_name not exists"
		continue
	fi
	owner=$(grep "^Owner:" "$desc"|awk '{print $2}')
	table_type=$(grep "^Table Type:" "$desc"|awk '{print $3}')
	(echo $tbltypelist|grep -w -q $table_type) && object_type="table"
	(echo $vwtypelist|grep -w -q $table_type) && object_type="view"
	if_partitioned=""
	stored_as=""
	create_statement=""
        stat_row_count=$(grep "numRows" "$desc"|awk '{print $2}')
        hdfs_size=$(grep "totalSize" "$desc"|awk '{print $2}')
	select_row_count=""
	partition_clause=""

	printf '%s' "$db" >>$mtbl
	printf '\002' >>$mtbl 
	printf '%s' "$table_name"  >>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "$object_type" >>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "$if_partitioned" >>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "$stored_as" >>$mtbl
	printf '\002' >>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "$dt" >>$mtbl
	printf '\002' >>$mtbl
        printf '%s' "$owner">>$mtbl
	printf '\002' >>$mtbl
        printf '%s' "$stat_row_count">>$mtbl
        printf '\002' >>$mtbl
        printf '%s' "$select_row_count">>$mtbl
        printf '\002' >>$mtbl
        printf '%s' "$hdfs_size">>$mtbl
        printf '\002' >>$mtbl
	printf '%s' "$partition_clause">>$mtbl
#        printf '\002' >>$mtbl
#	printf '%s' "$where_clause">>$mtbl
#        printf '\002' >>$mtbl
#	printf '%s' "$drop_clause">>$mtbl
        printf '\003'>>$mtbl
done

echo `date +"$dfmt"`"${lineb}upload $mtbl to hdfs" 
hdfs dfs -put -f $mtbl /env/1_dev/hive/raw/mtable_stg
echo `date +"$dfmt"`"${lineb}refresh mtable_stg and upsert into mtable" 
./run_db_sqlb.sh dev_raw "refresh mtable_stg;delete from mtable where db_name='$db' and concat(db_name,'.',object_name) not in (select concat(db_name,'.',object_name) from mtable_stg) ;upsert into mtable (db_name,object_name,object_type,run_date,owner,stat_row_count,hdfs_size) select db_name,object_name,object_type,run_date,owner,stat_row_count,hdfs_size from mtable_stg where db_name='$db';"
#rm -f $desc
