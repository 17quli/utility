CREATE VIEW ${var:view_db}.dss_tax_csa AS
SELECT z.IRD_NUMBER, z.LOCATION_NUMBER, z.TAX_TYPE, z.TREG_DATE_START, z.TREG_DATE_END, z.OFFICER_USER_ID, z.DATE_APPLIED, z.DATE_CEASED, z.`TIMESTAMP`, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_tax_csa z;
