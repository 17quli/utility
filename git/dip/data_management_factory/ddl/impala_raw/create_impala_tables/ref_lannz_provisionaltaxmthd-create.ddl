CREATE TABLE ${var:target_db}.ref_lannz_provisionaltaxmthd (
fstrLanguage VARCHAR(6),
fstrMethod VARCHAR(24),
fstrDecode1 VARCHAR(60),
fstrDecode2 VARCHAR(510),
fstrDescription VARCHAR(2000),
record_effective_timestamp TIMESTAMP,                                                                                     
record_expiry_timestamp TIMESTAMP,
checksum VARCHAR(32),                                                                                                  
record_active_flag VARCHAR(1),                                                                                            
record_deleted_flag VARCHAR(1),                                                                                           insert_object_run_key INT,                                                                                                
update_object_run_key INT    
 ) STORED AS PARQUET;