CREATE VIEW ${var:view_db}.app_tblnz_famincomecalc                                                                                  
AS SELECT                                                                                                                           
z.flngFAMEntitlementKey,                                                                                                            
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.fintRelationshipPeriod,                                                                                                           
z.fdtmStart,                                                                                                                        
z.fdtmStop,                                                                                                                         
z.fcurIncome,                                                                                                                       
z.fcurChildSupportPaid,                                                                                                             
z.fcurChildSupportReceived,                                                                                                         
z.fcurAdjustments,                                                                                                                  
z.fcurGrossed,                                                                                                                      
z.fblnActive,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_famincomecalc z;  