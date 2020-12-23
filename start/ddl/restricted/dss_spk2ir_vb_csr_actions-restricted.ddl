CREATE VIEW ${var:view_db}.dss_spk2ir_vb_csr_actions AS
SELECT z.CALL_NBR_CODE, z.CALL_LEG, z.IRD_NUMBER, z.`LOCATION`, z.TIME, z.ACTION, z.POINT_OF_ORIGIN, z.RUN_ID, z.EDW_LOAD_DATE, z.insert_object_run_key FROM ${var:source_db}.dss_spk2ir_vb_csr_actions z LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc ON CAST(z.IRD_NUMBER AS INT) = CAST(sc.IRD_NUMBER AS INT) WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N';