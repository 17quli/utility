CREATE TABLE ${var:target_db}.app_tblnz_atooverseasresponse (                                                                       
fi64FileLoadItemKey BIGINT,                                                                                                         
fi64FileKey BIGINT,                                                                                                                 
flngATOSequence INT,                                                                                                                
flngCaseKey INT,                                                                                                                    
fblnATOMatch SMALLINT,                                                                                                              
fstrIRD VARCHAR(18),                                                                                                                
fstrEmail VARCHAR(200),                                                                                                             
fdtmDOB TIMESTAMP,                                                                                                                  
fdtmDOD TIMESTAMP,                                                                                                                  
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET; 