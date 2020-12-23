#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

conffile=./conf/`basename ${0} .sh`.conf
db=$1
dt=$2
sclist=./stg/show_create_table_${db}.lst
mfilelist=./stg/`basename ${0} .sh`_tbl_${db}.lst
dfmt="%Y-%m-%d %H:%M:%S------"


if [ $# -ne 1 ] && [ $# -ne 2 ]
then
        echo "wrong # of arguments!" 
        echo "type $0 <database> [<date>]" 
        exit 1
fi

if [ "$dt" = "" ]
then
	dt=`date -Idate`
#	dt=${dt:0:10}
fi

>$mfilelist

echo `date +"$dfmt"`"truncate table dev_raw.mfile_stg" 
./run_db_sqlb.sh dev_raw "truncate table dev_raw.mfile_stg;"

echo `date +"$dfmt"`"list $db tables and write to $mfilelist" 
./list_tables.sh $db|while read line 
do
	statement=`sed -n "/\"CREATE TABLE ${db}.${line} (/,/\"/{p}" $sclist`
	if [[ "$statement" =~ "PARTITIONED BY (" ]]
	then
		if_partitioned="Y"
	else	
		if_partitioned="N"	
	fi
	stored_as=`echo $statement |awk -F "STORED AS " '{print $2}'|cut -d " " -f1`
	./run_db_sqlb.sh $db "show files in $line" |while read fl
	do
		printf '%s' "$dt" >>$mfilelist
		printf '\002' >>$mfilelist
		printf '%s' "$db" >>$mfilelist
		printf '\002' >>$mfilelist 
		printf '%s' "$line"  >>$mfilelist
		printf '\002' >>$mfilelist
		file_name=`echo "$fl"|cut -f1`
		printf '%s' "$file_name" >>$mfilelist
		printf '\002' >>$mfilelist
		printf '%s' "$if_partitioned" >>$mfilelist
		printf '\002' >>$mfilelist
		partition_name=`echo "$fl"|cut -f3`
		printf '%s' "$partition_name" >>$mfilelist
		printf '\002' >>$mfilelist
		printf '%s' "$stored_as" >>$mfilelist
		printf '\002' >>$mfilelist
		file_size=`echo "$fl"|cut -f2|sed -e "s/GB/*1024*1024*1024/g" -e "s/MB/*1024*1024/g" -e "s/KB/*1024/g" -e "s/B//g"`
		size=`echo "${file_size}"|bc`
		if [ -z "$size" ]
		then
			size=0
		else
			size=`echo "$size/1" |bc `
		fi
		printf '%s' "$size">>$mfilelist
		printf '\002' >>$mfilelist
        	printf '\003'>>$mfilelist
	done
done

echo `date +"$dfmt"`"upload $mfilelist to hdfs" 
hdfs dfs -put $mfilelist /env/1_dev/hive/raw/mfile_stg
echo `date +"$dfmt"`"refresh mfile_stg and upsert into mfile" 
./run_db_sqlb.sh dev_raw "refresh mfile_stg;upsert into mfile select * from mfile_stg;"
