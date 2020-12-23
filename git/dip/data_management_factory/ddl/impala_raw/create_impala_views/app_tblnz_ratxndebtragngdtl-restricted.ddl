CREATE VIEW ${var:view_db}.app_tblnz_ratxndebtragngdtl
AS SELECT
z.flngAccountKey,
z.fdtmFilingPeriod,
z.fdtmRevenuePeriod,
z.fstrDebtorRAKey,
z.fstrRevenueGroup,
z.fcurBalanceRevPrdStart,
z.fcurBalanceAtRevPrdEnd,
z.flngDaysAgedAtRevPrdEnd,
z.fstrAgingCategoryAtPeriodEnd,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_ratxndebtragngdtl z;