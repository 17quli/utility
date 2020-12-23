CREATE VIEW ${var:view_db}.dss_tax_filing_frequencies AS
SELECT z.FILING_FREQUENCY, z.DATE_APPLIED, z.DESCRIPTION, z.ALTERNATE_CODE, z.NO_OF_MTHS, z.DATE_CEASED, z.`TIMESTAMP`, z.VALIDATED, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_tax_filing_frequencies z;
