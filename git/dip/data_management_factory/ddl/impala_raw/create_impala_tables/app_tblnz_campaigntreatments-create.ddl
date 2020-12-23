CREATE TABLE ${var:target_db}.app_tblnz_campaigntreatments (
flngDocKey INT,
fintSeq SMALLINT,
fintTreatment SMALLINT,
fstrTreatment VARCHAR(40),
fstrTreatmentDecode VARCHAR(200),
fstrResult VARCHAR(100),
fstrResultListItem VARCHAR(200),
fstrTreatmentNotes VARCHAR(32767),
fstrWho VARCHAR(20),
fdtmWhen TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT
) STORED AS PARQUET;