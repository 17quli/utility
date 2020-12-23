#!/bin/bash
#20201030:	initial creation
#set -x 
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

source_db=$1
target_db=$2
nd_ago=$3
conffile=./conf/`basename ${0} .sh`.conf
ts=`date +%Y%m%d%H%M%S%N`
m5list=./stg/m5_${ts}.lst
tbllist=./stg/tbl_${ts}.lst
sclist=./stg/showcreate_${ts}.lst
ptnlist=./stg/partition_${ts}.lst
tblsql=./stg/tbl_${ts}.sql
dtsql=./stg/drop_table_${ts}.sql
ctsql=./stg/create_table_${ts}.sql
rpsql=./stg/recoverpartitions_${ts}.sql
refreshsql=./stg/refresh_${ts}.sql
hdfscopysh=./stg/hdfs_copy_${ts}.sh
mkdirsh=./stg/mkdir_${ts}.sh
body=./log/body_${ts}.txt
mainbody=./log/dbsbackup.txt
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
dfmt="%Y-%m-%d %H:%M:%S------"

echo `date +"$dfmt"`"start ${0} ${source_db} ${target_db}" |tee -a $body

if [ -f $conffile ]
then
        source $conffile
fi

if [ $# -lt 3 ] || [ $# -gt 4 ]
then
        echo "wrong # of arguments!" 
        echo "type $0 <source_db> <target_db> <ndays_ago> [<retention>]" 
        exit 1
fi


if ! [ "$nd_ago" -eq "$nd_ago" ] 2>/dev/null
then
	echo "$nd_ago is not a valid number!"
        exit 2
fi


if [ $# -eq 4 ]
then
        re='^[0-9]+$'
        if [ -n "$4" ] && [ "$4" -eq "$4" ] 2>/dev/null
        then
                retention=$4
        else
                echo "$4 is not a valid number!"
                exit 2
        fi
fi

if ! ([ -n "$retention" ] && [ "$retention" -eq "$retention" ] 2>/dev/null)
then
	retention=5
fi

if ! ([ -n "$replication" ] && [ "$replication" -eq "$replication" ] 2>/dev/null)
then
        replication=2
fi


db_split=`echo $source_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
source_env=$1
source_name=$2
db_split=`echo $target_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
target_env=$1
target_name=$2

if [ "$target_env" = "prod" ] && [ "$target_name" != "dw" ]
then
        echo "$0 does not support backup to non-dw production database"
	exit 2
fi

source_uri=`impala-shell -i ird10139au.vsp.sas.com:25003  -q "describe database ${source_db};" -d ${source_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'` 
if [ -z "$source_uri" ]
then
        echo "$source_db doesn't exist"
        exit 3
fi

target_uri=`impala-shell -i ird10139au.vsp.sas.com:25003  -q "describe database ${target_db}" -d ${target_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem |grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'`
if [ -z "$target_uri" ]
then
        echo "$target_db doesn't exist"
        exit 4
fi

snp_dt=$(date -d "$nd_ago days ago" +"%Y-%m-%d")

snapshot_location=$(hdfs dfs -ls -r -t -d $source_uri/.snapshot/${snp_dt}*|tail -n 1|awk '{print $8}')
if [ -z "$snapshot_location" ]
then
	echo "snapshot doesn't exist for $source_db"
        exit 5
fi
ymd=$(echo $snapshot_location|awk -F '/' '{print $NF}'|awk -F '-' '{print $1$2$3}')

ymdm5=`date -d "$ymd -${retention} days" +%Y%m%d`
ymdm6=$(date -d "$ymd -`expr ${retention} + 1` days " +%Y%m%d)
ymdm7=$(date -d "$ymd -`expr ${retention} + 2` days " +%Y%m%d)

echo `date +"$dfmt"`"show tables" |tee -a $body
impala-shell -B -i ird10139au.vsp.sas.com:25003  -q "show tables" -d ${source_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem > $tbllist
echo `date +"$dfmt"`"`wc -l <$tbllist` tables or views" |tee -a $body


cat $tbllist| sed -e 's/^/show create table /g' -e 's/$/;/g' >$tblsql

echo `date +"$dfmt"`"show create table" |tee -a $body
./run_db_file.sh $source_db $tblsql>$sclist
cat $sclist|grep "CREATE TABLE"|cut -d "(" -f1 |cut -d "." -f2 |sed -e "s/ *$//g">$tbllist
echo `date +"$dfmt"`"`wc -l <$tbllist` tables excluding views" |tee -a $body

comm -12 <(sort $tbllist|sed -e "s/^/${source_db}_/g" -e "s/$/_${ymd}/g") <(./run_db_sqlb.sh $target_db "show tables like '${source_db}_*_${ymd}'"|sort) >$dtsql
#awk -v sdb=$source_db -v ymd=$ymd '{print "drop table if exists " sdb "_" $0 "_" ymd " purge;"}' $tbllist >$dtsql
awk -v sdb=$source_db -v ymd=$ymd -v loc=$snapshot_location '{print "create external table " sdb "_" $0 "_" ymd " like " sdb "."$0" location '\''"loc"/"$0"'\'';"}' $tbllist >$ctsql

echo `date +"$dfmt"`"drop table" |tee -a $body
./run_db_tbls_sql.sh ${target_db} $dtsql "drop table if exists"
#./run_db_tbls_sql_parallel.sh ${target_db} $dtsql "drop table if exists"
echo `date +"$dfmt"`"`wc -l <$dtsql` tables dropped" |tee -a $body
sleep 5
echo `date +"$dfmt"`"create table" |tee -a $body
./run_db_file.sh ${target_db} $ctsql
#./run_db_file_parallel.sh ${target_db} $ctsql

echo `date +"$dfmt"`"`wc -l <$ctsql` tables created" |tee -a $body

sleep 5

cat $sclist |grep "CREATE TABLE\|PARTITIONED"|cut -d "|" -f2|sed -e 's/^ *//g' -e 's/ *$//g'|sed -E ':a ; $!N ; s/\n\PARTITIONED/PARTITIONED/ ; ta ; P ; D'>$ptnlist
grep "PARTITIONED" $ptnlist |cut -d "." -f2|cut -d "(" -f1|sed -e "s/^/alter table ${source_db}_/g" -e "s/ *$/_${ymd} recover partitions;/g">$rpsql
grep -v "PARTITIONED" $ptnlist |cut -d "." -f2|cut -d "(" -f1|sed -e "s/^/refresh ${source_db}_/g" -e "s/ *$/_${ymd};/g">$refreshsql
echo `date +"$dfmt"`"refresh table" |tee -a $body
./run_db_file.sh ${target_db} $refreshsql 
#./run_db_file_parallel.sh ${target_db} $refreshsql 
echo `date +"$dfmt"`"`wc -l <$refreshsql` tables refreshed" |tee -a $body
echo `date +"$dfmt"`"recover partitions" |tee -a $body
./run_db_file.sh ${target_db} $rpsql 
#./run_db_file_parallel.sh ${target_db} $rpsql 
echo `date +"$dfmt"`"`wc -l <$rpsql` table partitions recovered" |tee -a $body

echo `date +"$dfmt"`"show tables backup expired" |tee -a $body
./run_db_sqlb.sh $target_db "show tables "|grep "^${source_db}_"|grep "_${ymdm5}$\|_${ymdm6}$\|_${ymdm7}$" >$m5list
if [ -s $m5list ]
then
	echo `date +"$dfmt"`"drop tables backup expired" |tee -a $body
	./run_db_tbls_sql.sh ${target_db} $m5list "drop table if exists " "purge"
	#./run_db_tbls_sql_parallel.sh ${target_db} $m5list "drop table if exists " "purge"
	echo `date +"$dfmt"`"`wc -l <$m5list` expired tables dropped" |tee -a $body
fi
echo `date +"$dfmt"`"complete ${0} ${source_db} ${target_db}" |tee -a $body
if [ "$sendto" != "" ]
then
	if [ "$sendfrom" = "" ]
	then
		sendfrom="dip-cloudera@sas.com"
	fi
	mail -s "$subject" -r "$sendfrom" "$sendto" < $body
else
	cat $body>>$mainbody
	echo "--------------------------------------------------------------------------------------------" >>$mainbody
fi
