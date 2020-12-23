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

while  [ `echo "$from"|cut -d '+' -f1|sed -e 's/\-//g' -e 's/\://g' -e 's/T//g'` -lt  `echo "$to"|cut -d '+' -f1|sed -e 's/\-//g' -e 's/\://g' -e 's/T//g'` ]
do
	linecount=1000
	offset=0
	i=0
	hour=`date -d "$from" +%H`
        fromts=`date -u -d @$(date -d "$from" +%s) "+%Y-%m-%dT%H:%M:%SZ"`
	>$pidlist

	#truncate staging table
	./run_db_sqlb.sh dev_raw "truncate table mquery_stg" 
#	if [[ "$peak_hours" =~ "$hour" ]]
#        then
#        	fromtsnext=`date -u -d @$(date -d "$from +${peak_step} minute" +%s) "+%Y-%m-%dT%H:%M:%SZ"`
#		from=`date -Iseconds -d "$from +${peak_step} minute"`
#	else
	fromtsnext=`date -u -d @$(date -d "$from +${step} minute" +%s) "+%Y-%m-%dT%H:%M:%SZ"`
	from=`date -Iseconds -d "$from +${step} minute"`
#	fi

	while [ "$linecount" -ge 1000 ]
	do
		jsonfile=./stg/`date -d "$from" "+%Y%m%d%H%M%S"`_${offset}.json
		echo `date +"$dfmt"`"start getting json file from $fromts to $fromtsnext offset $offset" |tee -a $body
	#	wget --user ird0qal --password `cat .pass` -O ${jsonfile} https://ird01au.vsp.sas.com:7183/api/v19/clusters/IRD-PRD-01/services/impala/impalaQueries?from=${fromts}\&to=${fromtsnext}\&limit=1000\&offset=${offset} 
		wget --user ird0qal --password `cat .pass` -O $jsonfile https://ird01au.vsp.sas.com:7183/api/v19/clusters/IRD-PRD-01/services/impala/impalaQueries?from=${fromts}\&to=${fromtsnext}\&limit=1000\&filter=\(query_duration\>${query_duration}s\)\&offset=${offset} 
		linecount=`grep '"queryId" : ' $jsonfile |wc -l`
		i=`expr $i + 1`
		(./$json2txtcmd $jsonfile |tee -a $body) & 
		echo $! >>$pidlist
		if [ $i -ge $parallel ]
		then
			wait <$pidlist
			i=0
			>$pidlist
		fi
		offset=`expr $offset + 1000`
	done
	wait <$pidlist
	echo `date +"$dfmt"`"load from staging into mquery" |tee -a $body
	./run_db_sqlb.sh dev_raw "refresh mquery_stg;upsert into mquery select * from mquery_stg;"
done



if [ "$sendto" != "" ]
then
        mail -s "$subject" $sendto < $body
fi
rm -f $pidlist $body
