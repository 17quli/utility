-- Load data manually from RAW TDW tables into RAW START table
select count(1) from  ${var:target_db}.${var:app_tbl_name};

INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name} 
SELECT
CAST(z.FLNGDOCKEY AS INT) AS flngDocKey,
CAST(z.FCURSCHEDULARTAX AS DECIMAL(19,4)) AS fcurSchedularTax,
CAST(z.FCURSCHEDULARPAYMENTS AS DECIMAL(19,4)) AS fcurSchedularPayments,
CAST(z.FCURRWT AS DECIMAL(19,4)) AS fcurRWT,
CAST(z.FCURGROSSINTEREST AS DECIMAL(19,4)) AS fcurGrossInterest,
CAST(z.FCURDIVIDENDIMPUTATION AS DECIMAL(19,4)) AS fcurDividendImputation,
CAST(z.FCURDIVIDENDRWT AS DECIMAL(19,4)) AS fcurDividendRWT,
CAST(z.FCURDIVIDENDGROSS AS DECIMAL(19,4)) AS fcurDividendGross,
CAST(z.FCURMAORICREDITS AS DECIMAL(19,4)) AS fcurMaoriCredits,
CAST(z.FCURMAORIDISTRIBUTIONS AS DECIMAL(19,4)) AS fcurMaoriDistributions,
CAST(z.FCURTRUSTCREDITS AS DECIMAL(19,4)) AS fcurTrustCredits,
CAST(z.FCURTRUSTINCOME AS DECIMAL(19,4)) AS fcurTrustIncome,
CAST(z.FCURLTCCREDITS AS DECIMAL(19,4)) AS fcurLTCCredits,
CAST(z.FCURLTCACTIVEINCOME AS DECIMAL(19,4)) AS fcurLTCActiveIncome,
CAST(z.FCURLTCDEDUCTIONS AS DECIMAL(19,4)) AS fcurLTCDeductions,
CAST(z.FCURLTCPRIORDEDUCTIONS AS DECIMAL(19,4)) AS fcurLTCPriorDeductions,
CAST(z.FCURLTCADJUSTEDINCOME AS DECIMAL(19,4)) AS fcurLTCAdjustedIncome,
CAST(z.FCUROVERSEASTAX AS DECIMAL(19,4)) AS fcurOverseasTax,
CAST(z.FCUROVERSEASINCOME AS DECIMAL(19,4)) AS fcurOverseasIncome,
CAST(z.FCURBUSINESSINCOME AS DECIMAL(19,4)) AS fcurBusinessIncome,
CAST(z.FCURRENTALINCOME AS DECIMAL(19,4)) AS fcurRentalIncome,
CAST(z.FCURTOTALOTHERINCOME AS DECIMAL(19,4)) AS fcurTotalOtherIncome,
CAST(z.FCURRLWT AS DECIMAL(19,4)) AS fcurRLWT,
CAST(z.FCURTOTALINCOME AS DECIMAL(19,4)) AS fcurTotalIncome,
CAST(z.FCUREXPENSESCLAIMED AS DECIMAL(19,4)) AS fcurExpensesClaimed,
CAST(z.FCURINCOMEAFTEREXPENSES AS DECIMAL(19,4)) AS fcurIncomeAfterExpenses,
CAST(z.FCUREXTINGUISHEDLOSSES AS DECIMAL(19,4)) AS fcurExtinguishedLosses,
CAST(z.FCURPRIORDEDUCTIONS AS DECIMAL(19,4)) AS fcurPriorDeductions,
CAST(z.FCURDEDUCTIONSCLAIMED AS DECIMAL(19,4)) AS fcurDeductionsClaimed,
a.fstrResMethod AS fstrResMethod,
a.fcurResIncome AS fcurResIncome,
a.fcurResDeductions AS fcurResDeductions,
CAST(z.FBLNLTC AS SMALLINT) AS fblnLTC,
CAST(z.FBLNPARTNERSHIP AS SMALLINT) AS fblnPartnership,
a.fcurSaleOfProperty AS fcurSaleOfProperty,
CAST(z.FSTRWHO AS VARCHAR(20)) AS fstrWho,
CAST(z.record_effective_timestamp AS TIMESTAMP) AS fdtmwhen,
CAST(z.record_effective_timestamp AS TIMESTAMP) AS record_effective_timestamp,
CAST(z.record_expiry_timestamp AS TIMESTAMP) AS record_expiry_timestamp,
CAST(z.CURRENT_REC_FLAG AS VARCHAR(1)) AS record_active_flag,
CAST('N' AS VARCHAR(1)) AS record_deleted_flag,
CAST(z.insert_object_run_key AS INT) AS insert_object_run_key,
CAST(z.update_object_run_key AS INT) AS update_object_run_key
FROM  ${var:target_db}.${var:tdw_tbl_name} z
left outer join ${var:target_db}.app_tblnz_rtnnitprt_${var:yyyymmdd} a
on CAST(z.FLNGdocKEY AS INT) =a.flngdockey;

-- Check row counts of RAW tables with TDW history loaded:
select count(1) as fstrresmethodcnt from ${var:target_db}.${var:app_tbl_name} where fstrResMethod='I';
select count(*) as raw_new_count from  ${var:target_db}.${var:app_tbl_name};
select count(distinct flngdockey) as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};
select count(*) as low_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_effective_timestamp = '1800-01-01 00:00:00';
select count(*) as high_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_expiry_timestamp = '9000-12-31 00:00:00';
