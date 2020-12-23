CREATE VIEW ${var:view_db}.dss_spk2ir_stationary AS
SELECT z.CALL_NUMBER_CODE, z.STATIONARY_ID, z.EAI_ID, z.ITEM_CODE, z.QUANTITY, z.RETURN_TYPE, z.RETURN_PERIOD_DATE, z.EDW_LOAD_DATE, z.RUN_ID, z.CALL_LEG, z.insert_object_run_key FROM ${var:source_db}.dss_spk2ir_stationary z;
