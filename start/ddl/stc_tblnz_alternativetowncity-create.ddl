CREATE TABLE ${var:target_db}.stc_tblnz_alternativetowncity (                                       
flngTownCityAliasID INT,                                                                                                            
flngTownCityID INT,                                                                                                                 
fstrTownCityAliasName VARCHAR(80),                                                                                                  
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;  