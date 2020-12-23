CREATE VIEW ${var:view_db}.ref_lannz_employertype                                                                                   
AS SELECT                                                                                                                           
z.fstrLanguage,                                                                                                                     
z.fstrEmployerType,                                                                                                                 
z.fstrDecode1,                                                                                                                      
z.fstrDecode2,                                                                                                                      
z.fstrWebDecode,                                                                                                                    
z.fstrDescription,                                                                                                                  
z.insert_object_run_key                                                                                                             
 FROM ${var:source_db}.ref_lannz_employertype z;       