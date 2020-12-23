create view ${var:view_db}.dss_returns_attachments_ir20
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
z.efile_lodgement_date_5,
z.income_type_100190,
z.other_income_827,
z.overseas_income_828,
z.percent_of_profit_ent_100192,
z.reconcile_flag_4,
z.share_of_all_dividends_100193,
z.share_of_all_interest_100191,
z.share_of_imp_credits_705,
z.share_of_interest_divs_100569,
z.share_of_oseas_tax_credits_863,
z.share_of_other_tax_credits_864,
z.total_share_of_income_865,
z.share_of_maori_auth_dst_100584,
z.share_of_rental_income_100802,
z.share_oth_passiv_income_100803,
z.laqc_loss_100810,
z.deduction_extgd_losses_100857,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
from ${var:source_db}.dss_returns_attachments_ir20 z
left outer join ${var:source_db}.dss_special_clients_all sc
on cast(z.ird_number as int) = cast(sc.ird_number as int) 
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N'
;
