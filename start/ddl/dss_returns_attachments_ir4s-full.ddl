CREATE VIEW ${var:view_db}.dss_returns_attachments_ir4s AS
SELECT z.IRD_NUMBER, z.LOCATION_NUMBER, z.RETURN_PERIOD_DATE, z.RETURN_TYPE, z.RETURN_VERSION_NO, z.RETURN_STATUS, z.SCHEDULE_ERROR_CODE, z.FORM_VERSION_NO, z.ATTACHMENT_IRD_NUMBER, z.CERTIFICATE_SEQUENCE, z.DOC_LODGE_NBR_PREFIX, z.DOC_LODGE_NBR, z.DOC_LODGE_NBR_SUFFIX, z.NUMBER_OF_ERROR_ITEMS, z.`TIMESTAMP`, z.BATCH_NUMBER_100316, z.BOX_NUMBER_100317, z.COMPANY_LOANS_866, z.CURRENT_AC_BAL_867, z.EFILE_LODGEMENT_DATE_5, z.LOSS_OFFSETS_100181, z.RECONCILE_FLAG_4, z.SUBVENTION_PAYMENTS_100182, z.TOTAL_LAQC_LOSSES_132, z.TOTAL_SHAREHOLDER_SALARY_809, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_returns_attachments_ir4s z;
