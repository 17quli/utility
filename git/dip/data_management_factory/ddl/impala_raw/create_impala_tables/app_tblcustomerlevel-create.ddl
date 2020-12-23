create table ${var:target_db}.app_tblcustomerlevel (
flngdockey	int,	
flngcustomerkey	int,	
fstrcustomerlevel	varchar(12),	
fstrwho	varchar(20),	
fdtmwhen	timestamp,	
record_effective_timestamp	timestamp,
record_expiry_timestamp	timestamp,	
record_active_flag	varchar(1),	
record_deleted_flag	varchar(1),	
insert_object_run_key	int,	
update_object_run_key	int
 ) stored as parquet;
 
 
 


