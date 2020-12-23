#!/bin/bash
#set -x
cd `dirname $0`
json2txtcmd=./json2txt.sh
logfile=./log/`basename ${0} .sh`.log
conffile=./conf/`basename ${0} .sh`.conf
ts=`date +%Y%m%d%H%M%S`
body=./log/body_${ts}.txt
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
tsto=`date -u "+%Y-%m-%dT%H:%M:%SZ"`
dfmt="%Y-%m-%d %H:%M:%S------"
pidlist=./stg/pid_$$.lst
offset=0

exec> >(tee -a $logfile)
exec 2>&1

if [ -f $conffile ]
then
	source $conffile
	if [ $? -ne 0 ] 
	then
		exit $?
	fi
fi

if [ "$from" = "" ]
then
	#default to 24 hours ago
	from=`date -d "24 hours ago" -Iseconds`
fi


if [ "to" = "" ]
then
	#default to now
	to=`date -Iseconds` 
fi

if [ "$step" = "" ] || ! [ "$step" -eq "$step" ] 2>/dev/null
then
	#default to 60 minutes
	step=60
fi

if [ "$parallel" = "" ] || ! [ "$parallel" -eq "$parallel" ] 2>/dev/null
then
	#default to parallel json2txt 
	parallel=8
fi

#if [ "$peak_hours" = "" ] 
#then
	#default to 04 21
#	peak_hours="04 21"
#fi

if [ "$query_duration" = "" ] || ! [ "$query_duration" -eq "$query_duration" ] 2>/dev/null
then
	#default to 60 minutes
	query_duration=5
fi

if [ $# -eq 1 ]
then
 	if [ -n "$1" ] && [ "$1" -eq "$1" ] 2>/dev/null
        then
		to=`date -Iseconds`
		from=`date -Iseconds -d "$1 hours ago"`
        else
                echo "$1 is not a valid number of hours!"
                exit 1
        fi
fi

>$body

		jsonfile=./stg/`date -d "$from" "+%Y%m%d%H%M%S"`_${offset}.json
		echo `date +"$dfmt"`"start getting json file from $fromts to $fromtsnext offset $offset" |tee -a $body
	#	wget --user ird0qal --password `cat .pass` -O ${jsonfile} https://ird01au.vsp.sas.com:7183/api/v19/clusters/IRD-PRD-01/services/impala/impalaQueries?from=${fromts}\&to=${fromtsnext}\&limit=1000\&offset=${offset} 
		wget --user ird0qal --password `cat .pass` -O $jsonfile https://ird01au.vsp.sas.com:7183/api/v19/clusters/IRD-PRD-01/services/impala/impalaQueries?from=2020-04-15T01:59:00Z\&to=2020-04-15T02:03:00Z\&limit=1000\&filter=\(thread_network_receive_wait_time=85767\)
		#wget --user ird0qal --password `cat .pass` -O $jsonfile https://ird01au.vsp.sas.com:7183/api/v19/clusters/IRD-PRD-01/services/impala/impalaQueries?filter=\(query_duration\>4s and query_duration\<5s and user\=ird0jxm3\) 
		./$json2txtcmd $jsonfile |tee -a $body
		echo `date +"$dfmt"`"load from staging into mquery" |tee -a $body
	        ./run_db_sqlb.sh dev_raw "refresh mquery_stg;upsert into mquery select * from mquery_stg;"



if [ "$sendto" != "" ]
then
        mail -s "$subject" $sendto < $body
fi
rm -f $pidlist $body
