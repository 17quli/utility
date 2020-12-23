
CREATE VIEW ${var:view_db}.app_tblnz_rtnreb
AS SELECT
z.flngDocKey,
z.fcurSchoolDonations,
z.fcurReligiousDonations,
z.fcurRemainingDonations,
z.fcurTotalReceipt,
z.fcurCareAndHousePayments,
z.fcurCareAndHouseCredits,
z.fcurFinalTotal,
z.fstrPartnerIRD,
z.fstrTransferIRD,
z.fcurTransferAmount,
z.fblnWaitingOnIncome,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_rtnreb z;
