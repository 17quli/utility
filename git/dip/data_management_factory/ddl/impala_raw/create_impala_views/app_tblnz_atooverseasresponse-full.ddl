CREATE VIEW ${var:view_db}.app_tblnz_atooverseasresponse                                                                            
AS SELECT                                                                                                                           
z.fi64FileLoadItemKey,                                                                                                              
z.fi64FileKey,                                                                                                                      
z.flngATOSequence,                                                                                                                  
z.flngCaseKey,                                                                                                                      
z.fblnATOMatch,                                                                                                                     
z.fstrIRD,                                                                                                                          
z.fstrEmail,                                                                                                                        
z.fdtmDOB,                                                                                                                          
z.fdtmDOD,                                                                                                                          
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_atooverseasresponse z;