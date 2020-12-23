CREATE VIEW ${var:view_db}.app_tblnz_casfeedback                                                                                    
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fstrCustomerSegment,                                                                                                              
z.fstrFeedback,                                                                                                                     
z.fstrRecommendation,                                                                                                               
z.fstrProductNumber,                                                                                                                
z.fstrCaseSubType,                                                                                                                  
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_casfeedback z
LEFT OUTER JOIN ${var:source_db}.app_tblacaseall ca
ON CAST (z.flngDocKey AS INT) = CAST(ca.flngDocKey as INT)
LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel cl
on ca.flngcustomerkey = cl.flngcustomerkey 
WHERE 
  
  nvl(ca.record_active_flag, 'Y') = 'Y' AND
  nvl(ca.record_deleted_flag, 'N') = 'N' AND
  nvl(cl.fstrCustomerLevel, 'STD') = 'STD' AND
  nvl(cl.record_active_flag, 'Y') = 'Y' AND
  nvl(cl.record_deleted_flag, 'N') = 'N' 
; 
