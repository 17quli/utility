CREATE VIEW ${var:view_db}.stc_tblnz_pafmetadata                                                  
AS SELECT                                                                                                                           
z.fstrDataSet,                                                                                                                      
z.fstrNotes,                                                                                                                        
record_effective_timestamp,                                                                                               
record_expiry_timestamp,                                                                                                  
record_active_flag,                                                                                                      
record_deleted_flag,                                                                                                     
insert_object_run_key,                                                                                                          
update_object_run_key                                                                                                           
 FROM ${var:source_db}.stc_tblnz_pafmetadata z; 