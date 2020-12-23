CREATE TABLE ${var:target_db}.dss_address_types (
ADDRESS_TYPE_CODE VARCHAR(2),
DESCRIPTION VARCHAR(120),
DATE_APPLIED TIMESTAMP,
DATE_CEASED TIMESTAMP,
VALIDATED VARCHAR(2),
`TIMESTAMP` TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;