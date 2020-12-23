CREATE VIEW ${var:view_db}.pow_spk2ir_questions_source AS
SELECT z.QUESTION_ID, z.CALL_NBR_CODE, z.SPK2IR_QUESTION_CODE, z.QUESTION_START_TIME, z.QUESTION_END_TIME, z.SPK2IR_COMPONENT_CODE, z.`STATUS`, z.RUN_ID, z.CALL_LEG, z.insert_object_run_key FROM ${var:source_db}.pow_spk2ir_questions_source z;
