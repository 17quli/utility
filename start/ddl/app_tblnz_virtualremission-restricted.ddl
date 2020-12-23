CREATE VIEW ${var:view_db}.app_tblnz_virtualremission AS
SELECT z.flngCustomRateKey, z.flngVer, z.flngVerLast, z.fstrCustomRateType, z.flngAccountKey, z.fdtmFilingPeriod, z.flngBillItemKey, z.fdtmRemissionApplied, z.fcurInterestRemitted, z.fcurPenaltiesRemitted, z.fcurLatePaymentPenalty, z.fcurNonPaymentPenalty, z.fdtmReportingMonth, z.fblnFinal, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblnz_virtualremission z;
