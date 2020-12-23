create view lab_fcp_raw_restricted_access.dss_returns_keypoints_ir66n
AS SELECT
z.IRD_NUMBER,
z.LOCATION_NUMBER,
z.RETURN_PERIOD_DATE,
z.RETURN_TYPE,
z.RETURN_VERSION_NO,
z.RETURN_STATUS,
z.FORM_VERSION_NO,
z.NUMBER_OF_ERROR_ITEMS,
z.`TIMESTAMP`,
z.CHILD_SUPPORT_DEDUCTIONS_857,
z.GROSS_EARNINGS_407,
z.OTHER_TAX_DEDUCTIONS_801,
z.PRE_ENCRIPTION_CHECK_100018,
z.PRE_ENCRIPTION_IRD_NO_100019,
z.PRE_ENCRIPTION_LOC_NO_100020,
z.SPEC_SUPER_WITHHOLDING_TAX_722,
z.STD_DISCLAIMER_APPLIES_100045,
z.STUDENT_LOANS_DEDUCTIONS_851
FROM lab_fcp_raw.returns_keypoints_ir66n z
left outer join prod_raw.dss_special_clients_all sc
on sc.ird_number= z.ird_number
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N'
;