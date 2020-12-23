CREATE VIEW ${var:view_db}.dss_address_types AS
SELECT z.address_type_code, z.description, z.date_applied, z.date_ceased, z.validated, z.`timestamp`, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_address_types z;
