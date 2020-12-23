CREATE VIEW ${var:view_db}.app_tblmailcategory                                                    
AS SELECT                                                                                                                           
z.flngMailCategoryKey,                                                                                                              
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.fstrDecode1,                                                                                                                      
z.fstrDecode2,                                                                                                                      
z.fblnActive,                                                                                                                       
z.fstrDescription,                                                                                                                  
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblmailcategory z;