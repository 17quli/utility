select cast(cast(memory_aggregate_peak as double)/1024/1024/1024 as int) as agg_peak, 
cast(cast(memory_per_node_peak as double)/1024/1024/1024 as int) as per_node_peak, 
memory_aggregate_peak, 
memory_per_node_peak,
queryId,
statement 
from dev_raw.query 
where endtime >'2020-03-30T20:25:00Z' and starttime<'2020-03-30T20:25:00Z' 
order by 1 desc
limit 10
;
