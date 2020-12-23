CREATE VIEW ${var:view_db}.app_tblmailitememail                                                   
AS SELECT                                                                                                                           
z.fi64MailItemEmailKey,                                                                                                             
z.flngVerLast,                                                                                                                      
z.flngMailItemKey,                                                                                                                  
z.flngEmailCustomerKey,                                                                                                             
z.fstrEmail,                                                                                                                        
z.fstrEmailOption,                                                                                                                  
z.flngEmailKey,                                                                                                                     
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblmailitememail z
join ${var:source_db}.app_tblmailitem p
on z.flngMailItemKey=p.flngMailItemKey
 left outer join 
${var:source_db}.app_tblcustomerlevel cl
ON cast(p.fstrrecipientkey as int) = cl.flngcustomerkey
WHERE p.record_active_flag='Y' and
	p.record_deleted_flag='N' and 
nvl(cl.fstrCustomerLevel, 'STD') = 'STD' 
  AND nvl(cl.record_active_flag, 'Y') = 'Y' 
  AND nvl(cl.record_deleted_flag, 'N') = 'N'
 ;
 