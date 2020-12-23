CREATE TABLE ${var:target_db}.ref_vlnweblogonactsrc (                                                                               
fstrLanguage VARCHAR(100),                                                                                                          
fstrSource VARCHAR(100),                                                                                                            
fstrDecode1 VARCHAR(100),                                                                                                           
fstrDecode2 VARCHAR(100),                                                                                                           
fstrDescription VARCHAR(168),                                                                                                       
fstrRowSource VARCHAR(20),                                                                                                          
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
checksum VARCHAR(32),                                                                                                               
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;  