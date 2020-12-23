CREATE VIEW ${var:view_db}.app_tblemail                                                                                             
AS SELECT                                                                                                                           
z.flngEmailKey,                                                                                                                     
z.fstrEmailType,                                                                                                                    
z.fstrFrom,                                                                                                                         
z.fstrTo,                                                                                                                           
z.fstrCc,                                                                                                                           
z.fstrSubject,                                                                                                                      
z.fstrMessage,                                                                                                                      
z.flngCustomerKey,                                                                                                                  
z.flngAccountKey,                                                                                                                   
z.fdtmFilingPeriod,                                                                                                                 
z.flngFolderKey,                                                                                                                    
z.flngCrmKey,                                                                                                                       
z.fstrWho,                                                                                                                          
z.fdtmWhen,                                                                                                                         
z.insert_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tblemail z;
