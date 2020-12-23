CREATE VIEW ${var:view_db}.dss_spk2ir_eai_request AS
SELECT z.CALL_NUMBER_CODE, z.EAI_ID, z.STEP_ID, z.EAI_CALL_ID, z.EAI_CALL_START_TIME, z.EAI_CALL_END_TIME, z.TRIGGERS, z.EAI_STATUS, z.EDW_LOAD_DATE, z.RUN_ID, z.EAI_DURATION, z.NAME, z.CALL_LEG, z.insert_object_run_key FROM ${var:source_db}.dss_spk2ir_eai_request z;
