CREATE VIEW ${var:view_db}.app_tblnz_ksemployrchsnschms                                                                 
AS SELECT                                                                                                                           
z.flngRelationshipKey,                                                                                                              
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.flngEmployerAccountKey,                                                                                                           
z.flngEmployerCustomerKey,                                                                                                          
z.flngSchemeAccountKey,                                                                                                             
z.flngSchemeCustomerKey,                                                                                                            
z.fdtmCommence,                                                                                                                     
z.fdtmCease,                                                                                                                        
z.fstrCeaseReason,                                                                                                                  
z.fstrInvalidationReason,                                                                                                           
z.fblnValid,                                                                                                                        
z.flngAttachmentKey,                                                                                                                
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                            
FROM ${var:source_db}.app_tblnz_ksemployrchsnschms z;
