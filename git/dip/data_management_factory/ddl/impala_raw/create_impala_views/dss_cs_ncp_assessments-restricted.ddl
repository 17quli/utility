create view ${var:view_db}.dss_cs_ncp_assessments
as select 
z.ncp_ird_number,
z.return_period_date,
z.version_number,
z.date_start,
z.exemption_reason_indicator,
z.cs_assessment_inc_src_code,
z.cs_derived_income_src_code,
z.cs_assessed_income_amt,
z.cs_living_allowance_code,
z.cs_living_allowance_amt,
z.cs_est_income_reason_code,
z.cs_reassessment_reason_code,
z.cs_coa_type_code,
z.overseas_income_indicator,
z.maximum_income_indicator,
z.total_relationships_nbr,
z.fa_children_nbr,
z.va_children_nbr,
z.child_support_yearly_rate,
z.child_support_amt,
z.spousal_relationships_nbr,
z.spousal_yearly_rate,
z.spousal_amt,
z.lump_sum_nbr,
z.lump_sum_amt,
z.universal_fam_allowance_nbr,
z.cs_end_reason_code,
z.end_cp_ird_number,
z.date_end,
z.active_status_indicator,
z.`timestamp`,
z.tax_type,
z.liv_allowance_set_by_court_ord,
z.universal_fam_allowance_amt,
z.deleted_indicator,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.dss_cs_ncp_assessments z
left outer join dev_raw.dss_special_clients_all sc 
on cast(sc.ird_number as int) = cast(z.ncp_ird_number as int) 
left outer join dev_raw.dss_special_clients_all sc2 
on cast(sc2.ird_number as int) = cast(z. end_cp_ird_number as int) 
where nvl(sc.special_classification, 'STD') = 'STD' and nvl(sc2.special_classification, 'STD') = 'STD'
  and nvl(sc.record_active_flag, 'Y') = 'Y' and nvl(sc2.record_active_flag, 'Y') = 'Y' 
  and nvl(sc.record_deleted_flag, 'N') = 'N' and nvl(sc2.record_deleted_flag, 'N') = 'N'
;
