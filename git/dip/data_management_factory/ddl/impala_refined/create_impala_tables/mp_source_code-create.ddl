create  table ${var:target_db}.mp_source_code 
stored as parquet
as select * from dev_refined.mp_source_code;

compute stats ${var:target_db}.mp_source_code;
