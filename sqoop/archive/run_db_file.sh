#!/bin/bash
db_name=$1
sql_file=$2
logfile=./log/`basename ${0} .sh`.log

if [ $# -ne 2 ]
then
	echo "type $0 <db_name> <sql_file>"|tee -a $logfile
	exit 1
fi

if [ ! -f $sql_file ]
then
        echo "${sql_file} is not a valid file"|tee -a $logfile
        exit 2
fi


echo "executing ${0} ${db_name} ${sql_file}......"|tee -a $logfile
impala-shell -i ird26au.vsp.sas.com:25003  -f ${sql_file} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 2>&1|tee -a $logfile
