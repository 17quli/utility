create  table ${var:target_db}.snz_bic_anzsic2006
stored as parquet
as select * from dev_refined.snz_bic_anzsic2006;

compute stats ${var:target_db}.snz_bic_anzsic2006;