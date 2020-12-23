CREATE VIEW ${var:view_db}.dss_cross_references 
AS SELECT z.reference_type, z.ird_number_from, z.ird_number_to, z.latest_year, 
z.date_applied, z.confirmed_ind, z.first_year, z.date_ceased, z.`timestamp`, 
z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, 
z.insert_object_run_key, z.update_object_run_key 
FROM ${var:source_db}.dss_cross_references z  
left outer join  ${var:source_db}.dss_special_clients_all sc1
on cast(z.ird_number_from as int) = cast(sc1.ird_number as int) 
left outer join  ${var:source_db}.dss_special_clients_all sc2
on cast(z.ird_number_to as int) = cast(sc2.ird_number as int) 
where 
nvl(sc1.special_classification, 'STD')='STD'
and nvl( sc1.record_active_flag,'Y')='Y'
and nvl(sc1.record_deleted_flag, 'N') = 'N'
and nvl(sc2.special_classification, 'STD')='STD'
and nvl( sc2.record_active_flag,'Y')='Y'
and nvl(sc2.record_deleted_flag, 'N') = 'N'
;
