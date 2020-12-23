CREATE TABLE ${var:target_db}.app_tbltransstage (                                                                                   
flngTransKey INT,                                                                                                                   
flngVer INT,                                                                                                                        
flngVerLast INT,                                                                                                                    
fstrStage VARCHAR(12),                                                                                                              
fdtmStage TIMESTAMP,                                                                                                                
flngBillItemKey INT,                                                                                                                
fintBillItem SMALLINT,                                                                                                              
flngLockTransKey INT,                                                                                                               
fblnLockTrans SMALLINT,                                                                                                             
fstrLockType VARCHAR(12),                                                                                                           
fblnManualUnlock SMALLINT,                                                                                                          
fstrPeriodImpact VARCHAR(60),                                                                                                       
fblnReversed SMALLINT,                                                                                                              
fdtmReversed TIMESTAMP,                                                                                                             
fstrComment VARCHAR(510),                                                                                                           
fdtmRADay TIMESTAMP,                                                                                                                
fstrPostedWho VARCHAR(20),                                                                                                          
fdtmPosted TIMESTAMP,                                                                                                               
fdtmPenaltyThru TIMESTAMP,                                                                                                          
flngAccountKey INT,                                                                                                                 
fdtmFilingPeriod TIMESTAMP,                                                                                                         
fcurAmount DECIMAL(19,4),                                                                                                           
fcurBalance DECIMAL(19,4),                                                                                                          
fdtmEffect TIMESTAMP,                                                                                                               
flngLinkTrans INT,                                                                                                                  
fstrTransType VARCHAR(12),                                                                                                          
fstrAccountType VARCHAR(12),                                                                                                        
fstrSourceRAType VARCHAR(24),                                                                                                       
fstrBaseRAType VARCHAR(24),                                                                                                         
flngPaymentKey INT,                                                                                                                 
fdtmReport TIMESTAMP,                                                                                                               
FSTRWHO VARCHAR(20),                                                                                                                
FDTMWHEN TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;          