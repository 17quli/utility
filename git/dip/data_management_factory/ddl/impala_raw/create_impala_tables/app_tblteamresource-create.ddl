CREATE TABLE ${var:target_db}.app_tblteamresource (                                                                                 
FLNGRESOURCEKEY INT,                                                                                                                
FLNGVER INT,                                                                                                                        
FLNGVERLAST INT,                                                                                                                    
FLNGTEAMKEY INT,                                                                                                                    
FLNGFOLDERKEY INT,                                                                                                                  
FSTRUSER VARCHAR(20),                                                                                                               
FBLNACTIVE SMALLINT,                                                                                                                
FSTRWHO VARCHAR(20),                                                                                                                
FDTMWHEN TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;   