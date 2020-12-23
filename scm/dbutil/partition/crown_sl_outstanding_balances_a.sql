select year_month,count(1) from lab_fcp_raw.crown_sl_outstanding_balances group by year_month order by 1 desc;
