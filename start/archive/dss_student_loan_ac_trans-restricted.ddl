CREATE VIEW ${var:view_db}.dss_student_loan_ac_trans                                                                                
AS SELECT                                                                                                                           
z.`IRD_NUMBER`,                                                                                                                     
z.`LOCATION_NUMBER`,                                                                                                                
z.`TAX_TYPE`,                                                                                                                       
z.`SEQ_NO`,                                                                                                                         
z.`AMOUNT`,                                                                                                                         
z.`TRANSACTION_CODE`,                                                                                                               
z.`TRANSACTION_REASON_CODE`,                                                                                                        
z.`USER_ID`,                                                                                                                        
z.`DATE_PROCESSED`,                                                                                                                 
z.`DATE_EFFECTIVE`,                                                                                                                 
z.`TRANSACTION_PERIOD`,                                                                                                             
z.`TIMESTAMP`,                                                                                                                      
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.dss_student_loan_ac_trans z
 LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc ON CAST(z.IRD_NUMBER AS INT) = CAST(sc.IRD_NUMBER AS INT) 
 WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N'; 