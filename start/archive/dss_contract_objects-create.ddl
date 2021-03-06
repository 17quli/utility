CREATE TABLE ${var:target_db}.dss_contract_objects (                                                                                
`CONTRACT_OBJECT_ID` VARCHAR(40),                                                                                                   
`CONTRACT_OBJECT_TYPE` VARCHAR(8),                                                                                                  
`CONTRACT_OBJECT_NAME` VARCHAR(70),                                                                                                 
`SCHEME_ID` VARCHAR(40),                                                                                                            
`SCHEME_NOTIFICATION_DATE` TIMESTAMP,                                                                                               
`SCHEME_MEMBERSHIP_END_DATE` TIMESTAMP,                                                                                             
`SCHEME_RELATION_ENDING_REASON` VARCHAR(2),                                                                                         
`SCHEME_RELATIONSHIP_STATUS` VARCHAR(2),                                                                                            
`FEE_PAYMENT_DATE` TIMESTAMP,                                                                                                       
`REALLOCATION_DATE` TIMESTAMP,                                                                                                      
`LAST_PAYMENT_DATE` TIMESTAMP,                                                                                                      
`SCHEME_CHOICE_TYPE_INDICATOR` VARCHAR(2),                                                                                          
`EMPLOYER_RELATION_LINE_NUMBER` VARCHAR(20),                                                                                        
`SCHEMA_DEDUCTION_PERCENTAGE` DECIMAL(23,3),                                                                                        
`CURRENT_RECORD_INDICATOR` VARCHAR(2),                                                                                              
`DATE_APPLIED` TIMESTAMP,                                                                                                           
`DATE_CEASED` TIMESTAMP,                                                                                                            
`TIMESTAMP` TIMESTAMP,                                                                                                              
`CLOSURE_REASON_CODE` VARCHAR(8),                                                                                                   
`MTC_START_DATE` TIMESTAMP,                                                                                                         
`CREDITABLE_MEMBERSHIP_DATE` TIMESTAMP,                                                                                             
`CMD_CHANGE_REASON` VARCHAR(2),                                                                                                     
`LETTER_SENT_IND` VARCHAR(2),                                                                                                       
`MTC_FC_DATE` TIMESTAMP,                                                                                                            
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 )                                                                                                                                  
  STORED AS PARQUET;