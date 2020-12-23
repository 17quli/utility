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

impala-shell -i ird26au.vsp.sas.com:25003  -q "${sql}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem  2>>$logfile
