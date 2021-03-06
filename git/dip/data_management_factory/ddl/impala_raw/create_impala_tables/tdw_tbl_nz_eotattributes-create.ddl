CREATE TABLE ${var:target_db}.tdw_tbl_nz_eotattributes (
FLNGDOCKEY BIGINT,
FLNGACCOUNTKEY BIGINT,
FSTRACCOUNTTYPE VARCHAR(12),
FDTMFILINGPERIOD TIMESTAMP,
FSTREOTTYPE VARCHAR(20),
FSTRSTATUS VARCHAR(10),
FBLNWITHDRAWNFORLFP INT,
FBLNMANUALOVERRIDE INT,
FDTMEXTENSIONDATE TIMESTAMP,
FDTMTERMINALTAXDUE TIMESTAMP,
FDTMREPLICATED TIMESTAMP,
FSTRWHO VARCHAR(20),
EFFECTIVE_FROM TIMESTAMP,
EFFECTIVE_TO TIMESTAMP,
CURRENT_REC_FLAG VARCHAR(2),

record_effective_timestamp TIMESTAMP,

record_expiry_timestamp TIMESTAMP,

record_active_flag VARCHAR(1),

record_deleted_flag VARCHAR(1),

insert_object_run_key INT,

update_object_run_key INT

 ) STORED AS PARQUET;
