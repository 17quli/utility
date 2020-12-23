CREATE VIEW ${var:view_db}.app_tblnz_visitoutboundcall                                                                              
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fstrVisitType,                                                                                                                    
z.fstrSource,                                                                                                                       
z.fstrCallerIrdNumber,                                                                                                              
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.fstrTransferReason,                                                                                                               
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_visitoutboundcall z
LEFT OUTER JOIN 
(SELECT fstrID, cl.fstrcustomerlevel 
 FROM dev_raw.app_tblid id 
 INNER JOIN 
 dev_raw.app_tblcustomerlevel cl ON id.flngCustomerKey = cl.flngCustomerKey 
 WHERE id.fstrIDtype = 'IRD' 
 AND nvl(id.record_active_flag, 'Y') = 'Y' 
 AND nvl(id.record_deleted_flag, 'N') = 'N' 
 AND nvl(cl.record_active_flag, 'Y') = 'Y' 
 AND nvl(cl.record_deleted_flag, 'N') = 'N') idcl
 ON CAST(z.fstrCallerIrdNumber AS INT) = CAST(idcl.fstrID AS INT) 
WHERE nvl(idcl.fstrcustomerlevel, 'STD') = 'STD' 
;
