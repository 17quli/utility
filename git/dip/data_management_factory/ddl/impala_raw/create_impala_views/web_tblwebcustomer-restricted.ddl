CREATE VIEW ${var:view_db}.web_tblwebcustomer                                                                                       
AS SELECT                                                                                                                           
z.flngCustomerKey,                                                                                                                  
z.flngJointCustomerKey,                                                                                                             
z.fblnPrime,                                                                                                                        
z.fstrCustomerType,                                                                                                                 
z.fblnDefault,                                                                                                                      
z.fintProfileNumber,                                                                                                                
z.fintNameKey,                                                                                                                      
z.fstrNameType,                                                                                                                     
z.fstrFamilyName,                                                                                                                   
z.fstrMiddleName,                                                                                                                   
z.fstrFirstName,                                                                                                                    
z.fstrNameControl,                                                                                                                  
z.fdtmCommence,                                                                                                                     
z.fdtmCease,                                                                                                                        
z.fstrTitle,                                                                                                                        
z.fstrSuffix,                                                                                                                       
z.fstrFreeFormatName,                                                                                                               
z.fstrListFormatName,                                                                                                               
z.fstrAdditionalName,                                                                                                               
z.fstrAdditionalName2,                                                                                                              
z.fintAddressKey,                                                                                                                   
z.fstrAddressType,                                                                                                                  
z.fstrStreet,                                                                                                                       
z.fstrStreet2,                                                                                                                      
z.fstrUnitType,                                                                                                                     
z.fstrUnit,                                                                                                                         
z.fstrCity,                                                                                                                         
z.fstrCounty,                                                                                                                       
z.fstrState,                                                                                                                        
z.fstrZip,                                                                                                                          
z.fstrCountry,                                                                                                                      
z.fstrAttention,                                                                                                                    
z.fstrLocationCode,                                                                                                                 
z.fstrUrbanization,                                                                                                                 
z.fstrMunicipality,                                                                                                                 
z.fstrDistrict,                                                                                                                     
z.fstrSubDistrict,                                                                                                                  
z.fstrSubProvince,                                                                                                                  
z.fstrListFormatAddress,                                                                                                            
z.fstrAddressDescription,                                                                                                           
z.flngIDKey,                                                                                                                        
z.fstrIDType,                                                                                                                       
z.fstrID,                                                                                                                           
z.fstrFormattedID,                                                                                                                  
z.flngDocKey,                                                                                                                       
z.fstrProfileType,                                                                                                                  
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
FROM ${var:source_db}.web_tblwebcustomer z
left outer join ${var:source_db}.app_tblcustomerlevel  cl1 
on z.flngCustomerKey=cl1.flngcustomerkey 
left outer join ${var:source_db}.app_tblcustomerlevel  cl2 
on z.flngJointCustomerKey=cl2.flngcustomerkey
where 
cl1.fstrcustomerlevel = 'STD' 
and cl1.record_active_flag='Y'
and cl1.record_deleted_flag = 'N'
and cl2.fstrcustomerlevel = 'STD' 
and cl2.record_active_flag='Y'
and cl2.record_deleted_flag = 'N'
;