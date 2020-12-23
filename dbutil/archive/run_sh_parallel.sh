#!/bin/bash
#set -x
cmd_file=$1
parallel=3
parallelm1=`expr $parallel - 1`
logfile=./log/`basename ${0} .sh`.log

rm -f ${cmd_file}[0-$parallel] 

if [ $# -ne 1 ]
then
	echo "type $0 <cmd_file>"|tee -a $logfile
	exit 1
fi

if [ ! -f $cmd_file ]
then
        echo "${cmd_file} is not a valid file"|tee -a $logfile
        exit 2
fi

wcl=`wc -l<${cmd_file}`

if [ $wcl -gt $parallel ]
then
	split -l$((`wc -l < ${cmd_file}`/${parallelm1})) ${cmd_file} ${cmd_file} -da 1
	for ((i=0;i<${parallel};i++))
	do
		cmd_file_split="${cmd_file}${i}"
		if [ -f $cmd_file_split ]
		then
			. ./$cmd_file_split 2>&1 |tee -a ${logfile} & 
		fi
	done
else
	. ./${cmd_file} 2>&1|tee -a $logfile 
fi
