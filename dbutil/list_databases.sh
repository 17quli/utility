#!/bin/bash
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

./run_sqlb.sh "show databases" |awk '{print $1}'
