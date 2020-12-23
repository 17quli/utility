CREATE TABLE ${var:target_db}.app_tblmailcategory (                                                 
flngMailCategoryKey INT,                                                                                                            
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
fstrDecode1 VARCHAR(24),                                                                                                            
fstrDecode2 VARCHAR(60),                                                                                                            
fblnActive SMALLINT,                                                                                                                
fstrDescription VARCHAR(510),                                                                                                       
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;        