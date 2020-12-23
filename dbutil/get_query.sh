#!/bin/bash
set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

sql_file=$1
interval_minute_from="$2"
interval_minute_to="$3"

if [ $# -lt 1 ] || [ $# -gt 3 ] then
then
        echo "wrong # of arguments!"
        echo "type $0 <sql_file> <from> <to>"
        exit 1
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

impala-shell -i ird10139au.vsp.sas.com:25003  --var="v1=${interval_minute_from}" --var="v2=${interval_minute_to}" -f "${sql_file}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem  2>>$logfile
