CREATE VIEW ${var:view_db}.app_tblnz_studylinkceaselog                                                                              
AS SELECT                                                                                                                           
z.fi64CeaseLogKey,                                                                                                                  
z.flngDocKey,                                                                                                                       
z.fstrIRDNumber,                                                                                                                    
z.fstrFamilyName,                                                                                                                   
z.fstrMiddleName,                                                                                                                   
z.fstrFirstName,                                                                                                                    
z.fstrDLN,                                                                                                                          
z.fdtmCease,                                                                                                                        
z.fstrCeaseReason,                                                                                                                  
z.fstrAccountType,                                                                                                                  
z.fstrStudyLinkAction,                                                                                                              
z.fdtmResponse,                                                                                                                     
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
FROM ${var:source_db}.app_tblnz_studylinkceaselog z
left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${var:source_db}.app_tblid where fstrIDType = 'IRD' AND record_active_flag = 'Y' AND record_deleted_flag= 'N') id
on cast(z.fstrIRDNumber as int) = cast(id.fstrID as int) 
left outer JOIN ${var:source_db}.app_tblCustomerLevel cl on 
id.flngcustomerkey=cl.flngcustomerkey 
WHERE 
(nvl(cl.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N'); 
