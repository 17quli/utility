#!/bin/bash
#set -x
##awk -v source_db=$source_db '{print create table like  source_db .$0;}' tbl.lst >create_table.sql
##a=`wc -l<recoverpartitions.sql` 
#
##echo drop tables listed above?
##select choice in continue exit
##do
##case $choice in
##continue)
##echo dropping...
###dropping m5 tables
##break;
##;;
##exit)
##echo exiting...
##break
##;;
##esac
##done
#awk "/^Total\t-1/" $t
#sed -n "/^Total\t-1/p" $t
#stat_item=`./run_db_sqlb.sh dev_raw "show table stats ptn_account_dim" |grep "Total"`
#./run_tbls_sqlb.sh t1.lst "show files in "
#cat $f |tr -c '[:digit:]' '#'
#sed -e '
#/b/d
#s/[0-9]/#/g
#' $f
#sed -i 's/\r//g' oom2.txt
#awk '{print "insert into t4  partition(txn_return_period_year="$1",tax_type=cast(\047"$2"\047 as varchar(6))) select ird_number,location_number,return_period_date,seq_no,account_no,amount,transaction_code,transaction_type,transaction_status_code,payment_method_code,transaction_reason_code,return_type,user_id,date_effective,date_processed,date_reversed,account_key_link,transaction_seq_link,office_number,office_type,`timestamp` from t3 where extract(year from return_period_date)="$1" and tax_type=cast(\047"$2"\047 as varchar(6));"}' t1.lst
#dt=`date -I -d 18000101`
#key=1
#y=1800
#while [ $y -le 9000 ]
#do
#	q=`date -d "$dt" +%-m`
#	let q=q+2
#	q=`echo "$q"/3|bc`
#	m=`date -d "$dt" +%-m`
#	d=`date -d "$dt" +%-d`
#	sql="insert into dev_raw.mdim_dt values ($key,'$dt',$y,$q,$m,$d)"
#	./run_sql.sh "$sql"
##	echo "$key $dt $y $q $m $d"
#	let key=key+1
#	dt=`date -I -d "$dt +1 days"`
#	y=`date -d "$dt" +%Y`
#done
#./run_sqlb.sh "describe extended test_raw.app_tblid" | grep "^Owner:"|awk '{print $2}'
beeline -u "jdbc:hive2://ird10139au.vsp.sas.com:10001/default;principal=hive/ird10139au.vsp.sas.com@VSP.SAS.COM;ssl=true;sslTrustStore=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.jks" -e "show databases"
