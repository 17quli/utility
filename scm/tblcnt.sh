#!/bin/bash
db_name=$1
line_no=0

if [ $# -ne 1 ] 
then
	echo $#
	echo "type $0 <db_name>"
	exit 1
fi

impala-shell --quiet -i ird26au.vsp.sas.com:25003 --database ${db_name} -q "show tables;" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem >tbl.lst

line_cnt=`wc -l tbl.lst |cut -d " " -f1`
table_cnt=`expr $line_cnt - 4 `
if [ $table_cnt -eq -4 ]
then
	table_cnt=0;
fi
echo "${table_cnt}:${db_name}"

