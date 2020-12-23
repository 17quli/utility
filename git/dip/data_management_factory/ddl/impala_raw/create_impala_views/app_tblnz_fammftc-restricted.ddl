

CREATE VIEW ${var:view_db}.app_tblnz_fammftc
AS SELECT
z.flngFAMWorkKey,
z.flngVer,
z.flngVerLast,
z.fdtmStart,
z.fdtmStop,
z.fblnSharedCare,
z.fblnActive,
z.flngAccountKey,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_fammftc z;
