#!/bin/bash
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1
dir="/tmp/impala-shell-python-egg-cache-$USER"

if [ -d "$dir" ]
then
	chmod -R g+w "$dir"
else
	mkdir -p "$dir"
	chmod -R g+w "$dir"
fi
