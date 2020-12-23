#!/bin/bash
#set -x
logfile=./`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

./tdw.sh 50_tdw_backup.sql 
./tdw.sh 51_tdw_truncate.sql 
sleep 5
./tdw.sh 52_row_count.sql 
./tdw.sh 53_tdw_load_to_app.sql 
#tdw.sh 54_row_count.sql 
