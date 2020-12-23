CREATE TABLE ${var:target_db}.app_tblnz_ksspartgvccwbk (
flngGVCClawbackRequestKey INT,
flngMemberCustomerKey INT,
flngMemberAccountKey INT,
flngSchemeCustomerKey INT,
flngSchemeAccountKey INT,
fdtmStart TIMESTAMP,
fdtmEnd TIMESTAMP,
fdtmProcessed TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;