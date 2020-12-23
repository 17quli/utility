CREATE VIEW ${var:view_db}.dss_spk2ir_enrol_token_atmpt AS
SELECT z.CALL_NBR_CODE, z.CALL_LEG, z.TOKEN_NAME, z.TOKEN_IN_SESSION, z.START_TIME, z.END_TIME, z.NUMBER_OF_UTTERANCES, z.`STATUS`, z.RUN_ID, z.EDW_LOAD_DATE, z.insert_object_run_key FROM ${var:source_db}.dss_spk2ir_enrol_token_atmpt z;
