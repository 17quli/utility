CREATE TABLE ${var:target_db}.app_tblnz_rtnrltsummary (                                                                             
flngDocKey INT,                                                                                                                     
fstrWithholderIRD VARCHAR(18),                                                                                                      
fstrWithholderName VARCHAR(100),                                                                                                    
fcurTotalPaid DECIMAL(19,4),                                                                                                        
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;