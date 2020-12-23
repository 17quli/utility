CREATE VIEW ${var:view_db}.app_tbladdressprofile AS
SELECT z.flngcustomerkey, z.fintProfileNumber, z.fi64AddressKey, z.fintAddressKey, z.flngVer, z.flngVerLast, z.fblnDefault, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tbladdressprofile z;
