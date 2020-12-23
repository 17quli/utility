CREATE TABLE lab_fcp_raw.ptn_returns_keypoints_ir3 (
  ird_number INT,
  location_number INT,
  return_period_date TIMESTAMP,
  return_type VARCHAR(10),
  return_version_no INT,
  return_status VARCHAR(2),
  form_version_no INT,
  number_of_error_items INT,
  `timestamp` TIMESTAMP,
  accounts_included_flag_100023 VARCHAR(2),
  acc_class_number_1_412 BIGINT,
  acc_income_indicator_100088 VARCHAR(2),
  acc_start_date_1_100090 TIMESTAMP,
  acc_start_date_2_100092 TIMESTAMP,
  acc_start_date_3_100094 TIMESTAMP,
  acc_start_date_4_100096 TIMESTAMP,
  acc_stop_date_1_100091 TIMESTAMP,
  acc_stop_date_2_100093 TIMESTAMP,
  acc_stop_date_3_100095 TIMESTAMP,
  acc_stop_date_4_100097 TIMESTAMP,
  ac_premium_excl_gst_401 DECIMAL(16,2),
  amount_of_transfer_100042 DECIMAL(16,2),
  assessment_850 DECIMAL(16,2),
  a_50_oseas_pvt_pension_100086 DECIMAL(16,2),
  calc_earner_premium_424 DECIMAL(16,2),
  calc_employer_premium_403 DECIMAL(16,2),
  calc_emp_earner_exc_gst_420 DECIMAL(16,2),
  calc_gst_emp_earner_prem_421 DECIMAL(16,2),
  calc_gst_oth_earn_prem_100076 DECIMAL(16,2),
  calc_liable_earnings_100074 DECIMAL(16,2),
  calc_liable_earnings_ir12_416 DECIMAL(16,2),
  calc_oth_earner_premium_423 DECIMAL(16,2),
  calc_oth_earn_prem_gst_100075 DECIMAL(16,2),
  calc_oth_liable_earn_100079 DECIMAL(16,2),
  calc_rcl_earner_premium_422 DECIMAL(16,2),
  childcare_hsekeeper_pd_100038 DECIMAL(16,2),
  childcare_hsekeeper_reb_100039 DECIMAL(16,2),
  child_1_date_of_birth_924 TIMESTAMP,
  child_2_date_of_birth_925 TIMESTAMP,
  child_3_date_of_birth_926 TIMESTAMP,
  child_4_date_of_birth_927 TIMESTAMP,
  child_5_date_of_birth_928 TIMESTAMP,
  child_6_date_of_birth_929 TIMESTAMP,
  child_7_date_of_birth_930 TIMESTAMP,
  child_rebate_100035 DECIMAL(16,2),
  credit_adjustments_957 DECIMAL(16,2),
  date_marital_change_1_100051 TIMESTAMP,
  date_marital_change_2_100073 TIMESTAMP,
  debit_adjustments_956 DECIMAL(16,2),
  deemed_loss_102 DECIMAL(16,2),
  div_rwt_withholding_cr_805 DECIMAL(16,2),
  doc_attached_1_100058 VARCHAR(2),
  doc_attached_2_100059 VARCHAR(2),
  doc_attached_3_100060 VARCHAR(2),
  doc_attached_4_100061 VARCHAR(2),
  doc_attached_5_100062 VARCHAR(2),
  doc_attached_6_100063 VARCHAR(2),
  doc_attached_7_100064 VARCHAR(2),
  donations_rebate_100037 DECIMAL(16,2),
  earner_premium_100069 DECIMAL(16,2),
  earner_premium_payable_425 DECIMAL(16,2),
  earner_prem_overdeduct_414 DECIMAL(16,2),
  earnings_ir12_119 DECIMAL(16,2),
  earnings_ir13_120 DECIMAL(16,2),
  extra_pay_rebate_100033 DECIMAL(16,2),
  foreign_disclosure_129 VARCHAR(2),
  foreign_pension_1002 DECIMAL(16,2),
  frozen_rate_of_nzs_ind_100084 VARCHAR(2),
  fs2_attached_100071 VARCHAR(2),
  fstc_entitlement_ind_100021 VARCHAR(2),
  fstc_marital_change_ind_953 VARCHAR(2),
  fs_assessment_602 DECIMAL(16,2),
  fs_entitlement_1004 DECIMAL(16,2),
  fs_paid_by_ird_100080 DECIMAL(16,2),
  gmfi_entitlement_1007 DECIMAL(16,2),
  gmfi_inc_in_fam_assmt_y_n_959 VARCHAR(2),
  gross_earnings_407 DECIMAL(16,2),
  gross_nz_super_100054 DECIMAL(16,2),
  gross_nz_super__1183 DECIMAL(16,2),
  gst_on_resid_claims_levy_402 DECIMAL(16,2),
  half_non_tax_pension_100055 DECIMAL(16,2),
  iftc_entitlement_1005 DECIMAL(16,2),
  income_after_expenses_101 DECIMAL(16,2),
  inc_under_9880_rebate_100032 DECIMAL(16,2),
  interest_and_dividends_100068 DECIMAL(16,2),
  interim_repayment_amount_854 DECIMAL(16,2),
  interim_repayment_option_853 VARCHAR(2),
  ir12_dn_fstc_821 DECIMAL(16,2),
  ir12_ir13_gross_earnings_820 DECIMAL(16,2),
  ir12_ir13_total_tax_deds_819 DECIMAL(16,2),
  ir12_total_deductions_121 DECIMAL(16,2),
  laqc_loss_144 DECIMAL(16,2),
  less_repayment_threshold_856 DECIMAL(16,2),
  liable_earnings_419 DECIMAL(16,2),
  liable_earnings_ir12_417 DECIMAL(16,2),
  loss_brought_forward_136 DECIMAL(16,2),
  loss_claimed_133 DECIMAL(16,2),
  manual_overide_for_ns60_100085 VARCHAR(2),
  marital_change_1_100050 VARCHAR(16),
  marital_change_2_100072 VARCHAR(16),
  marital_indicator_100049 VARCHAR(2),
  more_acc_periods_100089 INT,
  more_other_iftc_inc_per_100099 INT,
  net_profit_702 DECIMAL(16,2),
  net_rents_826 DECIMAL(16,2),
  non_qual_trust_income_723 DECIMAL(16,2),
  non_resident_ind_100022 VARCHAR(2),
  not_used_100024 DECIMAL(16,2),
  not_used_100025 DECIMAL(16,2),
  not_used_100072 VARCHAR(14),
  not_used_100073 TIMESTAMP,
  no_of_wks_full_time_100031 INT,
  ns60_attached_100070 VARCHAR(2),
  number_liable_certs_415 INT,
  number_of_children_936 INT,
  nzs_exemption_100057 DECIMAL(16,2),
  nzs_recd_period_from_100046 TIMESTAMP,
  nzs_received_period_to_100047 TIMESTAMP,
  nzs_spouses_ird_number_100048 INT,
  nzs_spouses_other_inc_100056 DECIMAL(16,2),
  nzs_surcharge_704 DECIMAL(16,2),
  offset_against_sl_849 VARCHAR(2),
  other_iftc_income_ind_100098 VARCHAR(2),
  other_iftc_stop_date_1_100101 TIMESTAMP,
  other_iftc_stop_date_2_100103 TIMESTAMP,
  other_iftc_stop_date_3_100105 TIMESTAMP,
  other_iftc_stop_date_4_100107 TIMESTAMP,
  other_iftc_stop_date_5_100109 TIMESTAMP,
  other_iftc_strt_date_1_100100 TIMESTAMP,
  other_iftc_strt_date_2_100102 TIMESTAMP,
  other_iftc_strt_date_3_100104 TIMESTAMP,
  other_iftc_strt_date_4_100106 TIMESTAMP,
  other_iftc_strt_date_5_100108 TIMESTAMP,
  other_income_827 DECIMAL(16,2),
  other_income_liable_100087 VARCHAR(2),
  other_rebate_100041 DECIMAL(16,2),
  other_tax_deductions_801 DECIMAL(16,2),
  overseas_income_828 DECIMAL(16,2),
  overseas_tax_credits_107 DECIMAL(16,2),
  partners_taxable_income_955 DECIMAL(16,2),
  partner_ird_number_901 INT,
  partner_weeks_100066 INT,
  paye_ep_adjusted_100077 DECIMAL(16,2),
  pcc_start_date_child_1_939 TIMESTAMP,
  pcc_start_date_child_2_941 TIMESTAMP,
  pcc_start_date_child_3_943 TIMESTAMP,
  pcc_start_date_child_4_945 TIMESTAMP,
  pcc_start_date_child_5_947 TIMESTAMP,
  pcc_start_date_child_6_949 TIMESTAMP,
  pcc_start_date_child_7_951 TIMESTAMP,
  pcc_stop_date_child_1_940 TIMESTAMP,
  pcc_stop_date_child_2_942 TIMESTAMP,
  pcc_stop_date_child_3_944 TIMESTAMP,
  pcc_stop_date_child_4_946 TIMESTAMP,
  pcc_stop_date_child_5_948 TIMESTAMP,
  pcc_stop_date_child_6_950 TIMESTAMP,
  pcc_stop_date_child_7_952 TIMESTAMP,
  pre_encription_check_100018 VARCHAR(8),
  pre_encription_ird_no_100019 INT,
  pre_encription_loc_no_100020 INT,
  principal_carer_weeks_100065 INT,
  principle_child_carer_y_n_958 VARCHAR(28),
  provisional_tax_option_501 VARCHAR(2),
  provisional_tax_payable_502 DECIMAL(16,2),
  prov_tax_over_payment_504 DECIMAL(16,2),
  refund_by_cheque_146 VARCHAR(2),
  refund_tax_to_pay_100067 DECIMAL(16,2),
  refund_tax_to_pay_701 DECIMAL(16,2),
  residual_claims_levy_ind_418 VARCHAR(10),
  residual_income_tax_108 DECIMAL(16,2),
  residual_repayment_obl_869 DECIMAL(16,2),
  return_not_12_months_117 VARCHAR(2),
  rwt_and_other_tax_cr_803 DECIMAL(16,2),
  shared_cust_agreement_ind_954 VARCHAR(2),
  share_of_imp_credits_705 DECIMAL(16,2),
  sl_liable_income_868 DECIMAL(16,2),
  spec_savs_acct_rebate_100040 DECIMAL(16,2),
  spouse_rcvd_nzs_per_to_100053 TIMESTAMP,
  spouse_received_ns_ind_100169 VARCHAR(2),
  spse_rcvd_nzs_per_from_100052 TIMESTAMP,
  std_disclaimer_applies_100045 VARCHAR(2),
  student_loans_deductions_851 DECIMAL(16,2),
  taxable_income_109 DECIMAL(16,2),
  tax_on_taxable_income_721 DECIMAL(16,2),
  total_donations_paid_100036 DECIMAL(16,2),
  total_estate_trust_income_806 DECIMAL(16,2),
  total_expenses_claimed_100026 DECIMAL(16,2),
  total_fstc_601 DECIMAL(16,2),
  total_gross_dividends_804 DECIMAL(16,2),
  total_interest_802 DECIMAL(16,2),
  total_loss_carried_fwd_114 DECIMAL(16,2),
  total_partnership_income_808 DECIMAL(16,2),
  total_partnership_tax_crs_858 DECIMAL(16,2),
  total_pays_on_ir12_100034 INT,
  total_rebates_703 DECIMAL(16,2),
  total_shareholder_salary_809 DECIMAL(16,2),
  total_tax_credits_115 DECIMAL(16,2),
  total_tax_paid_by_trustees_807 DECIMAL(16,2),
  tot_family_assistance_ent_603 DECIMAL(16,2),
  tot_resid_claims_payable_426 DECIMAL(16,2),
  tot_sls_repmnts_to_ird_100081 DECIMAL(16,2),
  tot_tax_credits_adj_ep_100078 DECIMAL(16,2),
  tot_tax_deds_nz_super_1182 DECIMAL(16,2),
  transfer_to_ird_no_1 INT,
  transfer_to_location_no_2 INT,
  transfer_to_period_3 TIMESTAMP,
  trans_to_ac_earner_prem_100044 DECIMAL(16,2),
  trans_to_prov_tax_100043 DECIMAL(16,2),
  under_34200_rebate_100028 DECIMAL(16,2),
  under_34200_rebate_adj_100027 DECIMAL(16,2),
  under_38000_rebate_100030 DECIMAL(16,2),
  under_38000_rebate_adj_100029 DECIMAL(16,2),
  vet_pens_total_gross_100083 DECIMAL(16,2),
  vet_pens_total_tax_ded_100082 DECIMAL(16,2),
  amount_of_transfer_100512 DECIMAL(16,2),
  calc_total_deductions_100134 DECIMAL(16,2),
  earnings_not_liable_100187 DECIMAL(16,2),
  final_dr_cr_1000513 DECIMAL(16,2),
  fstc_entitlement_ind_1515 VARCHAR(2),
  gross_gri_100493 DECIMAL(16,2),
  gst_date_supply_100492 TIMESTAMP,
  ird_location_transfer_to_1510 INT,
  ird_no_transfer_to_1509 INT,
  nz_super_100522 VARCHAR(2),
  oseas_liable_earnings_100515 DECIMAL(16,2),
  other_tax_deductions_799 DECIMAL(16,2),
  overseas_earner_premium_100516 DECIMAL(16,2),
  payments_from_ird_1514 DECIMAL(16,2),
  period_transfer_to_1511 TIMESTAMP,
  previous_issue_date_406 TIMESTAMP,
  previous_notice_type_405 VARCHAR(2),
  previous_premium_amount_404 DECIMAL(16,2),
  provisional_income_503 DECIMAL(16,2),
  ptc_entitlment_1508 DECIMAL(16,2),
  self_employed_cease_date_1470 TIMESTAMP,
  tfr_to_own_student_loan_100511 DECIMAL(16,2),
  total_family_income_1507 DECIMAL(16,2),
  total_payments_from_winz_1513 DECIMAL(16,2),
  tot_w_holding_deducts_800 DECIMAL(16,2),
  tot_w_holding_payments_100514 DECIMAL(16,2),
  under_30875_rebate_100028 DECIMAL(16,2),
  under_30875_rebate_adj_100027 DECIMAL(16,2),
  veterans_pension_y_n_100523 VARCHAR(2),
  amount_transferred_100537 DECIMAL(16,2),
  are_you_associated_100572 VARCHAR(2),
  credit_adj_red_of_fit_100540 DECIMAL(16,2),
  earner_prem_eal_ep_100533 DECIMAL(16,2),
  empl_prem_ind_levy_ind_100531 VARCHAR(2),
  epr_resid_claim_levy_rt_100532 DECIMAL(16,2),
  excess_to_emp_over_max_100529 DECIMAL(16,2),
  fit_payable_100541 DECIMAL(16,2),
  gst_on_eal_earner_prem_100534 DECIMAL(16,2),
  ica_closing_balance_nu_100538 DECIMAL(16,2),
  pay_after_1st_wk_reimb_100528 DECIMAL(16,2),
  pay_emp_1st_wk_aftr_acc_100527 DECIMAL(16,2),
  student_loans_deductions_1336 DECIMAL(16,2),
  taxable_activity_com_dt_100526 TIMESTAMP,
  tax_on_trustee_income_111 DECIMAL(16,2),
  total_tax_credits_100173 DECIMAL(16,2),
  tot_eal_earner_prem_lbl_100535 DECIMAL(16,2),
  tot_earn_lble_for_levy_100530 DECIMAL(16,2),
  tot_rcl_eal_ep_pbl_sea_100536 DECIMAL(16,2),
  wpa_closing_balance_nu_100539 DECIMAL(16,2),
  are_you_associated_sls_100574 VARCHAR(2),
  tot_maori_auth_credits_100585 DECIMAL(16,2),
  tot_maori_auth_dist_100586 DECIMAL(16,2),
  allowable_imp_credits_100607 DECIMAL(16,2),
  ent_early_pymt_disc_yn_100609 VARCHAR(2),
  excess_imp_credits_100608 DECIMAL(16,2),
  reduced_imp_credits_100606 DECIMAL(16,2),
  excess_imp_credits_bf_100610 DECIMAL(16,2),
  in_work_payment_ent_100611 DECIMAL(16,2),
  date_from_100679 TIMESTAMP,
  date_to_100680 TIMESTAMP,
  fam_total_100700 DECIMAL(16,2),
  budget_write_off_amount_100702 DECIMAL(16,2),
  budget_write_off_flag_100701 VARCHAR(2),
  rd_flag_100696 VARCHAR(2),
  rd_tax_credit_100694 DECIMAL(16,2),
  situation_100693 VARCHAR(14),
  sps_rd_amount_100695 DECIMAL(16,2),
  fam_tax_credit_ent_100710 DECIMAL(16,2),
  wff_assessment_100747 DECIMAL(16,2),
  calc_ietc_credit_100757 DECIMAL(16,2),
  calc_qualifying_months_100756 INT,
  eligible_ietc_tax_cr_100748 VARCHAR(2),
  num_qualifying_months_100754 INT,
  overseas_income_end_dt_100750 TIMESTAMP,
  overseas_income_st_dt_100749 TIMESTAMP,
  tax_credits_claimed_100755 DECIMAL(16,2),
  wfftc_ir215_attached_100788 VARCHAR(2),
  intrst_pship_ltc_trust_100789 VARCHAR(2),
  divdnds_pship_ltc_trust_100790 VARCHAR(2),
  total_ltc_tax_credits_100791 DECIMAL(16,2),
  total_active_ltc_income_100792 DECIMAL(16,2),
  non_allowble_deductions_100793 DECIMAL(16,2),
  adjusted_ltc_income_100794 DECIMAL(16,2),
  futur_shr_employee_slry_100795 VARCHAR(2),
  interim_liable_income_100796 DECIMAL(16,2),
  sls_null_assmt_ind_100826 VARCHAR(2),
  sl_adjusted_net_income_100831 DECIMAL(16,2),
  pr_yr_n_allw_ded_claimd_100829 DECIMAL(16,2),
  net_schedular_payments_100828 DECIMAL(16,2),
  sl_unusd_repymt_thrshld_100830 DECIMAL(16,2),
  schedular_expenses_100827 DECIMAL(16,2),
  overseas_super_lump_sum_100864 VARCHAR(2),
  not_used_100022 VARCHAR(2)
)
partitioned by (return_period_year bigint)
STORED AS PARQUET;

