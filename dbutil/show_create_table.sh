#!/bin/bash
#set -x 
db=$1
ts=`date +%Y%m%d%H%M%S`
stlist=./stg/show_tables_${db}_${ts}.lst
sclist=./stg/show_create_table_${db}_${ts}.lst
scsql=./stg/show_create_table_${db}_${ts}.sql

if [ $# -eq 1 ]  || [ $# -eq 2 ] 
then
	if [ "$2" != "q" ] || [ ! -s $sclist ] 
	then
		./run_db_sqlb.sh $db "show tables" |sort> $stlist
		sed -e 's/^/show create table /g' -e 's/$/;/g' $stlist > $scsql
		./run_db_fileb.sh $db $scsql> $sclist
	fi
else
	echo "wrong # of arguments!" 
	echo "type `basename $0` <database> [q]" 
	exit 1
fi
