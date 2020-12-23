CREATE VIEW ${var:view_db}.pow_spk2ir_stationary_source AS
SELECT z.CALL_NBR_CODE, z.STATIONARY_ID, z.EAI_ID, z.FORM_OR_STATIONARY_ITEM_CODE, z.QUANTITY, z.RETURN_TYPE, z.RETURN_PERIOD_DATE, z.RUN_ID, z.CALL_LEG, z.insert_object_run_key FROM ${var:source_db}.pow_spk2ir_stationary_source z;
