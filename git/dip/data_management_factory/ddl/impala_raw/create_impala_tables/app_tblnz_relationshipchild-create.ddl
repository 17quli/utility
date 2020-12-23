create table ${var:target_db}.app_tblnz_relationshipchild (                                         
flngchildcustomerkey int,                                                                                                           
flngver int,                                                                                                                        
flngverlast int,                                                                                                                    
fdtmgracedate timestamp,                                                                                                            
fblndiedsincebirth smallint,                                                                                                        
fblnactive smallint,                                                                                                                
fstrwho varchar(20),                                                                                                                
fdtmwhen timestamp,                                                                                                                 
record_effective_timestamp timestamp,                                                                                               
record_expiry_timestamp timestamp,                                                                                                  
record_active_flag varchar(1),                                                                                                      
record_deleted_flag varchar(1),                                                                                                     
insert_object_run_key int,                                                                                                          
update_object_run_key int                                                                                                           
 ) stored as parquet;
