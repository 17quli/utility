CREATE TABLE lab_fcp_raw.ptn_transactions (
  ird_number INT,
  location_number INT,
  tax_type VARCHAR(6),
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
  `timestamp` TIMESTAMP
)
partitioned by (return_period_year bigint)
STORED AS PARQUET;

insert into lab_fcp_raw.ptn_transactions partition(return_period_year)
select z.* ,extract(year from z.return_period_date) 
from lab_fcp_raw.transactions z;

compute incremental stats lab_fcp_raw.ptn_transactions;

--recreate views
DROP VIEW if exists lab_fcp_raw_full_access.dss_transactions;
CREATE VIEW lab_fcp_raw_full_access.dss_transactions AS
SELECT z.ird_number, z.location_number, z.tax_type, z.return_period_date, z.seq_no, z.account_no, z.amount, z.transaction_code, z.transaction_type, z.transaction_status_code, z.payment_method_code, z.transaction_reason_code, z.return_type, z.user_id, z.date_effective, z.date_processed, z.date_reversed, z.account_key_link, z.transaction_seq_link, z.office_number, z.office_type, z.`timestamp`,z.return_period_year FROM lab_fcp_raw.transactions z;

DROP VIEW if exists lab_fcp_raw_restricted_access.dss_transactions;
CREATE VIEW lab_fcp_raw_restricted_access.dss_transactions AS
SELECT z.ird_number, z.location_number, z.tax_type, z.return_period_date, z.seq_no, z.account_no, z.amount, z.transaction_code, z.transaction_type, z.transaction_status_code, z.payment_method_code, z.transaction_reason_code, z.return_type, z.user_id, z.date_effective, z.date_processed, z.date_reversed, z.account_key_link, z.transaction_seq_link, z.office_number, z.office_type, z.`timestamp`,z.return_period_year FROM lab_fcp_raw.transactions z LEFT OUTER JOIN prod_raw.dss_special_clients_all sc ON sc.ird_number = z.ird_number WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N';

