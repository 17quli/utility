#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

print_all=$1
getfacl=getfacl.cmd
facl=getfacl.lst
conffile=./conf/`basename ${0} .sh`.conf
if [ -f $conffile ]
then
        source $conffile
fi

if [ -z "$groups" ]
then
	echo "no groups confirgured in $conffile"
	exit 1
fi

>$getfacl
./list_databases.sh |while read database
do
	./run_sqlb.sh "desc database $database" |cut -f2 >> $getfacl
done
sed -i -e 's/^/hdfs dfs -getfacl /g' -e 's/$/ /g' $getfacl

. ./$getfacl >$facl

while read groupname
do
	./show_role_grant_group.sh "$groupname" "$print_all"
done< <(echo "$groups" |xargs |tr " " "\n")
