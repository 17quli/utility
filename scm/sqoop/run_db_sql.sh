#!/bin/bash
#set -x
db_name=$1
sql=$2
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)

if [ $# -ne 2 ]
then
	echo "type $0 <db_name> <sql_file>"
	exit 1
fi

impala-shell -i ird26au.vsp.sas.com:25003  -q "${sql}" -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem  2>>$logfile
