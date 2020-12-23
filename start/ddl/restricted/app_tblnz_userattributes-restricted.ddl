CREATE VIEW ${var:view_db}.app_tblnz_userattributes AS
SELECT z.flngDocKey, z.fstrEmployeeId, z.fstrEmployeeType, z.fstrOfficeLocation, z.fstrTitle, z.fstrSection, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblnz_userattributes z;
