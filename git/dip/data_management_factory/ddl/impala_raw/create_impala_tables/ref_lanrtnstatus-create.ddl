CREATE TABLE ${var:target_db}.ref_lanrtnstatus (
FSTRLANGUAGE VARCHAR(6),
FSTRSTATUS VARCHAR(12),
FSTRMODULE VARCHAR(40),
FINTOCCURENCE SMALLINT,
FSTRDECODE1 VARCHAR(60),
FSTRDECODE2 VARCHAR(510),
fstrDecodeWeb VARCHAR(510),
fstrDescription VARCHAR(2000),
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
checksum VARCHAR(32),
insert_object_run_key INT,
update_object_run_key INT
 ) STORED AS PARQUET;
