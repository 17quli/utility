create view ${var:view_db}.dss_returns_attachments_ir43
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
z.child_rebate_100035,
z.efile_lodgement_date_5,
z.estate_trust_pay_tax_100185,
z.income_type_100190,
z.non_qual_trust_income_723,
z.other_income_827,
z.overseas_income_828,
z.overseas_tax_credits_107,
z.reconcile_flag_4,
z.resident_status_100183,
z.rwt_and_other_tax_cr_803,
z.share_of_imp_credits_705,
z.tax_less_child_rebate_100186,
z.tax_on_nqt_distribution_100189,
z.tax_on_share_of_income_100188,
z.total_gross_dividends_804,
z.total_interest_802,
z.total_tax_paid_by_trustees_807,
z.uplifted_resid_income_tax_506,
z.share_of_maori_auth_dst_100584,
z.ben_tax_payable_100822,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.dss_returns_attachments_ir43 z
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
