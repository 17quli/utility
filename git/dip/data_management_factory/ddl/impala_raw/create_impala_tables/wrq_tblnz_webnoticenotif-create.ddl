CREATE TABLE ${var:target_db}.wrq_tblnz_webnoticenotif (
flngWebNoticeKey INT,
flngWebLogonKey INT,
flngEmailKey INT,
flngSmsKey INT,
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 ) STORED AS PARQUET;
