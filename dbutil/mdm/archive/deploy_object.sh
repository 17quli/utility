#!/bin/bash
#set -x 
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

if [ $# -ne 3 ]
then
        echo "wrong # of arguments!"
        echo "type $0 <database environment> <database layer> {table|full_view|restricted_view}"
        exit 1
fi

db_env=$1
db_layer=$2
deploy_type=$3

conffile=./conf/`basename ${0} .sh`.conf
ts=`date +%Y%m%d%H%M%S`
sql_file=./`basename ${0} .sh`.sql
stg_file=./stg/`basename ${0} .sh`_${ts}.lst
dfmt="%Y-%m-%d %H:%M:%S------"

echo `date +"$dfmt"`"start ${0}" |tee -a $body

if [ -f $conffile ] 
then
	source $conffile
fi

>${stg_file}

impala-shell --quiet -i ird10139au.vsp.sas.com:25003  -f ${sql_file}  --var="db_env=${db_env}"  --var="db_layer=${db_layer}" --var="deploy_type=${deploy_type}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem |tee -a ${stg_file}
sed -i 's/^"//g' $stg_file
sed -i 's/"$//g' $stg_file

impala-shell -B -c -i ird10139au.vsp.sas.com:25003  -f ${stg_file} --var="db_env=${db_env}"  --var="db_layer=${db_layer}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
