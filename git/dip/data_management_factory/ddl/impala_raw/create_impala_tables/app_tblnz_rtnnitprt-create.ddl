CREATE TABLE ${var:target_db}.app_tblnz_rtnnitprt (
flngDocKey INT,
fcurSchedularTax DECIMAL(19,4),
fcurSchedularPayments DECIMAL(19,4),
fcurRWT DECIMAL(19,4),
fcurGrossInterest DECIMAL(19,4),
fcurDividendImputation DECIMAL(19,4),
fcurDividendRWT DECIMAL(19,4),
fcurDividendGross DECIMAL(19,4),
fcurMaoriCredits DECIMAL(19,4),
fcurMaoriDistributions DECIMAL(19,4),
fcurTrustCredits DECIMAL(19,4),
fcurTrustIncome DECIMAL(19,4),
fcurLTCCredits DECIMAL(19,4),
fcurLTCActiveIncome DECIMAL(19,4),
fcurLTCDeductions DECIMAL(19,4),
fcurLTCPriorDeductions DECIMAL(19,4),
fcurLTCAdjustedIncome DECIMAL(19,4),
fcurOverseasTax DECIMAL(19,4),
fcurOverseasIncome DECIMAL(19,4),
fcurBusinessIncome DECIMAL(19,4),
fcurRentalIncome DECIMAL(19,4),
fcurTotalOtherIncome DECIMAL(19,4),
fcurRLWT DECIMAL(19,4),
fcurTotalIncome DECIMAL(19,4),
fcurExpensesClaimed DECIMAL(19,4),
fcurIncomeAfterExpenses DECIMAL(19,4),
fcurExtinguishedLosses DECIMAL(19,4),
fcurPriorDeductions DECIMAL(19,4),
fcurDeductionsClaimed DECIMAL(19,4),
fstrResMethod VARCHAR(50),
fcurResIncome DECIMAL(19,4),
fcurResDeductions DECIMAL(19,4),
fblnLTC SMALLINT,
fblnPartnership SMALLINT,
fcurSaleOfProperty DECIMAL(19,4),
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;