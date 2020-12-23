CREATE TABLE ${var:target_db}.app_tblnz_keyofficehldrhist (                                                                         
flngDocKey INT,                                                                                                                     
flngVerLast INT,                                                                                                                    
fintSeq SMALLINT,                                                                                                                   
fstrIRD VARCHAR(100),                                                                                                               
fstrName VARCHAR(510),                                                                                                              
fstrPositionHeld VARCHAR(100),                                                                                                      
fdtmBegin TIMESTAMP,                                                                                                                
fdtmEnd TIMESTAMP,                                                                                                                  
fstrEndReason VARCHAR(100),                                                                                                         
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;