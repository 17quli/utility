create view ${var:view_db}.dss_cs_relationship_types
as select 
z.cs_relationship_type_code,
z.cs_relationship_type_desc,
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
 from ${var:source_db}.dss_cs_relationship_types z
;
