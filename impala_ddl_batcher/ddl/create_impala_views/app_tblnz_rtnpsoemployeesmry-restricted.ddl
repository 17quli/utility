CREATE VIEW ${var:view_db}.app_tblnz_rtnpsoemployeesmry
AS SELECT
z.flngDocKey,
z.flngSubmissionKey,
z.flngFileKey,
z.flngHeaderNumber,
z.fstrDLN,
z.fdtmSentToFIRST,
z.fdtmOriginalSentToFIRST,
z.fdtmLastSentToFIRST,
z.fblnFIRSTCnvError,
z.fblnFIRSTCnvErrorWorkItem,
z.fblnFIRSTCnvErrorComplete,
z.fcurTotalGross,
z.fcurTotalEarnings,
z.fcurTotalPAYE,
z.fcurTotalChildSupport,
z.fcurTotalStudentLoan,
z.fcurTotalKiwiSaverDeductions,
z.fcurTotalKiwiSaverContribution,
z.fcurTotalESCTDeductions,
z.fcurTotalAmountPayable,
z.fcurTotalTaxCreditsDonations,
z.fcurTotalTaxCreditsExtinguish,
z.fcurTotalFamilyTaxCredits,
z.fcurESCTAdjustments,
z.fcurESCTKiwiSaver,
z.fcurmaximumearnings,
z.fstrPIIRDNumber,
z.fstrContactPhoneNumber,
z.fstrContactName,
z.fstrPayrollPackage,
z.fstrPayrollContactEmail,
z.fblnCorrespondence,
z.fblnPaymentAttached,
z.fblnPayDayFiler,
z.fdtmPayDayPeriod,
z.fdtmPayDayDueDate,
z.fdtmMonthlyDueDate,
z.fdtmConsolidationDate,
z.fblnMSD,
z.fblnDuplicate,
z.fblnDuplicateLineItems,
z.fblnLineItemsProcessed,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
FROM ${var:source_db}.app_tblnz_rtnpsoemployeesmry z
WHERE z.flngDocKey IN
(SELECT DISTINCT rtn.flngDocKey
FROM ${var:source_db}.app_tblreturn rtn
INNER JOIN ${var:source_db}.app_tblaccount ac
ON rtn.flngAccountKey = ac.flngAccountKey
INNER JOIN ${var:source_db}.app_tblcustomerinfo cl ON ac.flngcustomerkey = cl.flngcustomerkey
WHERE
nvl(ac.record_active_flag, 'Y') = 'Y'
AND nvl(ac.record_deleted_flag, 'N') = 'N'
AND nvl(cl.fstrcustomerlevel, 'STD') = 'STD'
AND nvl(cl.record_active_flag, 'Y') = 'Y'
AND nvl(cl.record_deleted_flag, 'N') = 'N'
)
;
