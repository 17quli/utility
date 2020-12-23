CREATE VIEW ${var:view_db}.dss_spk2ir_enrol_session AS
SELECT z.CALL_NBR_CODE, z.CALL_LEG, z.IRD_NUMBER, z.`LOCATION`, z.POINT_OF_ORIGIN, z.TYPE, z.START_TIME, z.END_TIME, z.`STATUS`, z.AGE_OF_PIN, z.PIN_EXPIRY_THRESHOLD, z.RUN_ID, z.EDW_LOAD_DATE, z.insert_object_run_key FROM ${var:source_db}.dss_spk2ir_enrol_session z;
