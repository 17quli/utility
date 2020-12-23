CREATE TABLE lab_fcp_raw.ptn_client_inc_indicators (
  ird_number INT,
  location_number INT,
  tax_type VARCHAR(6),
  return_period_date TIMESTAMP,
  return_type VARCHAR(10),
  account_no INT,
  provisional_tax_ind_code INT,
  balance_date INT,
  `timestamp` TIMESTAMP,
  first_ks_contribution_date TIMESTAMP,
  total_assessment_amt DECIMAL(16,2),
  total_penalty_amt DECIMAL(16,2),
  total_interest_amt DECIMAL(16,2),
  total_payment_amt DECIMAL(16,2),
  total_refund_amt DECIMAL(16,2),
  total_balance_amt DECIMAL(16,2),
  total_active_disbursement_amt DECIMAL(16,2),
  total_oth_miscellaneous_amt DECIMAL(16,2),
  total_auto_writeoff_amt DECIMAL(16,2),
  total_credit_xfer_amt DECIMAL(16,2),
  total_os_xfer_amt DECIMAL(16,2),
  total_gross_earning_amt DECIMAL(16,2),
  total_late_filing_penalty_amt DECIMAL(16,2),
  total_shortfall_penalty_amt DECIMAL(16,2),
  total_credit_hold_amt DECIMAL(16,2),
  total_returned_credit_amt DECIMAL(16,2),
  tot_oth_pty_unrecoverable_amt DECIMAL(16,2),
  tot_crown_unrecoverable_amt DECIMAL(16,2),
  total_non_payment_penalty_amt DECIMAL(16,2),
  non_payment_penalty_indicator INT,
  non_payment_penalty_date TIMESTAMP,
  arrangement_begin_date TIMESTAMP,
  last_penalty_and_interest_date TIMESTAMP,
  manual_p_and_i_indicator INT,
  deferral_indicator VARCHAR(2),
  last_used_sequence_number INT,
  student_loan_summary_amt DECIMAL(16,2)
)
partitioned by (return_period_year bigint)
STORED AS PARQUET;

insert into lab_fcp_raw.ptn_client_inc_indicators partition(return_period_year)
select z.* ,extract(year from z.return_period_date) 
from lab_fcp_raw.client_inc_indicators z;

compute incremental stats lab_fcp_raw.ptn_client_inc_indicators;

select count(1) from lab_fcp_raw.client_inc_indicators;
select count(1) from lab_fcp_raw.ptn_client_inc_indicators;

--recreate views
DROP VIEW if exists lab_fcp_raw_full_access.dss_client_inc_indicators;
CREATE VIEW lab_fcp_raw_full_access.dss_client_inc_indicators AS
SELECT z.ird_number, z.location_number, z.tax_type, z.return_period_date, z.return_type, z.account_no, z.provisional_tax_ind_code, z.balance_date, z.`timestamp`, z.first_ks_contribution_date, z.total_assessment_amt, z.total_penalty_amt, z.total_interest_amt, z.total_payment_amt, z.total_refund_amt, z.total_balance_amt, z.total_active_disbursement_amt, z.total_oth_miscellaneous_amt, z.total_auto_writeoff_amt, z.total_credit_xfer_amt, z.total_os_xfer_amt, z.total_gross_earning_amt, z.total_late_filing_penalty_amt, z.total_shortfall_penalty_amt, z.total_credit_hold_amt, z.total_returned_credit_amt, z.tot_oth_pty_unrecoverable_amt, z.tot_crown_unrecoverable_amt, z.total_non_payment_penalty_amt, z.non_payment_penalty_indicator, z.non_payment_penalty_date, z.arrangement_begin_date, z.last_penalty_and_interest_date, z.manual_p_and_i_indicator, z.deferral_indicator, z.last_used_sequence_number, z.student_loan_summary_amt,z.return_period_year FROM lab_fcp_raw.client_inc_indicators z;

DROP VIEW if exists lab_fcp_raw_restricted_access.dss_client_inc_indicators;
CREATE VIEW lab_fcp_raw_restricted_access.dss_client_inc_indicators AS
SELECT z.ird_number, z.location_number, z.tax_type, z.return_period_date, z.return_type, z.account_no, z.provisional_tax_ind_code, z.balance_date, z.`timestamp`, z.first_ks_contribution_date, z.total_assessment_amt, z.total_penalty_amt, z.total_interest_amt, z.total_payment_amt, z.total_refund_amt, z.total_balance_amt, z.total_active_disbursement_amt, z.total_oth_miscellaneous_amt, z.total_auto_writeoff_amt, z.total_credit_xfer_amt, z.total_os_xfer_amt, z.total_gross_earning_amt, z.total_late_filing_penalty_amt, z.total_shortfall_penalty_amt, z.total_credit_hold_amt, z.total_returned_credit_amt, z.tot_oth_pty_unrecoverable_amt, z.tot_crown_unrecoverable_amt, z.total_non_payment_penalty_amt, z.non_payment_penalty_indicator, z.non_payment_penalty_date, z.arrangement_begin_date, z.last_penalty_and_interest_date, z.manual_p_and_i_indicator, z.deferral_indicator, z.last_used_sequence_number, z.student_loan_summary_amt,z.return_period_year FROM lab_fcp_raw.client_inc_indicators z LEFT OUTER JOIN prod_raw.dss_special_clients_all sc ON sc.ird_number = z.ird_number WHERE nvl(sc.special_classification, 'STD') = 'STD' AND nvl(sc.record_active_flag, 'Y') = 'Y' AND nvl(sc.record_deleted_flag, 'N') = 'N';
