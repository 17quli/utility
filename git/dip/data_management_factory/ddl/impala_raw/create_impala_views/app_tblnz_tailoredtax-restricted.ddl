CREATE VIEW ${var:view_db}.app_tblnz_tailoredtax
AS SELECT
z.flngEmployeeAccountKey,
z.flngEmployerAccountKey,
z.fintTaxYear,
z.flngVer,
z.flngVerLast,
z.flngCaseKey,
z.fblnTailoredTaxCode,
z.fblnTailoredTaxRate,
z.fdblRate,
z.fdtmCommence,
z.fdtmCease,
z.flngEmployerMailItemKey,
z.fstrWorkAndIncome,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_tailoredtax z;
