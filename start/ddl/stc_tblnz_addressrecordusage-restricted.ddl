CREATE VIEW ${var:view_db}_restricted_access.stc_tblnz_addressrecordusage                                           
AS SELECT                                                                                                                           
z.fintRecordUsageID,                                                                                                                
z.fstrUsageType,                                                                                                                    
z.fstrTypeDescription,                                                                                                              
z.fblnUnique,                                                                                                                       
z.fblnBase,                                                                                                                         
z.fblnHygene,                                                                                                                       
z.fblnInvalid,                                                                                                                      
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.stc_tblnz_addressrecordusage z;