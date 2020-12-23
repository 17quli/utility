#!/bin/bash
#set -x
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

ts=`date +%Y%m%d%H%M%S`
dt=`date +"%Y-%m-%d %H:%M:%S"`
tblist=./stg/tbl_${ts}.lst
>$tblist

cssql=./stg/compute_stats_${ts}.sql
cslist=./stg/compute_stats_${ts}.lst
plist=./stg/compute_stats_p_${ts}.lst
uplist=./stg/compute_stats_up_${ts}.lst
stssql1=./stg/show_table_stats1_${ts}.sql
stssql2=./stg/show_table_stats2_${ts}.sql
stssql=./stg/show_table_stats_${ts}.sql
stslist=./stg/show_table_stats_${ts}.lst
conffile=./conf/`basename ${0} .sh`.conf
body=./log/body_${ts}.txt
mtbl=./stg/mtable.lst
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
dfmt="%Y-%m-%d %H:%M:%S------"

if [ -f $conffile ]
then
        source $conffile
fi

if [ "${exclude}" = "" ]
then
	exclude="default"
fi

comm -23 <(./list_databases.sh |sort) <(echo ${exclude}|xargs|tr ' ' '\n'|sort)|while read line
do
	./run_db_sqlb.sh $line "show tables" |sed -e "s/^/${line}.\`/g" -e "s/$/\`/g" |tee -a $tblist
done

sed -e "s/^/show table stats /g" -e "s/$/;/g"  $tblist |tee $stssql1
sed -e "s/^/select '/g" -e "s/$/';/g"  $tblist |tee $stssql2
paste $stssql2 $stssql1 $stssql2 >$stssql
./run_fileb.sh $stssql | tee $stslist
#unpartitioned table
sed -E ':a ; $!N ; s/\n\-1/\t-1/ ; ta ; P ; D' $stslist |grep "hdfs://"|grep -P '\-1\t'|grep ^[a-z] |cut -f1|tee $uplist

#partitioned table
sed -n "/^Total\t-1/,/\`/{p}" $stslist|grep ^[a-z]|tee $plist

echo `date +"$dfmt"`"unpartitioned tables missing stats:" |tee -a $body
cat $uplist >> $body
echo `date +"$dfmt"`"partitioned tables missing stats:" |tee -a $body
cat $plist >> $body

echo `date +"$dfmt"`"compute table stats" |tee -a $body
sed -e 's/^/compute stats /g' -e 's/$/;/g' $uplist  >$cssql
sed -e 's/^/compute incremental stats /g' -e 's/$/;/g' $plist >>$cssql
./run_file_parallel.sh $cssql

rm -f $stssql1 $stssql2
>$mtbl
#update mtable
while read line
do
        statement=`./run_sqlb.sh "show create table $line"`
	db=`echo $line |cut -d "." -f1`
	table_name=`echo $line |cut -d "." -f2|cut -d '\`' -f2`
	
        printf '%s' "$db" >>$mtbl
        printf '\002' >>$mtbl
        printf '%s' "$table_name"  >>$mtbl
        printf '\002' >>$mtbl
        printf '%s' "table" >>$mtbl
        printf '\002' >>$mtbl
	if_partitioned="N"
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
                stat_item=`./run_db_sqlb.sh $db "show table stats $table_name" |grep "Total"`
                stat_row_count=`echo "$stat_item"|cut -f2`
                hdfs_size=`echo "$stat_item"|cut -f4|sed -e "s/GB/*1024*1024*1024/g" -e "s/MB/*1024*1024/g" -e "s/KB/*1024/g" -e "s/B//g"`
        else
                stat_item=`./run_db_sqlb.sh $db "show table stats $table_name"`
                stat_row_count=`echo "$stat_item" |cut -f1`
                hdfs_size=`echo "$stat_item" |cut -f3|sed -e "s/GB/*1024*1024*1024/g" -e "s/MB/*1024*1024/g" -e "s/KB/*1024/g" -e "s/B//g"`
        fi
        printf '%s' "$stat_row_count">>$mtbl
        printf '\002' >>$mtbl
        printf '\002' >>$mtbl
        size=`echo "${hdfs_size}"|bc`
        if [ -z $size ]
        then
         size=0
        else
         size=`echo "$size/1" |bc `
        fi
        printf '%s' "$size">>$mtbl
        printf '\002' >>$mtbl
        printf '\003'>>$mtbl
done <$uplist

while read line
do
        statement=`./run_sqlb.sh "show create table $line"`
        db=`echo $line |cut -d "." -f1`
        table_name=`echo $line |cut -d "." -f2|cut -d '\`' -f2`

        printf '%s' "$db" >>$mtbl
        printf '\002' >>$mtbl
        printf '%s' "$table_name"  >>$mtbl
        printf '\002' >>$mtbl
        printf '%s' "table" >>$mtbl
        printf '\002' >>$mtbl
        if_partitioned="Y"
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
		stat_item=`./run_db_sqlb.sh $db "show table stats $table_name" |grep "Total"`
                stat_row_count=`echo "$stat_item"|cut -f2`
		hdfs_size=`echo "$stat_item"|cut -f4|sed -e "s/GB/*1024*1024*1024/g" -e "s/MB/*1024*1024/g" -e "s/KB/*1024/g" -e "s/B//g"`
        else
		stat_item=`./run_db_sqlb.sh $db "show table stats $table_name"`
                stat_row_count=`echo "$stat_item" |cut -f1`
                hdfs_size=`echo "$stat_item" |cut -f3|sed -e "s/GB/*1024*1024*1024/g" -e "s/MB/*1024*1024/g" -e "s/KB/*1024/g" -e "s/B//g"`
        fi
        printf '%s' "$stat_row_count">>$mtbl
        printf '\002' >>$mtbl
        printf '\002' >>$mtbl
	size=`echo "${hdfs_size}"|bc`
	if [ -z $size ]
	then
       	 size=0
	else
       	 size=`echo "$size/1" |bc `
	fi
	printf '%s' "$size">>$mtbl
        printf '\002' >>$mtbl
        printf '\003'>>$mtbl
done <$plist

echo `date +"$dfmt"`"truncate table dev_raw.mtable_stg"
./run_db_sqlb.sh dev_raw "truncate table dev_raw.mtable_stg;"

echo `date +"$dfmt"`"upload $mtbl to hdfs"
hdfs dfs -put $mtbl /env/1_dev/hive/raw/mtable_stg

echo `date +"$dfmt"`"refresh mtable_stg and upsert into mtable"
./run_db_sqlb.sh dev_raw "refresh mtable_stg;upsert into mtable select * from mtable_stg;"


if [ "$sendto" != "" ]
then
        if [ "$sendfrom" = "" ]
        then
                sendfrom="dip-cloudera@sas.com"
        fi
        mail -s "$subject" -r "$sendfrom" "$sendto" < $body
fi
