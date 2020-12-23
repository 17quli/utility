#!/bin/bash
table_list=$1

if [ $# -ne 1 ] 
then
	echo "Wrong number of arguments. Please type: $0 <table_list_file> ]"
	exit 1
fi

test -f "$table_list" || exit
while read table_name
do
	echo "$table_name"
	./01_create_table.sh $table_name
	./03_create_full_view.sh $table_name
	./04_create_restricted_view.sh $table_name
done< <(sed -e '/^#/d' -e '/^ *$/d' "$table_list")

