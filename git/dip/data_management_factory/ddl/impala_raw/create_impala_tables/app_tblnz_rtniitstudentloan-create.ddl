CREATE TABLE ${var:target_db}.app_tblnz_rtniitstudentloan (
flngDocKey INT,
fcurSLThreshold DECIMAL(19,4),
fcurSLURT DECIMAL(19,4),
fcurSLAdjNetIncome DECIMAL(19,4),
fcurSLLiableIncome DECIMAL(19,4),
fcurSLAssessment DECIMAL(19,4),
fcurSLInterimAmount DECIMAL(19,4),
fbln215Indicator SMALLINT,
fblnManualOverride SMALLINT,
fintForwardDateNotice SMALLINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;