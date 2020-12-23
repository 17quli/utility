CREATE TABLE ${var:target_db}.app_tblnz_incomeshrattributes (
fi64IncomeKey BIGINT,
flngVer INT,
flngVerLast INT,
fcurAIMShareholderTaxCredits DECIMAL(19,4),
fcurRemuneration DECIMAL(19,4),
fcurLoans DECIMAL(19,4),
fcurAccountBalance DECIMAL(19,4),
fcurLossOffsets DECIMAL(19,4),
fcurSubventionPayments DECIMAL(19,4),
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;

