#!/bin/bash
source .config
table_name=$1
view_file_full="${1}-full.ddl"
view_file_restricted="${1}-restricted.ddl"

if [ $# -ne 1 ]
then
	echo "type $0 <table_name>"
	exit 1
fi

if [ ! -f "$view_file_restricted" ]
then
	echo "file $view_file_restricted not exists!"
	exit 2
fi

echo "creating  ${1} in ${view_db_restricted} database......"
impala-shell -i ird26au.vsp.sas.com:25003 -f ${view_file_restricted} --var="view_db=${view_db_restricted}" --var="source_db=${source_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi
echo "creating  ${1} in ${view_db_restricted} ${execution_result}"
