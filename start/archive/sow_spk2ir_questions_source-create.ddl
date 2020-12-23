CREATE TABLE ${var:target_db}.sow_spk2ir_questions_source (                                                                         
`QUESTION_ID` BIGINT,                                                                                                               
`CALL_NBR_CODE` VARCHAR(40),                                                                                                        
`SPK2IR_QUESTION_CODE` VARCHAR(256),                                                                                                
`QUESTION_START_TIME` TIMESTAMP,                                                                                                    
`QUESTION_END_TIME` TIMESTAMP,                                                                                                      
`SPK2IR_COMPONENT_CODE` VARCHAR(256),                                                                                               
`STATUS` VARCHAR(2),                                                                                                                
`RUN_ID` BIGINT,                                                                                                                    
`CALL_LEG` BIGINT,                                                                                                                  
insert_object_run_key INT                                                                                                           
 )                 