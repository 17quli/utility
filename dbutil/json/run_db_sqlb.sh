#!/bin/bash
execution_result=""
db_name=$1
sql=$2
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)

global_conf_file=./conf/impala-shell.conf
if [ -f "$global_conf_file" ]
then
        source "$global_conf_file"
else
        echo "please specify the connection detail in $global_conf_file"
        exit 2
fi


if [ $# -ne 2 ]
then
	echo "type $0 <db_name> <sql_file>"
	exit 1
fi

impala-shell -c -B --quiet -i "$imp_host" -q "${sql}" -d ${db_name}  -k --ssl --ca_cert="$imp_ca" 2>>$logfile
