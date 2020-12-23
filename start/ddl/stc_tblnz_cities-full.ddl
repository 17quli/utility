CREATE VIEW ${var:view_db}_full_access.stc_tblnz_cities                                                       
AS SELECT                                                                                                                           
z.fstrTownCity,                                                                                                                     
z.flngTownCityID,                                                                                                                   
z.fintPostCode,                                                                                                                     
record_effective_timestamp,                                                                                               
record_expiry_timestamp,                                                                                                  
record_active_flag,                                                                                                      
record_deleted_flag,                                                                                                     
insert_object_run_key,                                                                                                          
update_object_run_key                                                                                                           
 FROM ${var:source_db}.stc_tblnz_cities z;