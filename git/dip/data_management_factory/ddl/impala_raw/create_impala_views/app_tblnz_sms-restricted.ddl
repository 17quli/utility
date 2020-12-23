CREATE VIEW ${var:view_db}.app_tblnz_sms                                                          
AS SELECT                                                                                                                                                                                                                                                    
z.flngSMSKey,                                                                                                                       
z.fstrSMSType,                                                                                                                      
z.fstrDestinationNumber,                                                                                                            
z.fstrContent,  
case when z.flngCustomerKey=0 then wci.flngCustomerKey
	else z.flngcustomerkey end as flngcustomerkey,
z.flngAccountKey,                                                                                                                   
z.flngWebLogonKey,                                                                                                                  
z.flngAppointmentKey,                                                                                                               
z.flngFolderKey,                                                                                                                    
z.fstrExternalId,                                                                                                                   
z.fdtmRequested,                                                                                                                    
z.fdtmProcessed,                                                                                                                    
z.fdtmDelay,                                                                                                                        
z.fdtmLastSent,                                                                                                                     
z.fstrLastExternalMessageId,                                                                                                        
z.fstrLastExternalMessageStatus,                                                                                                    
z.fblnCanceled,                                                                                                                     
z.fstrBatch,                                                                                                                        
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_sms z
 left outer join ${var:source_db}.wrq_tblweblogon wci
 on z.flngWebLogonKey=wci.flngWebLogonKey
 left outer join ${var:source_db}.app_tblcustomerlevel cl
 on 
 case when z.flngCustomerKey=0 then wci.flngCustomerKey
	else z.flngcustomerkey end = cl.flngCustomerKey  
where nvl(cl.fstrcustomerlevel, 'STD') = 'STD' 
  and nvl(cl.record_active_flag, 'Y') = 'Y' 
  and nvl(cl.record_deleted_flag, 'N') = 'N' 
  and nvl(wci.record_active_flag,'Y')='Y'
  and nvl(wci.record_deleted_flag,'N')='N'
;