CREATE VIEW ${var:view_db}.dss_cs_children                                                        
AS SELECT                                                                                                                           
z.PARENT_CARER_IRD_NUMBER,                                                                                                          
z.CHILD_IRD_NUMBER,                                                                                                                 
z.DATE_BEGIN,                                                                                                                       
z.DATE_END,                                                                                                                         
z.CS_END_REASON_CODE,                                                                                                               
z.CS_PARENTHOOD_PROOF_CODE,                                                                                                         
z.CHILD_TYPE,                                                                                                                       
z.CARER_TYPE,                                                                                                                       
z.UCB_INDICATOR,                                                                                                                    
z.PARENT_APPLIED_INDICATOR,                                                                                                         
z.ONE_PARENT_REASON_CODE,                                                                                                           
z.PROPORTION_OF_CARE,                                                                                                               
z.PROPORTION_OF_CARE_TYPE,                                                                                                          
z.PROPORTION_OF_CARE_SOURCE,                                                                                                        
z.DOC_LODGE_NUMBER_PREFIX,                                                                                                          
z.DOC_LODGE_NUMBER,                                                                                                                 
z.DELETED_INDICATOR,                                                                                                                
z.DATE_APPLIED,                                                                                                                     
z.DATE_CEASED,                                                                                                                      
z.`TIMESTAMP`,                                                                                                                      
z.SCHOOL_INDICATOR,                                                                                                                 
z.OVERSEAS_CHILD_INDICATOR,                                                                                                         
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.dss_cs_children z
left outer join ${var:source_db}.dss_special_clients_all scp
on scp.ird_number= z.parent_carer_ird_number
left outer join ${var:source_db}.dss_special_clients_all scc
on z.child_ird_number = scc.ird_number
where nvl(scp.special_classification, 'STD')='STD'
and nvl( scp.record_active_flag,'Y')='Y'
and nvl(scp.record_deleted_flag, 'N') = 'N'
and nvl(scc.special_classification, 'STD')='STD'
and nvl( scc.record_active_flag,'Y')='Y'
and nvl(scc.record_deleted_flag, 'N') = 'N'
;