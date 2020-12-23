#!/bin/bash
execution_result=""
db_name=$1
sql="show tables;"

if [ $# -ne 1 ]
then
	echo "type $0 <db_name>"
	exit 1
fi


#echo "executing ${0} ${file_name} ${table_name} ${lab_project}......"
impala-shell --quiet -i ird26au.vsp.sas.com:25003 -q "${sql}" --database ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	
	execution_result="failed"	
fi

#echo "executing ${0} ${file_name} ${table_name} ${lab_project} ${execution_result}"
