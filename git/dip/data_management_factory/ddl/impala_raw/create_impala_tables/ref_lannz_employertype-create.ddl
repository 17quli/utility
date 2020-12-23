CREATE TABLE ${var:target_db}.ref_lannz_employertype (                                                                              
fstrLanguage VARCHAR(6),                                                                                                            
fstrEmployerType VARCHAR(12),                                                                                                       
fstrDecode1 VARCHAR(24),                                                                                                            
fstrDecode2 VARCHAR(60),                                                                                                            
fstrWebDecode VARCHAR(60),                                                                                                          
fstrDescription VARCHAR(510),                                                                                                       
insert_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;      