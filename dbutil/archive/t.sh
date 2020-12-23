##!/bin/bash
set -x
##split -l$((`wc -l < recoverpartitions.sql`/5)) recoverpartitions.sql recoverpartitions.sql -da 1
##count=6
##for ((i=1 ; i<=$count;i++))
##do
##	echo $i
##done
##rm t.sql[0-5]
#
##awk -v source_db=$source_db '{print "create table like " source_db "."$0";"}' tbl.lst >create_table.sql
##a=`wc -l<recoverpartitions.sql` 
#
##echo "drop tables listed above?"
##select choice in continue exit
##do
##case $choice in
##"continue")
##echo "dropping..."
###dropping m5 tables
##break;
##;;
##"exit")
##echo "exiting..."
##break
##;;
##esac
##done
##basename ./stg/m5_20200323200132.lst .lst
#conffile=./conf/dbsbackup.conf
#while read line
#do
#	if [ ${line:0:1} != "#" ]
#	then
#		echo $line
#		set -- $line
#		source_db=$1
#		target_db=$2
#		retention=$3
##		./dbackup.sh $source_db $target_db $retention
#		echo "./dbackup.sh $source_db $target_db $retention"
#	fi
#done <$conffile
#
#mail -s "hello" "quan.lian@ird.govt.nz" <<EOF
#hello
#world
#EOF

#sendmail quan.lian@ird.govt.nz <t
#source ./conf/dbbackup.conf
#subject="`basename $0 .conf` report at`date +"%H:%M %Y-%m-%d"`"
#body=./log/body.txt
#mail -s "$subject" $sendto < $body

dfmt="%Y-%m-%d %H:%M:%S------"
date +"$dfmt"
echo `date +"$dfmt"`"executing ${0} "
