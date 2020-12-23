CREATE VIEW ${var:view_db}.app_tblnz_rtnnrts AS
SELECT z.flngDocKey, z.fcurGrossDividends, z.fcurGrossInterest, z.fcurGrossRoyalties, z.fcurGrossOther, z.fcurGrossTotal, z.fcurNRWTDividends, z.fcurNRWTInterest, z.fcurNRWTRoyalties, z.fcurNRWTOther, z.fcurNRWTTotal, z.fcurFDPCredits, z.fcurNRWTPayable, z.fcurNRWTBCM, z.fcurManualNRWTPaid, z.fcurNRWTPaid, z.fcurNRWTFinal, z.fcurUnreconciledAmount, z.flngCertificateNumber, z.flngCertFiled, z.fblnElectronicFiled, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblnz_rtnnrts z;
