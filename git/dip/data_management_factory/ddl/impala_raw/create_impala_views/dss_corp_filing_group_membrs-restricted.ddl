CREATE VIEW ${var:view_db}.dss_corp_filing_group_membrs
AS SELECT 
z.IRD_NUMBER,
z.GROUP_ID,
z.DATE_APPLIED,
z.DATE_END,
z.MEMBER_TYPE,
z.DATE_START,
z.DLN_BGN_PREFIX,
z.DLN_BGN,
z.DLN_END_PREFIX,
z.DLN_END,
z.ACCOUNT_MANAGER_INVESTIGATIONS,
z.ACCOUNT_MANAGER_TECHNICAL,
z.MEMBER_DIRECT_OWNER,
z.ACCY_PROF,
z.SEGMNT,
z.MICRO_SEGMNT,
z.ISS,
z.REASON,
z.`TIMESTAMP`,
z.DATE_CEASED,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.dss_corp_filing_group_membrs z
LEFT OUTER JOIN  ${var:source_db}.dss_special_clients_all sc
ON CAST(z.IRD_NUMBER AS INT) = CAST(sc.IRD_NUMBER as INT) 
WHERE nvl(sc.special_classification, 'STD')='STD'
AND nvl( sc.record_active_flag,'Y')='Y'
AND nvl(sc.record_deleted_flag, 'N') = 'N';
