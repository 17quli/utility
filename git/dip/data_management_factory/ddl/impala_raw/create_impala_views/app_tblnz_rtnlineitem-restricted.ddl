CREATE VIEW ${var:view_db}.app_tblnz_rtnlineitem
AS SELECT 
z.fi64LineItemKey,
z.flngReturnKey,
z.fstrGatewayReferenceId,
z.flngAccountKey,
z.fdtmFilingPeriod,
z.fstrReturnDocType,
z.fintReturnDocVer,
z.fstrId,
z.fstrIdType,
z.fstrIRDNumber,
z.fstrName,
z.flngBatchKey,
z.fintBatchSequence,
z.fblnInError,
z.fdtmDeleted,
z.fblnProcessed,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_rtnlineitem z
WHERE z.flngAccountKey IN 
( SELECT DISTINCT ac.flngAccountKey 
  FROM ${var:source_db}.app_tblaccount ac 
  LEFT OUTER JOIN ${var:source_db}.app_tblCustomerLevel cl on 
  ac.flngcustomerkey=cl.flngcustomerkey 
  WHERE 
   nvl(ac.record_active_flag, 'Y') = 'Y'
   AND nvl(ac.record_deleted_flag, 'N') = 'N' 
   AND  nvl(cl.fstrCustomerLevel, 'STD') = 'STD' 
   AND nvl(cl.record_active_flag, 'Y') = 'Y' 
   AND nvl(cl.record_deleted_flag, 'N') = 'N' 
);
