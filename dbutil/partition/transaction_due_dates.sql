CREATE TABLE lab_fcp_raw.ptn_transaction_due_dates (
  ird_number INT,
  location_number INT,
  tax_type VARCHAR(6),
  return_period_date TIMESTAMP,
  seq_no INT,
  date_due TIMESTAMP,
  date_due_number INT,
  date_applied TIMESTAMP,
  due_amount DECIMAL(16,2),
  user_id VARCHAR(16),
  penalty_and_interest_amount DECIMAL(16,2),
  balance DECIMAL(16,2),
  transaction_code VARCHAR(8),
  due_date_reason_code VARCHAR(8),
  date_updated TIMESTAMP,
  date_ceased TIMESTAMP,
  `timestamp` TIMESTAMP,
  latest_indicator VARCHAR(2)
)
partitioned by (return_period_year bigint)
STORED AS PARQUET;

insert into lab_fcp_raw.ptn_transaction_due_dates partition(return_period_year)
select z.* ,extract(year from z.return_period_date) 
from lab_fcp_raw.transaction_due_dates z;

compute incremental stats lab_fcp_raw.ptn_transaction_due_dates;

select count(1) from lab_fcp_raw.transaction_due_dates;
select count(1) from lab_fcp_raw.ptn_transaction_due_dates;

--recreate views
DROP VIEW if exists lab_fcp_raw_full_access.dss_transaction_due_dates;
CREATE VIEW lab_fcp_raw_full_access.dss_transaction_due_dates AS
SELECT z.ird_number, z.location_number, z.tax_type, z.return_period_date, z.seq_no, z.date_due, z.date_due_number, z.date_applied, z.due_amount, z.user_id, z.penalty_and_interest_amount, z.balance, z.transaction_code, z.due_date_reason_code, z.date_updated, z.date_ceased, z.`timestamp`, z.latest_indicator,z.return_period_year FROM lab_fcp_raw.transaction_due_dates z
;

DROP VIEW if exists lab_fcp_raw_restricted_access.dss_transaction_due_dates;
CREATE VIEW lab_fcp_raw_restricted_access.dss_transaction_due_dates AS
SELECT z.ird_number, z.location_number, z.tax_type, z.return_period_date, z.seq_no, z.date_due, z.date_due_number, z.date_applied, z.due_amount, z.user_id, z.penalty_and_interest_amount, z.balance, z.transaction_code, z.due_date_reason_code, z.date_updated, z.date_ceased, z.`timestamp`, z.latest_indicator,z.return_period_year FROM lab_fcp_raw.transaction_due_dates z LEFT OUTER JOIN prod_raw.dss_special_clients_all sc ON sc.ird_number = z.ird_number WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N'
;
