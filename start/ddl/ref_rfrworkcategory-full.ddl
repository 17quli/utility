CREATE VIEW ${var:view_db}.ref_rfrworkcategory AS
SELECT z.fstrWorkCategory, z.fstrIcon, z.fblnActive, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.ref_rfrworkcategory z;
