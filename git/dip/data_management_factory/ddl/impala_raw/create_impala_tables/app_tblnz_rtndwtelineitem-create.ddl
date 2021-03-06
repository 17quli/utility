CREATE TABLE ${var:target_db}.app_tblnz_rtndwtelineitem (
fi64LineItemKey BIGINT,
flngVer INT,
flngVerLast INT,
fstrRecipientIdentifier VARCHAR(510),
fstrRecipientName VARCHAR(510),
fstrRecipientIRD VARCHAR(18),
fdtmRecipientDOB TIMESTAMP,
fstrRecipientPhone VARCHAR(100),
fstrRecipientEmail VARCHAR(510),
fstrRecipientAddress VARCHAR(510),
fstrRecipientCountry VARCHAR(60),
fstrRecipientCountryCode VARCHAR(4),
fcurRecipientPercentage DECIMAL(19,4),
fblnJointAccountIndicator SMALLINT,
flngJointAccountHolders INT,
fcurGrossAmount DECIMAL(19,4),
fcurDeducted DECIMAL(19,4),
fblnOverridePercentages SMALLINT,
flngShares INT,
fdtmPayment TIMESTAMP,
fdtmDeclared TIMESTAMP,
fblnBonus SMALLINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;
