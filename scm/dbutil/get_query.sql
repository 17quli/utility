select 	cast(nvl(cast(memory_aggregate_peak as double),0)/1024/1024/1024 as int) as agg_peak, 
	cast(nvl(cast(memory_per_node_peak as double),0)/1024/1024/1024 as int) as per_node_peak, 
	from_utc_timestamp(starttime,'NZ'),
	from_utc_timestamp(endtime,'NZ'),
	memory_per_node_peak_node,
	queryId,
	strleft(statement,20),
	user,
	stats_missing 
from dev_raw.mquery 
where from_utc_timestamp(endtime,'NZ') between date_add(now(),interval ${var:v1} minutes) and date_add(now(),interval ${var:v2} minutes) 
order by 1 desc
;
