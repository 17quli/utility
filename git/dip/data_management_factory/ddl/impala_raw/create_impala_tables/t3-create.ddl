CREATE TABLE ${var:target_db}.t3 (
  customer_key INT,
  ird_number VARCHAR(10),
  mail_key INT,
  letter_datetime TIMESTAMP,
  letter_date TIMESTAMP,
  letter_type VARCHAR(16),
  letter_category VARCHAR(32),
  letter_name VARCHAR(64),
  letter_channel VARCHAR(16),
  letter_issued_by VARCHAR(16),
  delta INT,
  type VARCHAR(32),
  start_datetime TIMESTAMP,
  short_description VARCHAR(1000),
  detail_description VARCHAR(1000),
  contact_text VARCHAR(30679),
  unique_id INT
)
STORED AS PARQUET
;
