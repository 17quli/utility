CREATE TABLE ${var:target_db}.app_tblnz_famabatements (                                                                             
flngFAMEntitlementKey INT,                                                                                                          
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
fintRelationshipPeriod SMALLINT,                                                                                                    
fintEntitlementPeriod SMALLINT,                                                                                                     
fcurIncome DECIMAL(19,4),                                                                                                           
fcurAbatementThreshold DECIMAL(19,4),                                                                                               
fcurAbatedIncome DECIMAL(19,4),                                                                                                     
fcurAbatementRate DECIMAL(19,4),                                                                                                    
fcurAbatementTotal DECIMAL(19,4),                                                                                                   
fblnProtected SMALLINT,                                                                                                             
fblnActive SMALLINT,                                                                                                                
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;