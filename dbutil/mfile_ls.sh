#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

conffile=./conf/`basename ${0} .sh`.conf
db=$1
dt=`date -Idate`
sclist=./stg/show_create_table_${db}.lst
mfilelist=./stg/`basename ${0} .sh`_${db}.lst
dfmt="%Y-%m-%d %H:%M:%S------"


if [ $# -ne 1 ] 
then
        echo "wrong # of arguments!" 
        echo "type $0 <database>"
        exit 1
fi

>$mfilelist

echo `date +"$dfmt"`"truncate table dev_raw.mfile_ls_stg" 
./run_db_sqlb.sh dev_raw "truncate table dev_raw.mfile_ls_stg;"

db_uri=`impala-shell -i ird10139au.vsp.sas.com:25003  -q "describe database ${db};" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'`
hdfs dfs -ls -R "$db_uri"|sed -e '/^d/d'|awk '{print $8"\002"$6" "$7":00\002"$5}'|while read line
do
	printf '%s' "$dt" >>$mfilelist
	printf '\002' >>$mfilelist
	printf '%s' "$line" >>$mfilelist
	printf '\003'>>$mfilelist
done

echo `date +"$dfmt"`"upload $mfilelist to hdfs" 
hdfs dfs -put $mfilelist /env/1_dev/hive/raw/mfile_ls_stg
echo `date +"$dfmt"`"refresh mfile_ls_stg and upsert into mfile_ls" 
./run_db_sqlb.sh dev_raw "refresh mfile_ls_stg;upsert into mfile_ls select * from mfile_ls_stg;"
