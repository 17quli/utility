#!/bin/bash
#set -x
db_name=$1
sql_file=$2
parallel=6
parallelm1=`expr $parallel - 1`
logfile=./log/`basename ${0} .sh`.log

rm -f ${sql_file}[0-$parallel] 

if [ $# -ne 2 ]
then
	echo "type $0 <db_name> <sql_file>"|tee -a $logfile
	exit 1
fi

if [ ! -f $sql_file ]
then
        echo "${sql_file} is not a valid file"|tee -a $logfile
        exit 2
fi

wcl=`wc -l<${sql_file}`

if [ $wcl -gt $parallel ]
then
	split -l$((`wc -l < ${sql_file}`/${parallelm1})) ${sql_file} ${sql_file} -da 1
	for ((i=0;i<${parallel};i++))
	do
		sql_file_split="${sql_file}${i}"
		if [ -f $sql_file_split ]
		then
			nohup impala-shell -i ird26au.vsp.sas.com:25003  -f ${sql_file_split} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 2>&1|tee -a $logfile &
		fi
	done
else
	impala-shell -i ird26au.vsp.sas.com:25003  -f ${sql_file} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem 2>&1|tee -a $logfile 
fi
