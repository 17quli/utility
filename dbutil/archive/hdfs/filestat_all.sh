#!/bin/bash
#set -x 
cd /home/ird0qal/hdfs
logfile=./log/${0}.log
dblist=dblist
yyyymmdd=`date +%Y%m%d`
while read dbs
do
        if [ ${dbs:0:1} != "#" ]
        then
                echo "${dbs}:" |tee -a ${logfile}
		./filestat.sh ${dbs}  2>&1 |tee -a ${logfile} 
        fi
done <${dblist}
./gen_put.sh $yyyymmdd 2>&1 |tee -a ${logfile}
./put.sh 2>&1 |tee -a ${logfile}
