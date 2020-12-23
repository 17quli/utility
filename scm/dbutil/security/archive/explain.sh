#!/bin/bash


logfile=./log/`basename ${0} .sh`.log
max_line_size=4096
exec> >(tee -a $logfile)
exec 2>&1
dir="/tmp/.explain.$$"
rm -rf $dir
mkdir -p $dir
export PYTHON_EGG_CACHE="$dir"

dfmt="%Y-%m-%d %H:%M:%S------"
#echo "please enter or paste SQL, type enter and then Ctrl+D to finish"
echo "please enter or paste SQL, terminated by ;"
#SQL="$(</dev/stdin)"
SQL=$(read -erd ";" v; echo "$v")
SQL="explain `echo "$SQL" |sed -e 's/;//g' -e 's/^ *explain *//g'`"
echo `date +"$dfmt"`"user `whoami` run $SQL" 

impala-shell --quiet -i ird26au.vsp.sas.com:25003  -q "${SQL}" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem
impala-shell --quiet -i ird26au.vsp.sas.com:25003  -q "select current_user()" -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem
#rm -rf $dir
