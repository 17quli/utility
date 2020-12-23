CREATE VIEW ${var:view_db}.frd_tblfrdactionresults AS
SELECT z.flngFraudPlanKey, z.flngReturnKey, z.flngDocVerLast, z.flngActionKey, z.flngVer, z.flngVerLast, z.fblnReleased, z.flngIndicatorKey, z.flngWorkKey, z.fdtmCreated, z.fstrCreatedBy, z.fstrResult, z.fdtmResult, z.fstrResultBy, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.frd_tblfrdactionresults z;