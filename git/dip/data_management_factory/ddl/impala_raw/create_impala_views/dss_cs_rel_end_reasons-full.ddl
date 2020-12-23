create view ${var:view_db}.dss_cs_rel_end_reasons
as select 
z.cs_rel_end_reason_code,
z.cs_rel_end_reason_desc,
z.date_applied,
z.date_ceased,
z.validated,
z.`timestamp`,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.dss_cs_rel_end_reasons z
;
