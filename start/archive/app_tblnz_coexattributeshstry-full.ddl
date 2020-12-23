CREATE VIEW ${var:view_db}.app_tblnz_coexattributeshstry                                                                            
AS SELECT                                                                                                                           
z.`flngDocKey`,                                                                                                                     
z.`flngVer`,                                                                                                                        
z.`flngVerLast`,                                                                                                                    
z.`fdtmCommence`,                                                                                                                   
z.`fdtmCease`,                                                                                                                      
z.`fstrCustomerSubType`,                                                                                                            
z.`fstrSubTypeClass`,                                                                                                               
z.`fblnIsNonResident`,                                                                                                              
z.`fstrNonResidentType`,                                                                                                            
z.`fstrCustomerLevel`,                                                                                                              
z.`fstrSecurityCode`,                                                                                                               
z.`fstrWho`,                                                                                                                        
z.`fdtmWhen`,                                                                                                                       
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_coexattributeshstry z;