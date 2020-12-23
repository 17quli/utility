#!/bin/bash
#set -x
logfile=./log/`basename ${0} .sh`.log
exec> >(tee -a $logfile)
exec 2>&1

ts=`date +%Y%m%d%H%M%S`
body=./log/body_${ts}.txt
subject="`basename $0 .sh` report at `date +"%H:%M %Y-%m-%d"`"
dfmt="%Y-%m-%d %H:%M:%S------"
merge_create_file=./stg/merge_create_${ts}.sql
merge_populate_file=./stg/merge_populate_${ts}.sql
merge_validate_file=./stg/merge_validate_${ts}.sql
merge_switch_file=./stg/merge_switch_${ts}.sql

>$merge_create_file
>$merge_populate_file
>$merge_validate_file
>$merge_switch_file

echo `date +"$dfmt"`"start ${0} " |tee -a $body

conffile=./conf/`basename ${0} .sh`.conf
if [ -f $conffile ]
then
        source $conffile
fi
small_file_size_threshold=${small_file_size_threshold:-67108864}
small_file_count_threshold=${small_file_count_threshold:-16}
average_file_size_threshold=${average_file_size_threshold:-67108864}
deployment_db=${deployment_db:-dev_raw}

while read v1 v2 v3 v4 v5
do
	./mfile_table.sh $v1 $v2
	i=0
	while read if_partitioned partition_value average_file_size small_file_count
	do
		let i=i+1
	     	merge_from_table="${v1}.${v2}"
             	merge_to_table="${v1}.${v2}_$ts"
             	merge_from_backup="${v1}.${v2}_old"
		if [ if_partitioned = 'N' ]
		then
			#non-partioned table rebuild
			echo `date +"$dfmt"`"prepare merge statement for ${v1}.${v2}:partitioned=$if_partitioned,small_file_count=$small_file_count,average_file_size=$average_file_size" |tee -a $body
			echo "drop table if exists $merge_to_table;create table $merge_to_table like $merge_from_table;">>$merge_create_file
			echo "insert into $merge_to_table select * from $merge_from_table;">>$merge_populate_file
			echo "select t1.cnt1 from (select count(1) cnt1 from $merge_from_table) t1 join (select count(1) cnt2 from $merge_to_table) t2 on t1.cnt1=t2.cnt2;">>$merge_validate_file
			echo "drop table if exists $merge_from_backup;alter table $merge_from_table rename to $merge_from_backup;alter table $merge_to_table rename to $merge_from_table;">>$merge_switch_file
			continue
		fi

		#partitioned table rebuild
		if [ $i -eq 1 ]
		then
		#table level process
			echo `date +"$dfmt"`"prepare merge statement for ${v1}.${v2}:partitioned=$if_partitioned" |tee -a $body
		        statement=`./run_sqlb.sh "show create table $merge_from_table"`
                	if [[ "$statement" =~ "PARTITIONED BY (" ]]
	                then
       		          if_partitioned="Y"
               		  partitioned_by=`echo "$statement" |sed -n "/PARTITIONED BY (/,/^)/p"`
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
END{print ")"}'|tr '\n' ' '`

			where_clause=`echo "$partitioned_by" |awk  'BEGIN{i=0;print "where "};
{
gsub(",","")
if ($0 != "PARTITIONED BY ("  && $0 != "(" && $0!=")")
        {
        i=i+1
        if (i==1)
                print $1"=cast(\047\$v"i"\047 as "$2")"
        else
                print " and "$1"=cast(\047\$v"i"\047 as "$2")"
        }
}'|tr '\n' ' '`

			  echo "drop table if exists $merge_from_backup;create table $merge_from_backup like $merge_from_table;">>$merge_create_file
			  echo "insert overwrite $merge_from_table $partition_clause select * from $merge_from_backup;">>$merge_switch_file
			else 
				echo `date +"$dfmt"`"error: $merge_from_table is partitioned in mfile but not in impala database."|tee -a $body
				exit
			fi
		fi

		#partition level process
		echo `date +"$dfmt"`"prepare merge statement for ${v1}.${v2}:partition_value=$partition_value,small_file_count=$small_file_count,average_file_size=$average_file_size" |tee -a $body
		partition_value=${partition_value%)}
		partition_value=${partition_value#*(}
		j=1
		while read var_value
		do
			var_name="\$v${j}"
			where_clause_i=`echo "$where_clause"|sed -e "s/$var_name/$var_value/"`
			let j=j+1
		done< <( echo "$partition_value"|awk -F "," '{
			for(i=1;i<=NF;i++)
		        print substr($i,index($i,"=")+1)
		}')

		#IFS=","
		#set -- $partition_value
		#j=1
		#while [ ! -z $1 ]
		#do
		#       var_value=`echo "$1"|cut -d "=" -f2`
		#	var_name="\$v${j}"
		#	where_clause=`echo "$where_clause"|sed -e "s/$var_name/$var_value/"`
		#        let j=j+1
		#        shift
		#done
		echo "insert into $merge_from_backup $partition_clause select * from $merge_from_table $where_clause_i;">>$merge_populate_file
		echo "select t1.cnt1 from (select count(1) cnt1 from $merge_from_table $where_clause_i) t1 join (select count(1) cnt2 from $merge_from_backup $where_clause_i) t2 on t1.cnt1=t2.cnt2;">>$merge_validate_file
	done< <(impala-shell -B --quiet -i ird26au.vsp.sas.com:25003  -d $deployment_db --var="v1=${v1}" --var="v2=${v2}" --var="v3=${v3}" --var="v4=${v4}" --var="v5=${v5}" -f if_merge.sql -k --ssl --ca_cert=/sso/hadoop/cloudera-certs/CACerts/DigiAndSAS-CA.pem)
done< <(./run_db_sqlb.sh $deployment_db "select db_name,table_name,small_file_size_threshold,small_file_count_threshold,average_file_size_threshold from mtable_config")

echo `date +"$dfmt"`"create merge table: $merge_create_file" |tee -a $body
./run_db_file_parallel.sh $deployment_db $merge_create_file

sleep 5

echo `date +"$dfmt"`"populate merge table: $merge_populate_file" |tee -a $body
./run_db_file_parallel.sh $deployment_db $merge_populate_file

sleep 5

echo `date +"$dfmt"`"validate merge table: $merge_validate_file" |tee -a $body
while read line
do
	validation_result=`./run_db_sqlb.sh $deployment_db "$line"`
	if [ -z "$validation_result" ]
	then
		echo "validation failure: $line"
		exit 1
	fi
done < $merge_validate_file
echo `date +"$dfmt"`"switch merge table: $merge_switch_file" |tee -a $body
./run_db_file_parallel.sh $deployment_db $merge_switch_file

echo `date +"$dfmt"`"complete ${0}" |tee -a $body
if [ "$sendto" != "" ]
then
        mail -s "$subject" $sendto < $body
fi
