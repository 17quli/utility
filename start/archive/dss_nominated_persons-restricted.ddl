create view ${var:view_db}.dss_nominated_persons
as select 
z.ird_number,
z.location_number,
z.nominated_ird_number,
z.tax_type,
z.date_start,
z.date_end,
z.date_created,
z.doc_lodge_nbr_prefix,
z.doc_lodge_nbr,
z.doc_lodge_nbr_suffix,
z.mainframe_user_id,
z.date_applied,
z.date_ceased,
z.`timestamp`,
z.nominated_location_number,
z.nominated_type,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.dss_nominated_persons z
left outer join  ${var:source_db}.dss_special_clients_all sc1
on cast(z.ird_number as int) = cast(sc1.ird_number as int) 
left outer join  ${var:source_db}.dss_special_clients_all sc2
on cast(z.nominated_ird_number as int) = cast(sc2.ird_number as int) 
where 
nvl(sc1.special_classification, 'STD')='STD'
and nvl( sc1.record_active_flag,'Y')='Y'
and nvl(sc1.record_deleted_flag, 'N') = 'N'
and nvl(sc2.special_classification, 'STD')='STD'
and nvl( sc2.record_active_flag,'Y')='Y'
and nvl(sc2.record_deleted_flag, 'N') = 'N';
