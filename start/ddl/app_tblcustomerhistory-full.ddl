CREATE VIEW ${var:view_db}.app_tblcustomerhistory AS
SELECT z.flngCustomerKey, z.flngVerLast, z.fstrCustomerTypeFrom, z.fstrCustomerTypeTo, z.flngDocKeyFrom, z.flngDocKeyTo, z.fstrWho, z.fdtmWhen, Z.record_effective_timestamp, Z.record_expiry_timestamp, Z.record_active_flag, Z.record_deleted_flag, Z.insert_object_run_key, Z.update_object_run_keY FROM ${var:source_db}.app_tblcustomerhistory z;
