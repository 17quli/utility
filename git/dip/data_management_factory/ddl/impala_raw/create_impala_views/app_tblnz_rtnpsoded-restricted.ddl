CREATE VIEW ${var:view_db}.app_tblnz_rtnpsoded                                                                                      
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fstrDLN,                                                                                                                          
z.fdtmSentToFIRST,                                                                                                                  
z.fdtmOriginalSentToFIRST,                                                                                                          
z.fdtmLastSentToFIRST,                                                                                                              
z.fblnFIRSTCnvError,                                                                                                                
z.fblnFIRSTCnvErrorWorkItem,                                                                                                        
z.fblnFIRSTCnvErrorComplete,                                                                                                        
z.fcurPAYE,                                                                                                                         
z.fcurChildSupport,                                                                                                                 
z.fcurStudentLoan,                                                                                                                  
z.fcurKiwiSaverDeductions,                                                                                                          
z.fcurKiwiSaverContributions,                                                                                                       
z.fcurESCTDeductions,                                                                                                               
z.fcurAmountPayable,                                                                                                                
z.fcurTaxCreditKiwiSaver,                                                                                                           
z.fcurTaxCreditCompliance,                                                                                                          
z.fblnElectronicPayment,                                                                                                            
z.fblnCorrespondence,                                                                                                               
z.fblnPaymentAttached,                                                                                                              
z.fblnPayrollIntermediary,                                                                                                          
z.fstrPIIRDNumber,                                                                                                                  
z.fdtmPIFilingPeriod,                                                                                                               
z.fstrPIRecordType,                                                                                                                 
z.fstrPIDLN,                                                                                                                        
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                         	                                                                                
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
FROM ${var:source_db}.app_tblnz_rtnpsoded z
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