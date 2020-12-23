
CREATE TABLE ${var:target_db}.app_tblnz_rtnrwtp (
flngDocKey INT,
fcurGrossDistributionIRD DECIMAL(19,4),
fcurDistributionIRDMultiply DECIMAL(19,4),
fcurGrossDistributions DECIMAL(19,4),
fcurDistributionMultiply DECIMAL(19,4),
fcurGrossDividends DECIMAL(19,4),
fcurDividendMultiply DECIMAL(19,4),
fcurGrossTotal DECIMAL(19,4),
fcurTotalTaxOnDistributions DECIMAL(19,4),
fcurCreditsAttached DECIMAL(19,4),
fcurFDPAttached DECIMAL(19,4),
fcurTotalCredits DECIMAL(19,4),
fcurRWTpayable DECIMAL(19,4),
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;