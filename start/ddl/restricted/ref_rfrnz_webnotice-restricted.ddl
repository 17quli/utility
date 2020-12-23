CREATE VIEW ${var:view_db}.ref_rfrnz_webnotice AS
SELECT z.fstrWebNoticeType, z.fstrEmailSubject, z.fstrEmailMessage, z.fstrEmailGroup, z.fstrSMSType, z.fblnAlwaysEmail, z.fblnBundle, z.fblnDoNothing, z.fblnCanReply, z.fblnTaxPrepCanReply, z.fblnActive, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.ref_rfrnz_webnotice z;
