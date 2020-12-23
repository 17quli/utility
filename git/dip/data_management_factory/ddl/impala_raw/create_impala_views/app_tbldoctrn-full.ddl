CREATE VIEW ${var:view_db}.app_tbldoctrn                                                                                            
AS SELECT                                                                                                                           
z.flngTransKey,                                                                                                                     
z.flngDocKey,                                                                                                                       
z.flngVerLast,                                                                                                                      
z.flngAccountKey,                                                                                                                   
z.fdtmFilingPeriod,                                                                                                                 
z.insert_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tbldoctrn z; 