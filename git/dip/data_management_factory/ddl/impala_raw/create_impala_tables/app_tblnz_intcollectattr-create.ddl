CREATE TABLE ${var:target_db}.app_tblnz_intcollectattr (                                                                            
flngDocKey INT,                                                                                                                     
fdtmDOB TIMESTAMP,                                                                                                                  
fstrOriginCountry VARCHAR(100),                                                                                                     
fstrCurrencyType VARCHAR(100),                                                                                                      
fcurDebtAmountNZD DECIMAL(19,4),                                                                                                    
fcurDebtAmountOther DECIMAL(19,4),                                                                                                  
fcurDebtPaid DECIMAL(19,4),                                                                                                         
fdblCurrencyRate DOUBLE,                                                                                                            
fblnGarnish SMALLINT,                                                                                                               
fblnPaymentPlan SMALLINT,                                                                                                           
fdtmDateEntered TIMESTAMP,                                                                                                          
fblnBankAccount SMALLINT,                                                                                                           
fdtmClosed TIMESTAMP,                                                                                                               
fstrClosedReason VARCHAR(200),                                                                                                      
fstrReOpenReason VARCHAR(200),                                                                                                      
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;   