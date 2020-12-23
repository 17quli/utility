CREATE TABLE ${var:target_db}.app_tblnz_rtnrwt (
flngDocKey INT,
fstrPayeeIRDNumber VARCHAR(18),
fdtmPeriod TIMESTAMP,
fblnJointOwnership SMALLINT,
fcurGrossDividends DECIMAL(19,4),
fcurImputationCredits DECIMAL(19,4),
fcurFDPCredits DECIMAL(19,4),
fcurRWTDeducted DECIMAL(19,4),
fstrPayerIRDNumber VARCHAR(18),
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;