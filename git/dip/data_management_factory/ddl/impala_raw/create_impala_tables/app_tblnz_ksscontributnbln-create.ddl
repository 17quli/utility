CREATE TABLE ${var:target_db}.app_tblnz_ksscontributnbln (
flngCustomerKey INT,
flngAccountKey INT,
fstrContributionType VARCHAR(12),
fintYear SMALLINT,
fcurContributionBalance DECIMAL(19,4),
fdtmNextEval TIMESTAMP,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
fdtmMinContributionDate TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;