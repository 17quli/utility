#!/bin/bash
execution_result=""
sql=$1
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)

if [ $# -ne 1 ]
then
	echo 'type $0 "<sql_command>"'
	exit 1
fi

impala-shell -B --quiet -i ird10139au.vsp.sas.com:25003  -q "${sql}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 2>>$logfile
