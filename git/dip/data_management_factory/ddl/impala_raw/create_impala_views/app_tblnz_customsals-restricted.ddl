CREATE VIEW ${var:view_db}.app_tblnz_customsals                                                                                     
AS SELECT                                                                                                                           
z.fi64GatewayWebServiceOutKeyAdd,                                                                                                   
z.fi64GatewayWebServiceOutKeyDel,                                                                                                   
z.fi64BatchKey,                                                                                                                     
z.fintSeq,                                                                                                                          
z.flngAlertId,                                                                                                                      
z.flngCustomerKey,                                                                                                                  
z.flngAccountKey,                                                                                                                   
z.fstrAccountType,                                                                                                                  
z.fstrIRDNumber,                                                                                                                    
z.fstrGivenName,                                                                                                                    
z.fstrFamilyName,                                                                                                                   
z.fdtmDOB,                                                                                                                          
z.fstrPassportNumber,                                                                                                               
z.fstrPassportCountryCode,                                                                                                          
z.fdtmAdded,                                                                                                                        
z.fdtmDeleted,                                                                                                                      
z.fdtmLastProcessed,                                                                                                                
z.fblnAdd,                                                                                                                          
z.fblnDelete,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
FROM ${var:source_db}.app_tblnz_customsals z
LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel cl ON z.flngcustomerkey = cl.flngcustomerkey 
WHERE nvl(cl.fstrCustomerLevel, 'STD') = 'STD' 
  AND nvl(cl.record_active_flag, 'Y') = 'Y' 
  AND nvl(cl.record_deleted_flag, 'N') = 'N' ;