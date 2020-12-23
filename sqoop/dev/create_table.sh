#!/bin/bash
db_name=$1
sql_file=$2
p1=$3
logfile=./log/${0}.log
ct_file=ct_m${p1}.sql

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

#echo "hdfs dfs -mkdir -p /user/ird0qal/m${p1} "
echo "drop table if exists  m${p1};" |tee  $ct_file
echo "create table m${p1} ("|tee -a $ct_file
./run_db_file_p1.sh $db_name $sql_file $p1 |tee -a $ct_file
echo ") row format delimited fields terminated by '\001' stored as textfile;" |tee -a $ct_file
#echo ") row format delimited fields terminated by '\001' stored as textfile location '/user/ird0qal/m${p1}';" |tee -a $ct_file
