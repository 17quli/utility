CREATE VIEW ${var:view_db}.dss_returns_keypoints_sl30 AS
SELECT z.IRD_NUMBER, z.LOCATION_NUMBER, z.RETURN_PERIOD_DATE, z.RETURN_TYPE, z.RETURN_VERSION_NO, z.RETURN_STATUS, z.FORM_VERSION_NO, z.NUMBER_OF_ERROR_ITEMS, z.`TIMESTAMP`, z.HALEX_ROLLUP_AMNT_DEDUCTED_852, z.STUDENT_LOANS_DEDUCTIONS_851, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_returns_keypoints_sl30 z;
