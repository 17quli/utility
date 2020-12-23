drop table if exists mbenchmark;
create table mbenchmark(
sql_id	int,
start_time 	timestamp,
end_time	timestamp,
duration_milli	bigint,
primary key (sql_id,start_time)
)
partition by hash(start_time) partitions 6
stored as kudu	
;
