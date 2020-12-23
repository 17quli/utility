CREATE VIEW ${var:view_db}.app_tbldocsource                                                                                         
AS SELECT                                                                                                                           
z.flngDocKey,                                                                                                                       
z.fstrSource,                                                                                                                       
z.fi64SourceKey,                                                                                                                    
z.insert_object_run_key                                                                                                             
 FROM ${var:source_db}.app_tbldocsource z;