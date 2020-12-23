CREATE VIEW ${var:view_db}.app_tblnz_provmethod                                                                                     
AS SELECT                                                                                                                           
z.flngMethodKey,                                                                                                                    
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.flngCustomerKey,                                                                                                                  
z.flngAccountKey,                                                                                                                   
z.fstrMethod,                                                                                                                       
z.fintTaxYear,                                                                                                                      
z.fdtmCommence,                                                                                                                     
z.fdtmCease,                                                                                                                        
z.fcurAmount,                                                                                                                       
z.fdblRatio,                                                                                                                        
z.fstrSource,                                                                                                                       
z.flngSourceKey,                                                                                                                    
z.fblnActive,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_provmethod z;                                                                                      