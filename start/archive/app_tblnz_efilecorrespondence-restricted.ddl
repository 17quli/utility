CREATE VIEW ${var:view_db}.app_tblnz_efilecorrespondence                                                                            
AS SELECT                                                                                                                           
z.`fi64FileLoadItemKey`,                                                                                                            
z.`flngCaseKey`,                                                                                                                    
z.`fstrDLN`,                                                                                                                        
z.`fstrEFileIRDNumber`,                                                                                                             
z.`fintEFileLocationNumber`,                                                                                                        
z.`fstrClientIRDNumber`,                                                                                                            
z.`fintClientLocationNumber`,                                                                                                       
z.`fstrTaxType`,                                                                                                                    
z.`fdtmReceived`,                                                                                                                   
z.`fstrDestinationCode1`,                                                                                                           
z.`fdtmCorrespondenceDate`,                                                                                                         
z.`fstrUserIRDNumber`,                                                                                                              
z.`fintUserLocationNumber`,                                                                                                         
z.`fstrTradeName`,                                                                                                                  
z.`fstrUserName`,                                                                                                                   
z.`fstrAddress`,                                                                                                                    
z.`fstrWorkPhone`,                                                                                                                  
z.`fstrAttention`,                                                                                                                  
z.`fstrReferenceNumber`,                                                                                                            
z.`fstrDestinationCode2`,                                                                                                           
z.`fstrWho`,                                                                                                                        
z.`fdtmWhen`,                                                                                                                       
z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblnz_efilecorrespondence z
LEFT OUTER JOIN 
(SELECT fstrID, cl.fstrcustomerlevel 
 FROM ${var:source_db}.app_tblid id 
 INNER JOIN 
 ${var:source_db}.app_tblcustomerlevel cl ON id.flngCustomerKey = cl.flngCustomerKey 
 WHERE id.fstrIDtype = 'IRD' 
 AND id.flngver = 0 
 AND id.fblnDefault = 1
 AND nvl(id.record_active_flag, 'Y') = 'Y' 
 AND nvl(id.record_deleted_flag, 'N') = 'N' 
 AND nvl(cl.record_active_flag, 'Y') = 'Y' 
 AND nvl(cl.record_deleted_flag, 'N') = 'N'
 ) idcl1
 ON CAST(z.fstrEFileIRDNumber AS INT) = CAST(idcl1.fstrID AS INT) 

LEFT OUTER JOIN 
(SELECT fstrID, cl.fstrcustomerlevel 
 FROM ${var:source_db}.app_tblid id 
 INNER JOIN 
 ${var:source_db}.app_tblcustomerlevel cl ON id.flngCustomerKey = cl.flngCustomerKey 
 WHERE id.fstrIDtype = 'IRD' 
 AND id.flngver = 0 
 AND id.fblnDefault = 1
 AND nvl(id.record_active_flag, 'Y') = 'Y' 
 AND nvl(id.record_deleted_flag, 'N') = 'N' 
 AND nvl(cl.record_active_flag, 'Y') = 'Y' 
 AND nvl(cl.record_deleted_flag, 'N') = 'N'
 ) idcl2
 ON CAST(z.fstrClientIRDNumber AS INT) = CAST(idcl2.fstrID AS INT) 

LEFT OUTER JOIN 
(SELECT fstrID, cl.fstrcustomerlevel 
 FROM ${var:source_db}.app_tblid id 
 INNER JOIN 
 ${var:source_db}.app_tblcustomerlevel cl ON id.flngCustomerKey = cl.flngCustomerKey 
 WHERE id.fstrIDtype = 'IRD' 
 AND id.flngver = 0 
 AND id.fblnDefault = 1
 AND nvl(id.record_active_flag, 'Y') = 'Y' 
 AND nvl(id.record_deleted_flag, 'N') = 'N' 
 AND nvl(cl.record_active_flag, 'Y') = 'Y' 
 AND nvl(cl.record_deleted_flag, 'N') = 'N'
 ) idcl3
 ON CAST(z.fstrUserIRDNumber AS INT) = CAST(idcl3.fstrID AS INT) 
WHERE nvl(idcl1.fstrcustomerlevel, 'STD') ='STD'
and  nvl(idcl2.fstrcustomerlevel, 'STD') ='STD'
and nvl(idcl3.fstrcustomerlevel, 'STD') = 'STD'

;