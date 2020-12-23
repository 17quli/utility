CREATE TABLE ${var:target_db}.app_tblnz_audselectionatt (
flngDocKey INT,
fstrAudCustomerGroup VARCHAR(12),
fstrAudComplianceBehaviour VARCHAR(12),
fstrAudRiskDescription VARCHAR(40),
fstrAudCostCentre VARCHAR(12),
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT
 ) STORED AS PARQUET;
