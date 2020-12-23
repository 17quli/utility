#!/bin/bash
table_name=$1
view_db=$2
source ./conf/config
view_file="../${1}-restricted.ddl"
view_file_tmp=lab_view.tmp

cat ${view_file}|sed -e "s/\${var:view_db}_restricted_access/\${var:view_db}/g">${view_file_tmp}

if [ $# -ne 2 ]
then
	echo "type $0 <table_name> <lab_project_name>"
	exit 1
fi

if [ ! -f "$view_file" ]
then
	echo "file $view_file not exists!"
	exit 2
fi

echo "dropping  ${1} in ${view_db} database......"
impala-shell -i ird10139au.vsp.sas.com:25003 --quiet -Q "sync_ddl=1" -q "drop view if exists ${view_db}.${table_name};" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
#impala-shell -i ird10139au.vsp.sas.com:25003 -q "drop view if exists ${view_db}_restricted_access.${table_name}; invalidate metadata ${view_db}_restricted_access.${table_name}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi
echo "dropping  ${1} in ${view_db} ${execution_result}"

echo "creating  ${1} in ${view_db} database......"
impala-shell -i ird10139au.vsp.sas.com:25003 --quiet -Q "sync_ddl=1" -f ${view_file_tmp} --var="view_db=${view_db}" --var="source_db=${source_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi
echo "creating  ${1} in ${view_db} ${execution_result}"

