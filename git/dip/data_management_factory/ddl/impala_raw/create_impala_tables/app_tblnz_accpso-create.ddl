CREATE TABLE ${var:target_db}.app_tblnz_accpso (                                                                                    
flngDocKey INT,                                                                                                                     
fblnIR56 SMALLINT,                                                                                                                  
fstrIR56Activity VARCHAR(12),                                                                                                       
fstrIR56ActivityOther VARCHAR(200),                                                                                                 
fstrFilingOption VARCHAR(12),                                                                                                       
fblnPayDayFiler SMALLINT,                                                                                                           
fstrPayDay VARCHAR(6),                                                                                                              
fstrPayPeriod VARCHAR(12),                                                                                                          
fdtmPayDayFilerStart TIMESTAMP,                                                                                                     
fstrBatchToFIRST VARCHAR(100),                                                                                                      
fblnCSE SMALLINT,                                                                                                                   
fblnSLE SMALLINT,                                                                                                                   
fblnKSE SMALLINT,                                                                                                                   
fblnKSR SMALLINT,                                                                                                                   
fblnSSC SMALLINT,                                                                                                                   
fstrEmployerGroup VARCHAR(24),                                                                                                      
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;   