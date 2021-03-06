CREATE VIEW ${var:view_db}.app_tblfile                                                                                              
AS SELECT                                                                                                                           
z.`flngFileKey`,                                                                                                                    
z.`fstrFileType`,                                                                                                                   
z.`fstrDir`,                                                                                                                        
z.`fstrName`,                                                                                                                       
z.`fstrOrigName`,                                                                                                                   
z.`flngCheckSum`,                                                                                                                   
z.`flngSize`,                                                                                                                       
z.`flngSizeCompressed`,                                                                                                             
z.`fdtmQueued`,                                                                                                                     
z.`fdtmReformatted`,                                                                                                                
z.`fdtmValidated`,                                                                                                                  
z.`fdtmLoaded`,                                                                                                                     
z.`fdtmRejected`,                                                                                                                   
z.`fdtmCompleted`,                                                                                                                  
z.`fblnDuplicate`,                                                                                                                  
z.`fblnStored`,                                                                                                                     
z.`fstrDataLocation`,                                                                                                               
z.`flngParentFileKey`,                                                                                                              
z.`fstrError`,                                                                                                                      
z.`fstrExternalId`,                                                                                                                 
z.`flngCrmKey`,                                                                                                                     
z.`flngFileSystemFileKey`,                                                                                                          
z.`fstrFileDataStorageMethod`,                                                                                                      
z.`FSTRWHO`,                                                                                                                        
z.`FDTMWHEN`,                                                                                                                       
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblfile z;