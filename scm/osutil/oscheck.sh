#!/bin/bash
#set -x
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

sql_file=$1
conffile=./conf/`basename ${0} .sh`.conf
body=./log/`basename ${0} .sh`.txt
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
dfmt="%Y-%m-%d %H:%M:%S------"

if [ $# -ne 1 ] 
then
        echo "wrong # of arguments!"
        echo "type $0 <sql_file>"
        exit 1
fi

if [ -f $conffile ]
then
        source $conffile
fi

# disk default threshold to 90 percent full
if ! ([ -n "$disk_threshold" ] && [ "$disk_threshold" -eq "$disk_threshold" ] 2>/dev/null)
then
        disk_threshold=90
fi

# cpu default to 20 percent idle
if ! ([ -n "$cpu_threshold" ] && [ "$cpu_threshold" -eq "$cpu_threshold" ] 2>/dev/null)
then
        cpu_threshold=0
fi

# mem default to 80 percent used
if ! ([ -n "$cpu_threshold" ] && [ "$cpu_threshold" -eq "$cpu_threshold" ] 2>/dev/null)
then
        cpu_threshold=0
fi

impala-shell --quiet -i ird26au.vsp.sas.com:25003  -d dev_raw --var="v1=${disk_threshold}" --var="v2=${mem_threshold}" --var="v3=${cpu_threshold}" --var="v4=${disk_exclude}" -f "${sql_file}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem >$body

sed -i 's/\r//g' $body

if [ -s $body ] && [ "$sendto" != "" ]
then
        mail -s "$subject" $sendto < $body
fi
