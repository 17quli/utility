#!/bin/bash
execution_result=""
file_name=$1
source_db=test_raw

if [ $# -lt 1 ]
then
	echo "type $0 <sql_file> <source_db>"
	exit 1
fi


echo "executing ${0} ${file_name} ${source_db} ......"
impala-shell --quiet -i ird26au.vsp.sas.com:25003 -f $1 --var="source_db=${source_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	
	execution_result="failed"	
fi

echo "executing ${0} ${file_name} ${source_db}" 
