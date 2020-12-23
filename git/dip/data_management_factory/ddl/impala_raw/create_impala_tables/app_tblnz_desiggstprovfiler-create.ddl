CREATE TABLE ${var:target_db}.app_tblnz_desiggstprovfiler (                                                                         
flngDocKey INT,                                                                                                                     
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
flngIncomeAccountKey INT,                                                                                                           
fblnDesignatedGSTProvEligible SMALLINT,                                                                                             
flngDesignatedGSTAccountKey INT,                                                                                                    
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET; 