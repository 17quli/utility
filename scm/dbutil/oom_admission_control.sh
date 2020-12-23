#!/bin/bash
#set -x
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

sql_file=$1
interval_minute_from="$2"
interval_minute_to="$3"
conffile=./conf/`basename ${0} .sh`.conf
body=./log/`basename ${0} .sh`.txt
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
dfmt="%Y-%m-%d %H:%M:%S------"

if [ $# -lt 1 ] || [ $# -gt 3 ] 
then
        echo "wrong # of arguments!"
        echo "type $0 <sql_file> <from> <to>"
        exit 1
fi

if [ -f $conffile ]
then
        source $conffile
fi

# from default to 60 minutes
if ! ([ -n "$interval_minute_from" ] && [ "$interval_minute_from" -eq "$interval_minute_from" ] 2>/dev/null)
then
        interval_minute_from=-60
fi

# to default to 0 minutes
if ! ([ -n "$interval_minute_to" ] && [ "$interval_minute_to" -eq "$interval_minute_to" ] 2>/dev/null)
then
        interval_minute_to=0
fi

impala-shell --quiet -i ird26au.vsp.sas.com:25003  --var="v1=${interval_minute_from}" --var="v2=${interval_minute_to}" -f "${sql_file}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem >$body 

sed -i 's/\r//g' $body

if [ -s $body ] && [ "$sendto" != "" ]
then
        mail -s "$subject" $sendto < $body
fi
