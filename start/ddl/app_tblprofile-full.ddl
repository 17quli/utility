CREATE VIEW ${var:view_db}.app_tblprofile AS
SELECT z.flngCustomerKey, z.fintProfileNumber, z.flngVer, z.flngVerLast, z.fstrProfileType, z.fblnDefault, z.fintParentProfileNumber, z.flngDocKey, z.fdtmCommence, z.fdtmCease, z.fdtmCreated, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblprofile z;
