#!/bin/bash
#set -x 
date
source_db=$1
target_db=$2
tbl_list=$3
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

dfmt="%Y-%m-%d %H:%M:%S------"

if [ $# -ne 3 ] 
then
	echo "wrong # of arguments!"
	echo "type $0 <source_db> <target_db> <tbl_list>"
	exit 1
fi

if [ ! -f $tbl_list ]
then
        echo "${tbl_list} is not a valid file"
        exit 2
fi


db_split=`echo $source_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
source_env=$1
source_name=$2
db_split=`echo $target_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
target_env=$1
target_name=$2

if [ $target_env = "prod" ] && [ "$target_name" != "dw" ]
then
        echo "$0 does not support copy to production database"
	exit 3
fi

target_uri=`impala-shell -i ird26au.vsp.sas.com:25003  -q "describe database ${target_db}" -d ${target_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem |grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'`
if [ -z "$target_uri" ]
then
        echo "$target_db doesn't exist"
        exit 4
fi


echo `date +"$dfmt"`"start ${0} ${source_db} ${target_db} ${tbl_list}"

cat ${tbl_list} | sed -e 's/^/show create table /g' -e 's/$/;/g' >tbl.sql

./run_db_file.sh $source_db tbl.sql>showcreate.lst
cat showcreate.lst|grep "CREATE TABLE"|cut -d "(" -f1 |cut -d "." -f2 >tbl.lst
sed -e 's/^/drop table if exists /g' -e 's/$/;/g' tbl.lst >drop_table.sql
awk -v sdb=$source_db '{print "create table " $0 " like " sdb "."$0";"}' tbl.lst >create_table.sql

echo `date +"$dfmt"`"drop tables from ${target_db}"

./run_db_file.sh ${target_db} drop_table.sql

sleep 5

echo `date +"$dfmt"`"create tables in ${target_db}"
./run_db_file.sh ${target_db} create_table.sql

grep hdfs showcreate.lst | cut -d "'" -f2 |awk -v tgt=${target_uri} '{print "hdfs dfs -cp -f " $0 " " tgt "/"}' >hdfs_copy.sh
echo `date +"$dfmt"`"hdfs copy"
. ./hdfs_copy.sh 
echo `date +"$dfmt"`"hdfs copy complete"

cat showcreate.lst |grep "CREATE TABLE\|PARTITIONED"|cut -d "|" -f2|sed -e 's/^ *//g' -e 's/ *$//g'|sed -E ':a ; $!N ; s/\n\PARTITIONED/PARTITIONED/ ; ta ; P ; D'>partition.lst
grep "PARTITIONED" partition.lst |cut -d "." -f2|cut -d "(" -f1|sed -e 's/^/alter table /g' -e 's/$/ recover partitions;/g'|awk -F " " '{print $0" compute stats "$3";"}'>recoverpartitions.sql
grep -v "PARTITIONED" partition.lst |cut -d "." -f2|cut -d "(" -f1|sed -e 's/^/refresh /g' -e 's/$/;/g'|awk -F " " '{print $0" compute stats "$2";"}'>refresh.sql

echo `date +"$dfmt"`"refresh database"
nohup ./run_db_file.sh ${target_db} refresh.sql  &
./run_db_file_parallel.sh ${target_db} recoverpartitions.sql 
echo `date +"$dfmt"`"database refresh completed"
