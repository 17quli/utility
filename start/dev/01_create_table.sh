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
sqlfile=../${table_name}-create.ddl
conffile=./conf/config

if [ -f $conffile ]
then
        source $conffile
fi

if [ ! -f "$sqlfile" ]
then
	echo "file $sqlfile not exists!"
	echo "copy/create file $sqlfile and run $0 <table_name> again."
fi

echo `date +"$dfmt"`"deploying ${table_name} in ${target_db} database......"
impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" --quiet -f ${sqlfile} --var="target_db=${target_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
