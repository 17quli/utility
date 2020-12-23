create view ${var:view_db}.dss_tax_reg_status_codes                                               
as select                                                                                                                           
z.treg_status_code,                                                                                                                 
z.date_applied,                                                                                                                     
z.description,                                                                                                                      
z.date_ceased,                                                                                                                      
z.`timestamp`,                                                                                                                      
z.validated,                                                                                                                        
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 from ${var:source_db}.dss_tax_reg_status_codes z;

