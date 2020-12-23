CREATE TABLE ${var:target_db}.app_tblnz_incomesources (
fi64IncomeKey BIGINT,
flngVer INT,
flngVerLast INT,
flngCustomerKey INT,
fstrSourceType VARCHAR(100),
fdtmStart TIMESTAMP,
fdtmStop TIMESTAMP,
fdtmReversed TIMESTAMP,
fblnActive SMALLINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;
