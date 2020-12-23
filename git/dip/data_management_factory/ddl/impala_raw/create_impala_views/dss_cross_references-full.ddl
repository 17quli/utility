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
;
