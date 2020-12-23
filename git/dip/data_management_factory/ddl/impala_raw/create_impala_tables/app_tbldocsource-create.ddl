CREATE TABLE ${var:target_db}.app_tbldocsource (                                                                                    
flngDocKey INT,                                                                                                                     
fstrSource VARCHAR(40),                                                                                                             
fi64SourceKey BIGINT,                                                                                                               
insert_object_run_key INT                                                                                                           
 ) STORED AS PARQUET;                                                                                                               
                      