CREATE VIEW ${var:view_db}.app_tblnz_paymentaddtnlinf
AS SELECT
z.flngDocKey,
z.fstrIrdBankType,
z.fstrIrdBankBranch,
z.fstrIrdBankAccountNumber,
z.fstrIrdBankSuffix,
z.fstrPaymentTransCode,
z.fstrPaymentAmount,
z.fstrPaymentInputSource,
z.fstrOriginBank,
z.fstrOriginBankBranch,
z.fstrOriginBatchNumber,
z.fstrThisPartyName,
z.fstrPRN,
z.fstrThisPartyReference,
z.fstrThisPartyParticulars,
z.fstrThisPartyAnalysisCode,
z.fstrOtherPartyName,
z.fstrOtherPartyBankType,
z.fstrOtherPartyBankBranch,
z.fstrOtherPartyBankAccount,
z.fstrOtherPartyBankSuffix,
z.fstrAccountType,
z.fdtmFilingPeriod,
z.fstrIDType,
z.fstrID,
z.fstrAccountFilingIdHash,
z.fdtmDueDate,
z.fstrMedia,
z.fstrVoucherType,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_paymentaddtnlinf z
;