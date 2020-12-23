#!/bin/bash
db_name=$1
sql_file=$2
p1=$3
logfile=./log/${0}.log
ct_file=create_${p1}.sql

if [ $# -ne 3 ]
then
	echo "type $0 <db_name> <sql_file> <p1>"|tee -a $logfile
	exit 1
fi

if [ ! -f $sql_file ]
then
        echo "${sql_file} is not a valid file"|tee -a $logfile
        exit 2
fi

echo "create table ${p1} ("|tee $ct_file
./run_db_file_p1.sh $db_name $sql_file $p1 |tee -a $ct_file
echo ") stored as parquet;" |tee -a $ct_file
