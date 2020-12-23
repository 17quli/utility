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
 FROM ${var:source_db}.app_tblnz_prfclientlstattr z
left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${var:source_db}.app_tblid where record_active_flag = 'Y' AND record_deleted_flag= 'N') id
on (cast(z.fstreFileIRD as int) = cast(id.fstrID as int) AND (id.fstrIDTypE='IRD'))
left outer JOIN ${var:source_db}.app_tblCustomerLevel cl on id.flngcustomerkey=cl.flngcustomerkey 
WHERE (nvl(cl.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N');