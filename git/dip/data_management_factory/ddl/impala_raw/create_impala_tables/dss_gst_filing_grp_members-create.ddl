create table ${var:target_db}.dss_gst_filing_grp_members (
group_id int,
ird_number int,
location_number int,
gst_filing_grp_type_code varchar(6),
date_start timestamp,
date_applied timestamp,
gst_filing_member_type_code varchar(2),
date_end timestamp,
date_ceased timestamp,
`timestamp` timestamp,
record_effective_timestamp timestamp,
record_expiry_timestamp timestamp,
record_active_flag varchar(1),
record_deleted_flag varchar(1),
insert_object_run_key int,
update_object_run_key int
 ) stored as parquet;
