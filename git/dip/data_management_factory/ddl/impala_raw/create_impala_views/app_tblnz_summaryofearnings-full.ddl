create view ${var:view_db}.app_tblnz_summaryofearnings
AS SELECT
z.flngCustomerKey,
z.fdtmIncomeYear,
z.flngEmployerCustomerKey,
z.flngActivityNumber,
z.fdtmStart,
z.fdtmStop,
z.fcurGross,
z.fcurEarnings,
z.fcurPAYE,
z.fcurStudentLoan,
z.fcurTaxCreditsExtinguish,
z.fcurFamilyTaxCredits,
z.fdtmIssueDate,
z.flngFileKey,
z.flngFileRowNumber,
z.fdtmFileOut,
z.fdtmLetterProcessed,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_summaryofearnings z;

