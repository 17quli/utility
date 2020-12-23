CREATE TABLE ${var:target_db}.app_tblnz_rtndwt (
flngDocKey INT,
fcurGrossDividends DECIMAL(19,4),
fcurMultiplyDividends DECIMAL(19,4),
fcurImpCredits DECIMAL(19,4),
fcurFdpCredits DECIMAL(19,4),
fcurTotalCredits DECIMAL(19,4),
fcurRWTPayable DECIMAL(19,4),
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;