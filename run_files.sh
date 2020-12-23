#!/bin/bash
execution_result=""
master_file=$1
sql_file=$1

if [ $# -ne 1 ]
then
	echo "type $0 <sql_file>"
	exit 1
fi

#while IFS= read -r table_name
#do
#        echo $table_name
#	impala-shell --quiet -i ird10139au.vsp.sas.com:25003  -f t1.sql --database ${db_name}  --var="table_name=${table_name}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
#done< <(cat tbl)

while read sql_file
do
	echo "executing ${0} ${sql_file}......"
	impala-shell -i ird10139au.vsp.sas.com:25003  -f ${sql_file} -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
	if [ $? -eq 0 ]
	then
		execution_result="succeeded"	
	else
		execution_result="failed"	
	fi
	echo "executing ${0} ${sql_file} $execution_result"
done <${sql_file}
