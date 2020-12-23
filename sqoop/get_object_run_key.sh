#!/bin/bash
#20201118:    initial creation by Quan Lian
#set -x
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

dfmt="%Y-%m-%d %H:%M:%S------"
env_list="dev test prod"
retry=3
error_exit(){
        echo -e "`date +"$dfmt"`${1-"Unknown error"}" 1>&2
        exit 1
}

env=$1

test $# -eq 1 || error_exit "Wrong # of arguments! Type `basename $0` <env>"
(echo $env_list|grep -w -q $env) || error_exit "Incorrect value for environment! can only be one of $env_list"
object_run_key=""

case $env in 
dev) object_run_key=`ssh -n -q ird10120au.vsp.sas.com "sqoop/get_object_run_key.sh"`;;
esac

i=0
while test -z "$object_run_key" && test "$i" -lt "$retry"
do
	case $env in
		dev) object_run_key=`ssh -n -q ird10120au.vsp.sas.com "sqoop/get_object_run_key.sh"`;;
	esac
	i=`expr $i + 1`
done

test -n $object_run_key || error_exit "failed to get object_run_key"
echo "$object_run_key"
