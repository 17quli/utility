
CREATE TABLE ${var:target_db}.app_tblnz_rtnprovisional (
flngDocKey INT,
fcurLossToCarryForward DECIMAL(19,4),
fcurResidualIncomeTax DECIMAL(19,4),
fcurTerminalTax DECIMAL(19,4),
fcurFurtherIncomeTax DECIMAL(19,4),
fcurPriorYearRIT DECIMAL(19,4),
fblnVoluntaryProv SMALLINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;
