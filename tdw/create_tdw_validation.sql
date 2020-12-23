drop table if exists tdw_validation;
create table tdw_validation
(
raw_table_name 			string,
environment			string,
batch_number			int,
tdw_table_name 			string,
raw_record_count 		bigint,
tdw_record_count 		bigint,
tdw_unique_key_count 		bigint,
tdw_multiple_key_count 		bigint,
tdw_min_effective_from		timestamp,
tdw_max_effective_from		timestamp,
raw_record_count_post_load	bigint,
raw_record_count_post_inc	bigint,
low_date_count			bigint,
high_date_count			bigint,
fdtmwhen_low_date_count		bigint,
primary key (raw_table_name,environment)
)
partition by hash(raw_table_name) partitions 12
stored as kudu
;




