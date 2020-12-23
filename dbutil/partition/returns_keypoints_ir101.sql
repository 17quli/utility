CREATE TABLE lab_fcp_raw.ptn_returns_keypoints_ir101 (
  ird_number INT,
  location_number INT,
  return_period_date TIMESTAMP,
  return_type VARCHAR(10),
  return_version_no INT,
  return_status VARCHAR(2),
  form_version_no INT,
  number_of_error_items INT,
  `timestamp` TIMESTAMP,
  adjustments_1206 DECIMAL(16,2),
  calculation_of_expenses_1209 DECIMAL(16,2),
  calculation_of_income_1204 DECIMAL(16,2),
  credit_adjustments_1210 DECIMAL(16,2),
  gst_on_fringe_benefits_1205 DECIMAL(16,2),
  gst_on_purchs_and_exs_1211 DECIMAL(16,2),
  gst_on_sales_and_income_1207 DECIMAL(16,2),
  gst_to_pay_refund_1212 DECIMAL(16,2),
  pre_encription_check_100018 VARCHAR(8),
  pre_encription_ird_no_100019 INT,
  pre_encription_loc_no_100020 INT,
  total_purchases_expenses_1208 DECIMAL(16,2),
  total_sales_and_income_1201 DECIMAL(16,2),
  total_taxable_supplies_1203 DECIMAL(16,2),
  zero_rated_supplies_1202 DECIMAL(16,2),
  acct_rev_flag_100668 VARCHAR(2),
  asset_sal_ovr_1000_100660 DECIMAL(16,2),
  comp_and_volnt_prov_tax_100663 DECIMAL(16,2),
  gst_and_prov_tax_payble_100667 DECIMAL(16,2),
  gst_liability_100666 DECIMAL(16,2),
  gst_rfnd_trans_prov_tax_100664 DECIMAL(16,2),
  prov_tax_les_gst_re_xfr_100665 DECIMAL(16,2),
  prv_tax_inst_due_100662 DECIMAL(16,2),
  sale_inc_frm_prior_mnth_100656 DECIMAL(16,2),
  sal_and_inc_all_br_100659 DECIMAL(16,2),
  sal_and_inc_frm_all_br_100658 DECIMAL(16,2),
  sal_and_inc_les_ast_sal_100661 DECIMAL(16,2),
  sum_sal_inc_this_last_100657 DECIMAL(16,2),
  tot_sal_inc_this_prd_100655 DECIMAL(16,2),
  adjustmnts_amt_12_5_pct_100638 DECIMAL(16,2),
  adjustmnts_amt_15_pct_100692 DECIMAL(16,2),
  calc_of_exp_12_5_pct_100765 DECIMAL(16,2),
  calc_of_exp_15_pct_100766 DECIMAL(16,2),
  calc_of_income_12_5_pct_100767 DECIMAL(16,2),
  calc_of_income_15_pct_100768 DECIMAL(16,2),
  credit_adj_12_5_pct_100769 DECIMAL(16,2),
  credit_adj_15_pct_100770 DECIMAL(16,2),
  gst_purch_exps_12_5_pct_100771 DECIMAL(16,2),
  gst_purch_exps_15_pct_100772 DECIMAL(16,2),
  gst_sales_inc_12_5_pct_100773 DECIMAL(16,2),
  gst_sales_inc_15_pct_100774 DECIMAL(16,2),
  tot_purch_exp_12_5_pct_100775 DECIMAL(16,2),
  tot_purch_exp_15_pct_100776 DECIMAL(16,2),
  tot_sales_inc_12_5_pct_100777 DECIMAL(16,2),
  tot_sales_inc_15_pct_100778 DECIMAL(16,2),
  tot_taxble_sup_12_5_pct_100779 DECIMAL(16,2),
  tot_taxble_sup_15_pct_100780 DECIMAL(16,2),
  zro_rtd_sup_12_5_pct_100781 DECIMAL(16,2),
  zro_rtd_sup_15_pct_100782 DECIMAL(16,2)
)
partitioned by (return_period_year bigint)
STORED AS PARQUET;

insert into lab_fcp_raw.ptn_returns_keypoints_ir101 partition(return_period_year)
select z.* ,extract(year from z.return_period_date) 
from lab_fcp_raw.returns_keypoints_ir101 z;

compute incremental stats lab_fcp_raw.ptn_returns_keypoints_ir101;

select count(1) from lab_fcp_raw.returns_keypoints_ir101;
select count(1) from lab_fcp_raw.ptn_returns_keypoints_ir101;

