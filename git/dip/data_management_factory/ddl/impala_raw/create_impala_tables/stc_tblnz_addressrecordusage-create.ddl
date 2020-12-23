CREATE TABLE ${var:target_db}.stc_tblnz_addressrecordusage (                                        
fintRecordUsageID SMALLINT,                                                                                                         
fstrUsageType VARCHAR(8),                                                                                                           
fstrTypeDescription VARCHAR(100),                                                                                                   
fblnUnique SMALLINT,                                                                                                                
fblnBase SMALLINT,                                                                                                                  
fblnHygene SMALLINT,                                                                                                                
fblnInvalid SMALLINT,                                                                                                               
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;                