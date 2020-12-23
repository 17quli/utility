create view ${var:view_db}.app_tblnz_rtniitincomeselect                                           
as select                                                                                                                           
z.flngdockey,                                                                                                                       
z.flngaccountkey,                                                                                                                   
z.fdtmfilingperiod,                                                                                                                 
z.flngselectgroup,                                                                                                                  
z.fdtmselectdate,                                                                                                                   
z.fblngroup2suspend,                                                                                                                
z.fblnconfirmed,                                                                                                                    
z.fblnautocalceot,                                                                                                                  
z.fstrformtypefiled,                                                                                                                
z.fstrwho,                                                                                                                          
z.fdtmwhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 from ${var:source_db}.app_tblnz_rtniitincomeselect z;
