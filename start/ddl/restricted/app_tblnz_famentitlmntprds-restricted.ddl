CREATE VIEW ${var:view_db}.app_tblnz_famentitlmntprds AS
SELECT z.flngFAMEntitlementKey, z.flngVer, z.flngVerLast, z.fintRelationshipPeriod, z.fintEntitlementPeriod, z.fdtmStart, z.fdtmStop, z.fintDays, z.fblnCTC, z.fblnIWTC, z.fblnMFTC, z.fintWeeksWorked, z.fblnProtected, z.fintFOUKids, z.fintSharedCare, z.fintAgedLess13, z.fintAged13To15, z.fintAged15Plus, z.fcurMFTC, z.fcurFTC, z.fcurIWTC, z.fcurCTC, z.fcurPTC, z.fcurBSTC, z.fcurAmount, z.fblnBenefit, z.fblnMSD, z.fblnActive, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblnz_famentitlmntprds z;