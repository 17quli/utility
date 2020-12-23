select extract (year from return_period_date),count(1) from lab_fcp_raw.transactions group by extract (year from return_period_date) order by 1 desc;
