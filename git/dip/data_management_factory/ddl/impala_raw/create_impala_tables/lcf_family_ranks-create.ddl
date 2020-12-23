CREATE TABLE ${var:target_db}.lcf_family_ranks(
SOURCE_SYSTEM VARCHAR(60),
SOURCE_CODE VARCHAR(60),
CODE_FAMILY VARCHAR(60),
CODE_RANKING INT,
CREATED_BY VARCHAR(20),
CREATED_ON TIMESTAMP,
UPDATED_BY VARCHAR(20),
UPDATED_ON TIMESTAMP,
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
checksum VARCHAR(32),                                                                                                               
insert_object_run_key INT,                                                                                                          
update_object_run_key INT   

) STORED AS PARQUET ;
