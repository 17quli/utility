CREATE TABLE ${var:target_db}.app_tblnz_rtnslsobligations (
flngDocKey INT,
flngAccountKey INT,
fdtmFilingPeriod TIMESTAMP,
fblnAssessmentLimited SMALLINT,
fcurNZBAmount DECIMAL(19,4),
fcurOBBAssessment DECIMAL(19,4),
fblnCnv SMALLINT,
fi64IncDocSetKey BIGINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;