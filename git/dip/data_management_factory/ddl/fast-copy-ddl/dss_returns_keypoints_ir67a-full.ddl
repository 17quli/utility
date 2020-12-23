create view lab_fcp_raw_full_access.dss_returns_keypoints_ir67a
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
z.APPROVED_ISSUER_LEVY_1333,
z.INTEREST_PAID_100235,
z.EDIT_FLAG_100821,
z.TOTAL_INTEREST_PAID_100235,
z.INTEREST_ZERO_RATED_100786,
z.NORMAL_RATED_AMOUNT_100787
FROM lab_fcp_raw.returns_keypoints_ir67a z;