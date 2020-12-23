#!/bin/bash
#set -x
cmd_file=$1
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

conffile=./conf/`basename ${0} .sh`.conf
dt=`date +%Y%m%d%H%M%S`

if [ $# -ne 1 ]
then
	echo "type $0 <cmd_file>"
	exit 1
fi

if [ ! -f $cmd_file ]
then
        echo "${cmd_file} is not a valid file"
        exit 2
fi

if [ -f $conffile ]
then
        source $conffile
fi


if ! ([ -n "$parallel" ] && [ "$parallel" -eq "$parallel" ] 2>/dev/null)
then
        parallel=4
fi


parallelm1=`expr $parallel - 1`

if [ "$parallelm1" -lt 1 ]
then
	parallemm1=1
fi

pidlist=./stg/pid_$$_${dt}.lst
>$pidlist
rm -f ${cmd_file}[0-$parallel] 


wcl=`wc -l<${cmd_file}`

if [ $wcl -gt $parallel ]
then
	split -l$((`wc -l < ${cmd_file}`/${parallelm1})) ${cmd_file} ${cmd_file} -da 1
	for ((i=0;i<${parallel};i++))
	do
		cmd_file_split="${cmd_file}${i}"
		if [ -f $cmd_file_split ]
		then
			. ./$cmd_file_split & 
			echo $! >>$pidlist
		fi
	done
	wait <$pidlist
else
	. ./${cmd_file} 
fi
rm -f $pidlist
rm -f ${cmd_file}[0-$parallel] 
