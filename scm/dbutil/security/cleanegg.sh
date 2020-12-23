#!/bin/bash
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1
dir="~/.python-eggs"

if [ -d "$dir" ]
then
	echo `whoami`>&2
	rm -rf "$dir"
fi
