CREATE VIEW ${var:view_db}.sow_spk2ir_calls_source                                                                                  
AS SELECT                                                                                                                           
z.`CALL_NBR_CODE`,                                                                                                                  
z.`CALL_DATE`,                                                                                                                      
z.`CALL_START_TIME`,                                                                                                                
z.`CALL_END_TIME`,                                                                                                                  
z.`IVR_SITE_INDICATOR`,                                                                                                             
z.`SERVICE_CODE`,                                                                                                                   
z.`ABANDON_FLAG`,                                                                                                                   
z.`IRD_NUMBER`,                                                                                                                     
z.`AUTHORISED_IRD_NUMBER`,                                                                                                          
z.`HANDOFF_PROCESS_INDICATOR`,                                                                                                      
z.`TARGET_SKILL`,                                                                                                                   
z.`OPEN_NAVIGATOR_ATTEMPTS`,                                                                                                        
z.`AUTHORISED_ID_ENTRY_ATTEMPTS`,                                                                                                   
z.`NUMBER_OF_ID_ENTRY_ATTEMPTS`,                                                                                                    
z.`AUTHORISED_ID_NUMBER_TYPE`,                                                                                                      
z.`VE_KVP`,                                                                                                                         
z.`TRANSLATION_KVP`,                                                                                                                
z.`SOFT_PHONE_TRANSFER`,                                                                                                            
z.`V_PIN`,                                                                                                                          
z.`V_ADDRESS`,                                                                                                                      
z.`V_DOB`,                                                                                                                          
z.`V_NAME`,                                                                                                                         
z.`V_PHONE`,                                                                                                                        
z.`V_CLI`,                                                                                                                          
z.`SOFT_PHONE_WRAP_UP_REASON_CODE`,                                                                                                 
z.`RUN_ID`,                                                                                                                         
z.`CALL_LEG`,                                                                                                                       
z.`B_IRDNUM`,                                                                                                                       
z.`B_DOB`,                                                                                                                          
z.`B_TOKEN3`,                                                                                                                       
z.`B_TOKEN4`,                                                                                                                       
z.`TYPE_OF_V`,                                                                                                                      
z.`IRDNUM_LOOKED_UP`,                                                                                                               
z.insert_object_run_key                                                                                                             
 FROM ${var:source_db}.sow_spk2ir_calls_source z
 LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc 
ON CAST(z.IRD_NUMBER AS INT) = CAST(sc.IRD_NUMBER as INT)  
LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc1 
ON CAST(z.AUTHORISED_IRD_NUMBER AS INT) = CAST(sc1.IRD_NUMBER as INT)  
WHERE nvl(sc.special_classification, 'STD')='STD' 
AND nvl(sc.record_active_flag,'Y')='Y' 
AND nvl(sc.record_deleted_flag, 'N') = 'N' 
AND nvl(sc1.special_classification, 'STD')='STD' 
AND nvl(sc1.record_active_flag,'Y')='Y' 
AND nvl(sc1.record_deleted_flag, 'N') = 'N' 

 ; 