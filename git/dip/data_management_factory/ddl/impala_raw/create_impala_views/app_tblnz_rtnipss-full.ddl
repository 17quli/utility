
CREATE VIEW ${var:view_db}.app_tblnz_rtnipss
AS SELECT
z.flngDocKey,
z.fcurInterestRWTDeducted,
z.fcurInterestNoRWTDeducted,
z.fcurInterestTotal,
z.fcurRWTCertificates,
z.fcurRWTBCM,
z.fcurRWTNoCertificates,
z.fcurRWTTotalPayable,
z.fcurManualRWTPaid,
z.fcurRWTIR15P,
z.fcurRWTAlreadyDeducted,
z.fcurRWTTotalPaid,
z.fcurRWTFinal,
z.flngCertificatesAttached,
z.flngCertFiled,
z.fblnElectronicFiled,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_rtnipss z;
