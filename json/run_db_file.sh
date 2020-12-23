#!/bin/bash
execution_result=""
db_name=$1
sql_file=$2

if [ $# -ne 2 ]
then
	echo "type $0 <db_name> <sql_file>"
	exit 1
fi

echo "executing ${0} ${db_name} ${sql_file}......"
impala-shell -i ird26au.vsp.sas.com:25003  -f ${sql_file} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi

echo "executing ${0} ${db_name} ${sql_file} ${execution_result}"
