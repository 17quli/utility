CREATE VIEW ${var:view_db}.app_tblnz_ksfdefaultscheme                                                                               
AS SELECT                                                                                                                           
z.flngDefaultSchemeKey,                                                                                                             
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.fdtmStart,                                                                                                                        
z.fdtmEnd,                                                                                                                          
z.fstrInvestmentProduct,                                                                                                            
z.fstrNZPostIdentifier,                                                                                                             
z.fblnActive,                                                                                                                       
z.flngAccountKey,                                                                                                                   
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_ksfdefaultscheme z; 