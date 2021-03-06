CREATE VIEW ${var:view_db}.app_tblvisitaction                                                                                       
AS SELECT                                                                                                                           
z.fi64VisitActionKey,                                                                                                               
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.flngVisitKey,                                                                                                                     
z.fstrVisitActionGroup,                                                                                                             
z.fstrVisitActionSubGroup,                                                                                                          
z.fstrVisitAction,                                                                                                                  
z.fintVisitActionLevel,                                                                                                             
z.flngCustomerKey,                                                                                                                  
z.flngAccountKey,                                                                                                                   
z.fstrOwner,                                                                                                                        
z.fdtmVisitActionStart,                                                                                                             
z.fdtmVisitActionEnd,                                                                                                               
z.fdtmResumed,                                                                                                                      
z.fdtmDiscarded,                                                                                                                    
z.flngDuration,                                                                                                                     
z.fstrDocType,                                                                                                                      
z.fintDocVer,                                                                                                                       
z.fi64DocEditInProgressKey,                                                                                                         
z.flngDocKey,                                                                                                                       
z.flngFolderKey,                                                                                                                    
z.flngCrmKey,                                                                                                                       
z.fstrVisitActionItemSource,                                                                                                        
z.fstrVisitActionItemType,                                                                                                          
z.fi64VisitActionItemKey,                                                                                                           
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblvisitaction z;