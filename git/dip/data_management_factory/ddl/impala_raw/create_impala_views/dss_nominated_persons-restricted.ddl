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
left outer join
(
 select distinct ird_number from ${var:source_db}.dss_special_clients_all  
 where 
  record_active_flag = 'Y'
  and record_deleted_flag = 'N'
  and (special_classification is null or special_classification = 'STD')
 ) sc1
on cast(sc1.ird_number as int) = cast(z.ird_number as int) 
left outer join
(
 select distinct ird_number from ${var:source_db}.dss_special_clients_all  
 where 
  record_active_flag = 'Y'
  and record_deleted_flag = 'N'
  and (special_classification is null or special_classification = 'STD')
 ) sc2
on cast(sc2.ird_number as int) = cast(z.nominated_ird_number as int) 
where 
(z.ird_number is null and sc1.ird_number is not null) or 
(z.nominated_ird_number is null and sc1.ird_number is not null) or 
(sc1.ird_number is not null and sc2.ird_number is not null) or 
(z.ird_number is null and z.nominated_ird_number is null)
;
