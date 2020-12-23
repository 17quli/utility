CREATE VIEW ${var:view_db}.dss_tax_types AS
SELECT z.TAX_TYPE, z.DATE_APPLIED, z.DESCRIPTION, z.DATE_CEASED, z.`TIMESTAMP`, z.VALIDATED, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_tax_types z;
