CREATE VIEW ${var:view_db}.web_tblweblogontocustomerinfo                                                                            
AS SELECT                                                                                                                           
z.flngWebLogonKey,                                                                                                                  
z.flngCustomerKey,                                                                                                                  
z.flngVerLast,                                                                                                                      
z.fstrAccessType,                                                                                                                   
z.fblnElectronicCorrespondence,                                                                                                     
z.fblnHidden,                                                                                                                       
z.fblnActive,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.web_tblweblogontocustomerinfo z;   