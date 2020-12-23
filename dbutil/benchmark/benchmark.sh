#!/bin/bash
cd `dirname $0`
dt=`date +"%Y-%m-%d %H:%M:%S.%s"`
sql_file=benchmark.sql
global_conf_file=./conf/impala-shell.conf
db_name=dev_raw
if [ -f "$global_conf_file" ]
then
	source "$global_conf_file"	
else
	echo "please specify the connection detail in $global_conf_file"
	exit 2
fi
impala-shell -B -i "$imp_host"  --var="v1=${dt}" -f ${sql_file} -d ${db_name}  -k --ssl --ca_cert="$imp_ca"
