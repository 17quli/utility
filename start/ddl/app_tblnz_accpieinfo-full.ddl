CREATE VIEW ${var:view_db}.app_tblnz_accpieinfo AS
SELECT z.flngDocKey, z.fstrPIEType, z.fstrFilingOption, z.fstrAttributionPeriod, z.fstrFDRCalcPeriod, z.fblnFilingReqExemption, z.fstrWho, z.fdtmWhen, z.fblnConverted, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblnz_accpieinfo z;
