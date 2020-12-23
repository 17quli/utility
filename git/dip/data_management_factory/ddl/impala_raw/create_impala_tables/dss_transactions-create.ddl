CREATE TABLE ${var:target_db}.dss_transactions (                                                                                    
IRD_NUMBER INT,                                                                                                                     
LOCATION_NUMBER INT,                                                                                                                
--TAX_TYPE VARCHAR(6),                                                                                                                 
RETURN_PERIOD_DATE TIMESTAMP,                                                                                                       
SEQ_NO INT,                                                                                                                         
ACCOUNT_NO INT,                                                                                                                     
AMOUNT DECIMAL(16,2),                                                                                                               
TRANSACTION_CODE VARCHAR(8)  ,                                                                                                      
TRANSACTION_TYPE VARCHAR(6)  ,                                                                                                       
TRANSACTION_STATUS_CODE VARCHAR(4)    ,                                                                                              
PAYMENT_METHOD_CODE VARCHAR(4)  ,                                                                                                    
TRANSACTION_REASON_CODE VARCHAR(8)    ,                                                                                              
RETURN_TYPE VARCHAR(10)   ,                                                                                                          
USER_ID VARCHAR(16)    ,                                                                                                             
DATE_EFFECTIVE TIMESTAMP,                                                                                                           
DATE_PROCESSED TIMESTAMP,                                                                                                           
DATE_REVERSED TIMESTAMP,                                                                                                            
ACCOUNT_KEY_LINK INT,                                                                                                               
TRANSACTION_SEQ_LINK INT,                                                                                                           
OFFICE_NUMBER INT,                                                                                                                  
OFFICE_TYPE VARCHAR(4) ,                                                                                                             
`TIMESTAMP` TIMESTAMP,                                                                                                              
insert_object_run_key INT                                                                                                          
 ) PARTITIONED BY (TAX_TYPE VARCHAR(6)) SORT BY (RETURN_PERIOD_DATE) STORED AS PARQUET;  