CREATE VIEW ${var:view_db}.app_tblnz_rtnpropertysale                                                                                
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fblnBrightLineTest,                                                                                                               
z.fstrPropertyTitleNumber,                                                                                                          
z.fstrAddressLine1,                                                                                                                 
z.fstrAddressLine2,                                                                                                                 
z.fstrSuburb,                                                                                                                       
z.fstrCity,                                                                                                                         
z.fstrPostCode,                                                                                                                     
z.fdtmDateOfPurchase,                                                                                                               
z.fdtmDateOfSale,                                                                                                                   
z.fcurSalePrice,                                                                                                                    
z.fcurPurchasePrice,                                                                                                                
z.fcurDeductibleCosts,                                                                                                              
z.fcurTotalCosts,                                                                                                                   
z.fcurNetProfitLoss,                                                                                                                
z.fdblPercentageOwnership,                                                                                                          
z.fcurShareOfNetProfitLoss,                                                                                                         
z.fdtmWhen,                                                                                                                         
z.fstrWho,                                                                                                                          
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtnpropertysale z; 