CREATE TABLE ${var:target_db}.app_tblnz_incrrctdedcasedtl (                                                                         
flngDocKey INT,                                                                                                                     
flngCaseKey INT,                                                                                                                    
flngAccountKey INT,                                                                                                                 
flngGarnishKey INT,                                                                                                                 
fdtmPaymentFrom TIMESTAMP,                                                                                                          
fdtmPaymentTo TIMESTAMP,                                                                                                            
fstrEmployerIRD VARCHAR(18),                                                                                                        
fstrEmployerName VARCHAR(200),                                                                                                      
fstrInterventionReason VARCHAR(30),                                                                                                 
fblnUnderDeduction SMALLINT,                                                                                                        
fcurUnderDeductionAmount DECIMAL(19,4),                                                                                             
fcurUnderDeductionExpected DECIMAL(19,4),                                                                                           
fcurUnderDeductionReceived DECIMAL(19,4),                                                                                           
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;       