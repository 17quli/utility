CREATE TABLE dev_raw.mtable_cdh5 (
  db_name STRING,
  object_name STRING,
  object_type STRING,
  if_partitioned STRING,
  stored_as STRING,
  create_statement STRING,
  run_date TIMESTAMP,
  stat_row_count BIGINT,
  select_row_count BIGINT,
  hdfs_size BIGINT,
  partition_clause STRING
)
STORED AS PARQUET
;
