CREATE VIEW ${var:view_db}.app_tblnz_provattributes                                                                                 
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.flngCustomerKey,                                                                                                                  
z.fstrCustomerType,                                                                                                                 
z.fblnProvFiler,                                                                                                                    
z.fstrNominatedIRD,                                                                                                                 
z.flngNominatedCustomerKey,                                                                                                         
z.fintNominatedProfileNumber,                                                                                                       
z.fstrOpenProvMethod,                                                                                                               
z.fdtmIncomeBalance,                                                                                                                
z.fintIncomeBalanceMonth,                                                                                                           
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_provattributes z
left outer join ${var:source_db}.app_tblcustomerlevel cl on z.flngNominatedCustomerKey = cl.flngCustomerKey
where nvl(cl.fstrcustomerlevel, 'STD') = 'STD' 
  and nvl(cl.record_active_flag, 'Y') = 'Y'
  and nvl(cl.record_deleted_flag, 'N') = 'N';
