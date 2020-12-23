#!/bin/bash
#set -x 
db=$1
stlist=./stg/show_tables_${db}.lst
sclist=./stg/show_create_table_${db}.lst
scsql=./stg/show_create_table_${db}.sql

if [ $# -eq 1 ]  || [ $# -eq 2 ]
then
        if [ "$2" != "q" ] || [ ! -s $sclist ]
        then
		./run_db_sqlb.sh $db "show tables" > $stlist
		sed -e 's/^/show create table /g' -e 's/$/;/g' $stlist > $scsql
		./run_db_fileb.sh $db $scsql> $sclist
	fi
	grep "CREATE VIEW" $sclist|cut -d "." -f2|cut -d " " -f1
        #comm -23 $stlist <(grep "CREATE TABLE" $sclist|cut -d "(" -f1 |awk -F "." '{gsub(/ /,"",$2);print $2}')
else
	echo "wrong # of arguments!" 
	echo "type `basename $0` <database> [q]" 
	exit 1
fi
