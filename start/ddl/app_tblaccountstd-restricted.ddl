CREATE VIEW ${var:view_db}.app_tblaccountstd AS
SELECT z.FLNGDOCKEY, z.FDTMCOMMENCE, z.FDTMCEASE, z.FSTRSTATUS, z.FSTRCLOSUREREASON, z.FSTRFILINGFRQ, z.fblnMailForm, z.FBLNREGISTERED, z.FSTRCITY, z.FSTRDISTRICT, z.FSTRGOVTAGENT, z.FINTPROCESSINGDAY, z.fstrSIC, z.fblnNoRtnPnlInt, z.FSTRWHO, z.FDTMWHEN, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblaccountstd z;
