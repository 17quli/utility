CREATE VIEW ${var:view_db}.app_tblnz_slsunlinkeddeduct                                                                              
AS SELECT                                                                                                                           
z.flngTransKey,                                                                                                                     
z.fdtmTransEffect,                                                                                                                  
z.fstrTransType,                                                                                                                    
z.fcurTransAmount,                                                                                                                  
z.flngReturnKey,                                                                                                                    
z.flngLineItemNumber,                                                                                                               
z.fstrEmployerIRD,                                                                                                                  
z.fstrEmployerLocation,                                                                                                             
z.flngEmployerAccountKey,                                                                                                           
z.fdtmEmployerFilingPeriod,                                                                                                         
z.fstrDLNPrefix,                                                                                                                    
z.fstrDLNBody,                                                                                                                      
z.fstrDLNSuffix,                                                                                                                    
z.fdtmLinked,                                                                                                                       
z.fstrLinkedBy,                                                                                                                     
z.insert_object_run_key                                                                                                      
FROM ${var:source_db}.app_tblnz_slsunlinkeddeduct z
  LEFT OUTER JOIN ${var:source_db}.app_tblaccount a
ON CAST (z.flngEmployerAccountKey AS INT) = CAST(a.flngAccountKey as INT)
LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel c ON a.flngcustomerkey = c.flngcustomerkey 
WHERE 
  nvl(a.record_active_flag, 'Y') = 'Y' AND
  nvl(a.record_deleted_flag, 'N') = 'N' AND
  nvl(c.fstrCustomerLevel, 'STD') = 'STD' AND
  nvl(c.record_active_flag, 'Y') = 'Y' AND
  nvl(c.record_deleted_flag, 'N') = 'N' ; 