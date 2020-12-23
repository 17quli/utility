CREATE TABLE ${var:target_db}.app_tblnz_cessationcase (                                                                             
flngDocKey INT,                                                                                                                     
fstrSource VARCHAR(24),                                                                                                             
fstrReason VARCHAR(12),                                                                                                             
fblnTaxPreparer SMALLINT,                                                                                                           
fdblMatchCertainty DOUBLE,                                                                                                          
fdblMaxMatchCertainty DOUBLE,                                                                                                       
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;