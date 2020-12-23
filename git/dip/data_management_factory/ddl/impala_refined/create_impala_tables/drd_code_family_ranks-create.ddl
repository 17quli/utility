create  table ${var:target_db}.drd_code_family_ranks
stored as parquet
as select * from dev_work.drd_code_family_ranks;

compute stats ${var:target_db}.drd_code_family_ranks;
