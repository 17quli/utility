CREATE VIEW ${var:view_db}.ref_lannz_customerclass                                                                                
AS SELECT                                                                                                                           
z.fstrLanguage,                                                                                                                     
z.fstrCustomerClass,                                                                                                                
z.fstrDecode1,                                                                                                                      
z.fstrDecode2,                                                                                                                      
z.fstrDecodeWeb,                                                                                                                    
z.fstrDescription,                                                                                                                  
z.insert_object_run_key                                                                                                             
 FROM ${var:source_db}.ref_lannz_customerclass z;                                                                                 
