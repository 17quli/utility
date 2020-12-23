drop table if exists mquery_stg;
CREATE TABLE mquery_stg (
  queryid STRING,
  statement STRING,
  querytype STRING,
  querystate STRING,
  starttime STRING,
  endtime STRING,
  rowsproduced STRING,
  thread_cpu_time_percentage STRING,
  thread_network_receive_wait_time STRING,
  thread_cpu_time STRING,
  hdfs_average_scan_range STRING,
  memory_spilled STRING,
  hdfs_bytes_read_short_circuit STRING,
  hdfs_bytes_read_from_cache STRING,
  hdfs_bytes_read STRING,
  query_status STRING,
  hdfs_scanner_average_bytes_read_per_second STRING,
  thread_network_receive_wait_time_percentage STRING,
  oom STRING,
  ddl_type STRING,
  num_backends STRING,
  planning_wait_time_percentage STRING,
  admission_wait STRING,
  connected_user STRING,
  stats_missing STRING,
  planning_wait_time STRING,
  memory_aggregate_peak STRING,
  client_fetch_wait_time_percentage STRING,
  memory_per_node_peak_node STRING,
  session_type STRING,
  hdfs_bytes_read_remote STRING,
  estimated_per_node_peak_memory STRING,
  hdfs_bytes_read_local_percentage STRING,
  hdfs_bytes_read_from_cache_percentage STRING,
  client_fetch_wait_time STRING,
  rows_inserted STRING,
  hdfs_bytes_written STRING,
  delegated_user STRING,
  file_formats STRING,
  admission_result STRING,
  pool STRING,
  original_user STRING,
  session_id STRING,
  hdfs_bytes_read_remote_percentage STRING,
  stats_corrupt STRING,
  hdfs_bytes_read_short_circuit_percentage STRING,
  memory_accrual STRING,
  thread_total_time STRING,
  thread_network_send_wait_time_percentage STRING,
  impala_version STRING,
  network_address STRING,
  thread_storage_wait_time_percentage STRING,
  hdfs_bytes_read_local STRING,
  memory_per_node_peak STRING,
  thread_network_send_wait_time STRING,
  num_fragments STRING,
  thread_storage_wait_time STRING,
  user STRING,
  coordinator__hostid STRING,
  detailsavailable STRING,
  impala_database STRING,
  durationmillis STRING
)
row format delimited 
fields terminated by '\002'
lines terminated by '\003'
stored as textfile;

create mquery_all_queries_stg like mquery_stg;

drop table if exists mquery;
CREATE TABLE mquery (
  queryid STRING,
  statement STRING,
  querytype STRING,
  querystate STRING,
  starttime STRING,
  endtime STRING,
  rowsproduced STRING,
  thread_cpu_time_percentage STRING,
  thread_network_receive_wait_time STRING,
  thread_cpu_time STRING,
  hdfs_average_scan_range STRING,
  memory_spilled STRING,
  hdfs_bytes_read_short_circuit STRING,
  hdfs_bytes_read_from_cache STRING,
  hdfs_bytes_read STRING,
  query_status STRING,
  hdfs_scanner_average_bytes_read_per_second STRING,
  thread_network_receive_wait_time_percentage STRING,
  oom STRING,
  ddl_type STRING,
  num_backends STRING,
  planning_wait_time_percentage STRING,
  admission_wait STRING,
  connected_user STRING,
  stats_missing STRING,
  planning_wait_time STRING,
  memory_aggregate_peak STRING,
  client_fetch_wait_time_percentage STRING,
  memory_per_node_peak_node STRING,
  session_type STRING,
  hdfs_bytes_read_remote STRING,
  estimated_per_node_peak_memory STRING,
  hdfs_bytes_read_local_percentage STRING,
  hdfs_bytes_read_from_cache_percentage STRING,
  client_fetch_wait_time STRING,
  rows_inserted STRING,
  hdfs_bytes_written STRING,
  delegated_user STRING,
  file_formats STRING,
  admission_result STRING,
  pool STRING,
  original_user STRING,
  session_id STRING,
  hdfs_bytes_read_remote_percentage STRING,
  stats_corrupt STRING,
  hdfs_bytes_read_short_circuit_percentage STRING,
  memory_accrual STRING,
  thread_total_time STRING,
  thread_network_send_wait_time_percentage STRING,
  impala_version STRING,
  network_address STRING,
  thread_storage_wait_time_percentage STRING,
  hdfs_bytes_read_local STRING,
  memory_per_node_peak STRING,
  thread_network_send_wait_time STRING,
  num_fragments STRING,
  thread_storage_wait_time STRING,
  user STRING,
  coordinator__hostid STRING,
  detailsavailable STRING,
  impala_database STRING,
  durationmillis STRING,
  primary key (queryid)
)
partition by hash(queryid) partitions 60
stored as kudu;


