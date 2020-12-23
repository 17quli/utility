CREATE VIEW ${var:view_db}.app_tblnz_famchildsupportact                                                                             
AS SELECT                                                                                                                           
z.flngFAMChildSupportActualsKey,                                                                                                    
z.flngFAMEntitlementKey,                                                                                                            
z.fdtmFilingPeriod,                                                                                                                 
z.flngPCGCustomerKey,                                                                                                               
z.fstrPCGIRD,                                                                                                                       
z.flngPNRCustomerKey,                                                                                                               
z.fstrPNRIRD,                                                                                                                       
z.fdtmSentToFIRST,                                                                                                                  
z.fcurAmountReceived,                                                                                                               
z.fcurAmountPaid,                                                                                                                   
z.fstrErrorCode,                                                                                                                    
z.fstrErrorMessage,                                                                                                                 
z.fdtmReceivedFromFIRST,                                                                                                            
z.fdtmActualsProcessed,                                                                                                             
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_famchildsupportact z  
left outer join ${var:source_db}.app_tblcustomerlevel c1
ON z.flngPCGCustomerKey = c1.flngcustomerkey
left outer join ${var:source_db}.app_tblcustomerlevel c2
on z.flngPNRCustomerKey = c2.flngcustomerkey
where nvl(c1.fstrcustomerlevel, 'STD')='STD'
and nvl(c1.record_active_flag,'Y')='Y'
and nvl(c1.record_deleted_flag, 'N') = 'N'
and nvl(c2.fstrcustomerlevel, 'STD')='STD'
and nvl(c2.record_active_flag,'Y')='Y'
and nvl(c2.record_deleted_flag, 'N') = 'N'
;

