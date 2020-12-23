#!/bin/bash
#set -x
host_file=$1
cmd_file=$2

if [ $# -ne 2 ]
then
	echo "wrong # of arguments." 
	echo "usage: `basename $0` host_file cmd_file" 
	exit 2
fi

logfile=./log/`basename $cmd_file`.log
exec> >(tee $logfile)

hosts=`cat $host_file`
 
for line in $hosts
do
	echo ""
	echo $line
	. $cmd_file $line
done
