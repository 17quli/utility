create table ${var:target_db}.dss_cs_relationship_types (
cs_relationship_type_code varchar(2),
cs_relationship_type_desc varchar(60),
date_applied timestamp,
date_ceased timestamp,
validated varchar(2),
`timestamp` timestamp,
record_effective_timestamp timestamp,
record_expiry_timestamp timestamp,
record_active_flag varchar(1),
record_deleted_flag varchar(1),
insert_object_run_key int,
update_object_run_key int
 ) stored as parquet;
