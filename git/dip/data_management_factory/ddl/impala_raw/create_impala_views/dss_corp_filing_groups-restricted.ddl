create view ${var:view_db}.dss_corp_filing_groups
as select 
z.group_id,
z.ird_number,
z.date_applied,
z.date_end,
z.date_start,
z.dln_bgn_prefix,
z.dln_bgn,
z.dln_end_prefix,
z.dln_end,
z.group_turnover,
z.group_turnover_year,
z.accy_pro,
z.iss,
z.`timestamp`,
z.date_ceased,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.dss_corp_filing_groups z
left outer join  ${var:source_db}.dss_special_clients_all sc
on cast(z.ird_number as int) = cast(sc.ird_number as int) 
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N';
;
