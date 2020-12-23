CREATE VIEW ${var:view_db}.dss_external_references AS
SELECT z.IRD_NUMBER, z.LOCATION_NUMBER, z.EXTERNAL_ORG_CODE, z.EXTERNAL_ID, z.DATE_START, z.DATE_APPLIED, z.DATE_END, z.DATE_CEASED, z.`TIMESTAMP`, z.COUNTRY_CODE, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_external_references z;
