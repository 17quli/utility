#!/bin/bash
#set -x
json=$1
logfile=./log/`basename ${0} .sh`.log
conffile=./conf/`basename ${0} .sh`.conf
jsonstg=./stg/`basename ${1} .json`.stg
txtstg=./stg/`basename ${1} .json`.txt
dfmt="%Y-%m-%d %H:%M:%S------"

exec> >(tee -a $logfile)
exec 2>&1

if [ $# -ne 1 ]
then
        echo "type $0 <json_file>"
        exit 1
fi

if [ ! -f $json ]
then
        echo "${json} is not a valid file"
        exit 2
fi

#cat $json|sed -e 's/[][{}]/''/g'|awk '{n=split($0,a,","); for (i=1; i<=n; i++) print a[i]}'|sed -e 's/^ *//g' -e 's/ *$//g' |tr -s '\n' |sed -E ':a ; $!N ; s/\n[a-zA-Z]+/ / ; ta ; P ; D' |grep -v '"attributes" :' |grep -v '"coordinator" :'>$jsonstg
sed -e 's/[][{}]/''/g' $json|awk '{n=split($0,a,",\n"); for (i=1; i<=n; i++) print a[i]}'|sed -e 's/^ *//g' -e 's/ *,$//g' |tr -s '\n' |sed -E ':a ; $!N ; s/\n[a-zA-Z]+/ / ; ta ; P ; D' |grep -v '"attributes" :' |grep -v '"coordinator" :'>$jsonstg
if [ ! -s $jsonstg ]
then
	echo "empty json file!" 
	exit 3
fi

linecount=`wc -l <$jsonstg`
queries=`grep '"queryId" :' $jsonstg|wc -l`
echo `date +"$dfmt"`"start converting $queries queries from json to text file `basename $txtstg`" 

declare -A q
q=([queryId]=""  [statement]=""  [queryType]=""  [queryState]=""  [startTime]=""  [endTime]=""  [rowsProduced]=""  [thread_cpu_time_percentage]=""  [thread_network_receive_wait_time]=""  [thread_cpu_time]=""  [hdfs_average_scan_range]=""  [memory_spilled]=""  [hdfs_bytes_read_short_circuit]=""  [hdfs_bytes_read_from_cache]=""  [hdfs_bytes_read]=""  [query_status]=""  [hdfs_scanner_average_bytes_read_per_second]=""  [thread_network_receive_wait_time_percentage]=""  [oom]=""  [ddl_type]=""  [num_backends]=""  [planning_wait_time_percentage]=""  [admission_wait]=""  [connected_user]=""  [stats_missing]=""  [planning_wait_time]=""  [memory_aggregate_peak]=""  [client_fetch_wait_time_percentage]=""  [memory_per_node_peak_node]=""  [session_type]=""  [hdfs_bytes_read_remote]=""  [estimated_per_node_peak_memory]=""  [hdfs_bytes_read_local_percentage]=""  [hdfs_bytes_read_from_cache_percentage]=""  [client_fetch_wait_time]=""  [rows_inserted]=""  [hdfs_bytes_written]=""  [delegated_user]=""  [file_formats]=""  [admission_result]=""  [pool]=""  [original_user]=""  [session_id]=""  [hdfs_bytes_read_remote_percentage]=""  [stats_corrupt]=""  [hdfs_bytes_read_short_circuit_percentage]=""  [memory_accrual]=""  [thread_total_time]=""  [thread_network_send_wait_time_percentage]=""  [impala_version]=""  [network_address]=""  [thread_storage_wait_time_percentage]=""  [hdfs_bytes_read_local]=""  [memory_per_node_peak]=""  [thread_network_send_wait_time]=""  [num_fragments]=""  [thread_storage_wait_time]=""  [user]=""  [hostId]=""  [detailsAvailable]=""  [database]=""  [durationMillis]="" )

print_query() {
                        printf '%s' "${q[queryId]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[statement]}">>$txtstg
                        printf '\002' >>$txtstg
			#echo -e "${q[statement]}"
                        printf '%s' "${q[queryType]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[queryState]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[startTime]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[endTime]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[rowsProduced]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[thread_cpu_time_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[thread_network_receive_wait_time]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[thread_cpu_time]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_average_scan_range]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[memory_spilled]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_read_short_circuit]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_read_from_cache]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_read]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[query_status]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_scanner_average_bytes_read_per_second]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[thread_network_receive_wait_time_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[oom]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[ddl_type]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[num_backends]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[planning_wait_time_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[admission_wait]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[connected_user]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[stats_missing]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[planning_wait_time]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[memory_aggregate_peak]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[client_fetch_wait_time_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[memory_per_node_peak_node]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[session_type]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_read_remote]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[estimated_per_node_peak_memory]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_read_local_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_read_from_cache_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[client_fetch_wait_time]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[rows_inserted]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_written]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[delegated_user]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[file_formats]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[admission_result]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[pool]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[original_user]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[session_id]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_read_remote_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[stats_corrupt]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_read_short_circuit_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[memory_accrual]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[thread_total_time]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[thread_network_send_wait_time_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[impala_version]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[network_address]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[thread_storage_wait_time_percentage]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hdfs_bytes_read_local]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[memory_per_node_peak]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[thread_network_send_wait_time]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[num_fragments]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[thread_storage_wait_time]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[user]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[hostId]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[detailsAvailable]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[database]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '%s' "${q[durationMillis]}">>$txtstg
                        printf '\002' >>$txtstg
                        printf '\003' >>$txtstg
}

if [ $queries -gt 0 ]
then
	while read -r line
	do

	#set -- $line
	name=$(echo -e "$line" |awk -v RS='\002' -F " : " '{gsub("\"","");print $1}')
	value=$(echo -e "$line" |awk -v RS='\002' -F " : " '{gsub("\"","");print $2}')
#	name=$(echo "$line" |awk -v RS='\002' -F " : " '{gsub("\"","");print $1}')
#	value=$(echo "$line" |awk -v RS='\002' -F " : " '{gsub("\"","");print $2}')
#	name=$(echo -e "$line" |awk -F " : " '{gsub("\"","");print $1}')
#	value=$(echo -e "$line" |awk -F " : " '{gsub("\"","");print $2}')
	if [ "$name" = "queryId" ] 
	then
		if [ "${q[queryId]}" != "" ]
		then
			#write to txtstg
			#echo "writing to $txtstg  queryId=${q[queryId]}" 
			print_query
			#initialize query arrary
			unset q
                        declare -A q
			q=([queryId]=""  [statement]=""  [queryType]=""  [queryState]=""  [startTime]=""  [endTime]=""  [rowsProduced]=""  [thread_cpu_time_percentage]=""  [thread_network_receive_wait_time]=""  [thread_cpu_time]=""  [hdfs_average_scan_range]=""  [memory_spilled]=""  [hdfs_bytes_read_short_circuit]=""  [hdfs_bytes_read_from_cache]=""  [hdfs_bytes_read]=""  [query_status]=""  [hdfs_scanner_average_bytes_read_per_second]=""  [thread_network_receive_wait_time_percentage]=""  [oom]=""  [ddl_type]=""  [num_backends]=""  [planning_wait_time_percentage]=""  [admission_wait]=""  [connected_user]=""  [stats_missing]=""  [planning_wait_time]=""  [memory_aggregate_peak]=""  [client_fetch_wait_time_percentage]=""  [memory_per_node_peak_node]=""  [session_type]=""  [hdfs_bytes_read_remote]=""  [estimated_per_node_peak_memory]=""  [hdfs_bytes_read_local_percentage]=""  [hdfs_bytes_read_from_cache_percentage]=""  [client_fetch_wait_time]=""  [rows_inserted]=""  [hdfs_bytes_written]=""  [delegated_user]=""  [file_formats]=""  [admission_result]=""  [pool]=""  [original_user]=""  [session_id]=""  [hdfs_bytes_read_remote_percentage]=""  [stats_corrupt]=""  [hdfs_bytes_read_short_circuit_percentage]=""  [memory_accrual]=""  [thread_total_time]=""  [thread_network_send_wait_time_percentage]=""  [impala_version]=""  [network_address]=""  [thread_storage_wait_time_percentage]=""  [hdfs_bytes_read_local]=""  [memory_per_node_peak]=""  [thread_network_send_wait_time]=""  [num_fragments]=""  [thread_storage_wait_time]=""  [user]=""  [hostId]=""  [detailsAvailable]=""  [database]=""  [durationMillis]="" )
		else
			>$txtstg	
		fi
	fi

	q[$name]="$value"
	#done < <(head -n `expr $linecount - 1` $jsonstg|tail -n `expr $linecount - 2`)
	done < $jsonstg

	if [ "${q[queryId]}" != "" ]
	then
		print_query	
	fi

#	echo `date +"$dfmt"`"truncate staging table" 
#	./run_db_sqlb.sh dev_raw "truncate table query_stg"
	echo `date +"$dfmt"`"start uploading text file $txtstg to HDFS" 
	hdfs dfs -put -f $txtstg /env/1_dev/hive/raw/mquery_stg 
#	echo `date +"$dfmt"`"load from staging into query" 
#	./run_db_sqlb.sh dev_raw "refresh query_stg;upsert into query select * from query_stg;"
#	rm -f $jsonstg $txtstg 
	rm -f $jsonstg $txtstg $json
fi
