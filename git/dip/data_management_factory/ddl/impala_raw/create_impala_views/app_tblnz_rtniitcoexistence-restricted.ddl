CREATE VIEW ${VAR:view_db}.app_tblnz_rtniitcoexistence
AS SELECT
z.flngReturnKey,
z.flngVerLast,
z.fdtmSentToFIRST,
z.flngDocKey,
z.fstrStatus,
z.fstrReturnType,
z.fdtmDateTimeStamp,
z.fstrFIRSTDLN,
z.fstrId,
z.fdtmFilingPeriod,
z.fdtmReturnGen,
z.fstrLodgementStatus,
z.fstrUserId,
z.fdtmLodged,
z.fstrPTSConfirmed,
z.fcurSchedularPayment,
z.fcurGrossInterest,
z.fcurGrossDividends,
z.fcurMADistributions,
z.fcurEstateTrustIncome,
z.fcurOverseasIncome,
z.fcurPartnershipIncome,
z.fcurActiveLTCIncome,
z.fcurShareholderSalary,
z.fcurNetRent,
z.fcurSelfEmployedIncome,
z.fcurOtherIncome,
z.fcurNetLossesBroughtForward,
z.fcurNetLossesClaimed,
z.fcurTaxableIncome,
z.fcurSLRepaymentThreshold,
z.fcurSLUnusedRepaymentThreshold,
z.fcurSLAdjustedNetIncome,
z.fcurSLLiableIncome,
z.fcurSLAssessmentAmount,
z.fcurSLInterimRepaymentAmount,
z.fblnIR215,
z.fintForwardDateNotice,
z.fblnManualOverride,
z.fblnPartYearReturn,
z.fstrPartYearSituation,
z.fdtmPartYearFromDate,
z.fdtmPartYearToDate,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${VAR:source_db}.app_tblnz_rtniitcoexistence z
left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${VAR:source_db}.app_tblid where fstrIDType = 'IRD' AND record_active_flag = 'Y' AND record_deleted_flag= 'N') id
on cast(z.fstrID as int) = cast(id.fstrID as int) 
left outer JOIN ${VAR:source_db}.app_tblCustomerLevel cl on 
id.flngcustomerkey=cl.flngcustomerkey 
WHERE 
(nvl(cl.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N');
;

