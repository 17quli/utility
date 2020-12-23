create table ${var:target_db}.dss_nominated_persons (
ird_number int,
location_number int,
nominated_ird_number int,
tax_type varchar(6),
date_start timestamp,
date_end timestamp,
date_created timestamp,
doc_lodge_nbr_prefix int,
doc_lodge_nbr int,
doc_lodge_nbr_suffix int,
mainframe_user_id varchar(16),
date_applied timestamp,
date_ceased timestamp,
`timestamp` timestamp,
nominated_location_number int,
nominated_type varchar(6),
record_effective_timestamp timestamp,
record_expiry_timestamp timestamp,
record_active_flag varchar(1),
record_deleted_flag varchar(1),
insert_object_run_key int,
update_object_run_key int
 ) stored as parquet;