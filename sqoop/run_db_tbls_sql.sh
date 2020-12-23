#!/bin/bash
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)

if [ $# -ne 3 ] && [ $# -ne 4 ]
then
	echo "type $0 <db_name> <tbl_list> <sql> [<sql_suffix>]"
	exit 1
fi

db_name=$1
tbl_list=$2
sql=$3
sql_suffix=$4
ts=`date +%Y%m%d%H%M%S`
sql_file="./stg/`basename ${0} .sh`_${ts}.sql"

if [ ! -f $tbl_list ] 
then
	echo "${tbl_list} is not a valid file"
	exit 2
fi

sed -e "s/^/$sql /g" -e "s/$/ ${sql_suffix};/g" ${tbl_list} >$sql_file


impala-shell -c -i ird10139au.vsp.sas.com:25003  -f "${sql_file}" -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 2>>$logfile

rm -f $sql_file
