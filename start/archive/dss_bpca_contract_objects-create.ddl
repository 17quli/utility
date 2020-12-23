CREATE TABLE ${var:target_db}.dss_bpca_contract_objects (                                                                           
`CONTRACT_OBJECT_ID` VARCHAR(40),                                                                                                   
`BP_NUMBER` VARCHAR(20),                                                                                                            
`CONTRACT_ACCOUNT_CATEGORY` VARCHAR(4),                                                                                             
`CONTRACT_ACCOUNT_NUMBER` VARCHAR(24),                                                                                              
`BANK_DETAILS` VARCHAR(50),                                                                                                         
`OUTGOING_PAYMEN_METHODS` VARCHAR(10),                                                                                              
`OUTGOING_PAYMENT_BANK_ID` VARCHAR(8),                                                                                              
`CURRENT_RECORD_INDICATOR` VARCHAR(2),                                                                                              
`DATE_APPLIED` TIMESTAMP,                                                                                                           
`DATE_CEASED` TIMESTAMP,                                                                                                            
`TIMESTAMP` TIMESTAMP,                                                                                                              
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 )                                                                                                                                  
  STORED AS PARQUET;