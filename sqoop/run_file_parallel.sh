#!/bin/bash
#set -x
sql_file=$1
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

conffile=./conf/`basename ${0} .sh`.conf

dt=`date +%Y%m%d%H%M%S`


if [ $# -ne 1 ]
then
	echo "type $0 <sql_file>"
	exit 1
fi

if [ ! -f $sql_file ]
then
        echo "${sql_file} is not a valid file"
        exit 2
fi

if [ -f $conffile ]
then
        source $conffile
fi


if [ "${parallel}" = "" ]
then
        parallel=6
fi

parallelm1=`expr $parallel - 1`
pidlist=./stg/pid_$$_${dt}.lst
>$pidlist
rm -f ${sql_file}[0-$parallel] 

wcl=`wc -l<${sql_file}`

if [ $wcl -gt $parallel ]
then
	split -n l/${parallel} ${sql_file} ${sql_file} -da 1
	for ((i=0;i<${parallel};i++))
	do
		sql_file_split="${sql_file}${i}"
		if [ -f $sql_file_split ]
		then
			nohup impala-shell -c -B --quiet -i ird10139au.vsp.sas.com:25003  -f ${sql_file_split} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem &
			echo $! >>$pidlist
		fi
	done
	wait <$pidlist
else
	impala-shell -c -B --quiet -i ird10139au.vsp.sas.com:25003  -f ${sql_file} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem 
fi
rm -f $pidlist
rm -f ${sql_file}[0-$parallel] 
