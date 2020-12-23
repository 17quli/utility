CREATE VIEW ${var:view_db}.app_tblnz_rtnnrtelineitem                                                                                
AS SELECT                                                                                                                           
z.fi64LineItemKey,                                                                                                                  
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.fstrRecipientIdentifier,                                                                                                          
z.fstrRecipientName,                                                                                                                
z.fstrRecipientIRD,                                                                                                                 
z.fdtmRecipientDOB,                                                                                                                 
z.fstrRecipientPhone,                                                                                                               
z.fstrRecipientEmail,                                                                                                               
z.fstrRecipientAddress,                                                                                                             
z.fstrRecipientCountry,                                                                                                             
z.fstrRecipientCountryCode,                                                                                                         
z.fcurRecipientPercentage,                                                                                                          
z.fblnJointAccountIndicator,                                                                                                        
z.flngJointAccountHolders,                                                                                                          
z.fcurGrossAmount,                                                                                                                  
z.fcurDeducted,                                                                                                                     
z.fblnOverridePercentages,                                                                                                          
z.flngShares,                                                                                                                       
z.fdtmPayment,                                                                                                                      
z.fdtmDeclared,                                                                                                                     
z.fblnBonus,                                                                                                                        
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
FROM ${var:source_db}.app_tblnz_rtnnrtelineitem z
left outer join 
(
  select DISTINCT fstrID,fstrIDType,flngcustomerkey 
  from ${var:source_db}.app_tblid 
  where fstrIDType = 'IRD' 
  AND record_active_flag = 'Y'
  AND record_deleted_flag= 'N'
) id1
on cast(z.fstrRecipientIRD as int) = cast(id1.fstrID as int) 
left outer JOIN 
${var:source_db}.app_tblCustomerLevel cl1 on 
id1.flngcustomerkey=cl1.flngcustomerkey 
WHERE
(nvl(cl1.fstrCustomerLevel, 'STD') = 'STD' 
AND nvl(cl1.record_active_flag, 'Y') = 'Y' 
AND nvl(cl1.record_deleted_flag, 'N') = 'N')
;