CREATE TABLE ${var:target_db}.app_tblnz_rtnipseincomeinfo (                                                                         
fi64SubLineItemKey BIGINT,                                                                                                          
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
fi64LineItemKey BIGINT,                                                                                                             
fstrIncomeType VARCHAR(60),                                                                                                         
fcurGrossAmount DECIMAL(19,4),                                                                                                      
fcurDeducted DECIMAL(19,4),                                                                                                         
fcurRWTRate DECIMAL(19,4),                                                                                                          
fblnInError SMALLINT,                                                                                                               
fdtmDeleted TIMESTAMP,                                                                                                              
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;