create table ${var:target_db}.dss_gst_filing_grp_types (
gst_filing_grp_type_code varchar(6),
gst_filing_grp_type_desc varchar(50),
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
