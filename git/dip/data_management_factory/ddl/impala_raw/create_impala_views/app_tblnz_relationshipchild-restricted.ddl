create view ${var:view_db}.app_tblnz_relationshipchild                                            
as select                                                                                                                           
z.flngchildcustomerkey,                                                                                                             
z.flngver,                                                                                                                          
z.flngverlast,                                                                                                                      
z.fdtmgracedate,                                                                                                                    
z.fblndiedsincebirth,                                                                                                               
z.fblnactive,                                                                                                                       
z.fstrwho,                                                                                                                          
z.fdtmwhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 from ${var:source_db}.app_tblnz_relationshipchild z; 
