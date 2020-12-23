CREATE TABLE ${var:target_db}.dss_student_loan_ac_trans (                                                                           
`IRD_NUMBER` INT,                                                                                                                   
`LOCATION_NUMBER` INT,                                                                                                              
`TAX_TYPE` VARCHAR(6),                                                                                                              
`SEQ_NO` INT,                                                                                                                       
`AMOUNT` DECIMAL(16,2),                                                                                                             
`TRANSACTION_CODE` VARCHAR(8),                                                                                                      
`TRANSACTION_REASON_CODE` VARCHAR(8),                                                                                               
`USER_ID` VARCHAR(16),                                                                                                              
`DATE_PROCESSED` TIMESTAMP,                                                                                                         
`DATE_EFFECTIVE` TIMESTAMP,                                                                                                         
`TRANSACTION_PERIOD` TIMESTAMP,                                                                                                     
`TIMESTAMP` TIMESTAMP,                                                                                                              
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 )                                                                                                                                  
  STORED AS PARQUET;                                                