CREATE TABLE ${var:target_db}.app_tblnz_famiwtc (
`flngFamWorkKey` INT,
`flngVer` INT,
`flngVerLast` INT,
`fdtmStart` TIMESTAMP,
`fdtmStop` TIMESTAMP,
`fblnGraceApplies` SMALLINT,
`fblnActive` SMALLINT,
`flngAccountKey` INT,
`fstrWho` VARCHAR(20),
`fdtmWhen` TIMESTAMP,
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT

 )

  STORED AS PARQUET;