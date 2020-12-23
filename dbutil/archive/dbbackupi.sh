#!/bin/bash
#set -x 
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

source_db=$1
target_db=$2
conffile=./conf/`basename ${0} .sh`.conf
ymd=`date +%Y%m%d`
ts=`date +%Y%m%d%H%M%S`
m5list=./stg/m5_${ts}.lst
retention=5
dfmt="%Y-%m-%d %H:%M:%S------"


if [ $# -lt 2 ] || [ $# -gt 3 ]
then
        echo "wrong # of arguments!" 
        echo "type $0 <source_db> <target_db> [<retention>]" 
        exit 1
fi

if [ $# -eq 3 ]
then
        re='^[0-9]+$'
        if [ -n "$3" ] && [ "$3" -eq "$3" ] 2>/dev/null
        then
                retention=$3
        else
                echo "$3 is not a valid number!"
                exit 2
        fi
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

echo `date +"$dfmt"`"executing ${0} ${source_db} ${target_db}" 
impala-shell -B -i ird10139au.vsp.sas.com:25003  -q "show tables" -d ${source_db}  -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.pem > tbl.lst

cat tbl.lst | sed -e 's/^/show create table /g' -e 's/$/;/g' >tbl.sql

./run_db_file.sh $source_db tbl.sql>showcreate.lst
cat showcreate.lst|grep "CREATE TABLE"|cut -d "(" -f1 |cut -d "." -f2 |sed -e "s/ *$//g">tbl.lst
awk -v sdb=$source_db -v ymd=$ymd '{print "drop table if exists " sdb "_" $0 "_" ymd ";"}' tbl.lst >drop_table.sql
awk -v sdb=$source_db -v ymd=$ymd '{print "create table " sdb "_" $0 "_" ymd " like " sdb "."$0";"}' tbl.lst >create_table.sql

./run_db_file.sh ${target_db} drop_table.sql
./run_db_file.sh ${target_db} create_table.sql 
grep hdfs showcreate.lst | cut -d "'" -f2 |awk -v tgt=${target_uri} -v sdb=${source_db} -v ymd=${ymd} -F '/' '{print "hdfs dfs -cp -f " $0 "/* " tgt "/" sdb "_" $NF "_" ymd}' >hdfs_copy.sh

echo `date +"$dfmt"`"run hdfs copy in parallel"
run_sh_parallel.sh hdfs_copy.sh 
echo `date +"$dfmt"`"run hdfs copy in parallel complete"

cat showcreate.lst |grep "CREATE TABLE\|PARTITIONED"|cut -d "|" -f2|sed -e 's/^ *//g' -e 's/ *$//g'|sed -E ':a ; $!N ; s/\n\PARTITIONED/PARTITIONED/ ; ta ; P ; D'>partition.lst
grep "PARTITIONED" partition.lst |cut -d "." -f2|cut -d "(" -f1|sed -e "s/^/alter table ${source_db}_/g" -e "s/ *$/_${ymd} recover partitions;/g">recoverpartitions.sql
grep -v "PARTITIONED" partition.lst |cut -d "." -f2|cut -d "(" -f1|sed -e "s/^/refresh ${source_db}_/g" -e "s/ *$/_${ymd};/g">refresh.sql
echo `date +"$dfmt"`"refresh database"
./run_db_file_parallel.sh ${target_db} refresh.sql 
echo `date +"$dfmt"`"recover partitions"
./run_db_file_parallel.sh ${target_db} recoverpartitions.sql 

./run_db_sqlb.sh prod_dw "show tables "|grep "^${source_db}_"|grep "_${ymdm5}$" >$m5list
if [ ! -s $m5list ]
then
	cat $m5list
	echo "drop tables listed above?"
	select choice in continue exit
	do
		case $choice in
		"continue")
			echo "dropping..." 
			./run_db_tbls_sql.sh ${target_db} $m5list "drop table if exists " "purge"
			break;
			;;
		"exit")
			echo "exiting without dropping tables." 
			break
			;;
		esac
	done
fi
