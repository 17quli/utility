CREATE TABLE ${var:target_db}.tdw_tbl_nz_rtnfif (                                                   
FLNGDOCKEY BIGINT,                                                                                                                  
FINTSEQ INT,                                                                                                                        
FSTRCALCULATIONMETHOD VARCHAR(8),                                                                                                   
FSTRNAME VARCHAR(510),                                                                                                              
FSTRSTOCKCODE VARCHAR(100),                                                                                                         
FSTRCOUNTRY VARCHAR(6),                                                                                                             
FCURMETHODMARKETVALUE DECIMAL(24,4),                                                                                                
FSTRWHO VARCHAR(20),                                                                                                                
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