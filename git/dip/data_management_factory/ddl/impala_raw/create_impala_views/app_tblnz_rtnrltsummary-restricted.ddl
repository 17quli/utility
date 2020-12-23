CREATE VIEW ${var:view_db}.app_tblnz_rtnrltsummary                                                                                  
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fstrWithholderIRD,                                                                                                                
z.fstrWithholderName,                                                                                                               
z.fcurTotalPaid,                                                                                                                    
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
FROM ${var:source_db}.app_tblnz_rtnrltsummary z
LEFT OUTER JOIN ${var:source_db}.app_tblreturn tr ON z.flngDocKey = tr.flngDocKey 
LEFT OUTER JOIN ${var:source_db}.app_tblaccount ta ON tr.flngaccountKey = ta.flngaccountKey 
LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel cl ON ta.flngCustomerKey = cl.flngCustomerKey 
WHERE nvl(cl.fstrcustomerlevel, 'STD') = 'STD'
  AND nvl(tr.record_active_flag, 'Y') = 'Y'
  AND nvl(tr.record_deleted_flag, 'N') = 'N'
  AND nvl(ta.record_active_flag, 'Y') = 'Y'
  AND nvl(ta.record_deleted_flag, 'N') = 'N'
  AND nvl(cl.record_active_flag, 'Y') = 'Y'
  AND nvl(cl.record_deleted_flag, 'N') = 'N';
 