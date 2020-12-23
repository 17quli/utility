CREATE TABLE ${var:target_db}.app_tblnz_incomedwtattributes (
fi64IncomeKey BIGINT,
flngVer INT,
flngVerLast INT,
fstrIncomeType VARCHAR(60),
fcurGrossAmount DECIMAL(19,4),
fcurRWTDeducted DECIMAL(19,4),
fcurRWTRate DECIMAL(19,4),
fcurImputationCredits DECIMAL(19,4),
fcurCreditRatio DECIMAL(19,4),
fblnAUDividendPaid SMALLINT,
fcurAUExchangeRate DECIMAL(19,4),
fcurJointAccountPercentage DECIMAL(19,4),
fblnJointAccountIndicator SMALLINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;
