"CREATE TABLE lab_fcp_raw.transactions (
  ird_number INT,
  location_number INT,
  return_period_date TIMESTAMP,
  seq_no INT,
  account_no INT,
  amount DECIMAL(16,2),
  transaction_code VARCHAR(8),
  transaction_type VARCHAR(6),
  transaction_status_code VARCHAR(4),
  payment_method_code VARCHAR(4),
  transaction_reason_code VARCHAR(8),
  return_type VARCHAR(10),
  user_id VARCHAR(16),
  date_effective TIMESTAMP,
  date_processed TIMESTAMP,
  date_reversed TIMESTAMP,
  account_key_link INT,
  transaction_seq_link INT,
  office_number INT,
  office_type VARCHAR(4),
  timestamp TIMESTAMP
)
PARTITIONED BY (
  txn_return_period_year INT, 
  tax_type VARCHAR(6)
)
STORED AS PARQUET
LOCATION 'hdfs://nameservice1/env/4_lab/hive/fcp_raw/transactions'
TBLPROPERTIES ('DO_NOT_UPDATE_STATS'='true', 'STATS_GENERATED_VIA_STATS_TASK'='true', 'numRows'='5415547342', 'totalSize'='155490195194')"
"CREATE TABLE dev_raw.dss_transactions (
  ird_number INT,
  location_number INT,
  return_period_date TIMESTAMP,
  seq_no INT,
  account_no INT,
  amount DECIMAL(16,2),
  transaction_code VARCHAR(8),
  transaction_type VARCHAR(6),
  transaction_status_code VARCHAR(4),
  payment_method_code VARCHAR(4),
  transaction_reason_code VARCHAR(8),
  return_type VARCHAR(10),
  user_id VARCHAR(16),
  date_effective TIMESTAMP,
  date_processed TIMESTAMP,
  date_reversed TIMESTAMP,
  account_key_link INT,
  transaction_seq_link INT,
  office_number INT,
  office_type VARCHAR(4),
  timestamp TIMESTAMP,
  insert_object_run_key INT
)
PARTITIONED BY (
  tax_type VARCHAR(6)
)
SORT BY (
  return_period_date
)
STORED AS PARQUET
LOCATION 'hdfs://nameservice1/env/1_dev/hive/raw/dss_transactions'
TBLPROPERTIES ('DO_NOT_UPDATE_STATS'='true', 'STATS_GENERATED_VIA_STATS_TASK'='true', 'numRows'='5418014578', 'totalSize'='158173482052')"
