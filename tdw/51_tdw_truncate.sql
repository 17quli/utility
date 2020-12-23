truncate table  ${var:target_db}.${var:app_tbl_name};
select 'row count after truncate',count(*) as raw from  ${var:target_db}.${var:app_tbl_name};
