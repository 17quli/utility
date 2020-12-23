CREATE VIEW ${var:view_db}.app_tblmailtemplate                                                                                      
AS SELECT                                                                                                                           
z.flngTemplateKey,                                                                                                                  
z.flngVerLast,                                                                                                                      
z.flngMailTypeKey,                                                                                                                  
z.flngTemplateVer,                                                                                                                  
z.fstrTemplateType,                                                                                                                 
z.flngSupersededKey,                                                                                                                
z.fstrLanguage,                                                                                                                     
z.fstrDescription,                                                                                                                  
z.fstrPrintControl,                                                                                                                 
z.fdtmInserted,                                                                                                                     
z.fstrInserted,                                                                                                                     
z.fdtmLastModified,                                                                                                                 
z.fstrLastModified,                                                                                                                 
z.fdtmApproved,                                                                                                                     
z.fstrApproved,                                                                                                                     
z.fdtmApprovedBatch,                                                                                                                
z.fstrApprovedBatch,                                                                                                                
z.fdtmRetired,                                                                                                                      
z.fstrRetired,                                                                                                                      
z.fstrParameterControl,                                                                                                             
z.fstrLetterDataBo,                                                                                                                 
z.flngParamFormat,                                                                                                                  
z.fstrRenderType,                                                                                                                   
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblmailtemplate z;