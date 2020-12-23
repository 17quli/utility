interval=$1
while true
do
	while read line 
	do
		a=`grep queryId $line |wc -l`
		echo "$line:$a"
	done< <(find ./stg -name "*.stg")

#hdfs dfs -ls /env/1_dev/hive/raw/query_stg
./run_db_sql.sh dev_raw "select count(1) from query_stg;select count(1) from query;"
sleep $1
done
