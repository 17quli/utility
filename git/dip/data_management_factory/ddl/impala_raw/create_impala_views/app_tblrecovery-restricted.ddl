CREATE VIEW ${var:view_db}.app_tblrecovery                                                                                          
AS SELECT                                                                                                                           
z.flngRecoveryKey,                                                                                                                  
z.fstrRecoveryGroup,                                                                                                                
z.flngParentKey,                                                                                                                    
z.flngBillItemKey,                                                                                                                  
z.fdtmBegin,                                                                                                                        
z.fdtmEnd,                                                                                                                          
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblrecovery z;  