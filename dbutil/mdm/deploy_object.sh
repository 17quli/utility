#!/bin/bash
#set -x 
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

if [ $# -ne 4 ]
then
        echo "wrong # of arguments!"
        echo "type $0 <database environment> <database layer> {table|full_view|restricted_view} <table_list_file>"
        exit 1
fi

db_env=$1
db_layer=$2
deploy_type=$3
tblist=$4

if [ ! -f "$tblist" ]
then
        echo "$tblist does not exist"
        exit 4
fi

conffile=./conf/`basename ${0} .sh`.conf
ts=`date +%Y%m%d%H%M%S`
sql_file=./`basename ${0} .sh`.sql
stg_file=./stg/`basename ${0} .sh`_${ts}.lst
dfmt="%Y-%m-%d %H:%M:%S------"

if [ -f $conffile ] 
then
	source $conffile
fi

case "$deploy_type" in
	table) 			db_name="${db_env}_${db_layer}";;
	full_view) 		db_name="${db_env}_${db_layer}_full_access";;
	restricted_view) 	db_name="${db_env}_${db_layer}_restricted_access";;
	*) 	echo "invalid deploy_type, must be table,full_view or restricted_view"
		exit 2;;
esac

echo `date +"$dfmt"`"start ${0} $@" 

in_clause=""

while IFS= read -r table_name
do
	if [ -n "$in_clause" ]
	then
		in_clause="${in_clause},'$table_name'"
	else
		in_clause="'$table_name'"
	fi
done< <(cat $tblist)

if [ -z "$in_clause" ]
then
	echo "no table to deploy"
	exit 5
fi

>${stg_file}

#impala-shell --quiet -i ird10139au.vsp.sas.com:25003  -Q "sync_ddl=1" -f ${sql_file}  --var="db_env=${db_env}"  --var="db_layer=${db_layer}" --var="deploy_type=${deploy_type}" --var="tblist=${in_clause}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem |tee -a ${stg_file}
impala-shell --quiet -i ird10139au.vsp.sas.com:25003  -Q "sync_ddl=1" -f ${sql_file}  --var="db_env=${db_env}"  --var="db_layer=${db_layer}" --var="deploy_type=${deploy_type}" --var="tblist=${in_clause}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem > ${stg_file}
sed -i 's/^"//g' $stg_file
sed -i 's/"$//g' $stg_file

rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_name} -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
echo `date +"$dfmt"`"${db_name} object count before deployment is $rc"
impala-shell --quiet -B -c -i ird10139au.vsp.sas.com:25003  -Q "sync_ddl=1" -f ${stg_file} --var="db_env=${db_env}"  --var="db_layer=${db_layer}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_name} -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
echo `date +"$dfmt"`"${db_name} object count after deployment is $rc"
