#!/bin/bash 

logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

dfmt="%Y-%m-%d %H:%M:%S------"
export USER=`whoami`
export TMPDIR="`dirname ${0}`/tmp"
export TEMP=$TMPDIR
export TMP=$TMPDIR
export PYTHON_EGG_CACHE="`dirname ${0}`/tmp/impala-shell-python-egg-cache-$USER"
#export PYTHON_EGG_CACHE="/tmp/impala-shell-python-egg-cache-$USER"

dfmt="%Y-%m-%d %H:%M:%S------"
#echo "please enter or paste SQL, type enter and then Ctrl+D to finish"
#echo "please enter or paste SQL terminated by ; or hit ctl-c to exit"
echo "please keyin or paste SQL terminated by ; then hit enter key to explain or hit ctl-c to exit"
#SQL="$(</dev/stdin)"
#SQL=$(read -erd ";" v; echo "$v")
#SQL="explain `echo "$SQL" |sed -e 's/;//g' -e 's/^ *explain *//g'`"
unset tmp
stty erase ^H
regexp="\;[[:blank:]]*$"
while :
do
 #read -e line
 read line </dev/tty
 tmp="$tmp"$line$'\n'
if [[ $line =~ $regexp ]]
then
	break
fi
# [[ $line =~ ";" ]] && break
done

SQL="explain `echo "$tmp" |sed -e 's/;//g' -e 's/^ *explain *//g'`"



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

impala-shell --quiet -i ird10139au.vsp.sas.com:25003  -q "${SQL}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem
exec $0 $@
