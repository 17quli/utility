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
#awk '{print "insert into t4  partition(txn_return_period_year="$1",tax_type=cast(\047"$2"\047 as varchar(6))) select ird_number,location_number,return_period_date,seq_no,account_no,amount,transaction_code,transaction_type,transaction_status_code,payment_method_code,transaction_reason_code,return_type,user_id,date_effective,date_processed,date_reversed,account_key_link,transaction_seq_link,office_number,office_type,`timestamp` from t3 where extract(year from return_period_date)="$1" and tax_type=cast(\047"$2"\047 as varchar(6));"}' t1.lst
#statement=`sed -n "/\"CREATE TABLE dev_raw.dss_transactions (/,/\"/{p}" t1.sql`
statement=`sed -n "/\"CREATE TABLE lab_fcp_raw.transactions (/,/\"/{p}" t1.sql`
partitioned_by=`echo "$statement" |sed -n "/PARTITIONED BY (/,/^)/p"`
#partitioned_by=`echo "$statement" |sed -n "/PARTITIONED BY (/,/^)/p"|tr '\n' ' '|sed -e 's/PARTITIONED BY (//' -e 's/) *$//'`
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
where_clause=`echo "$partitioned_by" |awk  'BEGIN{i=0;print "where "};
{
if ($0 != "PARTITIONED BY ("  && $0 != "(" && $0!=")")
        {
        i=i+1
        if (i==1)
                print $1"=cast(\047\$v"i"\047 as "$2")"
        else
                print "and "$1"=cast(\047\$v"i"\047 as "$2")"
        }
}'`
drop_clause=`echo "$partitioned_by" |awk  'BEGIN{i=0;print "drop partition("};
{
if ($0 != "PARTITIONED BY ("  && $0 != "(" && $0!=")")
        {
        i=i+1
        if (i==1)
                print $1"=cast(\047\$v"i"\047 as "$2")"
        else
                print ", "$1"=cast(\047\$v"i"\047 as "$2")"
        }
}'`


#partition_clause=`echo "$partitioned_by" |awk  -F ',' '{for (i = 1; i <= NF; i++) print substr($i,1,index($i,"\t")) }'`
#number_of_pk=0
#IFS=","
#set -- $partitioned_by
#while read line
#do
#	if [ "$line" = "PARTITIONED BY (" ] || [ "$line" = ")" ]
#	then 
#		continue
#	else
#		echo "$line"
#	fi
#done < <(echo "$partitioned_by")
echo $partition_clause
echo $where_clause
echo $drop_clause
