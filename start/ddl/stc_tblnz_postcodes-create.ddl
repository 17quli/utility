CREATE TABLE ${var:target_db}.stc_tblnz_postcodes (                                                 
fintPostCode SMALLINT,                                                                                                              
flngCount INT,                                                                                                                      
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
checksum VARCHAR(32),                                                                                                               
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;