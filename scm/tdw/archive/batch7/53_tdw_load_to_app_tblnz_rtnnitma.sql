-- Load data manually from RAW TDW tables into RAW START table
select count(1) from  ${var:target_db}.${var:app_tbl_name};

INSERT INTO TABLE  ${var:target_db}.${var:app_tbl_name} 
SELECT
CAST(z.FLNGDOCKEY AS INT) AS flngdockey,
CAST(z.FCURGROSSINTEREST AS DECIMAL(19,4)) AS fcurgrossinterest,
CAST(z.FCURDIVIDENDGROSS AS DECIMAL(19,4)) AS fcurdividendgross,
CAST(z.FCURMAORIDISTRIBUTIONS AS DECIMAL(19,4)) AS fcurmaoridistributions,
CAST(z.FCURNETRENTALINCOME AS DECIMAL(19,4)) AS fcurnetrentalincome,
CAST(z.FCURNETTRADINGINCOME AS DECIMAL(19,4)) AS fcurnettradingincome,
CAST(z.FCUROTHERINCOME AS DECIMAL(19,4)) AS fcurotherincome,
CAST(z.FCURTOTALINCOME AS DECIMAL(19,4)) AS fcurtotalincome,
CAST(z.FCURTOTALADJUSTMENTS AS DECIMAL(19,4)) AS fcurtotaladjustments,
CAST(z.FCURINCOMEAFTERADJUSTMENTS AS DECIMAL(19,4)) AS fcurincomeafteradjustments,
CAST(z.FCURTOTALDONATIONS AS DECIMAL(19,4)) AS fcurtotaldonations,
CAST(z.FCURINCOMEAFTERDONATIONS AS DECIMAL(19,4)) AS fcurincomeafterdonations,
CAST(z.FCURLOSSESBROUGHTFORWARD AS DECIMAL(19,4)) AS fcurlossesbroughtforward,
CAST(z.FCURTAXABLEINCOME AS DECIMAL(19,4)) AS fcurtaxableincome,
CAST(z.FCURTOTALTAXPAYABLE AS DECIMAL(19,4)) AS fcurtotaltaxpayable,
CAST(z.FCUROVERSEASTAX AS DECIMAL(19,4)) AS fcuroverseastax,
CAST(z.FCURTAXAFTEROVERSEAS AS DECIMAL(19,4)) AS fcurtaxafteroverseas,
CAST(z.FCURDIVIDENDIMPUTATION AS DECIMAL(19,4)) AS fcurdividendimputation,
CAST(z.FCURTAXAFTERDIVIDEND AS DECIMAL(19,4)) AS fcurtaxafterdividend,
CAST(z.FCURRWT AS DECIMAL(19,4)) AS fcurrwt,
CAST(z.FCURRLWT AS DECIMAL(19,4)) AS fcurrlwt,
CAST(z.FCURTAXAFTERRWT AS DECIMAL(19,4)) AS fcurtaxafterrwt,
CAST(z.FCURMAORICREDITS AS DECIMAL(19,4)) AS fcurmaoricredits,
CAST(z.FCURRESIDUALINCOMETAX AS DECIMAL(19,4)) AS fcurresidualincometax,
CAST(z.FCURPROVISIONALTAXPAID AS DECIMAL(19,4)) AS fcurprovisionaltaxpaid,
CAST(z.FCURTAXAMOUNT AS DECIMAL(19,4)) AS fcurtaxamount,
CAST(z.FCUROVERPAYMENTPROVISIONAL AS DECIMAL(19,4)) AS fcuroverpaymentprovisional,
CAST(z.FCURREFUNDAFTEROVERPAYMENT AS DECIMAL(19,4)) AS fcurrefundafteroverpayment,
CAST(z.FCURTRANSFERPROVISIONAL AS DECIMAL(19,4)) AS fcurtransferprovisional,
CAST(z.FCURTRANSFERCUSTOMERAMOUNT AS DECIMAL(19,4)) AS fcurtransfercustomeramount,
CAST(z.FCURTOTALREFUND AS DECIMAL(19,4)) AS fcurtotalrefund,
CAST(z.FDTMPROVISIONALSTARTDATE AS TIMESTAMP) AS fdtmprovisionalstartdate,
CAST(z.FSTRPROVISIONALOPTION AS VARCHAR(100)) AS fstrprovisionaloption,
CAST(z.FCURPROVISIONALTAX AS DECIMAL(19,4)) AS fcurprovisionaltax,
CAST(z.FBLNCFC AS SMALLINT) AS fblncfc,
CAST(z.FCURLOSSTOCARRYFORWARD AS DECIMAL(19,4)) AS fcurlosstocarryforward,
CAST(z.FCUREXCESSIMPUTATION AS DECIMAL(19,4)) AS fcurexcessimputation,
CAST(z.FCUREXCESSIMPUTATIONASLOSS AS DECIMAL(19,4)) AS fcurexcessimputationasloss,
case when z.CURRENT_REC_FLAG='Y' then a.fstrResMethod
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurResIncome
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurResDeductionsClaimed
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
case when z.CURRENT_REC_FLAG='Y' then a.fcurResDeductionsForward
else null
end
,
case when z.CURRENT_REC_FLAG='Y' then a.fcurResNetIncome
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
CAST(z.effective_from AS TIMESTAMP) AS fdtmwhen,
CAST(z.FSTRWHO AS VARCHAR(20)) AS fstrwho,
CAST(z.record_effective_timestamp AS TIMESTAMP) AS record_effective_timestamp,
CAST(z.record_expiry_timestamp AS TIMESTAMP) AS record_expiry_timestamp,
CAST(z.CURRENT_REC_FLAG AS VARCHAR(1)) AS record_active_flag,
CAST('N' AS VARCHAR(1)) AS record_deleted_flag,
CAST(z.insert_object_run_key AS INT) AS insert_object_run_key,
CAST(z.update_object_run_key AS INT) AS update_object_run_key
FROM  ${var:target_db}.${var:tdw_tbl_name} z
left outer join ${var:target_db}.app_tblnz_rtnnitma_${var:yyyymmdd} a
on CAST(z.FLNGdocKEY AS INT) =a.flngdockey;

-- Check row counts of RAW tables with TDW history loaded:
select count(1) as fstrresmethodcnt from ${var:target_db}.${var:app_tbl_name} where fstrResMethod='I';
select count(*) as raw_new_count from  ${var:target_db}.${var:app_tbl_name};
select count(distinct flngdockey) as distinct_keys_count FROM  ${var:target_db}.${var:app_tbl_name};
select count(*) as low_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_effective_timestamp = '1800-01-01 00:00:00';
select count(*) as high_date_count FROM  ${var:target_db}.${var:app_tbl_name} where record_expiry_timestamp = '9000-12-31 00:00:00';
select count(1) as lwmcnt from ${var:target_db}.${var:app_tbl_name} where fdtmwhen='1800-1-1';
drop table if exists prod_jnl.${var:app_tbl_name};
