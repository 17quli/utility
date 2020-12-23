CREATE TABLE ${var:target_db}.lcf_mp_source_code
(  
SOURCE_SYSTEM VARCHAR(32),
SOURCE_CODE_NAME VARCHAR(64),
SOURCE_CODE_VALUE VARCHAR(16),
SOURCE_DESCRIPTION VARCHAR(240),
DIP_CODE_NAME VARCHAR(64),
DIP_CODE_VALUE VARCHAR(24),
DIP_DESCRIPTION VARCHAR(1020),
SOURCE_TAX_TYPE VARCHAR(12),
SOURCE_CUST_TYPE VARCHAR(12),
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