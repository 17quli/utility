create table ${var:target_db}.app_tblnz_rtniitincomeselect (                                        
flngdockey int,                                                                                                                     
flngaccountkey int,                                                                                                                 
fdtmfilingperiod timestamp,                                                                                                         
flngselectgroup int,                                                                                                                
fdtmselectdate timestamp,                                                                                                           
fblngroup2suspend smallint,                                                                                                         
fblnconfirmed smallint,                                                                                                             
fblnautocalceot smallint,                                                                                                           
fstrformtypefiled varchar(16),                                                                                                      
fstrwho varchar(20),                                                                                                                
fdtmwhen timestamp,                                                                                                                 
record_effective_timestamp timestamp,                                                                                               
record_expiry_timestamp timestamp,                                                                                                  
record_active_flag varchar(1),                                                                                                      
record_deleted_flag varchar(1),                                                                                                     
insert_object_run_key int,                                                                                                          
update_object_run_key int                                                                                                           
 ) stored as parquet;   
