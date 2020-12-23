#!/bin/bash
db_name=$1
sql_file=$2
p1=$3
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)

if [ $# -ne 3 ]
then
	echo "type $0 <db_name> <sql_file> <p1>"
	exit 1
fi

if [ ! -f $sql_file ]
then
        echo "${sql_file} is not a valid file"
        exit 2
fi


impala-shell -B -c --quiet -i ird26au.vsp.sas.com:25003  -f ${sql_file} -d ${db_name} --var="p1=${p1}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem  2>>$logfile
