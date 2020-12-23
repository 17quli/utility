create table ${var:target_db}.dss_cross_reference_types (
reference_type varchar(6),
date_applied timestamp,
description varchar(120),
date_ceased timestamp,
`timestamp` timestamp,
validated varchar(2),
record_effective_timestamp timestamp,
record_expiry_timestamp timestamp,
record_active_flag varchar(1),
record_deleted_flag varchar(1),
insert_object_run_key int,
update_object_run_key int
 ) stored as parquet;
