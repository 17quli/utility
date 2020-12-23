CREATE VIEW ${var:view_db}.app_tblnz_famrelperiods                                                                                  
AS SELECT                                                                                                                           
z.flngFAMEntitlementKey,                                                                                                            
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.fintRelationshipPeriod,                                                                                                           
z.fdtmStart,                                                                                                                        
z.fdtmStop,                                                                                                                         
z.fintDays,                                                                                                                         
z.fstrPartnerIRD,                                                                                                                   
z.flngPartnerCustomerKey,                                                                                                           
z.fblnActive,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_famrelperiods z
 left outer join 
	${var:source_db}.app_tblCustomerLevel cl on 
z.flngpartnercustomerkey=cl.flngcustomerkey 
WHERE 
nvl(cl.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N'
;