CREATE TABLE ${var:target_db}.wrq_tblwebnoticeread (                                                                                
flngWebNoticeKey INT,                                                                                                               
flngWebLogonKey INT,                                                                                                                
fdtmReadWhen TIMESTAMP,                                                                                                             
fblnDeleted SMALLINT,                                                                                                               
fdtmDeletedWhen TIMESTAMP,                                                                                                          
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
change_capture TIMESTAMP,                                                                                                               
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;     