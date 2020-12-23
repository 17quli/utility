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

case "$deploy_type" in
        table)                  db_name="${db_env}_${db_layer}";;
        full_view)              db_name="${db_env}_${db_layer}_full_access";;
        restricted_view)        db_name="${db_env}_${db_layer}_restricted_access";;
        mdm)        		db_name="${db_env}_${db_layer}";;
        *)      echo "invalid deploy_type, must be mdm,table,full_view or restricted_view"
                exit 2;;
esac



if [ "$deploy_type" = "mdm" ]
then
	case "$db_env" in
		test) _from=dev;;
		prod) _from=test;;
		*)	echo "promotion to ${db_env} not supported";exit 3
	esac

	if [ -z "$_from" ]
	then
		echo "promotion_from is not configured in $conffile for $db_env"
		exit 3
	fi

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

	echo `date +"$dfmt"`"start promoting DDL from ${_from} to ${db_env}" 

	rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer} -q "select count(1) from mdm" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem`
	echo `date +"$dfmt"`"$db_name mdm row count before promotion is $rc"
	impala-shell -i ird10139au.vsp.sas.com:25003 --quiet -Q "sync_ddl=1" --quiet -d ${db_env}_${db_layer}  -q "upsert into mdm select * from ${_from}_${db_layer}.mdm where db_layer='$db_layer' and table_name in ($in_clause)" --query_option="sync_ddl=1" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
	rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer} -q "select count(1) from mdm" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem`
	echo `date +"$dfmt"`"$db_name mdm row count after load is $rc"
else
	./deploy_object.sh ${db_env} ${db_layer} $deploy_type $tblist
fi
