CREATE TABLE ${var:target_db}.app_tblnz_tailoredtax (
flngEmployeeAccountKey INT,
flngEmployerAccountKey INT,
fintTaxYear SMALLINT,
flngVer INT,
flngVerLast INT,
flngCaseKey INT,
fblnTailoredTaxCode SMALLINT,
fblnTailoredTaxRate SMALLINT,
fdblRate DOUBLE,
fdtmCommence TIMESTAMP,
fdtmCease TIMESTAMP,
flngEmployerMailItemKey INT,
fstrWorkAndIncome VARCHAR(18),
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;