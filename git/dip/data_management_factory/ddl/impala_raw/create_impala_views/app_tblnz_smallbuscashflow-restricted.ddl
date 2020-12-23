CREATE VIEW ${var:view_db}.app_tblnz_smallbuscashflow                                                                               
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.flngFullTimeEmployees,                                                                                                            
z.flngPartTimeEmployees,                                                                                                            
z.fblnReceivedMSDSubsidy,                                                                                                           
z.fcurWageSubsidyReceived,                                                                                                          
z.fcurWageSubsidyCalc,                                                                                                              
z.flngFullTimeEquivalent,                                                                                                           
z.fcurTotalGrantedForFTE,                                                                                                           
z.fblnOverrideLoanAmount,                                                                                                           
z.fcurMaximumAmount,                                                                                                                
z.fcurAmount,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_smallbuscashflow z;