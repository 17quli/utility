CREATE VIEW ${var:view_db}.app_tblnz_slscustomsmovement                                                                             
AS SELECT                                                                                                                           
z.flngCustomsMovementKey,                                                                                                           
z.flngAccountKey,                                                                                                                   
z.fintSeq,                                                                                                                          
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.fi64MovementID,                                                                                                                   
z.fi64GatewayKey,                                                                                                                   
z.fstrFirstName,                                                                                                                    
z.fstrLastName,                                                                                                                     
z.fdtmDOB,                                                                                                                          
z.fstrSex,                                                                                                                          
z.fstrPassportNumber,                                                                                                               
z.fstrCitizenship,                                                                                                                  
z.fdtmTravelDate,                                                                                                                   
z.fstrDirection,                                                                                                                    
z.fstrFlightNumber,                                                                                                                 
z.fstrPort,                                                                                                                         
z.fstrOverseasPort,                                                                                                                 
z.fcurMatchPercent,                                                                                                                 
z.fstrSource,                                                                                                                       
z.fstrIRDNumber,                                                                                                                    
z.fdtmReceived,                                                                                                                     
z.flngCaseKey,                                                                                                                      
z.fblnActive,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_slscustomsmovement z
 left outer join 
${var:source_db}.app_tblaccount ac
ON z.flngAccountKey = ac.flngAccountKey
left join 
${var:source_db}.app_tblcustomerinfo cl 
ON ac.flngcustomerkey = cl.flngcustomerkey
WHERE
nvl(ac.record_active_flag, 'Y') = 'Y'
AND nvl(ac.record_deleted_flag, 'N') = 'N'
AND nvl(cl.fstrcustomerlevel, 'STD') = 'STD'
AND nvl(cl.record_active_flag, 'Y') = 'Y'
AND nvl(cl.record_deleted_flag, 'N') = 'N'
; 