#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

if [ $# -ne 3 ]
then
        echo "wrong # of arguments!"
        echo "type $0 <database environment> <database layer> <table_list_file>"
        exit 1
fi

db_env=$1
db_layer=$2
tblist=$3

if [ ! -f "$tblist" ]
then
        echo "$tblist does not exist"
        exit 2
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

in_clause=""
>${stg_file}

while IFS= read -r table_name
do
        if [ -n "$in_clause" ]
        then
                in_clause="${in_clause},'$table_name'"
        else
                in_clause="'$table_name'"
        fi
done< <(cat $tblist)

rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer} -q "select count(1) from mdm" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem`
echo `date +"$dfmt"`"mdm row count before removal is $rc" 
echo `date +"$dfmt"`"start removing DDL from MDM for ${db_env}_${db_layer}" 
impala-shell -i ird10139au.vsp.sas.com:25003 --quiet -Q "sync_ddl=1" --quiet -d ${db_env}_${db_layer}  -q "delete from mdm where db_layer='$db_layer' and table_name in ($in_clause)" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer} -q "select count(1) from mdm" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem`
echo `date +"$dfmt"`"mdm row count after removal is $rc" 

rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer} -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
echo `date +"$dfmt"`"${db_env}_${db_layer} object count before removal is $rc"
./run_db_tbls_sqlb.sh "${db_env}_${db_layer}" $tblist "drop table if exists "
rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer} -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
echo `date +"$dfmt"`"${db_env}_${db_layer} object count after removal is $rc"


rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer}_full_access -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
echo `date +"$dfmt"`"${db_env}_${db_layer}_full_access object count before removal is $rc" 
./run_db_tbls_sqlb.sh "${db_env}_${db_layer}_full_access" $tblist "drop view if exists "
rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer}_full_access -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
echo `date +"$dfmt"`"${db_env}_${db_layer}_full_access object count after removal is $rc"

rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer}_restricted_access -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
echo `date +"$dfmt"`"${db_env}_${db_layer}_restricted_access object count before removal is $rc"
./run_db_tbls_sqlb.sh "${db_env}_${db_layer}_restricted_access" $tblist "drop view if exists "
rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer}_restricted_access -q "show tables" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|wc -l`
echo `date +"$dfmt"`"${db_env}_${db_layer}_restricted_access object count after removal is $rc"
