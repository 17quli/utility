drop table if exists mtable;
create table mtable(
db_name	string,
object_name string,
object_type string,
if_partitioned string,
stored_as string,
create_statement string,
run_date timestamp,
owner string,
stat_row_count	bigint,
select_row_count bigint,
hdfs_size	bigint,
partition_clause string,
--where_clause string,
--drop_clause string,
primary key (db_name,object_name)
)
partition by hash(db_name) partitions 6
stored as kudu
;
drop table if exists mtable_desc;
create table mtable_desc(
db_name string,
object_name string,
owner string,
create_time string,
object_type string,
stat_row_count  bigint,
hdfs_size       bigint,
sort_by	string,
if_partitioned string,
stored_as string,
run_date timestamp,
create_statement string,
partition_clause string,
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
owner string,
stat_row_count	bigint,
select_row_count bigint,
hdfs_size bigint,
partition_clause string
)
row format delimited
fields terminated by '\002'
lines terminated by '\003'
stored as textfile;

drop table if exists mtable_desc_stg;
create table mtable_desc_stg(
db_name string,
object_name string,
owner string,
create_time string,
object_type string,
stat_row_count  bigint,
hdfs_size       bigint,
sort_by string,
if_partitioned string,
stored_as string,
run_date timestamp,
create_statement string,
partition_clause string
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
drop table if exists mtable_config;
create table mtable_config
(
db_name string,
table_name string,
ingestion_pattern string,
small_file_size_threshold int,
small_file_count_threshold int,
average_file_size_threshold int,
primary key (db_name,table_name)
)
partition by hash(table_name) partitions 6
stored as kudu
;
insert into mtable_config values ('dev_raw','mobject_run','event',67108864,16,67108864);
insert into mtable_config values ('dev_raw','dss_transactions','event',67108864,16,67108864);
insert into mtable_config values ('dev_raw','ptn_app_tblnz_rtngst','change extract',67108864,16,67108864);
insert into mtable_config values ('dev_raw','mdim_dt','event',67108864,4,67108864);

drop table if exists mtable_sum;
create table mtable_sum
(
db_name string,
run_date timestamp,
table_count int,
hdfs_size bigint,
select_row_count bigint,
stat_row_count bigint,
primary key (db_name,run_date)
)
partition by hash(db_name) partitions 6
stored as kudu
;

create view lab_platform_project.lab_views_to_drop as
with lab as
(
select db_name,object_name,object_type
from mtable 
where db_name like 'lab_%' and object_type='view'
),
resv as
(
select db_name,object_name
from mtable 
where db_name ='prod_raw_restricted_access' and object_type='view'
)
select l.db_name,l.object_name,l.object_type
from lab l
join resv r on l.object_name=r.object_name;

create view lab_bronze_publish.all_tables as
select db_name,object_name as table_name,owner,if_partitioned,stored_as,create_statement,run_date,stat_row_count,select_row_count,hdfs_size,partition_clause
from dev_raw.mtable
where object_type='table'
;
create view lab_bronze_publish.all_views as
select db_name,object_name as view_name,owner,create_statement,run_date
from dev_raw.mtable
where object_type='view'
;
