CREATE VIEW ${var:view_db}.dss_edw_voice_id AS
SELECT z.CALL_DATE, z.CSR_ID, z.ENROL_TYPE, z.VOLUME, z.EDW_LOAD_DATE, z.insert_object_run_key FROM ${var:source_db}.dss_edw_voice_id z;
