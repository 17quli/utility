#!/bin/bash
#set -x
dir=$1
logfile=./log/`basename ${0} .sh`.log

if [ $# -ne 1 ]
then
        echo "type $0 <dir>"|tee -a $logfile
        exit 1
fi

if [ ! -d $1 ]
then
	echo "directory ${dir} does not exist!"|tee -a $logfile
	exit 2
fi

find ${dir} -name "*.load" >load.lst
awk -F "/" '{print "hdfs dfs -mkdir -p /env/1_dev/hive/raw/hdfs_file_stat/ptn_dt="$1"/ptn_db="$2}' load.lst >put.sh
awk -F "/" '{print "hdfs dfs -put "$1"/"$2"/"$3" /env/1_dev/hive/raw/hdfs_file_stat/ptn_dt="$1"/ptn_db="$2}' load.lst >>put.sh
awk -F "/" '{print "alter table hdfs_file_stat add partition(ptn_dt="$1",ptn_db=\x27"$2"\x27);"}' load.lst >alter_table.sql

find ${dir} -name "*.file" >load.lst
awk -F "/" '{print "hdfs dfs -mkdir -p /env/1_dev/hive/raw/hdfs_file_detail/ptn_dt="$1"/ptn_db="$2}' load.lst >>put.sh
awk -F "/" '{print "hdfs dfs -put "$1"/"$2"/"$3" /env/1_dev/hive/raw/hdfs_file_detail/ptn_dt="$1"/ptn_db="$2}' load.lst >>put.sh
awk -F "/" '{print "alter table hdfs_file_detail add partition(ptn_dt="$1",ptn_db=\x27"$2"\x27);"}' load.lst >>alter_table.sql
echo "./run_db_file.sh dev_raw alter_table.sql" >>put.sh
