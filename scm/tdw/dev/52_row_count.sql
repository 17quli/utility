upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,tdw_record_count)
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}',count(1) as raw_tdw_count from  ${var:target_db}.${var:tdw_tbl_name};
select raw_table_name as raw,environment as env,batch_number as batch,raw_record_count as raw_rc,tdw_record_count as tdw_rc,tdw_unique_key_count as tdw_ukc,tdw_multiple_key_count as tdw_mkc,tdw_min_effective_from,tdw_max_effective_from,raw_record_count_post_load as raw_rc_tdw_load,raw_record_count_post_inc as raw_rc_inc,low_date_count as lwm_rc,high_date_count as hwm_rc,fdtmwhen_low_date_count fdtmwhen_lwm_rc
from ${var:source_db}.tdw_validation 
where raw_table_name='${var:app_tbl_name}' and environment='${var:env}';
