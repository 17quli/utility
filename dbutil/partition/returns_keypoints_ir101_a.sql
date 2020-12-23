select extract (year from return_period_date),count(1) from lab_fcp_raw.returns_keypoints_ir101 group by extract (year from return_period_date) order by 1 desc;
