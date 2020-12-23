CREATE VIEW ${var:view_db}.dss_edw_voice_queue AS
SELECT z.INTERACTION_ID, z.CONN_ID, z.MEDIATION_SEGMENT_ID, z.TENANT_KEY, z.START_DATE_TIME_KEY, z.INTERACTION_TYPE_KEY, z.RESOURCE_KEY, z.MEDIA_TYPE_KEY, z.ENTRY_ORDINAL, z.CALENDAR_DATE, z.START_TS_LOCAL, z.END_TS_LOCAL, z.INTERACTION_TYPE, z.MEDIA_NAME, z.IRD_NUMBER, z.CLI, z.RESOURCE_NAME, z.RESOURCE_ROLE_CODE, z.ROLE_REASON, z.RESULT, z.RESULT_REASON, z.SOURCE_ADDRESS, z.TARGET_RESOURCE_NAME, z.TIME_TO_ACCEPT, z.TIME_TO_ABANDON, z.MEDIATION_DURATION, z.SHORT_ABANDONED_FLAG, z.MET_THRESHOLD_FLAG, z.TIME_PERIOD_START, z.TOTAL_TIME, z.CAPPED, z.DIRECT, z.CALL_ANSWERED, z.CALL_ABANDONED, z.EDW_LOAD_DATE, z.EDW_LOAD_SOURCE, z.insert_object_run_key FROM ${var:source_db}.dss_edw_voice_queue z LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc ON CAST(z.ird_number AS INT) = CAST(sc.ird_number AS INT) WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N';