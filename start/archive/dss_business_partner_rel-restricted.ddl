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
 FROM ${var:source_db}.dss_business_partner_rel z
 LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc1 ON CAST(z.bp_number_1 AS INT) = CAST(sc1.IRD_NUMBER AS INT)  
 LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc2 ON CAST(z.bp_number_2 AS INT) = CAST(sc2.IRD_NUMBER AS INT) 
 WHERE nvl(sc1.special_classification, 'STD') = 'STD' AND nvl(sc1.record_active_flag, 'Y') = 'Y' AND nvl(sc1.record_deleted_flag, 'N') = 'N' and 
 nvl(sc2.special_classification, 'STD') = 'STD' AND nvl(sc2.record_active_flag, 'Y') = 'Y' AND nvl(sc2.record_deleted_flag, 'N') = 'N'
 ; 