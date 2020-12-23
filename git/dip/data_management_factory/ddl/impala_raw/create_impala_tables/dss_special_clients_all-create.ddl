CREATE TABLE ${var:target_db}.dss_special_clients_all (
  ird_number INT,
  special_classification VARCHAR(20),
  record_effective_timestamp TIMESTAMP,
  record_expiry_timestamp TIMESTAMP,
  checksum VARCHAR(32),
  record_active_flag VARCHAR(1),
  record_deleted_flag VARCHAR(1),
  insert_object_run_key INT,
  update_object_run_key INT
)
STORED AS PARQUET
;
