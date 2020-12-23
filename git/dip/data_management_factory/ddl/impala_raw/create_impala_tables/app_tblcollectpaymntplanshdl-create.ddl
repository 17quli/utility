CREATE TABLE ${var:target_db}.app_tblcollectpaymntplanshdl (
flngPaymentPlanKey INT,
fintScheduleVersion SMALLINT,
fintInstallmentSeq SMALLINT,
flngVer INT,
flngVerLast INT,
fdtmInstallmentDue TIMESTAMP,
fcurStartingBalance DECIMAL(19,4),
fcurInstallment DECIMAL(19,4),
fcurInterest DECIMAL(19,4),
fcurPenalty DECIMAL(19,4),
fcurEndingBalance DECIMAL(19,4),
flngAchDebitKey INT,
fi64PaymentRequestKey BIGINT,
fdtmProcessed TIMESTAMP,
fblnSatisfied SMALLINT,
fdtmSatisfied TIMESTAMP,
fblnPreviousSchedule SMALLINT,
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