CREATE VIEW ${var:view_db}.dss_tax_cessation_reasons AS
SELECT z.CESSATION_REASON_CODE, z.DATE_APPLIED, z.DESCRIPTION, z.CLIENT_STATUS_IND, z.DATE_CEASED, z.`TIMESTAMP`, z.VALIDATED, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_tax_cessation_reasons z;
