CREATE VIEW ${var:view_db}.dss_returns_attachments_ir4s
 AS SELECT z.ird_number, z.location_number, z.return_period_date, z.return_type, 
z.return_version_no, z.return_status, z.schedule_error_code, z.form_version_no, z.attachment_ird_number, 
z.certificate_sequence, z.doc_lodge_nbr_prefix, z.doc_lodge_nbr, z.doc_lodge_nbr_suffix, z.number_of_error_items,
 z.`timestamp`, z.batch_number_100316, z.box_number_100317, z.company_loans_866, z.current_ac_bal_867, 
z.efile_lodgement_date_5, z.loss_offsets_100181, z.reconcile_flag_4, z.subvention_payments_100182, z.total_laqc_losses_132, 
z.total_shareholder_salary_809, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, 
z.insert_object_run_key, z.update_object_run_key 
FROM ${var:source_db}.dss_returns_attachments_ir4s z 
left outer join  ${var:source_db}.dss_special_clients_all sc1
on cast(z.ird_number as int) = cast(sc1.ird_number as int) 
left outer join  ${var:source_db}.dss_special_clients_all sc2
on cast(z.attachment_ird_number as int) = cast(sc2.ird_number as int) 
where 
nvl(sc1.special_classification, 'STD')='STD'
and nvl( sc1.record_active_flag,'Y')='Y'
and nvl(sc1.record_deleted_flag, 'N') = 'N'
and nvl(sc2.special_classification, 'STD')='STD'
and nvl( sc2.record_active_flag,'Y')='Y'
and nvl(sc2.record_deleted_flag, 'N') = 'N'
;
