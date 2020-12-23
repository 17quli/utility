CREATE TABLE ${var:target_db}.app_tblnz_casfeedback (                                                                               
flngDocKey INT,                                                                                                                     
fstrCustomerSegment VARCHAR(24),                                                                                                    
fstrFeedback VARCHAR(8000),                                                                                                         
fstrRecommendation VARCHAR(8000),                                                                                                   
fstrProductNumber VARCHAR(24),                                                                                                      
fstrCaseSubType VARCHAR(24),                                                                                                        
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET; 