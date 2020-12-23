CREATE VIEW ${var:view_db}.app_tblnz_cassecurityincident                                                                            
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fstrIncidentType,                                                                                                                 
z.fdtmIncidentDate,                                                                                                                 
z.fstrHowReceived,                                                                                                                  
z.fstrIncidentLocation,                                                                                                             
z.fstrOfficeLocation,                                                                                                               
z.fblnOfficeClosure,                                                                                                                
z.fstrReportedBy,                                                                                                                   
z.fstrUserPhone,                                                                                                                    
z.fblnDamage,                                                                                                                       
z.fstrTeamLeader,                                                                                                                   
z.fstrTeamLeaderPhoneNumber,                                                                                                        
z.fstrTarget,                                                                                                                       
z.fstrBusinessGroup,                                                                                                                
z.fblnWitnesses,                                                                                                                    
z.fstrIncidentDetails,                                                                                                              
z.fstrDamageDetails,                                                                                                                
z.fstrWitnessDetails,                                                                                                               
z.fblnManagerNotified,                                                                                                              
z.fblnFacilitiesManagementNotifi,                                                                                                   
z.fblnHealthAndSafety,                                                                                                              
z.fblnPoliceNotified,                                                                                                               
z.fdtmPoliceNotifiedDate,                                                                                                           
z.fstrPoliceReportReference,                                                                                                        
z.fstrPoliceActions,                                                                                                                
z.fblnStaffDebriefed,                                                                                                               
z.fblnLetterIssued,                                                                                                                 
z.fblnTrespassNotice,                                                                                                               
z.fblnOther,                                                                                                                        
z.fblnCorporateCommsNotified,                                                                                                       
z.fblnAlertNotification,                                                                                                            
z.fstrCorpSecurityComment,                                                                                                          
z.fblnThirdPartyContacted,                                                                                                          
z.fblnSecurityRequested,                                                                                                            
z.fstrWho,                                                                                                                          
z.fdtmWhen                                                                                                                                                                                                                                     
FROM ${var:source_db}.app_tblnz_cassecurityincident z
 left outer join 
${var:source_db}.app_tblacaseall ca 
on z.flngDocKey = ca.flngDocKey
 left outer join 
${var:source_db}.app_tblcustomerlevel cl 
on z.flngDocKey = cl.flngDocKey
and ca.flngCustomerKey = cl.flngCustomerKey
where nvl(cl.fstrcustomerlevel, 'STD') = 'STD' 
  and nvl(ca.record_active_flag, 'Y') = 'Y' 
  and nvl(ca.record_deleted_flag, 'N') = 'N'
  and nvl(cl.record_active_flag, 'Y') = 'Y'
  and nvl(cl.record_deleted_flag, 'N') = 'N';  
