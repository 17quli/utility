CREATE VIEW ${var:view_db}_restricted_access.stc_tblnz_alternativemailtown                                          
AS SELECT                                                                                                                           
z.flngMailTownAliasID,                                                                                                              
z.flngMailTownID,                                                                                                                   
z.fstrMailTownAliasName,                                                                                                            
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.stc_tblnz_alternativemailtown z;