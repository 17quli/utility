CREATE TABLE ${var:target_db}.t1 (
  flngfraudplankey INT,
  flngreturnkey INT,
  flngrulekey INT,
  effective_ts TIMESTAMP,
  record_effective_timestamp TIMESTAMP,
  record_expiry_timestamp TIMESTAMP,
  operation VARCHAR(1),
  insert_object_run_key INT,
  update_object_run_key INT
)
STORED AS PARQUET
;
