CREATE VIEW ${var:view_db}.app_tblnz_customerstd                                                                                    
AS SELECT                                                                                                                           
z.`flngDocKey`,                                                                                                                     
z.`fstrCustomerSubTypeClass`,                                                                                                       
z.`fstrCustomerSubType`,                                                                                                            
z.`fstrCustomerSegment`,                                                                                                            
z.`fstrSpecialFileType`,                                                                                                            
z.`fblnSpecialTaxResidency`,                                                                                                        
z.`fstrNonResidentType`,                                                                                                            
z.`fstrCurrentTaxResidency`,                                                                                                        
z.`fstrClosureReason`,                                                                                                              
z.`fintSMSCountryCode`,                                                                                                             
z.`fstrSMSAreaCode`,                                                                                                                
z.`fstrSMSPhoneNumber`,                                                                                                             
z.`fdtmIncomeBalanceDate`,                                                                                                          
z.`fstrCustomerClass`,                                                                                                              
z.`fstrWho`,                                                                                                                        
z.`fdtmWhen`,                                                                                                                       
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_customerstd z
 LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel cl 
 ON z.FLNGDOCKEY = cl.FLNGDOCKEY 
WHERE nvl(cl.fstrcustomerlevel, 'STD') = 'STD' 
  AND nvl(cl.record_active_flag, 'Y') = 'Y' 
  AND nvl(cl.record_deleted_flag, 'N') = 'N';