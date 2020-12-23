#!/bin/bash
db_name=$1
tblist=$2
sql_file=$3
exec> >(tee -a $logfile)

if [ $# -ne 3 ]
then
	echo "type $0 <db_name> <tblist> <sql_file>"
	exit 1
fi

while IFS= read -r table_name
do
        echo $table_name
	impala-shell -c --quiet -i ird10139au.vsp.sas.com:25003  -d ${db_name} -f ${sql_file} --var="db_name=${db_name}" --var="table_name=${table_name}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 2>>$logfile
done< <(cat $tblist)

