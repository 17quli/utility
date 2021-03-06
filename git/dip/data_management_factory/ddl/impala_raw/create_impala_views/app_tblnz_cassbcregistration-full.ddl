CREATE VIEW ${var:view_db}.app_tblnz_cassbcregistration                                                                             
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fstrRegistrationSource,                                                                                                           
z.fstrSourceReason,                                                                                                                 
z.fstrLegalDeclaration,                                                                                                             
z.fstrResidentDeclaration,                                                                                                          
z.fstrLossDeclaration,                                                                                                              
z.fstrExistingBusinessDeclare,                                                                                                      
z.fstrWorkingCapitalDeclaration,                                                                                                    
z.fstrBenefitDeclaration,                                                                                                           
z.fstrAgeDeclaration,                                                                                                               
z.fblnMSDVerified,                                                                                                                  
z.fcurMSDSubsidyAmount,                                                                                                             
z.fcurLoanAllowable,                                                                                                                
z.fblnOverrideLoan,                                                                                                                 
z.fcurLoanAmount,                                                                                                                   
z.flngFullTimeEmployees,                                                                                                            
z.flngPartTimeEmployees,                                                                                                            
z.flngFTE,                                                                                                                          
z.fstrNZBN,                                                                                                                         
z.fstrContactName,                                                                                                                  
z.fblnUnder18,                                                                                                                      
z.fblnExistingAccount,                                                                                                              
z.fblnCeased,                                                                                                                       
z.fblnInsolvent,                                                                                                                    
z.fblnEmployeeReview,                                                                                                               
z.fblnMultipleApplications,                                                                                                         
z.fblnSignificantEnterprise,                                                                                                        
z.fblnFraud,                                                                                                                        
z.fblnMSDIneligible,                                                                                                                
z.fblnIR3,                                                                                                                          
z.fblnSpecialAudit,                                                                                                                 
z.fblnFTECount,                                                                                                                     
z.fblnCommenceDate,                                                                                                                 
z.fblnOverseasIP,                                                                                                                   
z.fblnOverseasAddress,                                                                                                              
z.fblnPriorProsecution,                                                                                                             
z.fblnRelatedSuspectedOfFraud,                                                                                                      
z.fblnCurrentAudit,                                                                                                                 
z.fblnPriorEvasionAudit,                                                                                                            
z.fblnPrision,                                                                                                                      
z.fblnNonResident,                                                                                                                  
z.fblnRelatedSpecialAudit,                                                                                                          
z.fblnHighNZBNChangeCount,                                                                                                          
z.fstrIPAddress,                                                                                                                    
z.fstrIPCountry,                                                                                                                    
z.fstrIPCity,                                                                                                                       
z.fstrIPProxyType,                                                                                                                  
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_cassbcregistration z;     