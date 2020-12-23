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
removal_type=$3
tblist=$4

if [ ! -f "$tblist" ]
then
        echo "$tblist does not exist"
        exit 2
fi

conffile=./conf/`basename ${0} .sh`.conf
ts=`date +%Y%m%d%H%M%S`
sql_file=./`basename ${0} .sh`.sql
dfmt="%Y-%m-%d %H:%M:%S------"

if [ -f $conffile ]
then
        source $conffile
fi

case "$removal_type" in
        table)                  db_name="${db_env}_${db_layer}";object_type="table";;
        full_view)              db_name="${db_env}_${db_layer}_full_access";object_type="view";;
        restricted_view)        db_name="${db_env}_${db_layer}_restricted_access";object_type="view";;
        mdm)                  	db_name="${db_env}_${db_layer}";;
        *)      echo "invalid removal_type, must be table,full_view or restricted_view"
                exit 2;;
esac

if [ "$removal_type" = "mdm" ]
then
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

	rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_name} -q "select count(1) from mdm" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem`
	echo `date +"$dfmt"`"${db_name} mdm row count before removal is $rc" 
	impala-shell -i ird10139au.vsp.sas.com:25003 --quiet -Q "sync_ddl=1" --quiet -d ${db_env}_${db_layer}  -q "delete from mdm where db_layer='$db_layer' and table_name in ($in_clause)" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
	rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer} -q "select count(1) from mdm" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem`
	echo `date +"$dfmt"`"${db_name} mdm row count after removal is $rc" 
else

	rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_name} -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
	echo `date +"$dfmt"`"${db_name} object count before removal is $rc"
	./run_db_tbls_sqlb.sh "${db_name}" $tblist "drop $object_type if exists "
	rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_name} -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
	echo `date +"$dfmt"`"${db_name} object count after removal is $rc"
fi
