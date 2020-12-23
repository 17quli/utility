CREATE TABLE ${var:target_db}.app_tblnz_eotattrhistory (
flngDocKey INT,
flngVerLast INT,
flngAccountKey INT,
fstrAccountType VARCHAR(12),
fdtmFilingPeriod TIMESTAMP,
fstrEOTType VARCHAR(20),
fstrStatus VARCHAR(10),
fblnWithdrawnForLfp SMALLINT,
fblnManualOverride SMALLINT,
fdtmDeferredDate TIMESTAMP,
fdtmExtensionDate TIMESTAMP,
fdtmTerminalTaxDue TIMESTAMP,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;