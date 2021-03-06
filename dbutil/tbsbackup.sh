#!/bin/bash
#set -x 
#20200831:	initial creation of script
#20200922:	add parameter to control nunber replications the target will have
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

source_db=$1
target_db=$2
tbllist=$3
ts=`date +%Y%m%d%H%M%S%N`
tgttbllist=./stg/tgttbllist_${target_db}_${ts}.lst
conffile=./conf/`basename ${0} .sh`.conf
ymd=`date +%Y%m%d`
m5list=./stg/m5_${ts}.lst
sclist=./stg/showcreate_${ts}.lst
ptnlist=./stg/partition_${ts}.lst
tblsql=./stg/tbl_${ts}.sql
dtsql=./stg/drop_table_${ts}.sql
ctsql=./stg/create_table_${ts}.sql
rpsql=./stg/recoverpartitions_${ts}.sql
refreshsql=./stg/refresh_${ts}.sql
hdfscopysh=./stg/hdfs_copy_${ts}.sh
mkdirsh=./stg/mkdir_${ts}.sh
body=./log/body_${ts}.txt
mainbody=./log/dbsbackup.txt
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
dfmt="%Y-%m-%d %H:%M:%S------"

echo `date +"$dfmt"`"start ${0} ${source_db} ${target_db}" |tee -a $body

if [ -f $conffile ]
then
        source $conffile
fi

