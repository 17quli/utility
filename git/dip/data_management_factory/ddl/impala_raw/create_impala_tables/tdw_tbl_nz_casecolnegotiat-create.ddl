CREATE TABLE ${var:target_db}.tdw_tbl_nz_casecolnegotiat (                                          
FLNGDOCKEY BIGINT,                                                                                                                  
FLNGCOLLECTKEY BIGINT,                                                                                                              
FDTMENDDATE TIMESTAMP,                                                                                                              
FDTMORIGINALENDDATE TIMESTAMP,                                                                                                      
FSTRWHO VARCHAR(20),                                                                                                                
CUSTOMER_KEY BIGINT,                                                                                                                
EFFECTIVE_FROM TIMESTAMP,                                                                                                           
EFFECTIVE_TO TIMESTAMP,                                                                                                             
CURRENT_REC_FLAG VARCHAR(2),                                                                                                        
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;        