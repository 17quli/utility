CREATE TABLE ${var:target_db}.app_tblnz_visitoutboundcall (                                                                         
flngDocKey INT,                                                                                                                     
fstrVisitType VARCHAR(20),                                                                                                          
fstrSource VARCHAR(20),                                                                                                             
fstrCallerIrdNumber VARCHAR(18),                                                                                                    
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
fstrTransferReason VARCHAR(510),                                                                                                    
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;