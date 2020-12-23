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
 FROM ${var:source_db}.app_tblnz_slsunlinkeddeduct z;   