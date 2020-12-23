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
sqlfile=../90_reinstate_${table_name}.sql

if [ -f $conffile ]
then
        source $conffile
fi

./02_cleanup.sh $table_name

./01_create_table.sh $table_name

./03_create_full_view.sh $table_name

./04_create_restricted_view.sh $table_name

./cmd.sh 10_validate_table.sql $table_name 
if [ -f "$sqlfile" ]
then
	./cmd.sh $sqlfile  $table_name
	./cmd.sh 10_validate_table.sql $table_name 
fi

echo `date +"$dfmt"`"$sql" 
sql="compute stats $table_name"
impala-shell -i ird10139au.vsp.sas.com:25003  --quiet -q "${sql}" -d ${target_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
impala-shell -i ird10139au.vsp.sas.com:25003  --quiet -q "${sql}" -d ${journal_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
