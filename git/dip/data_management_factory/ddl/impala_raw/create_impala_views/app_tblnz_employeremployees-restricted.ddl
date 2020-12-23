CREATE VIEW ${var:view_db}.app_tblnz_employeremployees                                                                              
AS SELECT                                                                                                                           
z.flngRelationshipKey,                                                                                                              
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.flngEmployerCustomerKey,                                                                                                          
z.flngEmployerAccountKey,                                                                                                           
z.flngEmployeeCustomerKey,                                                                                                          
z.flngEmployeeKSSAccountKey,                                                                                                        
z.flngEmployeeSLSAccountKey,                                                                                                        
z.fstrEmployeeIRDNumber,                                                                                                            
z.fstrEmployeeName,                                                                                                                 
z.fstrEmployeeTitle,                                                                                                                
z.fstrEmployeeFirstName,                                                                                                            
z.fstrEmployeeMiddleName,                                                                                                           
z.fstrEmployeeFamilyName,                                                                                                           
z.fdtmEmployeeDOB,                                                                                                                  
z.fstrKiwiSaverStatus,                                                                                                              
z.fdtmKiwiSaverEndDate,                                                                                                             
z.fdtmKiwiSaverOptInDate,                                                                                                           
z.fdtmKiwiSaverOptOutDate,                                                                                                          
z.fdtmKiwiSaverOptOutDeclined,                                                                                                      
z.fblnAutoEnrolled,                                                                                                                 
z.fblnNonDistributionEmployee,                                                                                                      
z.fstrUnitType,                                                                                                                     
z.fstrUnitNumber,                                                                                                                   
z.fstrDistrict,                                                                                                                     
z.fstrSubDistrict,                                                                                                                  
z.fstrSubProvince,                                                                                                                  
z.fstrStreetNumber,                                                                                                                 
z.fstrStreetName,                                                                                                                   
z.fstrUrbanization,                                                                                                                 
z.fstrStreetAddress1,                                                                                                               
z.fstrStreetAddress2,                                                                                                               
z.fstrCity,                                                                                                                         
z.fstrCounty,                                                                                                                       
z.fstrPostCode,                                                                                                                     
z.fstrState,                                                                                                                        
z.fstrCountry,                                                                                                                      
z.fstrAttention,                                                                                                                    
z.fstrAddressDescription,                                                                                                           
z.fblnAddressVerified,                                                                                                              
z.fstrDaytimeCountry,                                                                                                               
z.fintDaytimeCountryCode,                                                                                                           
z.fstrDaytimeAreaCode,                                                                                                              
z.fstrDaytimePhoneNumber,                                                                                                           
z.fstrDaytimeExtension,                                                                                                             
z.fstrMobileCountry,                                                                                                                
z.fintMobileCountryCode,                                                                                                            
z.fstrMobileAreaCode,                                                                                                               
z.fstrMobilePhoneNumber,                                                                                                            
z.fstrMobileExtension,                                                                                                              
z.fstrEmailAddress,                                                                                                                 
z.fdtmCommence,                                                                                                                     
z.fdtmCease,                                                                                                                        
z.fdtmCreated,                                                                                                                      
z.fblnValid,                                                                                                                        
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_employeremployees z
left outer join
${var:source_db}.app_tblcustomerlevel cl1 
on z.flngemployeecustomerkey = cl1.flngcustomerkey 
left outer join
${var:source_db}.app_tblcustomerlevel cl2 
on z.flngemployercustomerkey= cl2.flngcustomerkey 
where nvl(cl1.fstrcustomerlevel, 'STD') = 'STD' 
and nvl(cl1.record_active_flag, 'Y') = 'Y' 
and nvl(cl1.record_deleted_flag, 'N') = 'N' 
and nvl(cl2.fstrcustomerlevel, 'STD') = 'STD' 
and nvl(cl2.record_active_flag, 'Y') = 'Y' 
and nvl(cl2.record_deleted_flag, 'N') = 'N';
;
