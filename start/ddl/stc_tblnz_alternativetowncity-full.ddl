CREATE VIEW ${var:view_db}_full_access.stc_tblnz_alternativetowncity                                          
AS SELECT                                                                                                                           
z.flngTownCityAliasID,                                                                                                              
z.flngTownCityID,                                                                                                                   
z.fstrTownCityAliasName,                                                                                                            
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.stc_tblnz_alternativetowncity z;