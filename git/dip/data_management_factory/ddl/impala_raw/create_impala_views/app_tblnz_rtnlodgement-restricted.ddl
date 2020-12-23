CREATE VIEW ${var:view_db}.app_tblnz_rtnlodgement
AS SELECT
z.flngLogKey,
z.fstrDLN,
z.fstrIRD,
z.fstrForm,
z.flngAccountKey,
z.fdtmFilingPeriod,
z.flngIndicatorKey,
z.fstrDocType,
z.fintDocVer,
z.fstrStatus,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
FROM ${var:source_db}.app_tblnz_rtnlodgement z
 LEFT OUTER JOIN ${var:source_db}.app_tblaccount a
ON CAST (z.flngAccountKey AS INT) = CAST(a.flngAccountKey as INT)
LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel c ON a.flngcustomerkey = c.flngcustomerkey 
WHERE 
  nvl(a.record_active_flag, 'Y') = 'Y' AND
  nvl(a.record_deleted_flag, 'N') = 'N' AND
  nvl(c.fstrCustomerLevel, 'STD') = 'STD' AND
  nvl(c.record_active_flag, 'Y') = 'Y' AND
  nvl(c.record_deleted_flag, 'N') = 'N' ; 