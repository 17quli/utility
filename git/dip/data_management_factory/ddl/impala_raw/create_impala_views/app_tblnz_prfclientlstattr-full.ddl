CREATE VIEW ${var:view_db}.app_tblnz_prfclientlstattr
AS SELECT
z.flngDocKey,
z.flngCustomerKey,
z.fstrAccountManager,
z.fintHeritageProfileNumber,
z.fstrSubGroup,
z.fintVisitMonth,
z.fblneFile,
z.fstreFileIRD,
z.finteFileLocation,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_prfclientlstattr z;