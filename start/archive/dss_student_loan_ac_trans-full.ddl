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
 FROM ${var:source_db}.dss_student_loan_ac_trans z;