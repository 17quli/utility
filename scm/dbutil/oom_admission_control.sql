select 	oom,
	cast(nvl(cast(memory_aggregate_peak as double),0)/1024/1024/1024 as int) as agg,
	cast(nvl(cast(memory_per_node_peak as double),0)/1024/1024/1024 as int) as mem,
	user,
	pool,
	from_utc_timestamp(starttime,'NZ')  as start_time,
        from_utc_timestamp(endtime,'NZ') as end_time,
	memory_per_node_peak_node node,
	queryId,
	stats_missing,
	strleft(statement,20) stmt
from dev_raw.mquery  
where oom='true' and from_utc_timestamp(endtime,'NZ') between date_add(now(),interval ${var:v1} minutes) and date_add(now(),interval ${var:v2} minutes)
order by 3 desc
;

select  nvl(cast(admission_wait as int),0) as admission,
        cast(nvl(cast(memory_aggregate_peak as double),0)/1024/1024/1024 as int) as agg,
        cast(nvl(cast(memory_per_node_peak as double),0)/1024/1024/1024 as int) as mem,
        user,
	pool,
        from_utc_timestamp(starttime,'NZ')  as start_time,
        from_utc_timestamp(endtime,'NZ') as end_time,
        memory_per_node_peak_node node,
        queryId,
        strleft(statement,20) stmt
from dev_raw.mquery
where nvl(cast(admission_wait as int),0)>1 and from_utc_timestamp(starttime,'NZ') between date_add(now(),interval ${var:v1} minutes) and date_add(now(),interval ${var:v2} minutes)
order by 4 desc
;
