select distinct record_effective_timestamp from ${var:table_name} where insert_object_run_key=(select min(insert_object_run_key) from ${var:table_name});
select count(1) from ${var:table_name} where insert_object_run_key<>(select min(insert_object_run_key) from ${var:table_name}) and record_effective_timestamp='1800-1-1';
select count(1) from ${var:table_name} p1 where  record_effective_timestamp<>'1800-1-1';
select count(1) from ${var:table_name} p1 where  record_effective_timestamp<>'1800-1-1' and record_effective_timestamp = (select max(start_time) from lcf_object_run where object_run_key=p1.insert_object_run_key);

