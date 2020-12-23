CREATE VIEW ${var:view_db}.web_tblnz_webmailredirect AS
SELECT z.flngMailItemKey, z.flngCustomerKey, z.fintProfileNumber, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.web_tblnz_webmailredirect z;
