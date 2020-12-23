CREATE VIEW ${var:view_db}.stc_tblnz_addressabbreviation                                          
AS SELECT                                                                                                                           
z.fstrName,                                                                                                                         
z.fstrAbbreviatedName,                                                                                                              
z.fstrAbbreviationType,                                                                                                             
z.fintRecordUsageID,                                                                                                                
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.stc_tblnz_addressabbreviation z; 