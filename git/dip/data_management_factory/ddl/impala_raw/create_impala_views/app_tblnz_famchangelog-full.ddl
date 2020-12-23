CREATE VIEW ${var:view_db}.app_tblnz_famchangelog                                                                                   
AS SELECT                                                                                                                           
z.fi64ChangeKey,                                                                                                                    
z.fstrChangeType,                                                                                                                   
z.flngLinkedCustomerKey,                                                                                                            
z.fdtmEffectiveDate,                                                                                                                
z.flngFAMEntitlementKey,                                                                                                            
z.fintRelationshipPeriod,                                                                                                           
z.fintEntitlementPeriod,                                                                                                            
z.fblnActive,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_famchangelog z;