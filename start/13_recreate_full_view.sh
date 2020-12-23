#!/bin/bash
source ./conf/config
table_name=$1
view_file="../${1}-full.ddl"
execution_result=""

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

echo "dropping  ${1} in ${view_db_full} database......"
impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" --quiet -q "drop view if exists ${view_db_full}.${table_name};" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
#impala-shell -i ird10139au.vsp.sas.com:25003 -q "drop view if exists ${view_db}_restricted_access.${table_name}; invalidate metadata ${view_db}_restricted_access.${table_name}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi
echo "dropping  ${1} in ${view_db_full} ${execution_result}"

echo "creating  ${1} in ${view_db_full} database......"
impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" -f ${view_file} --quiet --var="view_db=${view_db_full}" --var="source_db=${target_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi
echo "creating  ${1} in ${view_db_full} ${execution_result}"

