drop table if exists mfile;
create table mfile(
run_date timestamp,
db_name	string,
table_name string,
file_name string,
if_partitioned string,
partition_name string,
stored_as string,
file_size  bigint,
primary key (run_date,db_name,table_name,file_name)
)
partition by hash(db_name) partitions 6
stored as kudu
;
drop table if exists mfile_stg;
create table mfile_stg(
run_date timestamp,
db_name	string,
table_name string,
file_name string,
if_partitioned string,
partition_name string,
stored_as string,
file_size bigint
)
row format delimited
fields terminated by '\002'
lines terminated by '\003'
stored as textfile;
