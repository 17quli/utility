CREATE VIEW ${var:view_db}.app_tblauditgroupdetail                                                                                  
AS SELECT                                                                                                                           
z.flngAuditGroupKey,                                                                                                                
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.fstrExternalId,                                                                                                                   
z.fstrAuditGroupStatus,                                                                                                             
z.fstrAuditGroupStage,                                                                                                              
z.fstrAuditGroupProgram,                                                                                                            
z.fstrAuditGroupSource,                                                                                                             
z.fblnOpen,                                                                                                                         
z.fstrManager,                                                                                                                      
z.fstrDescription,                                                                                                                  
z.fdtmWorkDate,                                                                                                                     
z.fblnActive,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblauditgroupdetail z
 ;