CREATE TABLE ${var:target_db}.tdw_tbl_nz_rtndwte 
(flngdockey BIGINT,
fcurtotalgrossamount DECIMAL(24,4),
fcurtotaldeducted DECIMAL(24,4),
fstrwho VARCHAR(20),
effective_from TIMESTAMP,
effective_to TIMESTAMP,
current_rec_flag VARCHAR(2),
record_effective_timestamp TIMESTAMP,
record_expiry_timestamp TIMESTAMP,
record_active_flag VARCHAR(1),
record_deleted_flag VARCHAR(1),
insert_object_run_key INT,
update_object_run_key INT ) STORED AS PARQUET;