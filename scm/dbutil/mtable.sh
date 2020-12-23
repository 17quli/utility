#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

conffile=./conf/`basename ${0} .sh`.conf
db=$1
sclist=./stg/show_create_table_${db}.lst
mtbl=./stg/`basename ${0} .sh`_tbl_${db}.lst
dt=`date -Iseconds`
dt=${dt:0:19}
dfmt="%Y-%m-%d %H:%M:%S------"


if [ $# -ne 1 ]
then
        echo "wrong # of arguments!" 
        echo "type $0 <database>" 
        exit 1
fi

>$mtbl


echo `date +"$dfmt"`"truncate table dev_raw.mtable_stg" 
./run_db_sqlb.sh dev_raw "truncate table dev_raw.mtable_stg;"

echo `date +"$dfmt"`"list $db tables and write to $mtbl" 
./list_tables.sh $db|while read line 
do
	statement=`sed -n "/\"CREATE TABLE ${db}.${line} (/,/\"/{p}" $sclist`
	printf '%s' "$db" >>$mtbl
	printf '\002' >>$mtbl 
	printf '%s' "$line"  >>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "table" >>$mtbl
	printf '\002' >>$mtbl
	if [[ "$statement" =~ "PARTITIONED BY (" ]]
	then
		if_partitioned="Y"
                partitioned_by=`echo "$statement" |sed -n "/PARTITIONED BY (/,/^)/p"`
                partition_clause=`echo "$partitioned_by" |awk  'BEGIN{i=0;print "partition ("};
{
if ($0 != "PARTITIONED BY ("  && $0 != "(" && $0!=")")
        {
        i=i+1
        if (i==1)
                print $1
        else
                print ","$1
        }
}
END{print ")"}'`

#                where_clause=`echo "$partitioned_by" |awk  'BEGIN{i=0;print "where "};
#{
#gsub(",","")
#if ($0 != "PARTITIONED BY ("  && $0 != "(" && $0!=")")
#        {
#        i=i+1
#        if (i==1)
#                print $1"=cast(\047\$v"i"\047 as "$2")"
#        else
#                print " and "$1"=cast(\047\$v"i"\047 as "$2")"
#        }
#}'`

#		drop_clause=`echo "$partitioned_by" |awk  'BEGIN{i=0;print "drop partition("};
#{
#if ($0 != "PARTITIONED BY ("  && $0 != "(" && $0!=")")
#        {
#        i=i+1
#        if (i==1)
#                print $1"=cast(\047\$v"i"\047 as "$2")"
#        else
#                print ", "$1"=cast(\047\$v"i"\047 as "$2")"
#        }
#}'`
	else	
		if_partitioned="N"	
                partition_clause=""
#                where_clause=""
#		drop_clause=""
	fi
	printf '%s' "$if_partitioned" >>$mtbl
	printf '\002' >>$mtbl
	stored_as=`echo $statement |awk -F "STORED AS " '{print $2}'|cut -d " " -f1`
	printf '%s' "$stored_as" >>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "$statement">>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "$dt" >>$mtbl
	printf '\002' >>$mtbl
	if [ "$if_partitioned" = "Y" ]
        then
                stat_item=`./run_db_sqlb.sh $db "show table stats $line" |grep "Total"`
                stat_row_count=`echo "$stat_item"|cut -f2`
                hdfs_size=`echo "$stat_item"|cut -f4|sed -e "s/GB/*1024*1024*1024/g" -e "s/MB/*1024*1024/g" -e "s/KB/*1024/g" -e "s/B//g"`
        else
                stat_item=`./run_db_sqlb.sh $db "show table stats $line"`
                stat_row_count=`echo "$stat_item" |cut -f1`
                hdfs_size=`echo "$stat_item" |cut -f3|sed -e "s/GB/*1024*1024*1024/g" -e "s/MB/*1024*1024/g" -e "s/KB/*1024/g" -e "s/B//g"`
        fi
        printf '%s' "$stat_row_count">>$mtbl
        printf '\002' >>$mtbl
	select_row_count=`./run_db_sqlb.sh $db "select count(1) from $line"`
        printf '%s' "$select_row_count">>$mtbl
        printf '\002' >>$mtbl

        size=`echo "${hdfs_size}"|bc`
        if [ -z "$size" ]
        then
         size=0
        else
         size=`echo "$size/1" |bc `
        fi
        printf '%s' "$size">>$mtbl
        printf '\002' >>$mtbl
	printf '%s' "$partition_clause">>$mtbl
#        printf '\002' >>$mtbl
#	printf '%s' "$where_clause">>$mtbl
#        printf '\002' >>$mtbl
#	printf '%s' "$drop_clause">>$mtbl
        printf '\003'>>$mtbl
done

echo `date +"$dfmt"`"list $db views and write to $mtbl" 
./list_views.sh $db q|while read line 
do
	statement=`sed -n "/\"CREATE VIEW ${db}.${line} AS/,/\"/{p}" $sclist`
	printf '%s' "$db" >>$mtbl
	printf '\002' >>$mtbl 
	printf '%s' "$line"  >>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "view" >>$mtbl
	printf '\002' >>$mtbl
	if_partitioned="N/A"
	printf '%s' "$if_partitioned" >>$mtbl
        printf '\002' >>$mtbl
	stored_as=""
	printf '%s' "$stored_as" >>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "$statement">>$mtbl
	printf '\002' >>$mtbl
	printf '%s' "$dt" >>$mtbl
	printf '\002' >>$mtbl
	printf '\003'>>$mtbl
done

echo `date +"$dfmt"`"upload $mtbl to hdfs" 
hdfs dfs -put $mtbl /env/1_dev/hive/raw/mtable_stg
echo `date +"$dfmt"`"refresh mtable_stg and upsert into mtable" 
./run_db_sqlb.sh dev_raw "refresh mtable_stg;delete from mtable where db_name='$db';upsert into mtable select * from mtable_stg;"
