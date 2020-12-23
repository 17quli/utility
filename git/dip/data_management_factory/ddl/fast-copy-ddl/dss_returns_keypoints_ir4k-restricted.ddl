create view lab_fcp_raw_restricted_access.dss_returns_keypoints_ir4k
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
z.DIVIDEND_PAYE_PAYABLE_100501,
z.TOTAL_CREDITS_100500,
z.TOTAL_GROSS_DIVIDENDS_100498
FROM lab_fcp_raw.returns_keypoints_ir4k z
left outer join prod_raw.dss_special_clients_all sc
on sc.ird_number= z.ird_number
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N'
;