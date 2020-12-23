CREATE TABLE ${var:target_db}.tdw_tbl_recovery (                                                                                     
flngrecoverykey	bigint,	
fstrrecoverygroup	varchar(12),	
flngparentkey	bigint,	
flngbillitemkey	bigint,	
fdtmbegin	timestamp,	
fdtmend	timestamp,	
fstrwho	varchar(20),	
customer_key	bigint	,
effective_from	timestamp,	
effective_to	timestamp,	
current_rec_flag	varchar(2),	
record_effective_timestamp	timestamp,	
record_expiry_timestamp	timestamp,	
record_active_flag	varchar(1),	
record_deleted_flag	varchar(1),	
insert_object_run_key	int,	
update_object_run_key	int                                                                                                 
 ) STORED AS PARQUET;  