CREATE TABLE ${var:target_db}.dss_schedule_line_details (                                                                           
EMPLOYEE_IRD_NUMBER INT,                                                                                                            
EMPLOYEE_LOCATION_NUMBER INT,                                                                                                       
DOC_LODGE_NBR_PREFIX INT,                                                                                                           
DOC_LODGE_NBR INT,                                                                                                                  
DOC_LODGE_NBR_SUFFIX INT,                                                                                                           
LINE_NUMBER INT,                                                                                                                    
SEQUENCE_NUMBER INT,                                                                                                                
LINE_ITEM_STATUS_CODE VARCHAR(2),                                                                                                   
TYPE_CODE VARCHAR(10),                                                                                                              
SUB_TYPE_CODE VARCHAR(10),                                                                                                          
SCHEDULE_ERROR_CODE VARCHAR(8),                                                                                                     
TRANSACTION_STRUCTURE VARCHAR(6),                                                                                                   
FT_SEQUENCE_NUMBER INT,                                                                                                             
EMPLOYEE_NAME VARCHAR(40),                                                                                                          
REFUND_AMOUNT DECIMAL(16,2),                                                                                                        
RETURN_PERIOD_DATE TIMESTAMP,                                                                                                       
EMPLOYER_IRD_NUMBER INT,                                                                                                            
EMPLOYER_LOCATION_NUMBER INT,                                                                                                       
USER_ID VARCHAR(16),                                                                                                                
PROGRAM_ID VARCHAR(16),                                                                                                             
UPDATE_TIMESTAMP TIMESTAMP,                                                                                                         
WITHHOLD_TYPE_CODE VARCHAR(2),                                                                                                      
VERSION_NUMBER INT,                                                                                                                 
`TIMESTAMP` TIMESTAMP,                                                                                                              
EMPLOYEE_AMOUNT DECIMAL(16,2),                                                                                                      
CHANGE_REASON_CODE VARCHAR(8),                                                                                                      
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT
)
PARTITIONED BY (
  tax_type VARCHAR(6)
)
STORED AS PARQUET;