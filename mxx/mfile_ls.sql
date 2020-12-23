CREATE TABLE dev_raw.mfile_ls_cdh5 (
  run_date TIMESTAMP,
  file_name STRING,
  last_modified TIMESTAMP,
  file_size BIGINT,
  db_name STRING,
  table_name STRING,
  if_partitioned STRING,
  partition_name STRING,
  stored_as STRING
)
stored as parquet
;
