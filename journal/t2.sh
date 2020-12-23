#!/bin/bash
execution_result=""
db_name=prod_raw

if [ $# -lt 0 ]
then
	echo "type $0 <db_name>"
	exit 1
fi

while IFS= read -r table_name
do
        echo $table_name
	impala-shell --quiet -i ird26au.vsp.sas.com:25003  -f t1.sql --database ${db_name}  --var="table_name=${table_name}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
done< <(cat tbl)

#echo "executing ${0} ${file_name} ${table_name} ${lab_project}......"
#impala-shell --quiet -i ird26au.vsp.sas.com:25003  -f t1.sql --database ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
#if [ $? -eq 0 ]
#then
#	execution_result="succeeded"	
#else
	
#	execution_result="failed"	
#fi

#echo "executing ${0} ${file_name} ${table_name} ${lab_project} ${execution_result}"
