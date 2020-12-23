create view ${var:view_db}.dss_returns_attachments_ir4s
as select 
z.ird_number,
z.location_number,
z.return_period_date,
z.return_type,
z.return_version_no,
z.return_status,
z.schedule_error_code,
z.form_version_no,
z.attachment_ird_number,
z.certificate_sequence,
z.doc_lodge_nbr_prefix,
z.doc_lodge_nbr,
z.doc_lodge_nbr_suffix,
z.number_of_error_items,
z.`timestamp`,
z.batch_number_100316,
z.box_number_100317,
z.company_loans_866,
z.current_ac_bal_867,
z.efile_lodgement_date_5,
z.loss_offsets_100181,
z.reconcile_flag_4,
z.subvention_payments_100182,
z.total_laqc_losses_132,
z.total_shareholder_salary_809,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.dss_returns_attachments_ir4s z
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
on cast(sc2.ird_number as int) = cast(z. attachment_ird_number as int) 
where 
(z.ird_number is null and sc1.ird_number is not null) or 
(z. attachment_ird_number is null and sc1.ird_number is not null) or 
(sc1.ird_number is not null and sc2.ird_number is not null) or 
(z.ird_number is null and z.attachment_ird_number is null);