if [ $# -lt 3 ] || [ $# -gt 4 ]
then
        echo "wrong # of arguments!" 
        echo "type $0 <source_db> <target_db> <tbl_list> [<retention>]" 
        exit 1
fi

if [ $# -eq 4 ]
then
        re='^[0-9]+$'
        if [ -n "$4" ] && [ "$4" -eq "$4" ] 2>/dev/null
        then
                retention=$4
        else
                echo "$4 is not a valid number!"
                exit 2
        fi
fi

if ! ([ -n "$retention" ] && [ "$retention" -eq "$retention" ] 2>/dev/null)
then
	retention=5
fi

if ! ([ -n "$replication" ] && [ "$replication" -eq "$replication" ] 2>/dev/null)
then
	replication=2
fi

ymdm5=`date -d "${retention} days ago" +%Y%m%d`

db_split=`echo $source_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
source_env=$1
source_name=$2
db_split=`echo $target_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
target_env=$1
target_name=$2

if [ "$target_env" = "prod" ] && [ "$target_name" != "dw" ]
then
        echo "$0 does not support copy to non-dw production database"
	exit 2
fi

source_uri=`impala-shell -i ird10139au.vsp.sas.com:25003  -q "describe database ${source_db};" -d ${source_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem|grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'` 
if [ -z "$source_uri" ]
then
        echo "$source_db doesn't exist"
        exit 3
fi

target_uri=`impala-shell -i ird10139au.vsp.sas.com:25003  -q "describe database ${target_db}" -d ${target_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem |grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'`
if [ -z "$target_uri" ]
then
        echo "$target_db doesn't exist"
        exit 4
fi

if [ ! -f $tbllist ]
then
        echo "${tbllist} is not a valid file"
        exit 2
else
	echo `date +"$dfmt"`"`wc -l <$tbllist` tables to backup" |tee -a $body
fi

cat $tbllist| sed -e 's/^/show create table /g' -e 's/$/;/g' >$tblsql

echo `date +"$dfmt"`"show create table" |tee -a $body
./run_db_fileb.sh $source_db $tblsql>$sclist


awk -v sdb=$source_db -v ymd=$ymd '{print "drop table if exists " sdb "_" $0 "_" ymd " purge;"}' $tbllist >$dtsql
awk -v sdb=$source_db -v tdb=$target_db -v ymd=$ymd '{print tdb "." sdb "_" $0 "_" ymd}' $tbllist >$tgttbllist
awk -v sdb=$source_db -v ymd=$ymd '{print "create table " sdb "_" $0 "_" ymd " like " sdb "."$0";"}' $tbllist >$ctsql
grep hdfs $sclist | cut -d "'" -f2 |awk -v tgt=${target_uri} -v sdb=${source_db} -v ymd=${ymd} -F '/' '{print "hdfs dfs -D dfs.replication=2 -cp -f " $0 "/* " tgt "/" sdb "_" $NF "_" ymd}' >$hdfscopysh
grep hdfs $sclist | cut -d "'" -f2 |awk -v tgt=${target_uri} -v sdb=${source_db} -v ymd=${ymd} -F '/' '{print "hdfs dfs -mkdir -p " tgt "/" sdb "_" $NF "_" ymd}' >$mkdirsh


echo `date +"$dfmt"`"drop table" |tee -a $body
./run_db_file_parallelq.sh ${target_db} $dtsql
sleep 5
echo `date +"$dfmt"`"create table" |tee -a $body
./run_db_file_parallelq.sh ${target_db} $ctsql &
pidct=$!

echo `date +"$dfmt"`"hdfs make directory" |tee -a $body
./run_sh_parallel.sh $mkdirsh
echo `date +"$dfmt"`"`wc -l <$mkdirsh` hdfs directories created" |tee -a $body

echo `date +"$dfmt"`"hdfs copy" |tee -a $body
./run_sh_parallel.sh $hdfscopysh 
echo `date +"$dfmt"`"`wc -l <$hdfscopysh` hdfs directories copied" |tee -a $body

wait $pidct

echo `date +"$dfmt"`"`wc -l <$ctsql` tables created" |tee -a $body

sleep 5

cat $sclist |grep "CREATE TABLE\|PARTITIONED"|cut -d "|" -f2|sed -e 's/^ *//g' -e 's/ *$//g'|sed -E ':a ; $!N ; s/\n\PARTITIONED/PARTITIONED/ ; ta ; P ; D'>$ptnlist
grep "PARTITIONED" $ptnlist |cut -d "." -f2|cut -d "(" -f1|sed -e "s/^/alter table ${source_db}_/g" -e "s/ *$/_${ymd} recover partitions;/g">$rpsql
grep -v "PARTITIONED" $ptnlist |cut -d "." -f2|cut -d "(" -f1|sed -e "s/^/refresh ${source_db}_/g" -e "s/ *$/_${ymd};/g">$refreshsql
echo `date +"$dfmt"`"refresh table" |tee -a $body
./run_db_file_parallelq.sh ${target_db} $refreshsql 
echo `date +"$dfmt"`"`wc -l <$refreshsql` tables refreshed" |tee -a $body
echo `date +"$dfmt"`"recover partitions" |tee -a $body
./run_db_file_parallelq.sh ${target_db} $rpsql 
echo `date +"$dfmt"`"`wc -l <$rpsql` table partitions recovered" |tee -a $body

./tbsvalidation.sh $tgttbllist |tee -a $body

echo `date +"$dfmt"`"show tables backup expired" |tee -a $body
./run_db_sqlb.sh $target_db "show tables "|grep "^${source_db}_"|grep "_${ymdm5}$" >$m5list
if [ -s $m5list ]
then
	echo `date +"$dfmt"`"drop tables backup expired" |tee -a $body
	./run_db_tbls_sqlb.sh ${target_db} $m5list "drop table if exists " "purge"
	echo `date +"$dfmt"`"`wc -l <$m5list` expired tables dropped" |tee -a $body
fi
echo `date +"$dfmt"`"complete ${0} ${source_db} ${target_db}" |tee -a $body
if [ "$sendto" != "" ]
then
	if [ "$sendfrom" = "" ]
	then
		sendfrom="dip-cloudera@sas.com"
	fi
	mail -s "$subject" -r "$sendfrom" "$sendto" < $body
else
	cat $body>>$mainbody
	echo "--------------------------------------------------------------------------------------------" >>$mainbody
fi
