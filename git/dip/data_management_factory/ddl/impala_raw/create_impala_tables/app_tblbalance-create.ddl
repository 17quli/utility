CREATE TABLE ${var:target_db}.app_tblbalance (
flngAccountKey INT,
flngVer INT,
flngVerLast INT,
fstrAccountType VARCHAR(12),
fcurBalance DECIMAL(19,4),
fcurBalanceDelta DECIMAL(19,4),
fcurDisplayBalance DECIMAL(19,4),
fcurDisplayBalanceDelta DECIMAL(19,4),
fdtmInBalance TIMESTAMP,
fdtmBackEnd TIMESTAMP,
fdtmImpact TIMESTAMP,
fdtmPenalty TIMESTAMP,
fdtmDelta TIMESTAMP,
fdtmInspect TIMESTAMP,
fdtmLastStatement TIMESTAMP,
fcurLastStatementBal DECIMAL(19,4),
fblnPNIRecalc SMALLINT,
fblnHoldCredits SMALLINT,
fintTransStateCount SMALLINT,
flngTransStageCount INT,
fdtmTransStageNext TIMESTAMP,
fdtmCycledThru TIMESTAMP,
fdtmEvaluateAccount TIMESTAMP,
fdtmNextStatement TIMESTAMP,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;