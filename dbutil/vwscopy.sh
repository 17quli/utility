#!/bin/bash
#set -x 
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
        echo "$0 does not support copy to production database"
	exit 3
fi

target_uri=`impala-shell -i ird10139au.vsp.sas.com:25003  -q "describe database ${target_db}" -d ${target_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem |grep hdfs|cut -d "|" -f3|sed -e 's/^ *//g' -e 's/ *$//g'`
if [ -z "$target_uri" ]
then
        echo "$target_db doesn't exist"
        exit 4
fi


echo `date +"$dfmt"`"start ${0} ${source_db} ${target_db} ${tbl_list}"

cat ${tbl_list} | sed -e 's/^/show create view /g' -e 's/$/;/g' >$tblsql

./run_db_fileb.sh $source_db $tblsql>$sclist
cat $sclist|grep "CREATE VIEW"|cut -d "(" -f1 |cut -d "." -f2 >$tbllist
sed -i -e 's/ AS *$//g' $tbllist

sed -i -e "s/^\"//g" -e "s/\"$/;/g" $sclist
sed -i -e "s/${source_env}_raw\./${target_env}_raw\./g" -e "s/${source_env}_raw_restricted_access\./${target_env}_raw_restricted_access\./g" -e "s/${source_env}_raw_full_access\./${target_env}_raw_full_access\./g" $sclist


echo `date +"$dfmt"`"drop views from ${target_db}"

./run_db_tbls_sqlb.sh $target_db $tbllist "drop view if exists"

sleep 5

echo `date +"$dfmt"`"create views in ${target_db}"
./run_db_file.sh ${target_db} $sclist
