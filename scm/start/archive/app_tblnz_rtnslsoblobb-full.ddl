CREATE VIEW ${var:view_db}.app_tblnz_rtnslsoblobb                                                                                   
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fcurTotalLoanBalance,                                                                                                             
z.fdtmObbBegin,                                                                                                                     
z.fcurBalanceAtObbBegin,                                                                                                            
z.fcurFullYearObligation,                                                                                                           
z.fcurAdjustedObligation,                                                                                                           
z.fdtmInstalment1Due,                                                                                                               
z.fdtmInstalment2Due,                                                                                                               
z.fcurBracket,                                                                                                                      
z.fdtmObbBegin2,                                                                                                                    
z.fcurBracket2,                                                                                                                     
z.fcurBalanceAtObbBegin2,                                                                                                           
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtnslsoblobb z; 