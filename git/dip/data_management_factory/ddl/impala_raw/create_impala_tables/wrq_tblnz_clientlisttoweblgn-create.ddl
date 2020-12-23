CREATE TABLE ${var:target_db}.wrq_tblnz_clientlisttoweblgn (                                                                        
flngCustomerKey INT,                                                                                                                
fintProfileNumber SMALLINT,                                                                                                         
flngWebLogonKey INT,                                                                                                                
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
fstrAccessLevel VARCHAR(12),                                                                                                        
fstrSessionKey VARCHAR(100),                                                                                                        
fstrApplication VARCHAR(40),                                                                                                        
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;  