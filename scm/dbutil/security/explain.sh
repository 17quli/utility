#!/bin/bash

logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

dfmt="%Y-%m-%d %H:%M:%S------"
export USER=`whoami`
export PYTHON_EGG_CACHE="/tmp/impala-shell-python-egg-cache-$USER"

dfmt="%Y-%m-%d %H:%M:%S------"
#echo "please enter or paste SQL, type enter and then Ctrl+D to finish"
echo "please enter or paste SQL terminated by ; or hit ctl-c to exit"
#SQL="$(</dev/stdin)"
SQL=$(read -erd ";" v; echo "$v")
SQL="explain `echo "$SQL" |sed -e 's/;//g' -e 's/^ *explain *//g'`"

while getopts "l:u:" option
do
        case $option in
         l)     explain_level="set explain_level=${OPTARG};";;
         u)     real_user="$OPTARG";;
         *)     explain_level=" ";;
        esac
done

SQL="$explain_level $SQL"

echo `date +"$dfmt"`"user $real_user run $SQL" 

impala-shell --quiet -i ird26au.vsp.sas.com:25003  -q "${SQL}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem
exec $0 $@
