##!/bin/bash
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
awk '{print "insert into tx2  partition(txn_return_period_year="$1",tax_type=cast(\047"$2"\047 as varchar(6))) select ird_number,location_number,return_period_date,seq_no,account_no,amount,transaction_code,transaction_type,transaction_status_code,payment_method_code,transaction_reason_code,return_type,user_id,date_effective,date_processed,date_reversed,account_key_link,transaction_seq_link,office_number,office_type,`timestamp`,insert_object_run_key from tx1 where  return_period_date>=\047"$1"-01-01 00:00:00\047 and return_period_date<=\047"$1"-12-31 23:59:59.999999999\047 and tax_type=cast(\047"$2"\047 as varchar(6));"}' 2p.lst
