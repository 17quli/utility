create view ${var:view_db}.ref_lanlinktype
as select 
z.fstrlanguage,
z.fstrlinktype,
z.fstrdecode1,
z.fstrdecode2,
z.fstrdecodereverse,
z.fstrdecode2reverse,
z.fstrfromdecode,
z.fstrtodecode,
z.fstrdecodeweb,
z.fstrdecodewebreverse,
z.fstrdescription,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.ref_lanlinktype z
;
