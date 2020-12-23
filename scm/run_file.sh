#!/bin/bash
execution_result=""
sql_file=$1

if [ $# -ne 1 ]
then
	echo "type $0 <sql_file>"
	exit 1
fi

#while IFS= read -r table_name
#do
#        echo $table_name
#	impala-shell --quiet -i ird26au.vsp.sas.com:25003  -f t1.sql --database ${db_name}  --var="table_name=${table_name}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
#done< <(cat tbl)

echo "executing ${0} ${sql_file}......"
impala-shell -i ird26au.vsp.sas.com:25003  -f ${sql_file} -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi

echo "executing ${0} ${sql_file}"
