#!/bin/bash
#set -x 
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

source_db=$1
target_db=$2
conffile=./conf/`basename ${0} .sh`.conf
ts=`date +%Y%m%d%H%M%S`
tbllist=./stg/tbl_${ts}.lst
sclist=./stg/showcreate_${ts}.lst
ptnlist=./stg/partition_${ts}.lst
tblsql=./stg/tbl_${ts}.sql
dtsql=./stg/drop_table_${ts}.sql
ctsql=./stg/create_table_${ts}.sql
rpsql=./stg/recoverpartitions_${ts}.sql
refreshsql=./stg/refresh_${ts}.sql
hdfscopysh=./stg/hdfs_copy_${ts}.sh
body=./log/body_${ts}.txt
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
dfmt="%Y-%m-%d %H:%M:%S------"

echo `date +"$dfmt"`"start ${0} ${source_db} ${target_db}" |tee -a $body

if [ -f $conffile ] 
then
	source $conffile
fi

if [ $# -ne 2 ] 
then
	echo "wrong # of arguments!" 
	echo "type $0 <source_db> <target_db>" 
	exit 1
fi

db_split=`echo $source_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
source_env=$1
source_name=$2
db_split=`echo $target_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
target_env=$1
target_name=$2

if [ $target_env = "prod" ]
then
        echo "$0 does not support copy to production database"
	exit 2
fi

source_uri=`impala-shell -i ird26au.vsp.sas.com:25003  -q "describe database ${source_db};" -d ${source_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem|grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'` 
target_uri=`impala-shell -i ird26au.vsp.sas.com:25003  -q "describe database ${target_db}" -d ${target_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem |grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'`

echo `date +"$dfmt"`"show tables" |tee -a $body
impala-shell -B -i ird26au.vsp.sas.com:25003  -q "show tables" -d ${source_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem > $tbllist
echo `date +"$dfmt"`"`wc -l <$tbllist` tables or views" |tee -a $body

cat $tbllist | sed -e 's/^/show create table /g' -e 's/$/;/g' >$tblsql

echo `date +"$dfmt"`"show create table" |tee -a $body
./run_db_fileb.sh $source_db $tblsql>$sclist
cat $sclist|grep "CREATE TABLE"|cut -d "(" -f1 |cut -d "." -f2 >$tbllist
echo `date +"$dfmt"`"`wc -l <$tbllist` tables excluding views" |tee -a $body
sed -e 's/^/drop table if exists /g' -e 's/$/;/g' $tbllist >$dtsql
awk -v sdb=$source_db '{print "create table " $0 " like " sdb "."$0";"}' $tbllist >$ctsql

echo `date +"$dfmt"`"drop table" |tee -a $body
./run_db_fileb.sh ${target_db} $dtsql
sleep 5
echo `date +"$dfmt"`"create table" |tee -a $body
./run_db_fileb.sh ${target_db} $ctsql 
echo `date +"$dfmt"`"`wc -l <$ctsql` tables created" |tee -a $body

echo "hdfs dfs -cp -f ${source_uri}/* ${target_uri}/" >$hdfscopysh

echo `date +"$dfmt"`"hdfs copy" |tee -a $body
. $hdfscopysh  
if [ $? -ne 0 ]
then
	echo `date +"$dfmt"`"hdfs copy failure - refer to $logfile for detail." |tee -a $body
	exit $?
fi
echo `date +"$dfmt"`"complete hdfs copy" |tee -a $body

cat $sclist |grep "CREATE TABLE\|PARTITIONED"|cut -d "|" -f2|sed -e 's/^ *//g' -e 's/ *$//g'|sed -E ':a ; $!N ; s/\n\PARTITIONED/PARTITIONED/ ; ta ; P ; D'>$ptnlist
grep "PARTITIONED" $ptnlist |cut -d "." -f2|cut -d "(" -f1|sed -e 's/^/alter table /g' -e 's/$/ recover partitions;/g'|awk -F " " '{print $0" compute stats "$3";"}'>$rpsql
grep -v "PARTITIONED" $ptnlist |cut -d "." -f2|cut -d "(" -f1|sed -e 's/^/refresh /g' -e 's/$/;/g'|awk -F " " '{print $0" compute stats "$2";"}'>$refreshsql
echo `date +"$dfmt"`"refresh table" |tee -a $body
./run_db_file_parallel.sh ${target_db} $refreshsql 
echo `date +"$dfmt"`"`wc -l <$refreshsql` tables refreshed" |tee -a $body
echo `date +"$dfmt"`"recover partitions" |tee -a $body
./run_db_file_parallel.sh ${target_db} $rpsql 
echo `date +"$dfmt"`"`wc -l <$rpsql` table partitions recovered" |tee -a $body
echo `date +"$dfmt"`"complete ${0} ${source_db} ${target_db}" |tee -a $body
if [ "$sendto" != "" ]
then
        mail -s "$subject" $sendto < $body
fi
