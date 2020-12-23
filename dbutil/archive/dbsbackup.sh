#!/bin/bash
#set -x 
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

dblist=./conf/`basename ${0} .sh`.list
conffile=./conf/`basename ${0} .sh`.conf
body=./log/`basename ${0} .sh`.txt
ts=`date +%Y%m%d%H%M%S`
pidlist=./stg/pid_${ts}.lst
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
>$pidlist
concurrency=0

echo `date +"$dfmt"`"start databases backup" |tee -a $body
echo "--------------------------------------------------------------------------------------------" |tee -a $body

while read line
do
        if [ "${line:0:1}" != "#" ]
        then
                set -- $line
		sequence=$1
                source_db=$2
                target_db=$3
                retention=$4
		if [ -z "$old_sequence" ]
		then
			old_sequence=$sequence
		fi
		if [ "$sequence" -ne "$old_sequence" ] 
		then
	                wait <$pidlist
       		        >$pidlist
                	concurrency=0
		fi
                nohup ./dbbackup.sh $source_db $target_db $retention &
		echo $! >>$pidlist
		concurrency=`expr $concurrency + 1`
		sleep 2
        fi
	if [ "$concurrency" -ge "$parallel" ] 
	then
		wait <$pidlist
		>$pidlist
		concurrency=0
	fi
	old_sequence=$sequence
done< <(sort $dblist)

wait <$pidlist

echo `date +"$dfmt"`"databases backup completed" |tee -a $body

if [ "$sendto" != "" ]
then
	if [ "$sendfrom" = "" ]
        then
                sendfrom="dip-cloudera@sas.com"
        fi
        mail -s "$subject" -r "$sendfrom" "$sendto" < $body
fi
