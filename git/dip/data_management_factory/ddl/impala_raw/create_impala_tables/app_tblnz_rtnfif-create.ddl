CREATE TABLE ${var:target_db}.app_tblnz_rtnfif (                                                                                    
flngDocKey INT,                                                                                                                     
fintSeq SMALLINT,                                                                                                                   
fstrCalculationMethod VARCHAR(8),                                                                                                   
fstrName VARCHAR(510),                                                                                                              
fstrStockCode VARCHAR(100),                                                                                                         
fstrCountry VARCHAR(6),                                                                                                             
fcurMethodMarketValue DECIMAL(19,4),                                                                                                
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;