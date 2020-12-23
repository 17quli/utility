drop table if exists mtable;
create table mtable(
db_name	string,
object_name string,
object_type string,
if_partitioned string,
stored_as string,
create_statement string,
run_date timestamp,
stat_row_count	bigint,
select_row_count bigint,
hdfs_size	bigint,
partition_clause string,
where_clause string,
drop_clause string,
primary key (db_name,object_name)
)
partition by hash(db_name) partitions 6
stored as kudu
;
drop table if exists mtable_stg;
create table mtable_stg(
db_name	string,
object_name string,
object_type string,
if_partitioned string,
stored_as string,
create_statement string,
run_date timestamp,
stat_row_count	bigint,
select_row_count bigint,
hdfs_size bigint,
partition_clause string,
where_clause string,
drop_clause string
)
row format delimited
fields terminated by '\002'
lines terminated by '\003'
stored as textfile;

drop view if exists mtable_band;
create view mtable_band as
with rc as (
select 
case  when select_row_count<1000000 then '4 - small' when select_row_count<100000000 then '3 - medium' when select_row_count<500000000 then '2 - large' else '1 - gigantic' end as band,
rank() over (order by select_row_count desc),db_name,object_name,select_row_count from mtable 
where object_type='table'),
hdfs as (
select 
case  when nvl(hdfs_size,0)<200000000 then '4 - small' when nvl(hdfs_size,0)<2000000000 then '3 - medium' when nvl(hdfs_size,0)<20000000000 then '2 - large' else '1 - gigantic' end as band,
rank() over (order by nvl(hdfs_size,0) desc) as rnk,db_name,object_name,nvl(hdfs_size,0) hdfs_size from mtable 
where  object_type='table')
select case when rc.band<hdfs.band then rc.band else hdfs.band end as band, rc.db_name, rc.object_name, rc.band as rc_band,hdfs.band as hdfs_band,rc.select_row_count,hdfs.hdfs_size
from rc inner join hdfs on rc.db_name=hdfs.db_name and rc.object_name=hdfs.object_name 
;
