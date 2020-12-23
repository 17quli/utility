#!/bin/bash
#set -x
if [ $# -eq 1 ]
then
	ndays=$1
else
	ndays=1
fi

touch -t `date  --date="${ndays} days ago" +%Y%m%d2100.00` fdtm
while IFS= read -r file
do
	grep -l -i ^error: $file 
done< <(find /sso/biconfig/940/Lev1/Logs/*.log -cnewer fdtm)
