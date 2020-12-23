CREATE TABLE ${var:target_db}.tdw_tbl_nz_rtnrltsummary (   
flngdockey	bigint,	
fstrwithholderird	varchar(18),	
fstrwithholdername	varchar(100),	
fcurtotalpaid	decimal(24,4),	
fstrwho	varchar(20),
effective_from	timestamp,	
effective_to timestamp,	
current_rec_flag	varchar(2),	
record_effective_timestamp	timestamp,	
record_expiry_timestamp	timestamp,	
record_active_flag	varchar(1),	
record_deleted_flag	varchar(1),	
insert_object_run_key	int,
update_object_run_key	int)
STORED AS PARQUET;