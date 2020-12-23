CREATE VIEW ${var:view_db}.ref_lannz_provisionaltaxmthd
AS SELECT
z.fstrLanguage,
z.fstrMethod,
z.fstrDecode1,
z.fstrDecode2,
z.fstrDescription,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.checksum,
z.record_active_flag,
z.record_deleted_flag,
z.update_object_run_key
FROM ${var:source_db}.ref_lannz_provisionaltaxmthd z;
 