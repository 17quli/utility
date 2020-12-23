#!/bin/bash
sql_file=$1
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)

if [ $# -ne 1 ]
then
	echo "type $0 <sql_file>"
	exit 1
fi

if [ ! -f $sql_file ]
then
        echo "${sql_file} is not a valid file"
        exit 2
fi


impala-shell -c -B --quiet -i ird26au.vsp.sas.com:25003  -f ${sql_file} -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem  2>>$logfile
