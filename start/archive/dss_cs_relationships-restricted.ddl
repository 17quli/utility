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
left outer join  ${var:source_db}.dss_special_clients_all sc1
on cast(z.ncp_ird_number as int) = cast(sc1.ird_number as int) 
left outer join  ${var:source_db}.dss_special_clients_all sc2
on cast(z.cp_ird_number as int) = cast(sc2.ird_number as int) 
where 
nvl(sc1.special_classification, 'STD')='STD'
and nvl( sc1.record_active_flag,'Y')='Y'
and nvl(sc1.record_deleted_flag, 'N') = 'N'
and nvl(sc2.special_classification, 'STD')='STD'
and nvl( sc2.record_active_flag,'Y')='Y'
and nvl(sc2.record_deleted_flag, 'N') = 'N';
