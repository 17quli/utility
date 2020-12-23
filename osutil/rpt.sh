#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

ts=`date +%Y%m%d%H%M%S%N`
dfmt="%Y-%m-%d %H:%M:%S------"
tblslist=$1
sclist=./stg/show_create_table_${ts}.lst


error_exit(){
        dfmt="%Y-%m-%d %H:%M:%S------"
        echo -e "`date +"$dfmt"`${1-"Unknown error"}" 1>&2
        exit 1
}


test $# -eq 3 || error_exit "Wrong # of arguments! Type `basename $0` <cmd_file> <times> <interval_seconds>"
scmd=$1
ntimes=$2
ninterval=$3
test "$ntimes" -eq "$ntimes" 2>/dev/null || error_exit "$ntimes is not a valid number"
test "$ninterval" -eq "$ninterval" 2>/dev/null || error_exit "$ninterval is not a valid number"
test -x $scmd || error_exit "$scmd is not an executable file"

i=0

while [ $i -lt $ntimes ]
do
	echo -e "\n\n\n"
	echo `date +"$dfmt"`
	$scmd
	let i=i+1         
	sleep $ninterval
done

