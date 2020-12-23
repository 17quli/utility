CREATE VIEW ${var:view_db}.app_tblnz_rtnlineitemtoincome                                                                            
AS SELECT                                                                                                                           
z.fi64IncomeKey,                                                                                                                    
z.fi64LineItemKey,                                                                                                                  
z.fdtmWhen,                                                                                                                         
z.fstrWho,                                                                                                                          
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtnlineitemtoincome z;