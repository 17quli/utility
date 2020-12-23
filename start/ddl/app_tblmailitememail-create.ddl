CREATE TABLE ${var:target_db}.app_tblmailitememail (                                                
fi64MailItemEmailKey BIGINT,                                                                                                        
flngVerLast INT,                                                                                                                    
flngMailItemKey INT,                                                                                                                
flngEmailCustomerKey INT,                                                                                                           
fstrEmail VARCHAR(510),                                                                                                             
fstrEmailOption VARCHAR(24),                                                                                                        
flngEmailKey INT,                                                                                                                   
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;           
