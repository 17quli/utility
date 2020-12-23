CREATE VIEW ${var:view_db}.app_tblnz_rtngstoriginal                                                                                 
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fdtmFilingPeriod,                                                                                                                 
z.fstrFilingFreq,                                                                                                                   
z.fstrSourceType,                                                                                                                   
z.fcurGSTTotal,                                                                                                                     
z.fcurPTVoluntaryAmount,                                                                                                            
z.fcurPTRefundTransfer,                                                                                                             
z.fblnTransitional,                                                                                                                 
z.fstrWebLogonID,                                                                                                                   
z.fstrVendorID,                                                                                                                     
z.fstrIPAddress,                                                                                                                    
z.fblnDebitAdjustments,                                                                                                             
z.fcurDebitAdjustments,                                                                                                             
z.fblnP2DebitAdjustments,                                                                                                           
z.fcurP2DebitAdjustments,                                                                                                           
z.fblnCreditAdjustments,                                                                                                            
z.fcurCreditAdjustments,                                                                                                            
z.fblnP2CreditAdjustments,                                                                                                          
z.fcurP2CreditAdjustments,                                                                                                          
z.fblnFinalReturn,                                                                                                                  
z.fblnHospice,                                                                                                                      
z.fstrHospiceType,                                                                                                                  
z.fcurTotalSales,                                                                                                                   
z.fcurZeroSupplies,                                                                                                                 
z.fcurLongTermCareSales,                                                                                                            
z.fcurHospitalSales,                                                                                                                
z.fcurDebitPrivateUse,                                                                                                              
z.fcurDebitOneOff,                                                                                                                  
z.fcurDebitAssetsKept,                                                                                                              
z.fcurDebitEntertainment,                                                                                                           
z.fcurDebitChangeOfAccounting,                                                                                                      
z.fcurDebitExemptSupplies,                                                                                                          
z.fcurDebitAdjustPrevRate,                                                                                                          
z.fcurDebitOther,                                                                                                                   
z.fcurTotalPurchases,                                                                                                               
z.fcurCreditPrivateGoods,                                                                                                           
z.fcurCreditPrivateAssets,                                                                                                          
z.fcurCreditChangeOfAccounting,                                                                                                     
z.fcurCreditAdjustPrevRate,                                                                                                         
z.fcurCreditOther,                                                                                                                  
z.fcurTotalPart1GST,                                                                                                                
z.fcurP2TotalSales,                                                                                                                 
z.fcurP2ZeroSupplies,                                                                                                               
z.fcurP2LongTermSales,                                                                                                              
z.fcurP2HospitalSales,                                                                                                              
z.fcurDebitP2PrivateUse,                                                                                                            
z.fcurDebitP2OneOff,                                                                                                                
z.fcurDebitP2AssetsKept,                                                                                                            
z.fcurDebitP2Entertainment,                                                                                                         
z.fcurDebitP2ChangeOfAccounting,                                                                                                    
z.fcurDebitP2ExemptSupplies,                                                                                                        
z.fcurDebitP2AdjustPrevRate,                                                                                                        
z.fcurDebitP2Other,                                                                                                                 
z.fcurP2TotalPurchases,                                                                                                             
z.fcurCreditP2PrivateGoods,                                                                                                         
z.fcurCreditP2PrivateAssets,                                                                                                        
z.fcurCreditP2ChangeOfAccounting,                                                                                                   
z.fcurCreditP2AdjustPrevRate,                                                                                                       
z.fcurCreditP2Other,                                                                                                                
z.fcurTotalPart2GST,                                                                                                                
z.fcurTotalTransitionalGST,                                                                                                         
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtngstoriginal z
 LEFT OUTER JOIN ${var:source_db}.app_tblreturn r
 ON CAST (z.flngDocKey AS INT) = CAST(R.flngDocKey as INT) 
LEFT OUTER JOIN ${var:source_db}.app_tblaccount a
ON CAST (r.flngAccountKey AS INT) = CAST(a.flngAccountKey as INT)
LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel c ON a.flngcustomerkey = c.flngcustomerkey 
WHERE 
  
  nvl(r.record_active_flag, 'Y') = 'Y' AND
  nvl(r.record_deleted_flag, 'N') = 'N' AND
  nvl(a.record_active_flag, 'Y') = 'Y' AND
  nvl(a.record_deleted_flag, 'N') = 'N' AND
  nvl(c.fstrCustomerLevel, 'STD') = 'STD' AND
  nvl(c.record_active_flag, 'Y') = 'Y' AND
  nvl(c.record_deleted_flag, 'N') = 'N' ; 
;