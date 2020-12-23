CREATE VIEW ${var:view_db}.wrq_tblweblogontoaccount
AS SELECT 
z.flngWebLogonKey,
z.flngAccountKey,
z.flngVer,
z.flngVerLast,
z.flngCustomerKey,
z.fdtmFilingPeriodFrom,
z.fdtmFilingPeriodTo,
z.fblnElectronicCorrespondence,
z.fblnUpdate,
z.fstrAccessLevel,
z.fblnHidden,
z.fblnActive,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.wrq_tblweblogontoaccount z;
