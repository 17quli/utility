#!/bin/bash
tbl_list=$1
sql=$2
sql_file="${tbl_lst}.sql"
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)

if [ $# -ne 2 ]
then
	echo "type $0  <tbl_list> <sql>"
	exit 1
fi

if [ ! -f $tbl_list ] 
then
	echo "${tbl_list} is not a valid file"
	exit 2
fi

sed -e "s/^/$sql /g" -e "s/$/;/g" ${tbl_list} >$sql_file

impala-shell -B --quiet -c -i ird26au.vsp.sas.com:25003  -f "${sql_file}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 2>>$logfile

rm -f $sql_file
