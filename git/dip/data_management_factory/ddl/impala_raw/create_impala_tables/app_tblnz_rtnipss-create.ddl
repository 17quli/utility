CREATE TABLE ${var:target_db}.app_tblnz_rtnipss (
flngDocKey INT,
fcurInterestRWTDeducted DECIMAL(19,4),
fcurInterestNoRWTDeducted DECIMAL(19,4),
fcurInterestTotal DECIMAL(19,4),
fcurRWTCertificates DECIMAL(19,4),
fcurRWTBCM DECIMAL(19,4),
fcurRWTNoCertificates DECIMAL(19,4),
fcurRWTTotalPayable DECIMAL(19,4),
fcurManualRWTPaid DECIMAL(19,4),
fcurRWTIR15P DECIMAL(19,4),
fcurRWTAlreadyDeducted DECIMAL(19,4),
fcurRWTTotalPaid DECIMAL(19,4),
fcurRWTFinal DECIMAL(19,4),
flngCertificatesAttached INT,
flngCertFiled INT,
fblnElectronicFiled SMALLINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;