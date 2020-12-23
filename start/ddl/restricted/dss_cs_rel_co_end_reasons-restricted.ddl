CREATE VIEW ${var:view_db}.dss_cs_rel_co_end_reasons AS
SELECT z.cs_rel_co_end_reason_code, z.cs_rel_co_end_reason_desc, z.date_applied, z.date_ceased, z.validated, z.`timestamp`, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_cs_rel_co_end_reasons z;
