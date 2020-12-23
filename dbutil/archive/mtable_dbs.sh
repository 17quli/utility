#!/bin/bash
#20200924:	initial creation
#set -x
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

dblist=./conf/`basename ${0} .sh`.list
conffile=./conf/`basename ${0} .sh`.conf
body=./log/`basename ${0} .sh`.txt
ts=`date +%Y%m%d%H%M%S`
pidlist=./stg/pid_${dt}.lst
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
dfmt="%Y-%m-%d %H:%M:%S------"

if [ -f "$conffile" ]
then
        source $conffile
fi

if [ ! -f "$dblist" ]
then
        echo "dbbackup list file $dblist not exists!"
        exit 1
fi

>$body

echo `date +"$dfmt"`"start `basename ${0} .sh`" |tee -a $body

while read line
do
	if [ "${line:0:1}" != "#" ]
        then
		./mtable.sh $line
	fi
done< <(sort $dblist)

echo `date +"$dfmt"`"`basename ${0} .sh` completed" |tee -a $body

if [ "$sendto" != "" ]
then
        if [ "$sendfrom" = "" ]
        then
                sendfrom="dip-cloudera@sas.com"
        fi
        mail -s "$subject" -r "$sendfrom" "$sendto" < $body
fi

