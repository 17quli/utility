CREATE VIEW ${var:view_db}.dss_cross_reference_types AS
SELECT z.reference_type, z.date_applied, z.description, z.date_ceased, z.`timestamp`, z.validated, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_cross_reference_types z;
