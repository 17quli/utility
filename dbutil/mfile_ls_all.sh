#!/bin/bash
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

ts=`date +%Y%m%d%H%M%S`
conffile=./conf/`basename ${0} .sh`.conf
body=./log/`basename ${0} .sh`.txt
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
dfmt="%Y-%m-%d %H:%M:%S------"
dt=`date -Iseconds`
dt=${dt:0:10}




if [ -f $conffile ]
then
        source $conffile
fi

if [ "${exclude}" = "" ]
then
        exclude="default"
fi

>$body

echo `date +"$dfmt"`"populating mfile" |tee -a $body

./run_db_sqlb.sh dev_raw "delete from mfile_ls where run_date='$dt';"

comm -23 <(./list_databases.sh |sort) <(echo ${exclude}|xargs|tr ' ' '\n'|sort)|while read line
do
	echo `date +"$dfmt"`"populate hdfs file for database $line" |tee -a $body
	./mfile_ls.sh "$line" 
done

impala-shell -i ird10139au.vsp.sas.com:25003  -d dev_raw --var="v1=$dt" -f mfile_ls.sql -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem

if [ "$sendto" != "" ]
then
        if [ "$sendfrom" = "" ]
        then
                sendfrom="dip-cloudera@sas.com"
        fi
        mail -s "$subject" -r "$sendfrom" "$sendto" < $body
fi
