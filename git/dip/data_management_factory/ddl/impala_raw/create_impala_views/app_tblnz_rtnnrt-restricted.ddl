CREATE VIEW ${var:view_db}.app_tblnz_rtnnrt                                                                                         
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fstrPayeeIRDNumber,                                                                                                               
z.fdtmPeriod,                                                                                                                       
z.fdtmDOB,                                                                                                                          
z.fstrPayeeSurname,                                                                                                                 
z.fstrPayeeName,                                                                                                                    
z.fstrPayeeAddress1,                                                                                                                
z.fstrPayeeAddress2,                                                                                                                
z.fstrPayeeAddress3,                                                                                                                
z.fstrPayeeAddress4,                                                                                                                
z.fstrPayeeCountryCode,                                                                                                             
z.fcurDividendsGross,                                                                                                               
z.fcurInterestGross,                                                                                                                
z.fcurRoyaltiesGross,                                                                                                               
z.fcurOtherGross,                                                                                                                   
z.fcurDividendsNRWT,                                                                                                                
z.fcurInterestNRWT,                                                                                                                 
z.fcurRoyaltiesNRWT,                                                                                                                
z.fcurOtherNRWT,                                                                                                                    
z.fcurLiableTotal,                                                                                                                  
z.fcurFDPCredits,                                                                                                                   
z.fcurNetNRWTPaid,                                                                                                                  
z.fstrPayerIRDNumber,                                                                                                               
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
FROM ${var:source_db}.app_tblnz_rtnnrt z
LEFT OUTER JOIN ${var:source_db}.app_tblreturn tr ON z.flngDocKey = tr.flngDocKey
LEFT OUTER JOIN ${var:source_db}.app_tblaccount ta ON tr.flngDocKey = ta.flngDocKey
LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel cl ON ta.flngCustomerKey = cl.flngCustomerKey
WHERE nvl(cl.fstrcustomerlevel, 'STD') = 'STD'
  AND nvl(tr.record_active_flag, 'Y') = 'Y'
  AND nvl(tr.record_deleted_flag, 'N') = 'N'
  AND nvl(ta.record_active_flag, 'Y') = 'Y'
  AND nvl(ta.record_deleted_flag, 'N') = 'N'
  AND nvl(cl.record_active_flag, 'Y') = 'Y'
  AND nvl(cl.record_deleted_flag, 'N') = 'N';