#!/bin/bash
execution_result=""
db_name=$1
tbl_list=$2
sql=$3
sql_file="${tbl_lst}.sql"
logfile=./log/`basename ${0} .sh`.log

if [ $# -ne 3 ]
then
	echo "type $0 <db_name> <tbl_list> <sql>"|tee -a $logfile
	exit 1
fi

echo "executing ${0} ${db_name} ${tbl_list} ${sql}......"|tee -a $logfile
if [ ! -f $tbl_list ] 
then
	echo "${tbl_list} is not a valid file"|tee -a $logfile
	exit 2
fi

sed -e "s/^/$sql /g" -e "s/$/;/g" ${tbl_list} >$sql_file

impala-shell -i ird26au.vsp.sas.com:25003  -f "${sql_file}" -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 2>&1|tee -a $logfile

rm -f $sql_file
