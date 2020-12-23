CREATE TABLE ${var:target_db}.dss_business_partner_rel (                                                                            
`BP_RELATION_NUMBER` VARCHAR(24),                                                                                                   
`BP_NUMBER_1` VARCHAR(20),                                                                                                          
`BP_NUMBER_2` VARCHAR(20),                                                                                                          
`VALIDITY_DATE_THROUGH` TIMESTAMP,                                                                                                  
`BP_RELATIONSHIP_CATEGORY` VARCHAR(12),                                                                                             
`BP_RELATIONSHIP_DIRECTION` VARCHAR(2),                                                                                             
`VALIDITY_DATE_FROM` TIMESTAMP,                                                                                                     
`CURRENT_RECORD_INDICATOR` VARCHAR(2),                                                                                              
`DATE_APPLIED` TIMESTAMP,                                                                                                           
`DATE_CEASED` TIMESTAMP,                                                                                                            
`TIMESTAMP` TIMESTAMP,                                                                                                              
record_effective_timestamp TIMESTAMP,                                                                                               
record_expiry_timestamp TIMESTAMP,                                                                                                  
record_active_flag VARCHAR(1),                                                                                                      
record_deleted_flag VARCHAR(1),                                                                                                     
insert_object_run_key INT,                                                                                                          
update_object_run_key INT                                                                                                           
 )                                                                                                                                  
  STORED AS PARQUET;