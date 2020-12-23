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

drop table if exists mfile_ls;
create table mfile_ls(
run_date timestamp,
file_name string,
last_modified timestamp,
file_size  bigint,
db_name string,
table_name string,
if_partitioned string,
partition_name string,
stored_as string,
primary key (run_date,file_name)
)
partition by hash(file_name) partitions 6
stored as kudu
;

drop table if exists mfile_ls_stg;
create table mfile_ls_stg(
run_date timestamp,
file_name string,
last_modified timestamp,
file_size  bigint,
db_name string,
table_name string,
if_partitioned string,
partition_name string,
stored_as string
)
row format delimited
fields terminated by '\002'
lines terminated by '\003'
stored as textfile;

create table mfile_ls_inc stored as parquet as
with t as
(
select to_date(now()) as inc_on_date,l.* from mfile_ls l where run_date=to_date(now())
),
y as
(
select to_date(now()) as inc_on_date,l.* from mfile_ls l where run_date=to_date(date_add(now(),-1))
),
deleted as
(
select y.*
from y
left join t on y.file_name=t.file_name
where t.run_date is null
),
new as
(
select t.*
from t
left join y on y.file_name=t.file_name
where y.run_date is null
),
changed as
(
select t.*
from t
join y on t.file_name=y.file_name
where t.last_modified<>y.last_modified
union all
select y.*
from y
join t on y.file_name=t.file_name
where y.last_modified<>t.last_modified
)
select 'new' as change_type,* from new union all
select 'deleted' as change_type,* from deleted union all
select 'updated' as change_type,* from changed
;

