CREATE VIEW ${var:view_db}.wrq_tblwebnoticeemail                                                                                    
AS SELECT                                                                                                                           
z.flngWebNoticeKey,                                                                                                                 
z.flngEmailKey,                                                                                                                     
z.flngWebLogonKey,                                                                                                                  
z.fstrEmail,                                                                                                                        
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.wrq_tblwebnoticeemail z
LEFT OUTER JOIN
(select wl.flngWebLogonKey, cl.fstrcustomerlevel
 from ${var:source_db}.wrq_tblweblogon  wl
 inner join ${var:source_db}.app_tblcustomerlevel cl
 on wl.flngCustomerKey = cl.flngCustomerKey
  where 
 nvl(wl.record_active_flag, 'Y') = 'Y'
  and nvl(wl.record_deleted_flag, 'N') = 'N'
  and nvl(cl.record_active_flag, 'Y') = 'Y'
  and nvl(cl.record_deleted_flag, 'N') = 'N'
  ) wlcl
on z.flngWebLogonKey=wlcl.flngWebLogonKey
where
nvl(wlcl.fstrcustomerlevel, 'STD') = 'STD';