CREATE TABLE lab_fcp_raw.ptn_crown_sl_outstanding_balances (
  ird_number INT,
  location_number INT,
  cal_loan_balance_amount DECIMAL(16,2),
  cab_period_balance_amount DECIMAL(16,2),
  current_interest_amount DECIMAL(16,2),
  accruing_interest_writeoff_amt DECIMAL(16,2),
  total_loan_balance_amount DECIMAL(16,2),
  first_extraction_date TIMESTAMP,
  edw_load_date TIMESTAMP
)
partitioned by (year_month int)
STORED AS PARQUET;

insert into lab_fcp_raw.ptn_crown_sl_outstanding_balances 
(
year_month,
ird_number,
location_number,
cal_loan_balance_amount,
cab_period_balance_amount,
current_interest_amount,
accruing_interest_writeoff_amt,
total_loan_balance_amount,
first_extraction_date,
edw_load_date
)
select  
year_month,
ird_number,
location_number,
cal_loan_balance_amount,
cab_period_balance_amount,
current_interest_amount,
accruing_interest_writeoff_amt,
total_loan_balance_amount,
first_extraction_date,
edw_load_date
from lab_fcp_raw.crown_sl_outstanding_balances ;

compute incremental stats lab_fcp_raw.ptn_crown_sl_outstanding_balances;

--recreate views
DROP VIEW if exists lab_fcp_raw_full_access.mrt_crown_sl_outstanding_blnc;
CREATE VIEW lab_fcp_raw_full_access.mrt_crown_sl_outstanding_blnc AS
SELECT z.YEAR_MONTH, z.IRD_NUMBER, z.LOCATION_NUMBER, z.CAL_LOAN_BALANCE_AMOUNT, z.CAB_PERIOD_BALANCE_AMOUNT, z.CURRENT_INTEREST_AMOUNT, z.ACCRUING_INTEREST_WRITEOFF_AMT, z.TOTAL_LOAN_BALANCE_AMOUNT, z.FIRST_EXTRACTION_DATE, z.EDW_LOAD_DATE FROM lab_fcp_raw.crown_sl_outstanding_balances z
;
DROP VIEW if exists lab_fcp_raw_restricted_access.mrt_crown_sl_outstanding_blnc;
CREATE VIEW lab_fcp_raw_restricted_access.mrt_crown_sl_outstanding_blnc AS
SELECT z.YEAR_MONTH, z.IRD_NUMBER, z.LOCATION_NUMBER, z.CAL_LOAN_BALANCE_AMOUNT, z.CAB_PERIOD_BALANCE_AMOUNT, z.CURRENT_INTEREST_AMOUNT, z.ACCRUING_INTEREST_WRITEOFF_AMT, z.TOTAL_LOAN_BALANCE_AMOUNT, z.FIRST_EXTRACTION_DATE, z.EDW_LOAD_DATE FROM lab_fcp_raw.crown_sl_outstanding_balances z LEFT OUTER JOIN dev_raw.app_tblcustomerinfo ci ON CAST(ci.fstrid AS INT) = CAST(z.IRD_NUMBER AS INT) WHERE ci.fstridtype = 'IRD' AND ci.record_active_flag = 'Y' AND ci.record_deleted_flag = 'N' AND nvl(ci.fstrCustomerLevel, 'STD') = 'STD'
;
