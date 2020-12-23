CREATE VIEW ${var:view_db}.app_tblnz_bcmpayerinfo                                                 
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fstrRecipientIRD,                                                                                                                 
z.flngRecipientCustomerKey,                                                                                                         
z.fstrRecipientCustomerName,                                                                                                        
z.fstrPayerIRD,                                                                                                                     
z.flngPayerCustomerKey,                                                                                                             
z.flngPayerAccountKey,                                                                                                              
z.fcurAmount,                                                                                                                       
z.flngCertificateKey,                                                                                                               
z.flngFileKey,                                                                                                                      
z.fblnClosePending,                                                                                                                 
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_bcmpayerinfo z
left outer join 
${var:source_db}.app_tblcustomerlevel clr 
ON z.flngRecipientCustomerKey = clr.flngcustomerkey
Left outer join
${var:source_db}.app_tblcustomerlevel clp
ON z.flngPayerCustomerKey = clp.flngcustomerkey
WHERE nvl(clr.fstrCustomerLevel, 'STD') = 'STD' 
  AND nvl(clr.record_active_flag, 'Y') = 'Y' 
  AND nvl(clr.record_deleted_flag, 'N') = 'N'
  AND nvl(clp.fstrCustomerLevel, 'STD') = 'STD' 
  AND nvl(clp.record_active_flag, 'Y') = 'Y' 
  AND nvl(clp.record_deleted_flag, 'N') = 'N';
