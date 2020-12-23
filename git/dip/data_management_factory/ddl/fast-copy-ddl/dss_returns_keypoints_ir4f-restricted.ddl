create view lab_fcp_raw_restricted_access.dss_returns_keypoints_ir4f
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
z.BETA_OFFSET_100486,
z.CALCLATD_FDWP_LIABILITY_100485,
z.CALCULATED_TAX_100481,
z.CALC_TOTAL_TAX_CREDIT_100484,
z.DIVDND_WH_PAYMNT_PAYBLE_100488,
z.NUMBER_DIVDNDS_INCLUDED_100478,
z.PAY_SATSFD_BY_REDC_LOSS_100487,
z.TOTL_FORGN_DIVDNDS_RECD_100479,
z.TOT_FORGN_TAX_CRDT_ALWD_100482,
z.UNDRLYING_FRGN_TAX_CRDS_100480,
z.UNDRLYING_TAX_CRDS_USED_100483,
z.CONDUIT_RELIEF_TAX_CRED_100576,
z.FDWP_PAYABLE_100577
 FROM lab_fcp_raw.returns_keypoints_ir4f z
left outer join prod_raw.dss_special_clients_all sc
on sc.ird_number= z.ird_number
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N'
;
