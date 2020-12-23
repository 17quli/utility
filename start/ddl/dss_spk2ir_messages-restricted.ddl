CREATE VIEW ${var:view_db}.dss_spk2ir_messages AS
SELECT z.CALL_NUMBER_CODE, z.VOICE_MESSAGE_ID, z.VOICE_MESSAGE_TIME, z.VOICE_MESSAGE_TYPE_CODE, z.VOICE_MESSAGE_STATUS, z.EDW_LOAD_DATE, z.RUN_ID, z.CALL_LEG, z.insert_object_run_key FROM ${var:source_db}.dss_spk2ir_messages z;
