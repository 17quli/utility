#!/bin/bash
#20200909	:cleanup stg older than 7 days
#set -x
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

find /home/ird0qal -name "*.log" -exec truncate -s 0 {} \;

if [ $# -eq 1 ]
then
        ndays=$1
else
        ndays=7
fi

touch -t `date  --date="${ndays} days ago" +%Y%m%d1859.00` fdtm

find /home/ird0qal/dbutil/stg -type f ! -cnewer fdtm -exec rm {} \;

