CREATE VIEW ${var:view_db}.dss_locations
AS SELECT
z.`IRD_NUMBER`,
z.`LOCATION_NUMBER`,
z.`DATE_APPLIED`,
z.`SIC_CODE`,
z.`NATURE_OF_BUS`,
z.`DATE_ADVISORY_VISIT`,
z.`DATE_CEASED`,
z.`TIMESTAMP`,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.dss_locations z;