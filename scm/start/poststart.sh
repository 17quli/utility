#!/bin/bash
table_name=$1
lab_project=$2

if [ $# -ne 2 ] && [ $# -ne 1 ] 
then
	echo "Wrong number of arguments. Please type: $0 <table_name> [<lab_project>]"
	exit 1
fi

02_copy_table.sh $table_name
sleep 5

03_create_full_view.sh $table_name

04_create_restricted_view.sh $table_name

if [ "$lab_project" != "" ]
then
	05_create_lab_view.sh $table_name $lab_project
fi

sleep 5

cmd.sh 10_validate_table.sql $table_name $lab_project

