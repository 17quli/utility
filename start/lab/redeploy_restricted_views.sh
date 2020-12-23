#!/bin/bash
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

if [ $# -ne 1 ]
then
        echo "type $0 <table_name>"
        exit 1
fi

table_list=$1

if ! [ -f $table_list ]
then
	echo "$table_list not exists"
	exit 2
fi

while read table_name
do
	./14_recreate_restricted_view.sh $table_name
	./cmd.sh 10_validate_table.sql $table_name
done < <(cat $table_list |sed '/^[[:space:]]*$/d')

