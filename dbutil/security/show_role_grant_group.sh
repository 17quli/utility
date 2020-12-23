#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

group_name=$1
print_all=$2
facl=getfacl.lst
sed -i 's/ *$/ /g' $facl

if [ $# -ne 1 ] && [ $# -ne 2 ]
then
        echo "wrong # of arguments!"
        echo "type `basename $0` <group_name> [a]"
        exit 1
fi

./run_sqlb.sh "show role grant group $group_name"|while read line
do
	IFS="_"
	set -- $line
	impala_priv="${@: -1}"
	pos=`expr $# - 1`
	IFS=" "
	db=`echo "${@:1:$pos}"|tr ' ' '_'`
	location_orig=`./run_sqlb.sh "desc database $db"|cut -f2`
	location=`echo "$location_orig"|tr '/' '|'|sed -e 's/$/ /g'`
	if [ "$location" != "" ]
	then
		hdfs_other=`cat $facl |tr '/' '|'|sed -n "/$location/,/other::/{p}"|grep "other::"|cut -d ':' -f3`
#		hdfs_other=`cat $facl |tr '/' '|'|sed -n "/$location/,/other::/{p}"|grep ^other::|cut -d ':' -f3`
		hdfs_priv=`cat $facl |tr '/' '|'|sed -n "/$location/,/other::/{p}" |grep $group_name|cut -d ':' -f3`
		if ([[ "$impala_priv" =~ "ro" ]] && ([[ "${hdfs_priv}" =~ "r" ]] || [[ "${hdfs_other}" =~ "r" ]])) || ([[ "$impala_priv" =~ "rw" ]] && ([[ "$hdfs_priv" =~ "w" ]] || [[ "${hdfs_other}" =~ "w" ]])) || [[ "$impala_priv" =~ "hive" ]]
		then 
			#matched
			if [ "$print_all" = "a" ] && [ "$impala_priv" != "hive" ]
			then 
				echo "$db:$impala_priv:$hdfs_priv:$hdfs_other"
			fi
		else
			#unmatched
			case "$impala_priv" in
			ro)
				priv_bit="r-x"
				;;
			rw)	
				priv_bit="rwx"
				;;
			*)
				priv_bit="---"
				;;
			esac
			if [ "$print_all" = "c" ] 
			then
				echo "hdfs dfs -setfacl -R -m group:$group_name:$priv_bit $location_orig"
			elif [ "$print_all" = "d" ]
			then
				echo "$group_name-----------$db:$impala_priv:$hdfs_priv:$hdfs_other"
				hdfs dfs -getfacl "$location_orig"
				echo "hdfs dfs -setfacl -R -m group:$group_name:$priv_bit $location_orig"
			else
				echo "$db:$impala_priv:$hdfs_priv:$hdfs_other"
			fi
		fi
	fi
	hdfs_priv=""
done
