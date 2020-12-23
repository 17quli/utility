#!/bin/bash
cd `dirname $0`
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

hdfs dfs -put -f ./out/fmt.out /env/1_dev/hive/raw/mhost_stg
./run_db_sqlb.sh dev_raw "refresh mhost_stg;delete from mhost where category='disk';upsert into mhost select host, category , component , run_date ,cast(v1 as int), cast(v2 as int), cast(v3 as int),cast( v4 as int), cast(v5 as int), cast(v6 as int) from mhost_stg;"
./oscheck.sh ./oscheck.sql
