#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

if [ $# -ne 3 ]
then
        echo "wrong # of arguments!"
        echo "type $0 <database environment> <database layer> <table_list_file>"
        exit 1
fi

db_env=$1
db_layer=$2
tblist=$3

if [ ! -f "$tblist" ]
then
        echo "$tblist does not exist"
        exit 2
fi

conffile=./conf/`basename ${0} .sh`.conf
ts=`date +%Y%m%d%H%M%S`
sql_file=./`basename ${0} .sh`.sql
stg_file=./stg/`basename ${0} .sh`_${ts}.lst
dfmt="%Y-%m-%d %H:%M:%S------"

if [ -f $conffile ]
then
        source $conffile
fi

case "$db_env" in
	test) _from=dev;;
        prod) _from=test;;
        *)      echo "promotion to ${db_env} not supported";exit 3
esac

if [ -z "$_from" ]
then
	echo "promotion_from is not configured in $conffile for $db_env"
       	exit 4
fi


./mtx.sh $db_env $db_layer mdm $tblist
./mtx.sh $db_env $db_layer table $tblist
./mtx.sh $db_env $db_layer full_view $tblist
./mtx.sh $db_env $db_layer restricted_view $tblist
