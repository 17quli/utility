CREATE VIEW ${var:view_db}.dss_spk2ir_bio_verif_session AS
SELECT z.CALL_NBR_CODE, z.CALL_LEG, z.IRD_NUMBER, z.`LOCATION`, z.POINT_OF_ORIGIN, z.START_TIME, z.END_TIME, z.`STATUS`, z.COMBINED_SCORE, z.LEVEL_OF_MATCH, z.CLI_MATCH, z.NUM_TOKENS_PASSED, z.RUN_ID, z.EDW_LOAD_DATE, z.insert_object_run_key FROM ${var:source_db}.dss_spk2ir_bio_verif_session z;
