CREATE VIEW ${var:view_db}.ref_rfrworktype AS
SELECT z.fstrWorkType, z.fstrWorkCategory, z.fblnCanAddOnline, z.fblnCustomerRequired, z.fblnAccountRequired, z.fblnPeriodRequired, z.fblnDefaultOwner, z.fstrDaysToComplete, z.fstrDaysTilDue, z.fstrDaysTilAvailable, z.fblnAllowInError, z.fblnForceAvailable, z.fstrDocType, z.fintDocVer, z.fstrFirstStage, z.fstrAbortStage, z.fblnStageFromDoc, z.fstrPrePopBo, z.fblnAlwaysRunPrepop, z.fstrCompletionBo, z.fblnSaveOnFailedComplete, z.fblnPassMsgData, z.fstrFailMessage, z.fblnDocOnAdd, z.fblnDocOnChange, z.fblnDocOnClose, z.fblnAssignOwnerOnClose, z.fblnDocMode, z.fblnHideNoteOnComplete, z.fintFunction, z.fstrIndicator, z.fblnAssignToManager, z.fintAssignToFunction, z.flngAssignFunction, z.flngCompleteFunction, z.flngAbortFunction, z.fstrLinkTag, z.fstrViewSourceLinkTag, z.fblnRegistration, z.fblnReasonRequiredComplete, z.fblnCrmRequiredComplete, z.fblnCrmRequiredAbort, z.fblnActive, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.ref_rfrworktype z;