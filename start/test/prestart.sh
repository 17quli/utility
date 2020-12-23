#!/bin/bash
table_name=$1

if [ $# -ne 1 ]
then
	echo "Wrong number of arguments. Please type: $0 <table_name>"
	exit 1
fi

./01_create_table.sh $table_name
