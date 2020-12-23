CREATE VIEW ${var:view_db}.dss_offices AS
SELECT z.OFFICE_CODE, z.DESCRIPTION, z.SERVICE_CENTRE_CODE, z.DATE_APPLIED, z.DATE_CEASED, z.VALIDATED, z.`TIMESTAMP`, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_offices z;
