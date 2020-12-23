CREATE VIEW ${var:view_db}.app_tblrecoveryamount                                                                                    
AS SELECT                                                                                                                           
z.flngRecoveryKey,                                                                                                                  
z.flngOffsetKey,                                                                                                                    
z.flngDataKey,                                                                                                                      
z.fcurAmount,                                                                                                                       
z.fdtmDateTime,                                                                                                                     
z.fdtmDate,                                                                                                                         
z.fintDay,                                                                                                                          
z.fintMonth,                                                                                                                        
z.fintQuarter,                                                                                                                      
z.fintYear,                                                                                                                         
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblrecoveryamount z;    