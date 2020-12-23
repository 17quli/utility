CREATE VIEW ${var:view_db}.dss_mtc_claim_information                                                                                
AS SELECT                                                                                                                           
z.CONTRACT_OBJECT_ID,                                                                                                               
z.BP_NUMBER,                                                                                                                        
z.CONTRACT_ACCOUNT_CATEGORY,                                                                                                        
z.FISCAL_YEAR,                                                                                                                      
z.MTC_CLAIM_SEQUENCE,                                                                                                               
z.MTC_CLAIM_TYPE_CODE,                                                                                                              
z.DATE_FROM,                                                                                                                        
z.DATE_TO,                                                                                                                          
z.MTC_ELIGIBLE_DAYS_EXTERNAL,                                                                                                       
z.MTC_ELIGIBLE_DAYS,                                                                                                                
z.CONTRIBUTION_AMOUNT_EXTERNAL,                                                                                                     
z.CONTRIBUTION_AMOUNT,                                                                                                              
z.MORTGAGE_DIVERSION_AMOUNT,                                                                                                        
z.MTC_CLAIM_AMOUNT,                                                                                                                 
z.PAID_AMOUNT,                                                                                                                      
z.CURRENCY_KEY,                                                                                                                     
z.DATE_CLAIMED,                                                                                                                     
z.MTC_CLAIM_DOCUMENT_NUMBER,                                                                                                        
z.CREATED_TIMESTAMP,                                                                                                                
z.CREATED_TIMESTAMP_LONG,                                                                                                           
z.CREATED_BY,                                                                                                                       
z.CHANGED_TIMESTAMP,                                                                                                                
z.CHANGED_TIMESTAMP_LONG,                                                                                                           
z.CHANGED_BY,                                                                                                                       
z.`TIMESTAMP`,                                                                                                                      
z.EDW_LOAD_DATE,                                                                                                                    
z.DATE_FROM_EXTERNAL,                                                                                                               
z.SCHEME_ID,                                                                                                                        
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.dss_mtc_claim_information z
left outer join  ${var:source_db}.dss_special_clients_all sc1
on cast(z.bp_number as int) = cast(sc1.ird_number as int) where 
nvl(sc1.special_classification, 'STD')='STD'
and nvl( sc1.record_active_flag,'Y')='Y'
and nvl(sc1.record_deleted_flag, 'N') = 'N'
;
