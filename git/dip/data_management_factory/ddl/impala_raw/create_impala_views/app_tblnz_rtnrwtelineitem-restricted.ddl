-- --caters for scenarios 1)If base IRD finds a match; 2)If base IRD is null; 3)If base IRD is not null and can't find a match
CREATE VIEW ${var:view_db}.app_tblnz_rtnrwtelineitem                                                                                
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
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
from ${var:source_db}.app_tblnz_rtnrwtelineitem z
left outer join 
(select fstrID, cl.fstrcustomerlevel
 from ${var:source_db}.app_tblID id 
 inner join ${var:source_db}.app_tblcustomerlevel cl
 on id.flngCustomerKey = cl.flngCustomerKey
  where 
  id.fstrIDtype = 'IRD' 
  and id.flngver = 0 
  and id.fblnDefault = 1
  and nvl(id.record_active_flag, 'Y') = 'Y'
  and nvl(id.record_deleted_flag, 'N') = 'N'
  and nvl(cl.record_active_flag, 'Y') = 'Y'
  and nvl(cl.record_deleted_flag, 'N') = 'N'
  ) idcl
on cast(z.fstrRecipientIRD as INT) = cast(idcl.fstrID as INT)  
where
nvl(idcl.fstrcustomerlevel, 'STD') = 'STD';