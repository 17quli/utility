#!/bin/bash
#set -x 
db_name=$1

if [ $# -ne 1 ] 
then
	echo $#
	echo "type $0 <db_name>"
	exit 1
fi

impala-shell --quiet -i ird26au.vsp.sas.com:25003 -d ${db_name} -q "show tables;" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem >tbl.lst

line_cnt=`wc -l tbl.lst |cut -d " " -f1`
head_cnt=`expr $line_cnt - 1 `
tail_cnt=`expr $line_cnt - 4 ` 
table_cnt=`expr $line_cnt - 4 ` 
if [ $table_cnt -eq -4 ]
then
	table_cnt=0;
fi
head -n $head_cnt tbl.lst|tail -n $tail_cnt |cut -d "|" -f2 >tbl.sql
sed  -i -e 's/^/show table stats /g' -e 's/$/;/g' tbl.sql
impala-shell --quiet -i ird26au.vsp.sas.com:25003 -d ${db_name} -f tbl.sql -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem|grep "hdfs:" |awk -F "|" '{printf "%-80s%s%s\n", $9,":",$2}'|cut -d "/" -f8
