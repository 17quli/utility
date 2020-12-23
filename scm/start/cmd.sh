#!/bin/bash
execution_result=""
file_name=$1
table_name=$2
lab_project=$3

if [ $# -lt 1 ]
then
	echo "type $0 <sql_file> [<table_name> <lab_project>]"
	exit 1
fi


#echo "executing ${0} ${file_name} ${table_name} ${lab_project}......"
impala-shell --quiet -i ird26au.vsp.sas.com:25003 -f $1 --var="table_name=${table_name}" --var="lab_project=${lab_project}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	
	execution_result="failed"	
fi

#echo "executing ${0} ${file_name} ${table_name} ${lab_project} ${execution_result}"
