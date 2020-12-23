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
ts=`date +%Y%m%d%H%M%S`
conffile=./conf/config
sqlfile=./stg/`basename ${0} .sh`_${ts}.sql

if [ -f $conffile ]
then
        source $conffile
fi

echo `date +"$dfmt"`"generate SQL file $sqlfile"
echo "DROP VIEW if exists ${view_db_full}.${table_name} ;"|tee $sqlfile
echo "DROP VIEW if exists ${view_db_restricted}.${table_name} ;"|tee -a $sqlfile


impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" --quiet -f "$sqlfile" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem

./03_create_full_view.sh $table_name

./04_create_restricted_view.sh $table_name

./cmd.sh 10_validate_table.sql $table_name 
