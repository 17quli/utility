CREATE TABLE ${var:target_db}.app_tblnz_rtnreb (
flngDocKey INT,
fcurSchoolDonations DECIMAL(19,4),
fcurReligiousDonations DECIMAL(19,4),
fcurRemainingDonations DECIMAL(19,4),
fcurTotalReceipt DECIMAL(19,4),
fcurCareAndHousePayments DECIMAL(19,4),
fcurCareAndHouseCredits DECIMAL(19,4),
fcurFinalTotal DECIMAL(19,4),
fstrPartnerIRD VARCHAR(18),
fstrTransferIRD VARCHAR(18),
fcurTransferAmount DECIMAL(19,4),
fblnWaitingOnIncome SMALLINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;