CREATE VIEW ${var:view_db}.app_tblnz_rtnpieannlineitem                                            
AS SELECT                                                                                                                           
z.fi64LineItemKey,                                                                                                                  
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.fstrPIEName,                                                                                                                      
z.fstrPIEIRDNumber,                                                                                                                 
z.fstrInvestorName,                                                                                                                 
z.fstrInvestorIRDNumber,                                                                                                            
z.fstrRecipientStatus,                                                                                                              
z.fdtmInvestorDateOfBirth,                                                                                                          
z.fstrInvestorCertIdentifier,                                                                                                       
z.fcurRateYearEnd,                                                                                                                  
z.fblnRateChanged,                                                                                                                  
z.fcurUnitsHeldYearEnd,                                                                                                             
z.fdtmPeriod,                                                                                                                       
z.fcurTotalIncomeLoss,                                                                                                              
z.fcurTotalTaxCredits,                                                                                                              
z.fcurNetTaxPaid,                                                                                                                   
z.fcurTaxableIncomeLowMid,                                                                                                          
z.fcurTaxPaidLowMid,                                                                                                                
z.fcurTotalTaxCreditsLowMid,                                                                                                        
z.fcurZeroExitedTaxableIncome,                                                                                                      
z.fcurTotalForeignTaxCredits,                                                                                                       
z.fcurTotalOtherTaxCredits,                                                                                                         
z.fcurTotalICTaxCredits,                                                                                                            
z.fcurTotalRWTTaxCredits,                                                                                                           
z.fcurTaxPaymentExitedInvestors,                                                                                                    
z.fstrHomeAddressLine1,                                                                                                             
z.fstrHomeAddressLine2,                                                                                                             
z.fstrHomeAddressLine3,                                                                                                             
z.fstrHomeAddressLine4,                                                                                                             
z.fstrCountry,                                                                                                                      
z.fstrCountryCode,                                                                                                                  
z.fstrHomeTaxFileNumber,                                                                                                            
z.fstrNFIDTA,                                                                                                                       
z.fblnHomeTaxFileDeclaration,                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtnpieannlineitem z
left outer join 
${var:source_db}.app_tblcustomerinfo ci
on ci.fstrid = z.fstrPIEIRDNumber
left outer join 
${var:source_db}.app_tblcustomerinfo cii
on cii.fstrid = z.fstrInvestorIRDNumber
 where 
  nvl(ci.fstridtype,'IRD') = 'IRD'
  and nvl(ci.record_active_flag,'Y') = 'Y'
  and nvl(ci.record_deleted_flag,'N') = 'N'
  and nvl(ci.fstrCustomerLevel, 'STD') = 'STD'
  and nvl(cii.fstridtype,'IRD') = 'IRD'
  and nvl(cii.record_active_flag,'Y') = 'Y'
  and nvl(cii.record_deleted_flag,'N') = 'N'
  and nvl(cii.fstrCustomerLevel, 'STD') = 'STD';
  ;
