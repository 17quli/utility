CREATE TABLE ${var:target_db}.ref_lannz_corriesort (                                                                                
fstrLanguage VARCHAR(6),                                                                                                            
fstrCorrieSort VARCHAR(100),                                                                                                        
fstrDecode1 VARCHAR(60),                                                                                                            
fstrDecode2 VARCHAR(510),                                                                                                           
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
checksum VARCHAR(32),                                                                                                               
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;   
