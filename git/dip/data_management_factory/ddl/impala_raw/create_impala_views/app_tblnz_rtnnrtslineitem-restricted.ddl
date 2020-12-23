CREATE VIEW ${var:view_db}.app_tblnz_rtnnrtslineitem                                                                                
AS SELECT                                                                                                                           
z.fi64LineItemKey,                                                                                                                  
z.flngVer,                                                                                                                          
z.flngVerLast,                                                                                                                      
z.fdtmPeriod,                                                                                                                       
z.fstrRecipientIRD,                                                                                                                 
z.fstrRecipientStatus,                                                                                                              
z.fdtmRecipientDOB,                                                                                                                 
z.fstrRecipientSurname,                                                                                                             
z.fstrRecipientName,                                                                                                                
z.fstrRecipientAddress1,                                                                                                            
z.fstrRecipientAddress2,                                                                                                            
z.fstrRecipientAddress3,                                                                                                            
z.fstrRecipientAddress4,                                                                                                            
z.fstrRecipientCountryCode,                                                                                                         
z.fcurDividendsGross,                                                                                                               
z.fcurInterestGross,                                                                                                                
z.fcurRoyaltiesGross,                                                                                                               
z.fcurOtherGross,                                                                                                                   
z.fcurLiableTotal,                                                                                                                  
z.fcurTotalLessFDP,                                                                                                                 
z.fcurNetNRWTPaid,                                                                                                                  
z.fcurDividendsNRWT,                                                                                                                
z.fcurInterestNRWT,                                                                                                                 
z.fcurRoyaltiesNRWT,                                                                                                                
z.fcurOtherNRWT,                                                                                                                    
z.fstrPayerIRD,                                                                                                                     
z.fstrPayerName,                                                                                                                    
z.flngPayerCertificate,                                                                                                             
z.fstrPayerAddress1,                                                                                                                
z.fstrPayerAddress2,                                                                                                                
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtnnrtslineitem z
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
