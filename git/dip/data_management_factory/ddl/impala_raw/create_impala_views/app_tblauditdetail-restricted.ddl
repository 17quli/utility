CREATE VIEW ${var:view_db}.app_tblauditdetail
AS SELECT 
z.flngAuditkey,
z.flngVer,
z.flngVerLast,
z.fstrExternalID,
z.fstrAuditStatus,
z.fstrAuditStage,
z.fstrAuditProgram,
z.fstrAuditSource,
z.fdtmPostingPeriod,
z.fstrManager,
z.fstrApprovedBy,
z.fdtmApprovedWhen,
z.fstrDescription,
z.fblnApprovalReq,
z.fdtmFilingPeriodFrom,
z.fdtmFilingPeriodTo,
z.fdtmAuditFrom,
z.fdtmAuditTo,
z.fdtmEffective,
z.fdtmWorkDate,
z.fstrWho,
z.fdtmWhen,
z.fblnActive,
z.fdtmStatuteDate,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblauditdetail z
WHERE z.flngAuditkey IN 
    (SELECT DISTINCT au.flngAuditkey 
     FROM ${var:source_db}.app_TBLAUDIT au 
     INNER JOIN ${var:source_db}.app_tblaccount ac 
     ON au.flngAccountKey = ac.flngAccountKey 
     AND ac.record_deleted_flag = 'N' 
     AND ac.record_active_flag = 'Y' 
     inner JOIN ${var:source_db}.app_tblCustomerLevel cl on 
 ac.flngcustomerkey=cl.flngcustomerkey 
 WHERE nvl(cl.fstrCustomerLevel, 'STD') = 'STD' 
AND nvl(cl.record_active_flag, 'Y') = 'Y' 
AND nvl(cl.record_deleted_flag, 'N') = 'N' 
);
