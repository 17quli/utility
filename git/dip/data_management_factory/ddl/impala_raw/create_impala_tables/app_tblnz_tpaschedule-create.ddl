CREATE TABLE ${var:target_db}.app_tblnz_tpaschedule (
flngTPAKey INT,
flngSequence INT,
flngCustomerKey INT,
fstrName VARCHAR(510),
fstrIRDNumber VARCHAR(18),
fcurAmount DECIMAL(19,4),
fdtmDeleted TIMESTAMP,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;