CREATE TABLE ${var:target_db}.app_tblnz_accountdatehistory (                                                                        
flngAccountKey INT,                                                                                                                 
flngDocKey INT,                                                                                                                     
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
fstrAccountType VARCHAR(12),                                                                                                        
fdtmCommence TIMESTAMP,                                                                                                             
fdtmCease TIMESTAMP,                                                                                                                
fdtmReopened TIMESTAMP,                                                                                                             
fstrCeaseReason VARCHAR(12),                                                                                                        
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET; 