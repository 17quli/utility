CREATE VIEW ${var:view_db}.dss_business_partner_rel                                                                                 
AS SELECT                                                                                                                           
z.`BP_RELATION_NUMBER`,                                                                                                             
z.`BP_NUMBER_1`,                                                                                                                    
z.`BP_NUMBER_2`,                                                                                                                    
z.`VALIDITY_DATE_THROUGH`,                                                                                                          
z.`BP_RELATIONSHIP_CATEGORY`,                                                                                                       
z.`BP_RELATIONSHIP_DIRECTION`,                                                                                                      
z.`VALIDITY_DATE_FROM`,                                                                                                             
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
 FROM ${var:source_db}.dss_business_partner_rel z;