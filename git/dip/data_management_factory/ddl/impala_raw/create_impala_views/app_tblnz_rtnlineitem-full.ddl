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
;
