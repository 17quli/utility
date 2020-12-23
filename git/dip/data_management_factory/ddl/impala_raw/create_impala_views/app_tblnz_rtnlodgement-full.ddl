CREATE VIEW ${var:view_db}.app_tblnz_rtnlodgement                                                                                   
AS SELECT                                                                                                                           
z.flngLogKey,                                                                                                                       
z.fstrDLN,                                                                                                                          
z.fstrIRD,                                                                                                                          
z.fstrForm,                                                                                                                         
z.flngAccountKey,                                                                                                                   
z.fdtmFilingPeriod,                                                                                                                 
z.flngIndicatorKey,                                                                                                                 
z.fstrDocType,                                                                                                                      
z.fintDocVer,                                                                                                                       
z.fstrStatus,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtnlodgement z;