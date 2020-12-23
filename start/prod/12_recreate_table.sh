#!/bin/bash
source ./conf/config
table_name=$1
sqlfile=../${table_name}-create.ddl


if [ $# -ne 1 ] 
then
	echo "type $0 <table_name>"
	exit 1
fi

echo "recreating ${table_name} in ${target_db}......"
impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" --quiet -q "DROP TABLE if exists ${target_db}.${table_name};" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
impala-shell -i ird10139au.vsp.sas.com:25003 -Q "sync_ddl=1" --quiet -f ${sqlfile} --var="target_db=${target_db}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem

