#!/bin/bash
db_name=$1
sql_file=$2
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)

if [ $# -ne 2 ]
then
	echo "type $0 <db_name> <sql_file>"
	exit 1
fi

if [ ! -f $sql_file ]
then
        echo "${sql_file} is not a valid file"
        exit 2
fi


impala-shell -c -i ird10139au.vsp.sas.com:25003  -f ${sql_file} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem  
