#!/bin/bash
#set -x 
#20101221: add support to copy multiple tables to production databases
exec> >(tee -a $logfile)
exec 2>&1

date
source_db=$1
target_db=$2
tbl_list=$3
ts=`date +%Y%m%d%H%M%S`
logfile=./log/`basename ${0} .sh`.log
tblsql=./stg/tbl_${ts}.sql
sclist=./stg/showcreate_${ts}.lst
tbllist=./stg/tbl_${ts}.lst
ctsql=./stg/create_table_${ts}.sql
dtsql=./stg/drop_table_${ts}.sql
hdfscopysh=./stg/hdfs_copy_${ts}.sh
ptnlist=./stg/partition_${ts}.lst
rpsql=./stg/recoverpartitions_${ts}.sql
refreshsql=./stg/refresh_${ts}.sql


dfmt="%Y-%m-%d %H:%M:%S------"

if [ $# -ne 3 ] 
then
	echo "wrong # of arguments!"
	echo "type $0 <source_db> <target_db> <tbl_list>"
	exit 1
fi

if [ ! -f $tbl_list ]
then
        echo "${tbl_list} is not a valid file"
        exit 2
fi


db_split=`echo $source_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
source_env=$1
source_name=$2
db_split=`echo $target_db | sed -e '0,/_/ s/_/ /'`
set -- ${db_split}
target_env=$1
target_name=$2

if [ $target_env = "prod" ] && [ "$target_name" != "dw" ]
then
        echo -n "table in $target_db will be replaced by $source_db,(y/n)"
        read confirmation
        if [ "$confirmation" = "y" ]  ||  [ "$confirmation" = "Y" ]
        then
                :
        else
                echo "exit `basename $0`"
                exit 3
        fi
#        echo "$0 does not support copy to production database"
#	exit 3
fi

target_uri=`impala-shell -i ird10139au.vsp.sas.com:25003  -q "describe database ${target_db}" -d ${target_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem |grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'`
if [ -z "$target_uri" ]
then
        echo "$target_db doesn't exist"
        exit 4
fi


echo `date +"$dfmt"`"start ${0} ${source_db} ${target_db} ${tbl_list}"

cat ${tbl_list} | sed -e 's/^/show create table /g' -e 's/$/;/g' >$tblsql

./run_db_fileb.sh $source_db $tblsql>$sclist
cat $sclist|grep "CREATE TABLE"|cut -d "(" -f1 |cut -d "." -f2 >$tbllist
sed -e 's/^/drop table if exists /g' -e 's/$/;/g' $tbllist>$dtsql
awk -v sdb=$source_db '{print "create table " $0 " like " sdb "."$0";"}' $tbllist>$ctsql

echo `date +"$dfmt"`"drop tables from ${target_db}"

#./run_db_file.sh ${target_db} $dtsql
./run_db_file_parallelq.sh ${target_db} $dtsql

sleep 5

echo `date +"$dfmt"`"create tables in ${target_db}"
#./run_db_file.sh ${target_db} $ctsql
./run_db_file_parallelq.sh ${target_db} $ctsql

grep hdfs $sclist | cut -d "'" -f2 |awk -v tgt=${target_uri} '{print "hdfs dfs -cp -f " $0 " " tgt "/"}' >$hdfscopysh
echo `date +"$dfmt"`"hdfs copy"
./run_sh_parallel.sh $hdfscopysh
echo `date +"$dfmt"`"hdfs copy complete"

cat $sclist |grep "CREATE TABLE\|PARTITIONED"|cut -d "|" -f2|sed -e 's/^ *//g' -e 's/ *$//g'|sed -E ':a ; $!N ; s/\n\PARTITIONED/PARTITIONED/ ; ta ; P ; D'>$ptnlist
grep "PARTITIONED" $ptnlist |cut -d "." -f2|cut -d "(" -f1|sed -e 's/^/alter table /g' -e 's/$/ recover partitions;/g'|awk -F " " '{print $0" compute stats "$3";"}'>$rpsql
grep -v "PARTITIONED" $ptnlist |cut -d "." -f2|cut -d "(" -f1|sed -e 's/^/refresh /g' -e 's/$/;/g'|awk -F " " '{print $0" compute stats "$2";"}'>$refreshsql

echo `date +"$dfmt"`"refresh database"
nohup ./run_db_fileb.sh ${target_db} $refreshsql  &
pidrefresh=$!
./run_db_file_parallelq.sh ${target_db} $rpsql 
wait $pidrefresh
echo `date +"$dfmt"`"database refresh completed"
