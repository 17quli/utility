CREATE TABLE ${VAR:target_db}.ref_lancountry (
fstrLanguage VARCHAR(6),
fstrCountry VARCHAR(12),
fstrDecode1 VARCHAR(60),
fstrDecode2 VARCHAR(510),
fstrDecode3 VARCHAR(510),
fstrDescription VARCHAR(2000),
fstrStateDecode VARCHAR(510),
fstrPhoneError VARCHAR(510),
fstrNationality VARCHAR(510),
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
checksum VARCHAR(32),
insert_object_run_key INT,
update_object_run_key INT
 ) STORED AS PARQUET;