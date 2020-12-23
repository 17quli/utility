#!/bin/bash
execution_result=""
tblist=$1
sql_file=$2

if [ $# -ne 2 ]
then
	echo "type $0 <tblist> <sql_file>"
	exit 1
fi

while IFS= read -r table_name
do
        echo $table_name
	impala-shell --quiet -i ird10139au.vsp.sas.com:25003  -f ${sql_file} --var="table_name=${table_name}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
done< <(cat $tblist)

