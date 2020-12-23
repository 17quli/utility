CREATE TABLE ${var:target_db}.app_tblnz_ratxndebtragngdtl (
flngAccountKey INT,
fdtmFilingPeriod TIMESTAMP,
fdtmRevenuePeriod TIMESTAMP,
fstrDebtorRAKey VARCHAR(24),
fstrRevenueGroup VARCHAR(12),
fcurBalanceRevPrdStart DECIMAL(19,4),
fcurBalanceAtRevPrdEnd DECIMAL(19,4),
flngDaysAgedAtRevPrdEnd INT,
fstrAgingCategoryAtPeriodEnd VARCHAR(12),
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;