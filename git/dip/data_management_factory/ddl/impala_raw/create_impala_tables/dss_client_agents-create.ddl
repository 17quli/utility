create table ${var:target_db}.dss_client_agents (
ird_number int,
location_number int,
tax_type varchar(6),
date_applied timestamp,
agent_ird_number int,
agent_location_number int,
date_end timestamp,
date_start timestamp,
time_extension varchar(2),
withdraw_date timestamp,
`timestamp` timestamp,
date_ceased timestamp,
user_id varchar(16),
date_processed timestamp,
record_effective_timestamp timestamp,
record_expiry_timestamp timestamp,
record_active_flag varchar(1),
record_deleted_flag varchar(1),
insert_object_run_key int,
update_object_run_key int
 ) stored as parquet;
