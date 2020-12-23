create table ${var:target_db}.dss_cross_references (
reference_type varchar(6),
ird_number_from int,
ird_number_to int,
latest_year int,
date_applied timestamp,
confirmed_ind varchar(2),
first_year int,
date_ceased timestamp,
`timestamp` timestamp,
record_effective_timestamp timestamp,
record_expiry_timestamp timestamp,
record_active_flag varchar(1),
record_deleted_flag varchar(1),
insert_object_run_key int,
update_object_run_key int
 ) stored as parquet;
