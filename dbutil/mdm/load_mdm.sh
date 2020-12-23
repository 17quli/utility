#!/bin/bash
#set -x 
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

conffile=./conf/`basename ${0} .sh`.conf
ts=`date +%Y%m%d%H%M%S`
sql_file=./load_mdm.sql
stg_file=./stg/`basename ${0} .sh`_${ts}.lst
dfmt="%Y-%m-%d %H:%M:%S------"

echo `date +"$dfmt"`"start ${0}" |tee -a $body

if [ -f $conffile ] 
then
	source $conffile
fi

if [ -z "$table_dir" ]
then
	echo "please specify table_dir in $conffile"
	exit 1
fi

if [ -z "$view_dir" ]
then
	echo "please specify view_dir in $conffile"
	exit 2
fi

if [ $# -ne 1 ]
then
        echo "type $0 <tblist> "
        exit 3
fi

tblist="$1"

if [ ! -f "$tblist" ]
then
        echo "$tblist does not exist"
        exit 4
fi


db_env='dev'
db_layer='raw'

>${stg_file}

while IFS= read -r table_name
do
	echo `date +"$dfmt"`"load DDL for table $table_name " |tee -a $body
	full_path="${table_dir}/${table_name}-create.ddl"
	table_ddl=`sed -e 's/\${var:target_db}/\${var:db_env}_\${var:db_layer}/gI' "$full_path"`

	full_view="$view_dir"/"${table_name}-full.ddl"
	if [ -f $full_view ]
	then
       	 full_view_ddl=`sed -e 's/\${var:view_db}/\${var:db_env}_\${var:db_layer}_full_access/gI' -e 's/\${var:source_db}/\${var:db_env}_\${var:db_layer}/gI' $full_view`
	else
       	 full_view_ddl=""
	fi

	restricted_view="$view_dir"/"${table_name}-restricted.ddl"
	if [ -f $restricted_view ]
	then
       	 restricted_view_ddl=`sed -e 's/\${var:view_db}/\${var:db_env}_\${var:db_layer}_restricted_access/gI' -e 's/\${var:source_db}/\${var:db_env}_\${var:db_layer}/gI' $full_view`
	else
       	 restricted_view_ddl=""
	fi
	now=`date +"%Y-%m-%d %H:%M:%S"`
	printf '%s' "${db_layer}">>$stg_file
	printf '\002' >>$stg_file
	printf '%s' "${table_name}">>$stg_file
	printf '\002' >>$stg_file
	printf '%s' "${table_ddl}">>$stg_file
	printf '\002' >>$stg_file
	printf '%s' "${full_view_ddl}">>$stg_file
	printf '\002' >>$stg_file
	printf '%s' "${restricted_view_ddl}">>$stg_file
	printf '\002' >>$stg_file
	printf '%s' "${now}">>$stg_file
	printf '\003' >>$stg_file
done< <(cat $tblist)

impala-shell -i ird10139au.vsp.sas.com:25003  --quiet -d ${db_env}_${db_layer} -q "truncate table mdm_stg" --query_option="sync_ddl=1" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem >/dev/null

echo `date +"$dfmt"`"start uploading text file $txtstg to HDFS"
hdfs dfs -put -f $stg_file /env/1_${db_env}/hive/${db_layer}/mdm_stg

impala-shell -i ird10139au.vsp.sas.com:25003 --quiet -d ${db_env}_${db_layer} -q "refresh mdm_stg" --query_option="sync_ddl=1" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem

rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer} -q "select count(1) from mdm" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem`
echo `date +"$dfmt"`"mdm row count before load is $rc"


impala-shell -i ird10139au.vsp.sas.com:25003  --quiet -d ${db_env}_${db_layer}  -q "upsert into mdm select * from mdm_stg" --query_option="sync_ddl=1" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem

rc=`impala-shell -i ird10139au.vsp.sas.com:25003 -B --quiet -d ${db_env}_${db_layer} -q "select count(1) from mdm" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem`
echo `date +"$dfmt"`"mdm row count after load is $rc"
