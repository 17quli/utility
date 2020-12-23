CREATE VIEW ${var:view_db}.app_tblauditgroup
AS SELECT 
z.flngAuditGroupKey,
z.fstrAuditGroupId,
z.fstrAuditGroupType,
z.flngcustomerkey,
z.flngFolderKey,
z.flngDocKey,
z.flngTeamKey,
z.fstrApprovedBy,
z.fdtmApprovedWhen,
z.fdtmCreatedWhen,
z.fstrCreatedBy,
z.fdtmClosedWhen,
z.fstrClosedby,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblauditgroup z
;
