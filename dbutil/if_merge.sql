select f.if_partitioned,concat(f.db_name,'.',f.table_name,'_',decode(f.if_partitioned,'Y',concat('partition(',replace(f.partition_name,'/',','),')'),'N','')) partition_clause,trunc(avg(f.file_size)) average_file_size,sum(if(file_size<=${var:v3},1,0)) small_file_count
from mfile f 
where f.db_name='${var:v1}' and f.table_name='${var:v2}'
group by f.if_partitioned, concat(f.db_name,'.',f.table_name,'_',decode(f.if_partitioned,'Y',concat('partition(',replace(f.partition_name,'/',','),')'),'N','')) having sum(if(file_size<=${var:v3},1,0))>=${var:v4} and avg(file_size)<=${var:v5} 
order by 1,2,3
