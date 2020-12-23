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
        exit 4
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

./deploy_object.sh $db_env $db_layer table $tblist
./deploy_object.sh $db_env $db_layer full_view $tblist
./deploy_object.sh $db_env $db_layer restricted_view $tblist