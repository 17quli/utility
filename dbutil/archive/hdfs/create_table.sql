drop table if exists hdfs_file_stat;
create table hdfs_file_stat 
(
	table_name	varchar(64),
	num_of_file	int,
	total_size	bigint,
	avg_size	bigint
)
partitioned by (ptn_dt int,ptn_db string)
row format delimited
fields terminated by ':'
stored as textfile
;
drop table if exists hdfs_file_detail;
create table hdfs_file_detail 
(
	file_name	string,
	file_size	int
) partitioned by (ptn_dt int,ptn_db string) 
row format delimited 
fields terminated by '|'
stored as textfile
;
