CREATE TABLE ${var:target_db}.app_tblnz_cassbcregemployees (                                                                        
flngDocKey INT,                                                                                                                     
fintSeq SMALLINT,                                                                                                                   
fstrIRDNumber VARCHAR(20),                                                                                                          
fblnFT SMALLINT,                                                                                                                    
fblnPT SMALLINT,                                                                                                                    
fstrFirstName VARCHAR(510),                                                                                                         
fstrLastName VARCHAR(510),                                                                                                          
fblnPrepopped SMALLINT,                                                                                                             
fstrWho VARCHAR(20),                                                                                                                
fdtmWhen TIMESTAMP,                                                                                                                 
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;  