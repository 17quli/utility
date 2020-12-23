CREATE TABLE ${var:target_db}.app_tblnz_accppl (                                                                                    
flngDocKey INT,                                                                                                                     
fintSeq SMALLINT,                                                                                                                   
fdtmCommence TIMESTAMP,                                                                                                             
fdtmCease TIMESTAMP,                                                                                                                
fstrCeaseReason VARCHAR(100),                                                                                                       
fdtmAppRcptDate TIMESTAMP,                                                                                                          
fdtmChildDueBirthDate TIMESTAMP,                                                                                                    
fstrPartnerIRDNumber VARCHAR(100),                                                                                                  
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;                