insert into lab_fcp_raw.ptn_returns_keypoints_ir3 partition(return_period_year)
select z.* ,extract(year from z.return_period_date) 
from lab_fcp_raw.returns_keypoints_ir3 z;

compute incremental stats lab_fcp_raw.ptn_returns_keypoints_ir3;

select count(1) from lab_fcp_raw.returns_keypoints_ir3;
select count(1) from lab_fcp_raw.ptn_returns_keypoints_ir3;

--recreate views
DROP VIEW if exists lab_fcp_raw_full_access.dss_returns_keypoints_ir3;
CREATE VIEW lab_fcp_raw_full_access.dss_returns_keypoints_ir3 AS
SELECT z.ird_number, z.location_number, z.return_period_date, z.return_type, z.return_version_no, z.return_status, z.form_version_no, z.number_of_error_items, z.`timestamp`, z.accounts_included_flag_100023, z.acc_class_number_1_412, z.acc_income_indicator_100088, z.acc_start_date_1_100090, z.acc_start_date_2_100092, z.acc_start_date_3_100094, z.acc_start_date_4_100096, z.acc_stop_date_1_100091, z.acc_stop_date_2_100093, z.acc_stop_date_3_100095, z.acc_stop_date_4_100097, z.ac_premium_excl_gst_401, z.amount_of_transfer_100042, z.assessment_850, z.a_50_oseas_pvt_pension_100086, z.calc_earner_premium_424, z.calc_employer_premium_403, z.calc_emp_earner_exc_gst_420, z.calc_gst_emp_earner_prem_421, z.calc_gst_oth_earn_prem_100076, z.calc_liable_earnings_100074, z.calc_liable_earnings_ir12_416, z.calc_oth_earner_premium_423, z.calc_oth_earn_prem_gst_100075, z.calc_oth_liable_earn_100079, z.calc_rcl_earner_premium_422, z.childcare_hsekeeper_pd_100038, z.childcare_hsekeeper_reb_100039, z.child_1_date_of_birth_924, z.child_2_date_of_birth_925, z.child_3_date_of_birth_926, z.child_4_date_of_birth_927, z.child_5_date_of_birth_928, z.child_6_date_of_birth_929, z.child_7_date_of_birth_930, z.child_rebate_100035, z.credit_adjustments_957, z.date_marital_change_1_100051, z.date_marital_change_2_100073, z.debit_adjustments_956, z.deemed_loss_102, z.div_rwt_withholding_cr_805, z.doc_attached_1_100058, z.doc_attached_2_100059, z.doc_attached_3_100060, z.doc_attached_4_100061, z.doc_attached_5_100062, z.doc_attached_6_100063, z.doc_attached_7_100064, z.donations_rebate_100037, z.earner_premium_100069, z.earner_premium_payable_425, z.earner_prem_overdeduct_414, z.earnings_ir12_119, z.earnings_ir13_120, z.extra_pay_rebate_100033, z.foreign_disclosure_129, z.foreign_pension_1002, z.frozen_rate_of_nzs_ind_100084, z.fs2_attached_100071, z.fstc_entitlement_ind_100021, z.fstc_marital_change_ind_953, z.fs_assessment_602, z.fs_entitlement_1004, z.fs_paid_by_ird_100080, z.gmfi_entitlement_1007, z.gmfi_inc_in_fam_assmt_y_n_959, z.gross_earnings_407, z.gross_nz_super_100054, z.gross_nz_super__1183, z.gst_on_resid_claims_levy_402, z.half_non_tax_pension_100055, z.iftc_entitlement_1005, z.income_after_expenses_101, z.inc_under_9880_rebate_100032, z.interest_and_dividends_100068, z.interim_repayment_amount_854, z.interim_repayment_option_853, z.ir12_dn_fstc_821, z.ir12_ir13_gross_earnings_820, z.ir12_ir13_total_tax_deds_819, z.ir12_total_deductions_121, z.laqc_loss_144, z.less_repayment_threshold_856, z.liable_earnings_419, z.liable_earnings_ir12_417, z.loss_brought_forward_136, z.loss_claimed_133, z.manual_overide_for_ns60_100085, z.marital_change_1_100050, z.marital_change_2_100072, z.marital_indicator_100049, z.more_acc_periods_100089, z.more_other_iftc_inc_per_100099, z.net_profit_702, z.net_rents_826, z.non_qual_trust_income_723, z.non_resident_ind_100022, z.not_used_100024, z.not_used_100025, z.not_used_100072, z.not_used_100073, z.no_of_wks_full_time_100031, z.ns60_attached_100070, z.number_liable_certs_415, z.number_of_children_936, z.nzs_exemption_100057, z.nzs_recd_period_from_100046, z.nzs_received_period_to_100047, z.nzs_spouses_ird_number_100048, z.nzs_spouses_other_inc_100056, z.nzs_surcharge_704, z.offset_against_sl_849, z.other_iftc_income_ind_100098, z.other_iftc_stop_date_1_100101, z.other_iftc_stop_date_2_100103, z.other_iftc_stop_date_3_100105, z.other_iftc_stop_date_4_100107, z.other_iftc_stop_date_5_100109, z.other_iftc_strt_date_1_100100, z.other_iftc_strt_date_2_100102, z.other_iftc_strt_date_3_100104, z.other_iftc_strt_date_4_100106, z.other_iftc_strt_date_5_100108, z.other_income_827, z.other_income_liable_100087, z.other_rebate_100041, z.other_tax_deductions_801, z.overseas_income_828, z.overseas_tax_credits_107, z.partners_taxable_income_955, z.partner_ird_number_901, z.partner_weeks_100066, z.paye_ep_adjusted_100077, z.pcc_start_date_child_1_939, z.pcc_start_date_child_2_941, z.pcc_start_date_child_3_943, z.pcc_start_date_child_4_945, z.pcc_start_date_child_5_947, z.pcc_start_date_child_6_949, z.pcc_start_date_child_7_951, z.pcc_stop_date_child_1_940, z.pcc_stop_date_child_2_942, z.pcc_stop_date_child_3_944, z.pcc_stop_date_child_4_946, z.pcc_stop_date_child_5_948, z.pcc_stop_date_child_6_950, z.pcc_stop_date_child_7_952, z.pre_encription_check_100018, z.pre_encription_ird_no_100019, z.pre_encription_loc_no_100020, z.principal_carer_weeks_100065, z.principle_child_carer_y_n_958, z.provisional_tax_option_501, z.provisional_tax_payable_502, z.prov_tax_over_payment_504, z.refund_by_cheque_146, z.refund_tax_to_pay_100067, z.refund_tax_to_pay_701, z.residual_claims_levy_ind_418, z.residual_income_tax_108, z.residual_repayment_obl_869, z.return_not_12_months_117, z.rwt_and_other_tax_cr_803, z.shared_cust_agreement_ind_954, z.share_of_imp_credits_705, z.sl_liable_income_868, z.spec_savs_acct_rebate_100040, z.spouse_rcvd_nzs_per_to_100053, z.spouse_received_ns_ind_100169, z.spse_rcvd_nzs_per_from_100052, z.std_disclaimer_applies_100045, z.student_loans_deductions_851, z.taxable_income_109, z.tax_on_taxable_income_721, z.total_donations_paid_100036, z.total_estate_trust_income_806, z.total_expenses_claimed_100026, z.total_fstc_601, z.total_gross_dividends_804, z.total_interest_802, z.total_loss_carried_fwd_114, z.total_partnership_income_808, z.total_partnership_tax_crs_858, z.total_pays_on_ir12_100034, z.total_rebates_703, z.total_shareholder_salary_809, z.total_tax_credits_115, z.total_tax_paid_by_trustees_807, z.tot_family_assistance_ent_603, z.tot_resid_claims_payable_426, z.tot_sls_repmnts_to_ird_100081, z.tot_tax_credits_adj_ep_100078, z.tot_tax_deds_nz_super_1182, z.transfer_to_ird_no_1, z.transfer_to_location_no_2, z.transfer_to_period_3, z.trans_to_ac_earner_prem_100044, z.trans_to_prov_tax_100043, z.under_34200_rebate_100028, z.under_34200_rebate_adj_100027, z.under_38000_rebate_100030, z.under_38000_rebate_adj_100029, z.vet_pens_total_gross_100083, z.vet_pens_total_tax_ded_100082, z.amount_of_transfer_100512, z.calc_total_deductions_100134, z.earnings_not_liable_100187, z.final_dr_cr_1000513, z.fstc_entitlement_ind_1515, z.gross_gri_100493, z.gst_date_supply_100492, z.ird_location_transfer_to_1510, z.ird_no_transfer_to_1509, z.nz_super_100522, z.oseas_liable_earnings_100515, z.other_tax_deductions_799, z.overseas_earner_premium_100516, z.payments_from_ird_1514, z.period_transfer_to_1511, z.previous_issue_date_406, z.previous_notice_type_405, z.previous_premium_amount_404, z.provisional_income_503, z.ptc_entitlment_1508, z.self_employed_cease_date_1470, z.tfr_to_own_student_loan_100511, z.total_family_income_1507, z.total_payments_from_winz_1513, z.tot_w_holding_deducts_800, z.tot_w_holding_payments_100514, z.under_30875_rebate_100028, z.under_30875_rebate_adj_100027, z.veterans_pension_y_n_100523, z.amount_transferred_100537, z.are_you_associated_100572, z.credit_adj_red_of_fit_100540, z.earner_prem_eal_ep_100533, z.empl_prem_ind_levy_ind_100531, z.epr_resid_claim_levy_rt_100532, z.excess_to_emp_over_max_100529, z.fit_payable_100541, z.gst_on_eal_earner_prem_100534, z.ica_closing_balance_nu_100538, z.pay_after_1st_wk_reimb_100528, z.pay_emp_1st_wk_aftr_acc_100527, z.student_loans_deductions_1336, z.taxable_activity_com_dt_100526, z.tax_on_trustee_income_111, z.total_tax_credits_100173, z.tot_eal_earner_prem_lbl_100535, z.tot_earn_lble_for_levy_100530, z.tot_rcl_eal_ep_pbl_sea_100536, z.wpa_closing_balance_nu_100539, z.are_you_associated_sls_100574, z.tot_maori_auth_credits_100585, z.tot_maori_auth_dist_100586, z.allowable_imp_credits_100607, z.ent_early_pymt_disc_yn_100609, z.excess_imp_credits_100608, z.reduced_imp_credits_100606, z.excess_imp_credits_bf_100610, z.in_work_payment_ent_100611, z.date_from_100679, z.date_to_100680, z.fam_total_100700, z.budget_write_off_amount_100702, z.budget_write_off_flag_100701, z.rd_flag_100696, z.rd_tax_credit_100694, z.situation_100693, z.sps_rd_amount_100695, z.fam_tax_credit_ent_100710, z.wff_assessment_100747, z.calc_ietc_credit_100757, z.calc_qualifying_months_100756, z.eligible_ietc_tax_cr_100748, z.num_qualifying_months_100754, z.overseas_income_end_dt_100750, z.overseas_income_st_dt_100749, z.tax_credits_claimed_100755, z.wfftc_ir215_attached_100788, z.intrst_pship_ltc_trust_100789, z.divdnds_pship_ltc_trust_100790, z.total_ltc_tax_credits_100791, z.total_active_ltc_income_100792, z.non_allowble_deductions_100793, z.adjusted_ltc_income_100794, z.futur_shr_employee_slry_100795, z.interim_liable_income_100796, z.sls_null_assmt_ind_100826, z.sl_adjusted_net_income_100831, z.pr_yr_n_allw_ded_claimd_100829, z.net_schedular_payments_100828, z.sl_unusd_repymt_thrshld_100830, z.schedular_expenses_100827, z.overseas_super_lump_sum_100864, z.not_used_100022,z.return_period_year FROM lab_fcp_raw.returns_keypoints_ir3 z
;
DROP VIEW if exists lab_fcp_raw_restricted_access.dss_returns_keypoints_ir3;
CREATE VIEW lab_fcp_raw_restricted_access.dss_returns_keypoints_ir3 AS
SELECT z.ird_number, z.location_number, z.return_period_date, z.return_type, z.return_version_no, z.return_status, z.form_version_no, z.number_of_error_items, z.`timestamp`, z.accounts_included_flag_100023, z.acc_class_number_1_412, z.acc_income_indicator_100088, z.acc_start_date_1_100090, z.acc_start_date_2_100092, z.acc_start_date_3_100094, z.acc_start_date_4_100096, z.acc_stop_date_1_100091, z.acc_stop_date_2_100093, z.acc_stop_date_3_100095, z.acc_stop_date_4_100097, z.ac_premium_excl_gst_401, z.amount_of_transfer_100042, z.assessment_850, z.a_50_oseas_pvt_pension_100086, z.calc_earner_premium_424, z.calc_employer_premium_403, z.calc_emp_earner_exc_gst_420, z.calc_gst_emp_earner_prem_421, z.calc_gst_oth_earn_prem_100076, z.calc_liable_earnings_100074, z.calc_liable_earnings_ir12_416, z.calc_oth_earner_premium_423, z.calc_oth_earn_prem_gst_100075, z.calc_oth_liable_earn_100079, z.calc_rcl_earner_premium_422, z.childcare_hsekeeper_pd_100038, z.childcare_hsekeeper_reb_100039, z.child_1_date_of_birth_924, z.child_2_date_of_birth_925, z.child_3_date_of_birth_926, z.child_4_date_of_birth_927, z.child_5_date_of_birth_928, z.child_6_date_of_birth_929, z.child_7_date_of_birth_930, z.child_rebate_100035, z.credit_adjustments_957, z.date_marital_change_1_100051, z.date_marital_change_2_100073, z.debit_adjustments_956, z.deemed_loss_102, z.div_rwt_withholding_cr_805, z.doc_attached_1_100058, z.doc_attached_2_100059, z.doc_attached_3_100060, z.doc_attached_4_100061, z.doc_attached_5_100062, z.doc_attached_6_100063, z.doc_attached_7_100064, z.donations_rebate_100037, z.earner_premium_100069, z.earner_premium_payable_425, z.earner_prem_overdeduct_414, z.earnings_ir12_119, z.earnings_ir13_120, z.extra_pay_rebate_100033, z.foreign_disclosure_129, z.foreign_pension_1002, z.frozen_rate_of_nzs_ind_100084, z.fs2_attached_100071, z.fstc_entitlement_ind_100021, z.fstc_marital_change_ind_953, z.fs_assessment_602, z.fs_entitlement_1004, z.fs_paid_by_ird_100080, z.gmfi_entitlement_1007, z.gmfi_inc_in_fam_assmt_y_n_959, z.gross_earnings_407, z.gross_nz_super_100054, z.gross_nz_super__1183, z.gst_on_resid_claims_levy_402, z.half_non_tax_pension_100055, z.iftc_entitlement_1005, z.income_after_expenses_101, z.inc_under_9880_rebate_100032, z.interest_and_dividends_100068, z.interim_repayment_amount_854, z.interim_repayment_option_853, z.ir12_dn_fstc_821, z.ir12_ir13_gross_earnings_820, z.ir12_ir13_total_tax_deds_819, z.ir12_total_deductions_121, z.laqc_loss_144, z.less_repayment_threshold_856, z.liable_earnings_419, z.liable_earnings_ir12_417, z.loss_brought_forward_136, z.loss_claimed_133, z.manual_overide_for_ns60_100085, z.marital_change_1_100050, z.marital_change_2_100072, z.marital_indicator_100049, z.more_acc_periods_100089, z.more_other_iftc_inc_per_100099, z.net_profit_702, z.net_rents_826, z.non_qual_trust_income_723, z.non_resident_ind_100022, z.not_used_100024, z.not_used_100025, z.not_used_100072, z.not_used_100073, z.no_of_wks_full_time_100031, z.ns60_attached_100070, z.number_liable_certs_415, z.number_of_children_936, z.nzs_exemption_100057, z.nzs_recd_period_from_100046, z.nzs_received_period_to_100047, z.nzs_spouses_ird_number_100048, z.nzs_spouses_other_inc_100056, z.nzs_surcharge_704, z.offset_against_sl_849, z.other_iftc_income_ind_100098, z.other_iftc_stop_date_1_100101, z.other_iftc_stop_date_2_100103, z.other_iftc_stop_date_3_100105, z.other_iftc_stop_date_4_100107, z.other_iftc_stop_date_5_100109, z.other_iftc_strt_date_1_100100, z.other_iftc_strt_date_2_100102, z.other_iftc_strt_date_3_100104, z.other_iftc_strt_date_4_100106, z.other_iftc_strt_date_5_100108, z.other_income_827, z.other_income_liable_100087, z.other_rebate_100041, z.other_tax_deductions_801, z.overseas_income_828, z.overseas_tax_credits_107, z.partners_taxable_income_955, z.partner_ird_number_901, z.partner_weeks_100066, z.paye_ep_adjusted_100077, z.pcc_start_date_child_1_939, z.pcc_start_date_child_2_941, z.pcc_start_date_child_3_943, z.pcc_start_date_child_4_945, z.pcc_start_date_child_5_947, z.pcc_start_date_child_6_949, z.pcc_start_date_child_7_951, z.pcc_stop_date_child_1_940, z.pcc_stop_date_child_2_942, z.pcc_stop_date_child_3_944, z.pcc_stop_date_child_4_946, z.pcc_stop_date_child_5_948, z.pcc_stop_date_child_6_950, z.pcc_stop_date_child_7_952, z.pre_encription_check_100018, z.pre_encription_ird_no_100019, z.pre_encription_loc_no_100020, z.principal_carer_weeks_100065, z.principle_child_carer_y_n_958, z.provisional_tax_option_501, z.provisional_tax_payable_502, z.prov_tax_over_payment_504, z.refund_by_cheque_146, z.refund_tax_to_pay_100067, z.refund_tax_to_pay_701, z.residual_claims_levy_ind_418, z.residual_income_tax_108, z.residual_repayment_obl_869, z.return_not_12_months_117, z.rwt_and_other_tax_cr_803, z.shared_cust_agreement_ind_954, z.share_of_imp_credits_705, z.sl_liable_income_868, z.spec_savs_acct_rebate_100040, z.spouse_rcvd_nzs_per_to_100053, z.spouse_received_ns_ind_100169, z.spse_rcvd_nzs_per_from_100052, z.std_disclaimer_applies_100045, z.student_loans_deductions_851, z.taxable_income_109, z.tax_on_taxable_income_721, z.total_donations_paid_100036, z.total_estate_trust_income_806, z.total_expenses_claimed_100026, z.total_fstc_601, z.total_gross_dividends_804, z.total_interest_802, z.total_loss_carried_fwd_114, z.total_partnership_income_808, z.total_partnership_tax_crs_858, z.total_pays_on_ir12_100034, z.total_rebates_703, z.total_shareholder_salary_809, z.total_tax_credits_115, z.total_tax_paid_by_trustees_807, z.tot_family_assistance_ent_603, z.tot_resid_claims_payable_426, z.tot_sls_repmnts_to_ird_100081, z.tot_tax_credits_adj_ep_100078, z.tot_tax_deds_nz_super_1182, z.transfer_to_ird_no_1, z.transfer_to_location_no_2, z.transfer_to_period_3, z.trans_to_ac_earner_prem_100044, z.trans_to_prov_tax_100043, z.under_34200_rebate_100028, z.under_34200_rebate_adj_100027, z.under_38000_rebate_100030, z.under_38000_rebate_adj_100029, z.vet_pens_total_gross_100083, z.vet_pens_total_tax_ded_100082, z.amount_of_transfer_100512, z.calc_total_deductions_100134, z.earnings_not_liable_100187, z.final_dr_cr_1000513, z.fstc_entitlement_ind_1515, z.gross_gri_100493, z.gst_date_supply_100492, z.ird_location_transfer_to_1510, z.ird_no_transfer_to_1509, z.nz_super_100522, z.oseas_liable_earnings_100515, z.other_tax_deductions_799, z.overseas_earner_premium_100516, z.payments_from_ird_1514, z.period_transfer_to_1511, z.previous_issue_date_406, z.previous_notice_type_405, z.previous_premium_amount_404, z.provisional_income_503, z.ptc_entitlment_1508, z.self_employed_cease_date_1470, z.tfr_to_own_student_loan_100511, z.total_family_income_1507, z.total_payments_from_winz_1513, z.tot_w_holding_deducts_800, z.tot_w_holding_payments_100514, z.under_30875_rebate_100028, z.under_30875_rebate_adj_100027, z.veterans_pension_y_n_100523, z.amount_transferred_100537, z.are_you_associated_100572, z.credit_adj_red_of_fit_100540, z.earner_prem_eal_ep_100533, z.empl_prem_ind_levy_ind_100531, z.epr_resid_claim_levy_rt_100532, z.excess_to_emp_over_max_100529, z.fit_payable_100541, z.gst_on_eal_earner_prem_100534, z.ica_closing_balance_nu_100538, z.pay_after_1st_wk_reimb_100528, z.pay_emp_1st_wk_aftr_acc_100527, z.student_loans_deductions_1336, z.taxable_activity_com_dt_100526, z.tax_on_trustee_income_111, z.total_tax_credits_100173, z.tot_eal_earner_prem_lbl_100535, z.tot_earn_lble_for_levy_100530, z.tot_rcl_eal_ep_pbl_sea_100536, z.wpa_closing_balance_nu_100539, z.are_you_associated_sls_100574, z.tot_maori_auth_credits_100585, z.tot_maori_auth_dist_100586, z.allowable_imp_credits_100607, z.ent_early_pymt_disc_yn_100609, z.excess_imp_credits_100608, z.reduced_imp_credits_100606, z.excess_imp_credits_bf_100610, z.in_work_payment_ent_100611, z.date_from_100679, z.date_to_100680, z.fam_total_100700, z.budget_write_off_amount_100702, z.budget_write_off_flag_100701, z.rd_flag_100696, z.rd_tax_credit_100694, z.situation_100693, z.sps_rd_amount_100695, z.fam_tax_credit_ent_100710, z.wff_assessment_100747, z.calc_ietc_credit_100757, z.calc_qualifying_months_100756, z.eligible_ietc_tax_cr_100748, z.num_qualifying_months_100754, z.overseas_income_end_dt_100750, z.overseas_income_st_dt_100749, z.tax_credits_claimed_100755, z.wfftc_ir215_attached_100788, z.intrst_pship_ltc_trust_100789, z.divdnds_pship_ltc_trust_100790, z.total_ltc_tax_credits_100791, z.total_active_ltc_income_100792, z.non_allowble_deductions_100793, z.adjusted_ltc_income_100794, z.futur_shr_employee_slry_100795, z.interim_liable_income_100796, z.sls_null_assmt_ind_100826, z.sl_adjusted_net_income_100831, z.pr_yr_n_allw_ded_claimd_100829, z.net_schedular_payments_100828, z.sl_unusd_repymt_thrshld_100830, z.schedular_expenses_100827, z.overseas_super_lump_sum_100864, z.not_used_100022, z.return_period_year  FROM lab_fcp_raw.returns_keypoints_ir3 z LEFT OUTER JOIN prod_raw.dss_special_clients_all sc ON sc.ird_number = z.ird_number WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N'
;
