CREATE VIEW ${var:view_db}.ref_lancountry
AS SELECT
z.fstrLanguage,
z.fstrCountry,
z.fstrDecode1,
z.fstrDecode2,
z.fstrDecode3,
z.fstrDescription,
z.fstrStateDecode,
z.fstrPhoneError,
z.fstrNationality,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.ref_lancountry z;