CREATE TABLE mquery_all_queries (
  queryid STRING,
  statement STRING,
  querytype STRING,
  querystate STRING,
  starttime STRING,
  endtime STRING,
  rowsproduced STRING,
  thread_cpu_time_percentage STRING,
  thread_network_receive_wait_time STRING,
  thread_cpu_time STRING,
  hdfs_average_scan_range STRING,
  memory_spilled STRING,
  hdfs_bytes_read_short_circuit STRING,
  hdfs_bytes_read_from_cache STRING,
  hdfs_bytes_read STRING,
  query_status STRING,
  hdfs_scanner_average_bytes_read_per_second STRING,
  thread_network_receive_wait_time_percentage STRING,
  oom STRING,
  ddl_type STRING,
  num_backends STRING,
  planning_wait_time_percentage STRING,
  admission_wait STRING,
  connected_user STRING,
  stats_missing STRING,
  planning_wait_time STRING,
  memory_aggregate_peak STRING,
  client_fetch_wait_time_percentage STRING,
  memory_per_node_peak_node STRING,
  session_type STRING,
  hdfs_bytes_read_remote STRING,
  estimated_per_node_peak_memory STRING,
  hdfs_bytes_read_local_percentage STRING,
  hdfs_bytes_read_from_cache_percentage STRING,
  client_fetch_wait_time STRING,
  rows_inserted STRING,
  hdfs_bytes_written STRING,
  delegated_user STRING,
  file_formats STRING,
  admission_result STRING,
  pool STRING,
  original_user STRING,
  session_id STRING,
  hdfs_bytes_read_remote_percentage STRING,
  stats_corrupt STRING,
  hdfs_bytes_read_short_circuit_percentage STRING,
  memory_accrual STRING,
  thread_total_time STRING,
  thread_network_send_wait_time_percentage STRING,
  impala_version STRING,
  network_address STRING,
  thread_storage_wait_time_percentage STRING,
  hdfs_bytes_read_local STRING,
  memory_per_node_peak STRING,
  thread_network_send_wait_time STRING,
  num_fragments STRING,
  thread_storage_wait_time STRING,
  user STRING,
  coordinator__hostid STRING,
  detailsavailable STRING,
  impala_database STRING,
  durationmillis STRING,
 primary key (queryid)
)
partition by hash(queryid) partitions 60
stored as kudu;



drop view if exists mquery_oom;
create view mquery_oom as
select q.user,q.queryid,from_utc_timestamp(q.starttime,'NZ') strt,from_utc_timestamp(q.endtime,'NZ') nd
,trunc(cast(q.memory_per_node_peak as double)/1024/1024/1024) node
,trunc(cast(q.memory_aggregate_peak as double)/1024/1024/1024) agg,substr(statement,1,80) stmt
,nvl(u.team,'others') team
from dev_raw.mquery q
left outer join dev_raw.muser u
on q.user=u.user_id
where q.oom='true' 
;

drop view if exists mquery_oom_all;
create view mquery_oom_all as
select week,dt as dt,count(1) as cnt from (
select extract(year from nd)*100+week(nd) as week,trunc(nd,'DAY') dt,o.* from mquery_oom o ) w
group by week,dt
;

