CREATE VIEW ${var:view_db}.app_tblnz_ksscontributnbln
AS SELECT
z.flngCustomerKey,
z.flngAccountKey,
z.fstrContributionType,
z.fintYear,
z.fcurContributionBalance,
z.fdtmNextEval,
z.fstrWho,
z.fdtmWhen,
z.fdtmMinContributionDate,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_ksscontributnbln z;