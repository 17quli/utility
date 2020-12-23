create view ${var:view_db}.dss_cross_references
as select 
z.reference_type,
z.ird_number_from,
z.ird_number_to,
z.latest_year,
z.date_applied,
z.confirmed_ind,
z.first_year,
z.date_ceased,
z.`timestamp`,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.dss_cross_references z
left outer join
(
 select distinct ird_number from ${var:source_db}.dss_special_clients_all  
 where 
  record_active_flag = 'Y'
  and record_deleted_flag = 'N'
  and (special_classification is null or special_classification = 'STD')
 ) sc1
on cast(sc1.ird_number as int) = cast(z.ird_number_from as int) 
left outer join
(
 select distinct ird_number from ${var:source_db}.dss_special_clients_all  
 where 
  record_active_flag = 'Y'
  and record_deleted_flag = 'N'
  and (special_classification is null or special_classification = 'STD')
 ) sc2
on cast(sc2.ird_number as int) = cast(z.ird_number_to as int) 
where 
(z.ird_number_from is null and sc1.ird_number is not null) or 
(z.ird_number_to is null and sc1.ird_number is not null) or 
(sc1.ird_number is not null and sc2.ird_number is not null) or 
(z.ird_number_from is null and z.ird_number_to is null)

;
