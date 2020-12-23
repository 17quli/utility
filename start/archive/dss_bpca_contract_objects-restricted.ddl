CREATE VIEW ${var:view_db}.dss_bpca_contract_objects                                                                                
AS SELECT                                                                                                                           
z.`CONTRACT_OBJECT_ID`,                                                                                                             
z.`BP_NUMBER`,                                                                                                                      
z.`CONTRACT_ACCOUNT_CATEGORY`,                                                                                                      
z.`CONTRACT_ACCOUNT_NUMBER`,                                                                                                        
z.`BANK_DETAILS`,                                                                                                                   
z.`OUTGOING_PAYMEN_METHODS`,                                                                                                        
z.`OUTGOING_PAYMENT_BANK_ID`,                                                                                                       
z.`CURRENT_RECORD_INDICATOR`,                                                                                                       
z.`DATE_APPLIED`,                                                                                                                   
z.`DATE_CEASED`,                                                                                                                    
z.`TIMESTAMP`,                                                                                                                      
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.dss_bpca_contract_objects z
 LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc ON CAST(z.BP_NUMBER AS INT) = CAST(sc.IRD_NUMBER AS INT) 
 WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N'; 