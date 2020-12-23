create  table ${var:target_db}.local_start_bankruptcy
stored as parquet
as select * from dev_refined.local_start_bankruptcy;

compute stats ${var:target_db}.local_start_bankruptcy;