create view ${var:view_db}.ref_rfrnz_filing                                                       
as select                                                                                                                           
z.fstrfiling,                                                                                                                       
z.fblnpoliced,                                                                                                                      
z.fstrregularfrequency,                                                                                                             
z.fintrecurringbillingperiods,                                                                                                      
z.fblnfirstactive,                                                                                                                  
z.fstrheritagecode,                                                                                                                 
z.fblnirregular,                                                                                                                    
z.fblnpayday,                                                                                                                       
z.fblnelectronic,                                                                                                                   
z.fstrdocsetdoc,                                                                                                                    
z.fblnactive,                                                                                                                       
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 from ${var:source_db}.ref_rfrnz_filing z;  

