#!/bin/bash
#set -x
cd `dirname $0`
json2txtcmd=./json2txt.sh
logfile=./log/`basename ${0} .sh`.log
dfmt="%Y-%m-%d %H:%M:%S------"
jsonfile=./temp_load.json


#truncate staging table
./run_db_sql.sh dev_raw "truncate table query_stg" |tee -a $logfile

wget --user ird0qal --password `cat .pass` -O $jsonfile https://ird01au.vsp.sas.com:7183/api/v19/clusters/IRD-PRD-01/services/impala/impalaQueries?from=2020-04-07T15:50:00Z\&to=2020-04-07T15:55:00Z\&limit=1000 |tee -a $logfile
#	wget --user ird0qal --password `cat .pass` -O $jsonfile https://ird01au.vsp.sas.com:7183/api/v19/clusters/IRD-PRD-01/services/impala/impalaQueries?from=${fromts}\&to=${fromtsnext}\&limit=1000\&filter=\(query_duration\>5s\)\&executing=false 2>1|tee -a $logfile

./$json2txtcmd $jsonfile |tee -a $logfile 
