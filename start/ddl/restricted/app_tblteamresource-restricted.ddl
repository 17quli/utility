CREATE VIEW ${var:view_db}.app_tblteamresource AS
SELECT z.FLNGRESOURCEKEY, z.FLNGVER, z.FLNGVERLAST, z.FLNGTEAMKEY, z.FLNGFOLDERKEY, z.FSTRUSER, z.FBLNACTIVE, z.FSTRWHO, z.FDTMWHEN, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblteamresource z;
