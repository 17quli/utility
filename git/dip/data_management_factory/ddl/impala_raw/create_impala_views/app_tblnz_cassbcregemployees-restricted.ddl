CREATE VIEW ${var:view_db}.app_tblnz_cassbcregemployees                                                                             
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fintSeq,                                                                                                                          
z.fstrIRDNumber,                                                                                                                    
z.fblnFT,                                                                                                                           
z.fblnPT,                                                                                                                           
z.fstrFirstName,                                                                                                                    
z.fstrLastName,                                                                                                                     
z.fblnPrepopped,                                                                                                                    
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
FROM ${var:source_db}.app_tblnz_cassbcregemployees z
LEFT OUTER JOIN ${var:source_db}.app_tblacaseall ca ON z.flngDocKey = ca.flngDocKey 
LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel cl ON ca.flngCustomerKey = cl.flngCustomerKey 
WHERE nvl(cl.fstrcustomerlevel, 'STD') = 'STD'
  AND nvl(ca.record_active_flag, 'Y') = 'Y'
  AND nvl(ca.record_deleted_flag, 'N') = 'N'
  AND nvl(cl.record_active_flag, 'Y') = 'Y'
  AND nvl(cl.record_deleted_flag, 'N') = 'N';