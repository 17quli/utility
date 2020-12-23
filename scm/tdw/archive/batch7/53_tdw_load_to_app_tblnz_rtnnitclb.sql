-- Load data manually from RAW TDW tables into RAW START table
select count(1) from  ${var:target_db}.${var:app_tbl_name};

INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name} 
SELECT
CAST(z.FLNGDOCKEY AS INT) AS flngDocKey,
CAST(z.FBLNFRIENDLYSOCIETY AS SMALLINT) AS fblnFriendlySociety,
CAST(z.FCURFRIENDLYNETINCOME AS DECIMAL(19,4)) AS fcurFriendlyNetIncome,
CAST(z.FBLNSPECIFIC AS SMALLINT) AS fblnSpecific,
CAST(z.FCUREXEMPTINTEREST AS DECIMAL(19,4)) AS fcurExemptInterest,
CAST(z.FCUREXEMPTDIVIDENDS AS DECIMAL(19,4)) AS fcurExemptDividends,
CAST(z.FCUREXEMPTMAORIAUTHORITY AS DECIMAL(19,4)) AS fcurExemptMaoriAuthority,
CAST(z.FCUREXEMPTOTHERINCOME AS DECIMAL(19,4)) AS fcurExemptOtherIncome,
CAST(z.FCUREXEMPTTOTALINCOME AS DECIMAL(19,4)) AS fcurExemptTotalIncome,
CAST(z.FBLNOTHER AS SMALLINT) AS fblnOther,
CAST(z.FCUROTHERINTEREST AS DECIMAL(19,4)) AS fcurOtherInterest,
CAST(z.FCUROTHERDIVIDENDS AS DECIMAL(19,4)) AS fcurOtherDividends,
CAST(z.FCUROTHERMAORIAUTHORITY AS DECIMAL(19,4)) AS fcurOtherMaoriAuthority,
CAST(z.FCUROTHEROTHERINCOME AS DECIMAL(19,4)) AS fcurOtherOtherIncome,
CAST(z.FCUROTHERTOTALINCOME AS DECIMAL(19,4)) AS fcurOtherTotalIncome,
CAST(z.FCURNONPROFITCREDIT AS DECIMAL(19,4)) AS fcurNonProfitCredit,
CAST(z.FCURTOTALINCOMEAFTERNONPROFIT AS DECIMAL(19,4)) AS fcurTotalIncomeAfterNonProfit,
CAST(z.FCURNETINCOMEBEFOREDONATIONS AS DECIMAL(19,4)) AS fcurNetIncomeBeforeDonations,
CAST(z.FCURDONATIONDEDUCTION AS DECIMAL(19,4)) AS fcurDonationDeduction,
CAST(z.FCURNETINCOME AS DECIMAL(19,4)) AS fcurNetIncome,
CAST(z.FCURNETLOSSBROUGHTFORWARD AS DECIMAL(19,4)) AS fcurNetLossBroughtForward,
CAST(z.FCURTAXABLEINCOME AS DECIMAL(19,4)) AS fcurTaxableIncome,
CAST(z.FBLNINCORPORATED AS SMALLINT) AS fblnIncorporated,
CAST(z.FCURTAXONAMOUNT AS DECIMAL(19,4)) AS fcurTaxOnAmount,
CAST(z.FCUROVERSEASTAX AS DECIMAL(19,4)) AS fcurOverseasTax,
CAST(z.FCURTAXAFTEROVERSEAS AS DECIMAL(19,4)) AS fcurTaxAfterOverseas,
CAST(z.FCURIMPUTATIONCREDITS AS DECIMAL(19,4)) AS fcurImputationCredits,
CAST(z.FCURIMPUTATIONBROUGHTFORWARD AS DECIMAL(19,4)) AS fcurImputationBroughtForward,
CAST(z.FCURTOTALIMPUTATIONCREDITS AS DECIMAL(19,4)) AS fcurTotalImputationCredits,
CAST(z.FCUREXCESSIMPUTATIONCREDITS AS DECIMAL(19,4)) AS fcurExcessImputationCredits,
CAST(z.FCUREXCESSIMPCREDITSCARRYFWD AS DECIMAL(19,4)) AS fcurExcessImpCreditsCarryFwd,
CAST(z.FCUREXCESSIMPCREDITSASLOSS AS DECIMAL(19,4)) AS fcurExcessImpCreditsAsLoss,
CAST(z.FCURTAXAFTERIMPUTATION AS DECIMAL(19,4)) AS fcurTaxAfterImputation,
CAST(z.FCURTOTALLOSSTOCARRYFORWARD AS DECIMAL(19,4)) AS fcurTotalLossToCarryForward,
CAST(z.FCURRWT AS DECIMAL(19,4)) AS fcurRWT,
CAST(z.FCURRLWT AS DECIMAL(19,4)) AS fcurRLWT,
CAST(z.FCURTAXAFTERRWT AS DECIMAL(19,4)) AS fcurTaxAfterRWT,
CAST(z.FCUROTHERTAXCREDITS AS DECIMAL(19,4)) AS fcurOtherTaxCredits,
CAST(z.FCURRESIDUALINCOMETAX AS DECIMAL(19,4)) AS fcurResidualIncomeTax,
CAST(z.FCURPROVISIONALTAXPAID AS DECIMAL(19,4)) AS fcurProvisionalTaxPaid,
CAST(z.FCURTAXAMOUNT AS DECIMAL(19,4)) AS fcurTaxAmount,
CAST(z.FCUROVERPAYMENTPROVISIONAL AS DECIMAL(19,4)) AS fcurOverpaymentProvisional,
CAST(z.FCURREFUNDAFTEROVERPAYMENT AS DECIMAL(19,4)) AS fcurRefundAfterOverpayment,
CAST(z.FCURTRANSFERPROVISIONAL AS DECIMAL(19,4)) AS fcurTransferProvisional,
CAST(z.FCURTRANSFERCUSTOMERAMOUNT AS DECIMAL(19,4)) AS fcurTransferCustomerAmount,
CAST(z.FCURTOTALREFUND AS DECIMAL(19,4)) AS fcurTotalRefund,
CAST(z.FDTMPROVISIONALSTARTDATE AS TIMESTAMP) AS fdtmProvisionalStartDate,
CAST(z.FSTRPROVISIONALOPTION AS VARCHAR(100)) AS fstrProvisionalOption,
CAST(z.FCURPROVISIONALTAX AS DECIMAL(19,4)) AS fcurProvisionalTax,
case when z.CURRENT_REC_FLAG='Y' then a.fstrResMethod
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurResIncome
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurResDeductions
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurResDeductionsPriorYear
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurResDeductionsClaimed
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurResNetIncome
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurResDeductionsForward
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurRDICarryForwardCurrentYear
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurRDICarryForwardRemaining
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurPropertyProfitLoss
else null
end
,
CAST(z.FSTRWHO AS VARCHAR(20)) AS fstrWho,
CAST(z.effective_from AS TIMESTAMP) AS fdtmwhen,
CAST(z.record_effective_timestamp AS TIMESTAMP) AS record_effective_timestamp,
CAST(z.record_expiry_timestamp AS TIMESTAMP) AS record_expiry_timestamp,
CAST(z.CURRENT_REC_FLAG AS VARCHAR(1)) AS record_active_flag,
CAST('N' AS VARCHAR(1)) AS record_deleted_flag,
CAST(z.insert_object_run_key AS INT) AS insert_object_run_key,
CAST(z.update_object_run_key AS INT) AS update_object_run_key
FROM  ${var:target_db}.${var:tdw_tbl_name} z
left outer join ${var:target_db}.app_tblnz_rtnnitclb_${var:yyyymmdd} a
on CAST(z.FLNGdocKEY AS INT) =a.flngdockey; 

-- Check row counts of RAW tables with TDW history loaded:
select count(1) as fstrresmethodcnt from ${var:target_db}.${var:app_tbl_name} where fstrResMethod='I';
select count(*) as raw_new_count from  ${var:target_db}.${var:app_tbl_name};
select count(distinct flngdockey) as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};
select count(*) as low_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_effective_timestamp = '1800-01-01 00:00:00';
select count(*) as high_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_expiry_timestamp = '9000-12-31 00:00:00';
select count(1) as lwmcnt from ${var:target_db}.${var:app_tbl_name} where fdtmwhen='1800-1-1';
drop table if exists prod_jnl.${var:app_tbl_name};
