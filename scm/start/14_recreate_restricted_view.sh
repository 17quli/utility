#!/bin/bash
source .config
table_name=$1
view_file="${1}-restricted.ddl"

if [ $# -ne 1 ]
then
	echo "type $0 <table_name>"
	exit 1
fi

if [ ! -f "$view_file" ]
then
	echo "file $view_file not exists!"
	exit 2
fi

echo "dropping  ${1} in ${view_db_restricted} database......"
impala-shell -i ird26au.vsp.sas.com:25003 -q "drop view if exists ${view_db_restricted}.${table_name};" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
#impala-shell -i ird26au.vsp.sas.com:25003 -q "drop view if exists ${view_db}_restricted_access.${table_name}; invalidate metadata ${view_db}_restricted_access.${table_name}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi
echo "dropping  ${1} in ${view_db_restricted} ${execution_result}"

sleep 5

echo "creating  ${1} in ${view_db_restricted} database......"
sleep 5
impala-shell -i ird26au.vsp.sas.com:25003 -f ${view_file} --var="view_db=${view_db_restricted}" --var="source_db=${source_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi
echo "creating  ${1} in ${view_db_restricted} ${execution_result}"

