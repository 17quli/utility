#!/bin/bash
#set -x
sql_file="$1"
v1="$2"
v2="$3"
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)

if [ $# -ne 3 ]
then
	echo 'type $0 "<sql_command> <p1> <p2>"'
	exit 1
fi
impala-shell -i ird10139au.vsp.sas.com:25003  --var="v1=${v1}" --var="v2=${v2}" -f "${sql_file}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem  2>>$logfile
