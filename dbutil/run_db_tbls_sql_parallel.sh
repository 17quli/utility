#!/bin/bash
logfile=./log/`basename ${0} .sh`.log
conffile=./conf/`basename ${0} .sh`.conf

exec> >(tee -a $logfile)

if [ $# -ne 3 ] && [ $# -ne 4 ]
then
	echo "type $0 <db_name> <tbl_list> <sql> [<sql_suffix>]"
	exit 1
fi

db_name=$1
tbl_list=$2
sql=$3
sql_suffix=$4
ts=`date +%Y%m%d%H%M%S`
sql_file="./stg/`basename ${0} .sh`_${ts}.sql"

if [ ! -f $tbl_list ] 
then
	echo "${tbl_list} is not a valid file"
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

if [ "${parallel}" -gt 8 ]
then
        parallel=8
fi

sed -e "s/^/$sql /g" -e "s/$/ ${sql_suffix};/g" ${tbl_list} >$sql_file

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
                        nohup impala-shell -c -i ird10139au.vsp.sas.com:25003 -f ${sql_file_split} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem &
                        echo $! >>$pidlist
                fi
        done
        wait <$pidlist
else
        impala-shell -c -i ird10139au.vsp.sas.com:25003  -f ${sql_file} -d ${db_name}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
fi
rm -f $pidlist
rm -f ${sql_file}[0-$parallel]
rm -f $sql_file
