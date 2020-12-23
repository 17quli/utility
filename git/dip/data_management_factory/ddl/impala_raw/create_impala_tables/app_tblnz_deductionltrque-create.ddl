CREATE TABLE ${var:target_db}.app_tblnz_deductionltrque (
flngDeductionQueueKey INT,
flngGarnisheeCustKey INT,
flngGarnisheeKey INT,
flngGarnishKey INT,
flngFolderKey INT,
fstrIRD VARCHAR(60),
fstrBehalfIRD VARCHAR(60),
fstrFormattedName VARCHAR(510),
fcurDebt DECIMAL(19,4),
fdtmReIssue TIMESTAMP,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;
