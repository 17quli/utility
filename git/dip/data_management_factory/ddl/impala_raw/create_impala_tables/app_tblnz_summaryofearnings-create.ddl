create table ${var:target_db}.app_tblnz_summaryofearnings (
flngCustomerKey INT,
fdtmIncomeYear TIMESTAMP,
flngEmployerCustomerKey INT,
flngActivityNumber INT,
fdtmStart TIMESTAMP,
fdtmStop TIMESTAMP,
fcurGross DECIMAL(19,4),
fcurEarnings DECIMAL(19,4),
fcurPAYE DECIMAL(19,4),
fcurStudentLoan DECIMAL(19,4),
fcurTaxCreditsExtinguish DECIMAL(19,4),
fcurFamilyTaxCredits DECIMAL(19,4),
fdtmIssueDate TIMESTAMP,
flngFileKey INT,
flngFileRowNumber INT,
fdtmFileOut TIMESTAMP,
fdtmLetterProcessed TIMESTAMP,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;

