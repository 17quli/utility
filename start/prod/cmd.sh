#!/bin/bash
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

if [ $# -ne 2 ]
then
        echo "invaild parameters. Please type $0 <file_name> <table_name>"
        exit 1
fi

sqlfile=$1
table_name=$2
dfmt="%Y-%m-%d %H:%M:%S------"
ts=`date +%Y%m%d`
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

impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" --quiet -f $sqlfile --var="db_name=${target_db}" --var="table_name=${table_name}" --var="db_env=${db_env}" --var="table_suffix=${ts}_${USER}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
