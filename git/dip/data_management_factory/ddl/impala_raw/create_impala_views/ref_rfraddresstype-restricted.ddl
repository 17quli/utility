CREATE VIEW ${var:view_db}.ref_rfraddresstype
AS SELECT 
z.FSTRADDRESSTYPE,
z.fstrSource,
z.FSTRDISTRICTOFFICERULE,
z.fblnCanCai,
z.fblnLocationCode,
z.fstrLocationCodeMask,
z.fstrFormatString,
z.fintAllowBlank,
z.fblnSearchIndex,
z.fblnCanInactivate,
z.fblnCommenceInFuture,
z.fblnCeaseInFuture,
z.FBLNACTIVE,
 z.record_effective_timestamp,                                                                                                       
z.record_expiry_timestamp,                                                                                                          
z.record_active_flag,                                                                                                               
z.record_deleted_flag,                                                                                                              
z.insert_object_run_key,                                                                                                            
z.update_object_run_key,
z.checksum                                                                                                            
FROM ${var:source_db}.ref_rfraddresstype z;
