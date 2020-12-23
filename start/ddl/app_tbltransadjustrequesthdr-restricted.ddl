CREATE VIEW ${var:view_db}.app_tbltransadjustrequesthdr AS
SELECT z.flngRequestKey, z.flngVer, z.flngVerLast, z.fstrAdjustType, z.fstrRequestStatus, z.flngCustomerKey, z.flngAccountKey, z.fdtmFilingPeriod, z.flngWorkKey, z.flngCaseKey, z.flngFolderKey, z.fcurRequestAmount, z.fstrRequestedBy, z.fdtmRequested, z.fstrRejectedBy, z.fdtmRejected, z.fstrWithdrawnBy, z.fdtmWithdrawn, z.fstrApprovedBy, z.fdtmApproved, z.fstrReversedBy, z.fdtmReversed, z.flngCRMKey, z.fstrDescription, z.fcurOriginalRequest, z.fcurOriginalRequestPenalty, z.fcurOriginalRequestInterest, z.fstrAdjustReason, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tbltransadjustrequesthdr z;
