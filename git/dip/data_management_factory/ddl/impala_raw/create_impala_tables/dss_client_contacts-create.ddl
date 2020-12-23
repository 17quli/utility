create table ${var:target_db}.dss_client_contacts (
ird_number int,
location_number int,
tax_type varchar(6),
date_applied timestamp,
contact_name varchar(100),
work_phone_number varchar(48),
phone_number varchar(48),
fax_number varchar(48),
cell_phone_number varchar(48),
date_ceased timestamp,
`timestamp` timestamp,
record_effective_timestamp timestamp,
record_expiry_timestamp timestamp,
record_active_flag varchar(1),
record_deleted_flag varchar(1),
insert_object_run_key int,
update_object_run_key int
 ) stored as parquet;
