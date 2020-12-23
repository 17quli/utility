CREATE VIEW ${var:view_db}.dss_agents AS
SELECT z.IRD_NUMBER, z.LOCATION_NUMBER, z.DATE_APPLIED, z.AGT_DATE_START, z.AGT_DATE_END, z.AGENT_TYPE, z.OLD_SYSTEM_NUMBER, z.AGENCY_IRD_NUMBER, z.AGENCY_LOCATION_NUMBER, z.AGENT_TIME_EXTENSION, z.WITHDRAW_DATE, z.OFFICE_NUMBER, z.SEGMNT, z.MICRO_SEGMNT, z.ACCOUNT_MANAGER_ID, z.EFILE_ACCESS, z.EFILE_TARGET, z.`TIMESTAMP`, z.DATE_CEASED, z.PROFESSIONAL_ORG_CODE, z.PUBLIC_PRACTICE_CERT_IND, z.EMPLOYER_RETURNS_IND, z.OTHER_RETURN_IND, z.EMAIL_ADDRESS, z.EFILE_IRD_NUMBER, z.EFILE_LOCATION_NUMBER, z.EFILE_REPORT_OPTION, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_agents z;
