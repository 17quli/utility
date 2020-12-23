CREATE VIEW ${var:view_db}.app_tblworkdetailcompleted
AS SELECT
z.flngWorkKey,
z.fstrWorkType,
z.fstrWorkCategory,
z.flngVer,
z.flngVerLast,
z.fdtmCreated,
z.fdtmAssigned,
z.fdtmCompleted,
z.fdtmAborted,
z.fdtmDue,
z.fdtmDueTime,
z.fdtmAvailable,
z.fdtmExpire,
z.fstrOwner,
z.fstrSubscriber,
z.fstrNote,
z.fstrReason,
z.fstrSource,
z.fblnHasWorkData,
z.fblnValid,
z.flngCustomerKey,
z.fintProfile,
z.flngAccountKey,
z.fdtmPeriod,
z.fstrAccountType,
z.fstrStage,
z.fcurAmount,
z.fstrExternalID,
z.flngDocKey,
z.flngIndicatorKey,
z.fstrIndicator,
z.flngCRMKey,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblworkdetailcompleted z;