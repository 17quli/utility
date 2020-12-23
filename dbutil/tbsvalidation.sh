#!/bin/bash
#20201004:      initial creation of script 
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

dfmt="%Y-%m-%d %H:%M:%S------"
linea='####################################################################'

if [ $# -eq 1 ] 
then
	db_name=""
	tbllist=$1
elif [ $# -eq 2 ]
then
	db_name=$1
	tbllist=$2
else
        echo "wrong # of arguments!"
        echo "type $0 <table_list_file> or $0 <db_name> <table_list_file>"
        exit 1
fi
	

if [ ! -f $tbllist ]
then
        echo "${tbllist} is not a valid file"
        exit 2
fi

echo `date +"$dfmt"`"start ${0} ${tbllist}"

while read tbl 
do
	lineb=`printf "%s %s" "$tbl" "${linea:${#tbl}}"`
	sql="select concat('row count of $lineb', cast (rc as string),'\n') from (select count(1) as rc from $tbl) t;"
	if [ "$db_name" = "" ]
	then
		./run_sqlb.sh "$sql"
	else
		./run_db_sqlb.sh $db_name "$sql"
	fi
done< <(cat $tbllist) 


