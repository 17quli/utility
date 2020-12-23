create view ${var:view_db}.dss_cs_relationships
as select 
z.relationship_number,
z.cp_ird_number,
z.ncp_ird_number,
z.date_start,
z.date_end,
z.date_reviewed,
z.cp_case_type_indicator,
z.cs_rel_end_reason_code,
z.cs_relationship_status_code,
z.cs_relationship_type_code,
z.reciprocal_indicator,
z.ucb_indicator,
z.deleted_indicator,
z.date_applied,
z.date_ceased,
z.`timestamp`,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.dss_cs_relationships z
left outer join
(
 select distinct ird_number from ${var:source_db}.dss_special_clients_all  
 where 
  record_active_flag = 'Y'
  and record_deleted_flag = 'N'
  and (special_classification is null or special_classification = 'STD')
 ) sc1
on cast(sc1.ird_number as int) = cast(z.cp_ird_number as int) 
left outer join
(
 select distinct ird_number from ${var:source_db}.dss_special_clients_all  
 where 
  record_active_flag = 'Y'
  and record_deleted_flag = 'N'
  and (special_classification is null or special_classification = 'STD')
 ) sc2
on cast(sc2.ird_number as int) = cast(z.ncp_ird_number as int) 
where 
(z.cp_ird_number is null and sc1.ird_number is not null) or 
(z.ncp_ird_number is null and sc1.ird_number is not null) or 
(sc1.ird_number is not null and sc2.ird_number is not null) or 
(z.cp_ird_number is null and z.ncp_ird_number is null)
;
