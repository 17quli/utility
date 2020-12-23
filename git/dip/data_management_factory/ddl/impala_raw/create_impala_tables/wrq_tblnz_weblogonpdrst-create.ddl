CREATE TABLE ${var:target_db}.wrq_tblnz_weblogonpdrst (
fi64ResetKey BIGINT,
flngWebLogonKey INT,
fstrSessionKey VARCHAR(100),
flngEmailKey INT,
fstrControl VARCHAR(16),
fblnIsTap SMALLINT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;
