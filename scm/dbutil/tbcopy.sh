#!/bin/bash
#set -x 
source=$1
target_db=$2
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

if [ $# -ne 2 ] 
then
	echo "wrong # of arguments!"
	echo "type $0 <source_db.source_table> <target_db>"
	exit 1
fi

input_split=`echo $source | sed -e 's/\./ /'`
set -- ${input_split}
source_db=$1
source_table=$2
target_table=$source_table
target="${target_db}.${target_table}"
if [ -z "${source_db}" ] || [ -z "${source_table}" ]
then
	echo "<source> should be like <source_db>.<source_table>"
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
if [ $target_env = "prod" ]
then
        echo "$0 does not support copy to production database"
	exit 4
fi

sql="show create table ${source};"
impala-shell -B -i ird26au.vsp.sas.com:25003  -q "${sql}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem>showcreate.lst

if [ $? -ne 0 ]
then
	echo "execute ${sql} failed" 
	exit 5
fi

source_uri=`grep hdfs showcreate.lst|cut -d "'" -f2` 

if [ ! -s showcreate.lst ] || [ -z "${source_uri}" ]
then
	echo "${source} does not exist"
	exit 6
fi

target_uri=`impala-shell -i ird26au.vsp.sas.com:25003  -q "describe database ${target_db}" -d ${target_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem |grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'`

if [ $? -ne 0 ] || [ -z "${target_uri}" ]
then
	echo "execute describe database ${target_db} failed"
	exit 7
fi

echo "hdfs dfs -cp -f ${source_uri} ${target_uri}/" >hdfs_copy.sh


source_table=`grep "CREATE TABLE" showcreate.lst|cut -d "(" -f1 |cut -d "." -f2`
if [ -z ${source_table} ]
then
	echo "${source} does not exist!"
	exit 7
fi

echo "dropping table ${target}......"
impala-shell -B -i ird26au.vsp.sas.com:25003  -q "drop table if exists ${target};" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 

sleep 5

echo "creating table ${target}......"
impala-shell -B -i ird26au.vsp.sas.com:25003  -q "create table ${target} like ${source};" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 


echo "hdfs copy......" 
date
. ./hdfs_copy.sh 
date

if_partitioned=`grep PARTITIONED showcreate.lst` 
if [ -z "$if_partitioned" ]
then
	sql="refresh ${target};"
else
	sql="alter table ${target} recover partitions;"
fi

impala-shell -i ird26au.vsp.sas.com:25003  -q "${sql}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
