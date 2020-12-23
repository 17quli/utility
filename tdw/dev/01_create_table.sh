#target_db="test_raw"
#view_db_full="test_raw_full_access"
#view_db_restricted="test_raw_restricted_access"
source config
table_name=${1}
file_name="../${1}-create.ddl"
execution_result=""

if [ $# -ne 1 ]
then
	exit 1
fi

if [ ! -f "$file_name" ]
then
	echo "file $file_name not exists!"
	echo "copy/create file $file_name and run $0 <table_name> again."
fi

echo "deploying ${table_name} in ${target_db} database......"
impala-shell -i ird26au.vsp.sas.com:25003 -f ${file_name} --var="target_db=${target_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 
if [ $? -eq 0 ]
then
	execution_result="succeeded"	
else
	
	execution_result="failed"	
fi

echo "deploying ${table_name} in ${target_db} database ${execution_result}."

