#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

conffile=./conf/`basename ${0} .sh`.conf
db=$1
sclist=./stg/show_create_table_${db}.lst
mtbl=./stg/`basename ${0} .sh`_tbl_${db}.lst
dt=`date -Iseconds`
dt=${dt:0:19}
dfmt="%Y-%m-%d %H:%M:%S------"


if [ $# -ne 1 ]
then
        echo "wrong # of arguments!" 
        echo "type $0 <database>" 
        exit 1
fi

>$mtbl


echo `date +"$dfmt"`"start show create table for $db " 
./show_create_table.sh $db
echo `date +"$dfmt"`"complete show create table for  $db" 