drop view if exists mquery_oom_user;
create view mquery_oom_user as
select month,week,dt as dt,count(1) as cnt from (
select extract(year from nd)*100+week(nd) as week,extract(year from nd)*100 +month(nd) as month,trunc(nd,'DD') dt,o.* from mquery_oom o where team<>'platform') w
group by month,week,dt
;

create view mquery_vw as
select queryid
,substr(statement,1,30) as statement_abbr
,querystate,query_status
,from_utc_timestamp(starttime,'NZ') as starttime
,from_utc_timestamp(endtime,'NZ') as endtime
,trunc(nvl(cast(memory_aggregate_peak as double),0)/1024/1024/1024) memory_aggregate_peak_g
,truncate(nvl(cast(memory_per_node_peak as double),0)/1024/1024/1024) memory_per_node_peak_g
,truncate(nvl(cast(estimated_per_node_peak_memory as double),0)/1024/1024/1024) estimated_per_node_peak_memory_g
,truncate(nvl(cast(memory_spilled as double),0)/1024/1024/1024) memory_spilled_g
,truncate(nvl(cast(hdfs_bytes_read as double)/1024/1024/1024,0)) as hdfs_bytes_read_g
,truncate(nvl(cast(hdfs_bytes_written as double)/1024/1024/1024,0)) hdfs_bytes_written
,truncate(cast (thread_cpu_time as double)/1000/60) thread_total_time_m
,truncate(cast (thread_cpu_time as double)/1000/60) as thread_cpu_time_m
,truncate(cast (thread_network_receive_wait_time as double)/1000/60) thread_network_receive_wait_time_m
,truncate(cast (thread_network_send_wait_time as double)/1000/60) thread_network_send_wait_time_m
,truncate(cast (client_fetch_wait_time as double)/1000/60) client_fetch_wait_time_m
,truncate(cast (thread_storage_wait_time as double)/1000/60) thread_storage_wait_time_m
,truncate (cast(durationmillis as int)/1000/60) duration_m
,planning_wait_time as planning_wait_time_ms
,truncate(nvl(cast(rowsproduced as bigint),0)/1024/1024) rowsproduced_m
,user ,pool ,oom
,nvl(cast(admission_wait as int),0) admission_wait_ms
,impala_database,coordinator__hostid,memory_accrual
,hdfs_average_scan_range ,hdfs_bytes_read_short_circuit,hdfs_bytes_read_from_cache,hdfs_bytes_read_local,hdfs_bytes_read_remote,hdfs_scanner_average_bytes_read_per_second
,nvl(cast(hdfs_bytes_read_remote_percentage as int),0) hdfs_bytes_read_remote_percentage
,nvl(cast(hdfs_bytes_read_short_circuit_percentage as int),0) hdfs_bytes_read_short_circuit_percentage
,nvl(cast(thread_cpu_time_percentage as int),0) thread_cpu_time_percentage
,nvl(cast(thread_network_receive_wait_time_percentage as int),0) thread_network_receive_wait_time_percentage
,nvl(cast(thread_network_send_wait_time_percentage as int),0) thread_network_send_wait_time_percentage
,nvl(cast(client_fetch_wait_time_percentage as int),0) client_fetch_wait_time_percentage
,nvl(cast(thread_storage_wait_time_percentage as int),0) thread_storage_wait_time_percentage
,nvl(cast(planning_wait_time_percentage as int),0) planning_wait_time_percentage
,memory_per_node_peak_node
,querytype
,ddl_type
,admission_result
,session_id
,cast(num_backends as int) as num_backends
,cast(num_fragments as int) as num_fragments
,original_user
,connected_user
,stats_missing
,stats_corrupt
,session_type
,network_address
,hdfs_bytes_read_local_percentage
,hdfs_bytes_read_from_cache_percentage
,rows_inserted
,delegated_user
,file_formats
,impala_version
,detailsavailable
,statement
from dev_raw.mquery
;

create view lab_heritage2dip_project.mquery_vw as 
select * from dev_raw.mquery_vw 
where statement like '%lab_bronze_publish%base_employee%' 
or statement like '%lab_bronze_publish%covid_customer_details%' 
or statement like '%lab_bronze_publish%base_employee%cmp_features%' 
;
