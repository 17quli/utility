CREATE VIEW ${var:view_db}.dss_agents AS 
SELECT z.IRD_NUMBER, z.LOCATION_NUMBER, z.DATE_APPLIED, z.AGT_DATE_START, z.AGT_DATE_END, 
z.AGENT_TYPE, z.OLD_SYSTEM_NUMBER, z.AGENCY_IRD_NUMBER, z.AGENCY_LOCATION_NUMBER, z.AGENT_TIME_EXTENSION, z.WITHDRAW_DATE, 
z.OFFICE_NUMBER, z.SEGMNT, z.MICRO_SEGMNT, z.ACCOUNT_MANAGER_ID, z.EFILE_ACCESS, z.EFILE_TARGET, z.`TIMESTAMP`, 
z.DATE_CEASED, z.PROFESSIONAL_ORG_CODE, z.PUBLIC_PRACTICE_CERT_IND, z.EMPLOYER_RETURNS_IND, z.OTHER_RETURN_IND, 
z.EMAIL_ADDRESS, z.EFILE_IRD_NUMBER, z.EFILE_LOCATION_NUMBER, 
z.EFILE_REPORT_OPTION, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag,
z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key 
FROM ${var:source_db}.dss_agents z 

left outer join  ${var:source_db}.dss_special_clients_all sc1
on cast(z.ird_number as int) = cast(sc1.ird_number as int) 
left outer join  ${var:source_db}.dss_special_clients_all sc2
on cast(z.AGENCY_IRD_NUMBER as int) = cast(sc2.ird_number as int) 
where 
nvl(sc1.special_classification, 'STD')='STD'
and nvl( sc1.record_active_flag,'Y')='Y'
and nvl(sc1.record_deleted_flag, 'N') = 'N'
and nvl(sc2.special_classification, 'STD')='STD'
and nvl( sc2.record_active_flag,'Y')='Y'
and nvl(sc2.record_deleted_flag, 'N') = 'N'
;
