CREATE VIEW ${var:view_db}.app_tblnz_rtnrebrcp                                                                                      
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fintSeq,                                                                                                                          
z.flngCustomerKey,                                                                                                                  
z.flngCaseKey,                                                                                                                      
z.fcurReceiptAmount,                                                                                                                
z.fcurApprovedAmount,                                                                                                               
z.fdtmReceiptDate,                                                                                                                  
z.fdtmFilingPeriod,                                                                                                                 
z.fstrDonationType,                                                                                                                 
z.fstrOrganisationName,                                                                                                             
z.fstrOrganisationIRD,                                                                                                              
z.fstrOrganisationCharityNum,                                                                                                       
z.fstrPartnerIRD,                                                                                                                   
z.flngPartnerCustomerKey,                                                                                                           
z.fcurPartnerAmount,                                                                                                                
z.fstrRejectedWho,                                                                                                                  
z.flngWebReqKey,                                                                                                                    
z.fblnTaxAgentClaim,                                                                                                                
z.fstrAuditRejectionRating,                                                                                                         
z.fstrRejectionReason,                                                                                                              
z.fstrOtherRejectionReason,                                                                                                         
z.flngOCRPage,                                                                                                                      
z.fstrOCRSourceType,                                                                                                                
z.flngOCRSourceKey,                                                                                                                 
z.fstrOCRStatus,                                                                                                                    
z.fstrOCRText,                                                                                                                      
z.fblnOCRKeyerConfirm,                                                                                                              
z.fblnOCRDonee,                                                                                                                     
z.fstrOCRReceiptID,                                                                                                                 
z.fstrOCRAddressName,                                                                                                               
z.fstrOCRAddress,                                                                                                                   
z.fstrOCREmail,                                                                                                                     
z.fstrOCRWebSite,                                                                                                                   
z.fstrOCRCharityNumber,                                                                                                             
z.fstrOCRName,                                                                                                                      
z.fstrOCRIRD,                                                                                                                       
z.fcurOCRReceiptAmount,                                                                                                             
z.fdtmOCRReceiptDate,                                                                                                               
z.fstrOCRType,                                                                                                                      
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_rtnrebrcp z;                                                                                       
