CREATE TABLE ${var:target_db}.frd_tblnz_frdsend (
flngReturnKey INT,
flngDocKey INT,
flngDocVerLast INT,
fstrSourceState VARCHAR(100),
fcurAmount DECIMAL(19,4),
fcurPenalty DECIMAL(19,4),
fcurInterest DECIMAL(19,4),
fblnAuditChange SMALLINT,
fblnAmendment SMALLINT,
fstrForeignBankHash VARCHAR(100),
fdtmTimeStamp TIMESTAMP,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;