CREATE VIEW ${var:view_db}.app_tblnz_rtnslsobligatns2013                                                                            
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fcurTotalIncome,                                                                                                                  
z.fcurPreviouslyAssessedIncome,                                                                                                     
z.fcurNZBAssessment,                                                                                                                
z.fcurOBBInstalmentAmount1,                                                                                                         
z.fcurOBBInstalmentAmount2,                                                                                                         
z.fcurBracket,                                                                                                                      
z.fdtmObbBegin2,                                                                                                                    
z.fcurBracket2,                                                                                                                     
z.fblnCnv,                                                                                                                          
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtnslsobligatns2013 z;