#!/bin/bash
table_name=$1
view_db="${2}"
view_file="../${1}-restricted.ddl"

source config

if [ $# -ne 2 ]
then
	echo "type $0 <table_name> <lab_database>"
	exit 1
fi

if [ ! -f "${view_file}" ]
then
	echo "file $view_file not exists!"
	exit 2
fi


echo "creating  ${table_name} in ${view_db} database......"
impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" -f ${view_file} --var="view_db=${view_db}" --var="source_db=${source_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi
echo "creating  ${table_name} in ${view_db} ${execution_result}"

