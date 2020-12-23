#!/bin/bash
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

if [ $# -ne 1 ] 
then
	echo "type $0 <table_name>"
	exit 1
fi

table_name=$1
dfmt="%Y-%m-%d %H:%M:%S------"
ts=`date +%Y%m%d`
sqlfile=./stg/`basename ${0} .sh`_${ts}.sql
conffile=./conf/config

if [ -f $conffile ]
then
        source $conffile
fi

echo `date +"$dfmt"`"generate SQL file $sqlfile"
echo "CREATE TABLE ${backup_db}.${journal_db}_${table_name}_${ts}_${USER} STORED AS PARQUET as select * from ${journal_db}.${table_name};"|tee $sqlfile
echo "CREATE TABLE ${backup_db}.${target_db}_${table_name}_${ts}_${USER} STORED AS PARQUET as select * from ${target_db}.${table_name};"|tee -a $sqlfile
echo "DROP TABLE ${target_db}.${table_name} ;"|tee -a $sqlfile
echo "DROP TABLE ${journal_db}.${table_name} ;"|tee -a $sqlfile
echo "DROP VIEW ${view_db_full}.${table_name} ;"|tee -a $sqlfile
echo "DROP VIEW ${view_db_restricted}.${table_name} ;"|tee -a $sqlfile

echo `date +"$dfmt"`"execute SQL file $sqlfile"
impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" --quiet -f "$sqlfile" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
