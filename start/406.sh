#!/bin/bash
#20201018:      initial creation
#set -x
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1
dfmt="%Y-%m-%d %H:%M:%S------"
error_exit(){
        echo -e "`date +"${dfmt}"ERROR:`${1-"Unknown error"}"
        exit 1
}

test $# -eq 1 || error_exit "Wrong # of arguments! Type `basename $0` {dev|test|prod}"
db_env="$1"
read -p "you are about to move to $db_env ,press any key to continue..."
cd /home/ird0qal/dbutil
./tbsbackup.sh ${db_env}_raw ${db_env}_dw /home/ird0qal/start/breakfix.lst || error_exit "tables backup from ${db_env}_raw to ${db_env}_dw failed"
./tbsbackup.sh ${db_env}_jnl ${db_env}_dw /home/ird0qal/start/breakfix.lst || error_exit "tables backup from ${db_env}_jnl to ${db_env}_dw failed"
./tbscopy.sh dev_jnl ${db_env}_jnl /home/ird0qal/start/breakfix.lst || error_exit "tables copy from dev_jnl to ${db_env}_jnl failed"
cd /home/ird0qal/start/${db_env}
./redeploy.sh /home/ird0qal/start/breakfix.lst || error_exit "redeploy failed"
