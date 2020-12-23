CREATE VIEW ${var:view_db}.dss_returns AS
SELECT z.IRD_NUMBER, z.LOCATION_NUMBER, z.RETURN_PERIOD_DATE, z.RETURN_TYPE, z.RETURN_VERSION_NO, z.FORM_VERSION_NO, z.RETURN_CATEGORY, z.RETURN_SOURCE, z.DATE_PROCESSED, z.TAX_YEAR, z.DATE_RETURNED, z.ACCOMPANYING_PAYMENT, z.RESPONSIBLE_OFFICER, z.RETURN_STATUS, z.LIABILITY_CODE, z.RETURN_FORM_ERROR_CODE, z.RETURN_ERROR_CODE, z.`TIMESTAMP`, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_returns z;
