INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name}
SELECT
cast(fstruser as VARCHAR(20)) as fstruser,
cast(fstrtype as VARCHAR(24)) as fstrtype,
cast(fdtmstart as TIMESTAMP) as fdtmstart,
cast(fdtmend as TIMESTAMP) as fdtmend,
cast(fstrfirstname as VARCHAR(100)) as fstrfirstname,
cast(fstrfamilyname as VARCHAR(510)) as fstrfamilyname,
cast(fstrmiddlename as VARCHAR(100)) as fstrmiddlename,
cast(fstrtitle as VARCHAR(24)) as fstrtitle,
cast(fstrstreet as VARCHAR(510)) as fstrstreet,
cast(fstrstreet2 as VARCHAR(510)) as fstrstreet2,
cast(fstrunit as VARCHAR(60)) as fstrunit,
cast(fstrunittype as VARCHAR(100)) as fstrunittype,
cast(fstrcity as VARCHAR(200)) as fstrcity,
cast(fstrcounty as VARCHAR(12)) as fstrcounty,
cast(fstrstate as VARCHAR(12)) as fstrstate,
cast(fstrzip as VARCHAR(60)) as fstrzip,
cast(fstrcountry as VARCHAR(12)) as fstrcountry,
cast(fstrattention as VARCHAR(510)) as fstrattention,
cast(fstrlocationcode as VARCHAR(60)) as fstrlocationcode,
cast(fstrurbanization as VARCHAR(100)) as fstrurbanization,
cast(fstrrowid as VARCHAR(60)) as fstrrowid,
cast(fstrmunicipality as VARCHAR(60)) as fstrmunicipality,
cast(fstrdistrict as VARCHAR(60)) as fstrdistrict,
cast(fstrsubdistrict as VARCHAR(60)) as fstrsubdistrict,
cast(fstrsubprovince as VARCHAR(100)) as fstrsubprovince,
cast(fstraddressdescription as VARCHAR(510)) as fstraddressdescription,
cast(fblnverified as SMALLINT) as fblnverified,
cast(fdtmverified as TIMESTAMP) as fdtmverified,
cast(fstrphonetype1 as VARCHAR(12)) as fstrphonetype1,
cast(fintcountrycode1 as SMALLINT) as fintcountrycode1,
cast(fstrcountry1 as VARCHAR(12)) as fstrcountry1,
cast(fstrareacode1 as VARCHAR(10)) as fstrareacode1,
cast(fstrphonenumber1 as VARCHAR(30)) as fstrphonenumber1,
cast(fstrextension1 as VARCHAR(20)) as fstrextension1,
cast(fstrphonetype2 as VARCHAR(12)) as fstrphonetype2,
cast(fintcountrycode2 as SMALLINT) as fintcountrycode2,
cast(fstrcountry2 as VARCHAR(12)) as fstrcountry2,
cast(fstrareacode2 as VARCHAR(10)) as fstrareacode2,
cast(fstrphonenumber2 as VARCHAR(30)) as fstrphonenumber2,
cast(fstrextension2 as VARCHAR(20)) as fstrextension2,
cast(fstrphonetype3 as VARCHAR(12)) as fstrphonetype3,
cast(fintcountrycode3 as SMALLINT) as fintcountrycode3,
cast(fstrcountry3 as VARCHAR(12)) as fstrcountry3,
cast(fstrareacode3 as VARCHAR(10)) as fstrareacode3,
cast(fstrphonenumber3 as VARCHAR(30)) as fstrphonenumber3,
cast(fstrextension3 as VARCHAR(20)) as fstrextension3,
cast(fstrphonetype4 as VARCHAR(12)) as fstrphonetype4,
cast(fintcountrycode4 as SMALLINT) as fintcountrycode4,
cast(fstrcountry4 as VARCHAR(12)) as fstrcountry4,
cast(fstrareacode4 as VARCHAR(10)) as fstrareacode4,
cast(fstrphonenumber4 as VARCHAR(30)) as fstrphonenumber4,
cast(fstrextension4 as VARCHAR(20)) as fstrextension4,
cast(fstremail as VARCHAR(510)) as fstremail,
cast(fstrlob as VARCHAR(24)) as fstrlob,
cast(fstrsbu as VARCHAR(24)) as fstrsbu,
cast(fstrregion as VARCHAR(12)) as fstrregion,
cast(fstrdistrictoffice as VARCHAR(12)) as fstrdistrictoffice,
cast(fstrreslocation as VARCHAR(12)) as fstrreslocation,
cast(fstrdesklocation as VARCHAR(80)) as fstrdesklocation,
cast(fstraliasname as VARCHAR(80)) as fstraliasname,
cast(fstrnetworkid as VARCHAR(510)) as fstrnetworkid,
cast(fstrmanager as VARCHAR(20)) as fstrmanager,
cast(flngcustomerkey as INT) as flngcustomerkey,
cast(fblnproduction as SMALLINT) as fblnproduction,
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
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}',count(distinct fstruser)  as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};
upsert into ${var:source_db}.tdw_validation(raw_table_name,environment,batch_number,tdw_table_name,tdw_multiple_key_count)
select '${var:app_tbl_name}','${var:env}',${var:batch_number},'${var:tdw_tbl_name}', count(1) from (select fstruser,count(1) FROM  ${var:target_db}.${var:app_tbl_name} group by fstruser having count(1)>1) z;
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