--recreate views
DROP VIEW if exists lab_fcp_raw_full_access.dss_returns_keypoints_ir101;
CREATE VIEW lab_fcp_raw_full_access.dss_returns_keypoints_ir101 AS
SELECT z.ird_number, z.location_number, z.return_period_date, z.return_type, z.return_version_no, z.return_status, z.form_version_no, z.number_of_error_items, z.`timestamp`, z.adjustments_1206, z.calculation_of_expenses_1209, z.calculation_of_income_1204, z.credit_adjustments_1210, z.gst_on_fringe_benefits_1205, z.gst_on_purchs_and_exs_1211, z.gst_on_sales_and_income_1207, z.gst_to_pay_refund_1212, z.pre_encription_check_100018, z.pre_encription_ird_no_100019, z.pre_encription_loc_no_100020, z.total_purchases_expenses_1208, z.total_sales_and_income_1201, z.total_taxable_supplies_1203, z.zero_rated_supplies_1202, z.acct_rev_flag_100668, z.asset_sal_ovr_1000_100660, z.comp_and_volnt_prov_tax_100663, z.gst_and_prov_tax_payble_100667, z.gst_liability_100666, z.gst_rfnd_trans_prov_tax_100664, z.prov_tax_les_gst_re_xfr_100665, z.prv_tax_inst_due_100662, z.sale_inc_frm_prior_mnth_100656, z.sal_and_inc_all_br_100659, z.sal_and_inc_frm_all_br_100658, z.sal_and_inc_les_ast_sal_100661, z.sum_sal_inc_this_last_100657, z.tot_sal_inc_this_prd_100655, z.adjustmnts_amt_12_5_pct_100638, z.adjustmnts_amt_15_pct_100692, z.calc_of_exp_12_5_pct_100765, z.calc_of_exp_15_pct_100766, z.calc_of_income_12_5_pct_100767, z.calc_of_income_15_pct_100768, z.credit_adj_12_5_pct_100769, z.credit_adj_15_pct_100770, z.gst_purch_exps_12_5_pct_100771, z.gst_purch_exps_15_pct_100772, z.gst_sales_inc_12_5_pct_100773, z.gst_sales_inc_15_pct_100774, z.tot_purch_exp_12_5_pct_100775, z.tot_purch_exp_15_pct_100776, z.tot_sales_inc_12_5_pct_100777, z.tot_sales_inc_15_pct_100778, z.tot_taxble_sup_12_5_pct_100779, z.tot_taxble_sup_15_pct_100780, z.zro_rtd_sup_12_5_pct_100781, z.zro_rtd_sup_15_pct_100782,z.return_period_year FROM lab_fcp_raw.returns_keypoints_ir101 z
;
DROP VIEW if exists lab_fcp_raw_restricted_access.dss_returns_keypoints_ir101;
CREATE VIEW lab_fcp_raw_restricted_access.dss_returns_keypoints_ir101 AS
SELECT z.ird_number, z.location_number, z.return_period_date, z.return_type, z.return_version_no, z.return_status, z.form_version_no, z.number_of_error_items, z.`timestamp`, z.adjustments_1206, z.calculation_of_expenses_1209, z.calculation_of_income_1204, z.credit_adjustments_1210, z.gst_on_fringe_benefits_1205, z.gst_on_purchs_and_exs_1211, z.gst_on_sales_and_income_1207, z.gst_to_pay_refund_1212, z.pre_encription_check_100018, z.pre_encription_ird_no_100019, z.pre_encription_loc_no_100020, z.total_purchases_expenses_1208, z.total_sales_and_income_1201, z.total_taxable_supplies_1203, z.zero_rated_supplies_1202, z.acct_rev_flag_100668, z.asset_sal_ovr_1000_100660, z.comp_and_volnt_prov_tax_100663, z.gst_and_prov_tax_payble_100667, z.gst_liability_100666, z.gst_rfnd_trans_prov_tax_100664, z.prov_tax_les_gst_re_xfr_100665, z.prv_tax_inst_due_100662, z.sale_inc_frm_prior_mnth_100656, z.sal_and_inc_all_br_100659, z.sal_and_inc_frm_all_br_100658, z.sal_and_inc_les_ast_sal_100661, z.sum_sal_inc_this_last_100657, z.tot_sal_inc_this_prd_100655, z.adjustmnts_amt_12_5_pct_100638, z.adjustmnts_amt_15_pct_100692, z.calc_of_exp_12_5_pct_100765, z.calc_of_exp_15_pct_100766, z.calc_of_income_12_5_pct_100767, z.calc_of_income_15_pct_100768, z.credit_adj_12_5_pct_100769, z.credit_adj_15_pct_100770, z.gst_purch_exps_12_5_pct_100771, z.gst_purch_exps_15_pct_100772, z.gst_sales_inc_12_5_pct_100773, z.gst_sales_inc_15_pct_100774, z.tot_purch_exp_12_5_pct_100775, z.tot_purch_exp_15_pct_100776, z.tot_sales_inc_12_5_pct_100777, z.tot_sales_inc_15_pct_100778, z.tot_taxble_sup_12_5_pct_100779, z.tot_taxble_sup_15_pct_100780, z.zro_rtd_sup_12_5_pct_100781, z.zro_rtd_sup_15_pct_100782,z.return_period_year FROM lab_fcp_raw.returns_keypoints_ir101 z LEFT OUTER JOIN prod_raw.dss_special_clients_all sc ON sc.ird_number = z.ird_number WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N'
;
