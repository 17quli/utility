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

if [ -f $conffile ]
then
        source $conffile
fi

if [ "${exclude}" = "" ]
then
        exclude="default"
fi


>$body

echo `date +"$dfmt"`"populating mtable" |tee -a $body


comm -23 <(./list_databases.sh |sort) <(echo ${exclude}|xargs|tr ' ' '\n'|sort)|while read line
do
	echo `date +"$dfmt"`"populate meta data for database $line" |tee -a $body
	./mtable.sh $line
done

./run_db_sqlb.sh dev_raw "insert into mtable_sum select db_name,now(),cast(count(1) as int),sum(hdfs_size),sum(select_row_count),sum(stat_row_count) from mtable where object_type='table'group by db_name"

if [ "$sendto" != "" ]
then
        if [ "$sendfrom" = "" ]
        then
                sendfrom="dip-cloudera@sas.com"
        fi
        mail -s "$subject" -r "$sendfrom" "$sendto" < $body
fi
