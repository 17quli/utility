
CREATE TABLE ${var:target_db}.ref_lanidtype (
fstrLanguage VARCHAR(6),
fstrIdType VARCHAR(12),
fstrDecode1 VARCHAR(60),
fstrDecode2 VARCHAR(510),
fstrDecodeWeb1 VARCHAR(60),
fstrDecodeWeb2 VARCHAR(510),
fstrDescription VARCHAR(2000),
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT,
checksum VARCHAR(32)
 ) STORED AS PARQUET;
