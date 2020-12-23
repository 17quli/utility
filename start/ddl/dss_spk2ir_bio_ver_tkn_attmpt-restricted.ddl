CREATE VIEW ${var:view_db}.dss_spk2ir_bio_ver_tkn_attmpt AS
SELECT z.CALL_NBR_CODE, z.CALL_LEG, z.TOKEN_NAME, z.TOKEN_IN_SESSION, z.START_TIME, z.END_TIME, z.`STATUS`, z.PURPOSE, z.THRESHOLD_USED, z.SCORE, z.RUN_ID, z.EDW_LOAD_DATE, z.insert_object_run_key FROM ${var:source_db}.dss_spk2ir_bio_ver_tkn_attmpt z;
