#!/bin/bash
source .config
table_name=$1

if [ $# -ne 1 ] 
then
	echo "type $0 <table_name>"
	exit 1
fi

echo "copying ${table_name} from ${target_db} to ${lab_db}......"
impala-shell -i ird26au.vsp.sas.com:25003 -q "CREATE TABLE ${lab_db}.${table_name} STORED AS PARQUET as select * from ${target_db}.${table_name};" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	execution_result="failed"	
fi
echo "copying ${table_name} from ${target_db} to ${lab_db} ${execution_result}"

