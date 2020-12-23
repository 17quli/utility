INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name}
SELECT
cast(flngdockey as INT) as flngdockey,
cast(fcurgrossdividends as DECIMAL(19,4)) as fcurgrossdividends,
cast(fcurgrossinterest as DECIMAL(19,4)) as fcurgrossinterest,
cast(fcurgrossroyalties as DECIMAL(19,4)) as fcurgrossroyalties,
cast(fcurgrossother as DECIMAL(19,4)) as fcurgrossother,
cast(fcurgrosstotal as DECIMAL(19,4)) as fcurgrosstotal,
cast(fcurnrwtdividends as DECIMAL(19,4)) as fcurnrwtdividends,
cast(fcurnrwtinterest as DECIMAL(19,4)) as fcurnrwtinterest,
cast(fcurnrwtroyalties as DECIMAL(19,4)) as fcurnrwtroyalties,
cast(fcurnrwtother as DECIMAL(19,4)) as fcurnrwtother,
cast(fcurnrwttotal as DECIMAL(19,4)) as fcurnrwttotal,
cast(fcurfdpcredits as DECIMAL(19,4)) as fcurfdpcredits,
cast(fcurnrwtpayable as DECIMAL(19,4)) as fcurnrwtpayable,
cast(fcurnrwtbcm as DECIMAL(19,4)) as fcurnrwtbcm,
cast(fcurmanualnrwtpaid as DECIMAL(19,4)) as fcurmanualnrwtpaid,
cast(fcurnrwtpaid as DECIMAL(19,4)) as fcurnrwtpaid,
cast(fcurnrwtfinal as DECIMAL(19,4)) as fcurnrwtfinal,
cast(fcurunreconciledamount as DECIMAL(19,4)) as fcurunreconciledamount,
cast(flngcertificatenumber as INT) as flngcertificatenumber,
cast(flngcertfiled as INT) as flngcertfiled,
cast(fblnelectronicfiled as SMALLINT) as fblnelectronicfiled,
cast(fstrwho as VARCHAR(20)) as fstrwho,
CAST(effective_from AS TIMESTAMP) AS fdtmwhen,
CAST(record_effective_timestamp AS TIMESTAMP) AS record_effective_timestamp,
CAST(record_expiry_timestamp AS TIMESTAMP) AS record_expiry_timestamp,
CAST(CURRENT_REC_FLAG AS VARCHAR(1)) AS record_active_flag,
CAST('N' AS VARCHAR(1)) AS record_deleted_flag,
CAST(insert_object_run_key AS INT) AS insert_object_run_key,
CAST(update_object_run_key AS INT) AS update_object_run_key
FROM  ${var:target_db}.${var:tdw_tbl_name};
upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,raw_record_count_post_load)
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}',count(1) from  ${var:target_db}.${var:app_tbl_name};
upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,tdw_unique_key_count)
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}',count(distinct flngdockey)  as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};
upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,tdw_multiple_key_count)
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}', count(1) from (select flngdockey,count(1) FROM  ${var:target_db}.${var:app_tbl_name} group by flngdockey having count(1)>1) z;
upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,tdw_min_effective_from,tdw_max_effective_from)
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}', min(fdtmwhen),max(fdtmwhen) from ${var:target_db}.${var:app_tbl_name};
upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,low_date_count)
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}',count(*) as low_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_effective_timestamp = '1800-01-01 00:00:00';
upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,high_date_count)
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}', count(*) as high_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_expiry_timestamp = '9000-12-31 00:00:00';
upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,fdtmwhen_low_date_count)
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}', count(1) as lwmcnt from ${var:target_db}.${var:app_tbl_name} where fdtmwhen='1800-1-1';
select raw_table_name as raw,environment as env,batch_number as batch,raw_record_count as raw_rc,tdw_record_count as tdw_rc,tdw_unique_key_count as tdw_ukc,tdw_multiple_key_count as tdw_mkc,tdw_min_effective_from,tdw_max_effective_from,raw_record_count_post_load as raw_rc_tdw_load,raw_record_count_post_inc as raw_rc_inc,low_date_count as lwm_rc,high_date_count as hwm_rc,fdtmwhen_low_date_count fdtmwhen_lwm_rc 
from ${var:source_db}.tdw_validation 
where raw_table_name='${var:app_tbl_name}' and environment='${var:env}';
drop table if exists ${var:journal_db}.${var:app_tbl_name};
