CREATE VIEW ${var:view_db}.app_tblnz_garnishdetails AS
SELECT z.flngGarnishKey, z.flngVer, z.flngVerLast, z.fcurExpectedAmount, z.fdtmNextEvalution, z.flngStrikes, z.fdtmWhen, z.fstrWho, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblnz_garnishdetails z;
