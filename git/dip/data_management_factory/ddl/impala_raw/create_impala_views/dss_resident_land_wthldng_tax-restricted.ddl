CREATE VIEW ${var:view_db}.dss_resident_land_wthldng_tax                                                                            
AS SELECT                                                                                                                           
z.WITHHOLDER_IRD_NUMBER,                                                                                                            
z.WITHHOLDER_LOC_NUMBER,                                                                                                            
z.TAX_TYPE,                                                                                                                         
z.DOC_LODGE_NBR_PREFIX,                                                                                                             
z.DOC_LODGE_NBR,                                                                                                                    
z.ITEM_STATUS_CODE,                                                                                                                 
z.SUBJECT_CODE,                                                                                                                     
z.PAGE_NUMBER,                                                                                                                      
z.TYPE_ENTERED,                                                                                                                     
z.PERIOD_ENDED,                                                                                                                     
z.VENDOR_NAME,                                                                                                                      
z.VENDOR_IRD_NUMBER,                                                                                                                
z.AMOUNT_PAID_TO_IR,                                                                                                                
z.AMOUNT_REQUIRED_DEDUCTED,                                                                                                         
z.CERTIFICATE_OF_TITLE_NUMBER,                                                                                                      
z.CALCULATION_METHOD_USED,                                                                                                          
z.DATE_APPLIED,                                                                                                                     
z.DATE_CEASED,                                                                                                                      
z.`TIMESTAMP`,                                                                                                                      
z.VALIDATION_ERROR,                                                                                                                 
z.FILEID,                                                                                                                           
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.dss_resident_land_wthldng_tax z
left outer join
(
 select distinct ird_number from ${var:source_db}.dss_special_clients_all  
 where 
  record_active_flag = 'Y'
  and record_deleted_flag = 'N'
  and (special_classification is null or special_classification = 'STD')
 ) sc1
on cast(sc1.ird_number as int) = cast(z.WITHHOLDER_IRD_NUMBER as int) 
left outer join
(
 select distinct ird_number from ${var:source_db}.dss_special_clients_all  
 where 
  record_active_flag = 'Y'
  and record_deleted_flag = 'N'
  and (special_classification is null or special_classification = 'STD')
 ) sc2
on cast(sc2.ird_number as int) = cast(z.VENDOR_IRD_NUMBER as int) 
where 
(z.WITHHOLDER_IRD_NUMBER is null and sc1.ird_number is not null) or 
(z.VENDOR_IRD_NUMBER is null and sc1.ird_number is not null) or 
(sc1.ird_number is not null and sc2.ird_number is not null) or 
(z.WITHHOLDER_IRD_NUMBER is null and z.VENDOR_IRD_NUMBER is null);
;