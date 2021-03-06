CREATE VIEW lab_fcp_raw_restricted_access.dss_returns_keypoints_ir853
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
z.INC_LOS_EXITD_0_INVSTR_100639,
z.NO_ASESMENT_IND_100209,
z.TAXABL_INCOM_LOS_100704,
z.TAX_PD_RBT_100706,
z.TAX_PD_RB_INC_LOW_MID_100708,
z.TOT_0_RTD_ALC_DWP_TX_CR_100713,
z.TOT_0_RTD_ALC_FTC_TX_CR_100712,
z.TOT_0_RTD_ALC_IC_TAX_CR_100714,
z.TOT_0_RTD_ALC_RWT_CR_100715,
z.TOT_NUMBR_OF_CERTFCATES_100703,
z.TOT_TAX_CR_100705,
z.TOT_TAX_CR_LOW_MID_100709,
z.TXBL_INC_LS_TAX_LOW_MID_100707,
z.TX_PAY_EXTD_0_INVSTRS_100650
 FROM lab_fcp_raw.returns_keypoints_ir853 z
left outer join prod_raw.dss_special_clients_all sc
on sc.ird_number= z.ird_number
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N';
