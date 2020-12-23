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
sqlfile=../${1}-full.ddl
conffile=./conf/config

if [ -f $conffile ]
then
        source $conffile
fi

if [ ! -f "${sqlfile}" ]
then
	echo "file $sqlfile not exists!"
	exit 2
fi

echo `date +"$dfmt"`"deploying ${table_name} in ${view_db_full} database......"
impala-shell -i ird10139au.vsp.sas.com:25003 --quiet -f ${sqlfile} --var="view_db=${view_db_full}" --var="source_db=${target_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
#impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" --quiet -f ${sqlfile} --var="view_db=${view_db_full}" --var="source_db=${target_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
