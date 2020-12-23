from t3
insert into table t5 partition(txn_return_period_year=2020,tax_type='NCP')
select ird_number,
location_number,
return_period_date,
seq_no,
account_no,
amount,
transaction_code,
transaction_type,
transaction_status_code,
payment_method_code,
transaction_reason_code,
return_type,
user_id,
date_effective,
date_processed,
date_reversed,
account_key_link,
transaction_seq_link,
office_number,
office_type,
`timestamp`,
date_format(return_period_date,'yyyy') as txn_return_period_year,
tax_type
from t3
where date_format(return_period_date,'yyyy')='2020' and tax_type='NCP'
;
