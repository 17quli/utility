CREATE TABLE ${var:target_db}.app_tblnz_intcollectpayments (                                                                        
flngDocKey INT,                                                                                                                     
fintSeq SMALLINT,                                                                                                                   
fdtmPaymentDate TIMESTAMP,                                                                                                          
fcurPaymentAmountNZD DECIMAL(19,4),                                                                                                 
fcurPaymentAmountOther DECIMAL(19,4),                                                                                               
fdblCurrencyRate DOUBLE,                                                                                                            
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;