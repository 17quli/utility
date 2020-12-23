CREATE VIEW ${var:view_db}.app_tblnz_rtndwt
AS SELECT
z.flngDocKey,
z.fcurGrossDividends,
z.fcurMultiplyDividends,
z.fcurImpCredits,
z.fcurFdpCredits,
z.fcurTotalCredits,
z.fcurRWTPayable,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_rtndwt z;
