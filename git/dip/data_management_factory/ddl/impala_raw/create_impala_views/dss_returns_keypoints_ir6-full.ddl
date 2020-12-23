CREATE VIEW ${var:view_db}.dss_returns_keypoints_ir6
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
z.ACCOUNTS_INCLUDED_FLAG_100023,
z.ACCRUALS_PROPERTY_IND_100205,
z.DEEMED_LOSS_102,
z.DIV_RWT_WITHHOLDING_CR_805,
z.ESTATE_TRUST_EXS_CLAIM_100200,
z.FIRST_RETURN_100197,
z.INCOME_AFTER_EXPENSES_101,
z.INC_ALLOCN_TO_BENEFICIARY_714,
z.INC_ALLOC_TO_TRUSTEE_716,
z.IR6B_BENEFICIARY_INCOME_100202,
z.IR6B_BFICIARY_TAX_CREDS_100203,
z.IR6B_BFICIARY_TAX_TO_PAY_715,
z.LAQC_LOSS_144,
z.LOSS_BROUGHT_FORWARD_136,
z.LOSS_CLAIMED_133,
z.NET_PROFIT_702,
z.NEW_PROV_TAX_DATE_505,
z.OTHER_INCOME_LIABLE_100087,
z.OVERSEAS_INCOME_828,
z.OVERSEAS_TAX_CREDITS_107,
z.PRE_ENCRIPTION_CHECK_100018,
z.PRE_ENCRIPTION_IRD_NO_100019,
z.PRE_ENCRIPTION_LOC_NO_100020,
z.PROVISIONAL_INCOME_503,
z.PROVISIONAL_TAX_OPTION_501,
z.PROVISIONAL_TAX_PAYABLE_502,
z.PROV_TAX_OVER_PAYMENT_504,
z.PSHIP_ESTATE_TRUST_INCOME_810,
z.PSHIP_ESTATE_TRUST_TAX_CR_811,
z.REFUND_BY_CHEQUE_146,
z.REFUND_TAX_TO_PAY_701,
z.RESIDUAL_INCOME_TAX_108,
z.RTS_IN_F_CO_UNIT_TRUST_100204,
z.RWT_AND_OTHER_TAX_CR_803,
z.SHARE_OF_IMP_CREDITS_705,
z.STD_DISCLAIMER_APPLIES_100045,
z.TAXABLE_INCOME_109,
z.TAX_ON_TRUSTEE_INCOME_111,
z.TAX_PAYABLE_BFICIARIES_100206,
z.TOTAL_GROSS_DIVIDENDS_804,
z.TOTAL_INTEREST_802,
z.TOTAL_LOSS_CARRIED_FWD_114,
z.TOTAL_TAXABLE_DIST_100201,
z.TOTAL_TAX_CREDITS_115,
z.TOT_TAX_CREDS_ACCRUED_100199,
z.TOT_TAX_PAYABLE_TRUSTEE_717,
z.TRANSFER_AMOUNT_100131,
z.TRANSFER_TO_IRD_NO_1,
z.TRANSFER_TO_LOCATION_NO_2,
z.TRANSFER_TO_PERIOD_3,
z.TRANS_TO_PROV_TAX_100043,
z.TRUSTEES_DIV_IMPUT_CRDS_720,
z.TRUSTEES_OSEAS_TAX_CRD_718,
z.TRUSTEES_WH_TAX_PAYE_DDT_719,
z.TRUSTEE_TAX_PAID_100207,
z.TYPE_OF_ESTATE_TRUST_100198,
z.UPLIFTED_RIT_ALL_BENS_730,
z.UPLIFTED_RIT_TOTAL_731,
z.FINAL_RETURN_100495,
z.ACC_CLASS_NUMBER_1_412,
z.AC_PREMIUM_EXCL_GST_401,
z.AMOUNT_TRANSFERRED_100537,
z.ARE_YOU_ASSOCIATED_100574,
z.ASSESSMENT_850,
z.CALC_EMPLOYER_PREMIUM_403,
z.CREDIT_ADJ_RED_OF_FIT_100540,
z.EARNER_PREM_EAL_EP_100533,
z.EARNER_PREM_OVERDEDUCT_414,
z.EMPL_PREM_IND_LEVY_IND_100531,
z.EPR_RESID_CLAIM_LEVY_RT_100532,
z.EXCESS_TO_EMP_OVER_MAX_100529,
z.FIT_PAYABLE_100541,
z.FS_ASSESSMENT_602,
z.GROSS_EARNINGS_407,
z.GST_ON_EAL_EARNER_PREM_100534,
z.GST_ON_RESID_CLAIMS_LEVY_402,
z.ICA_CLOSING_BALANCE_NU_100538,
z.INTERIM_REPAYMENT_AMOUNT_854,
z.INTERIM_REPAYMENT_OPTION_853,
z.NZS_SURCHARGE_704,
z.OTHER_TAX_DEDUCTIONS_801,
z.PAY_AFTER_1ST_WK_REIMB_100528,
z.PAY_EMP_1ST_WK_AFTR_ACC_100527,
z.STUDENT_LOANS_DEDUCTIONS_1336,
z.TAX_ON_TAXABLE_INCOME_721,
z.TOTAL_FSTC_601,
z.TOTAL_REBATES_703,
z.TOTAL_TAX_CREDITS_100173,
z.TOT_EAL_EARNER_PREM_LBL_100535,
z.TOT_EARN_LBLE_FOR_LEVY_100530,
z.TOT_RCL_EAL_EP_PBL_SEA_100536,
z.WPA_CLOSING_BALANCE_NU_100539,
z.ARE_YOU_ASSOCIATED_100572,
z.TOT_MAORI_AUTH_CREDITS_100585,
z.TOT_MAORI_AUTH_DIST_100586,
z.IR6B_BENEF_OTH_CREDIT_100690,
z.IR6B_IMP_CREDIT_100691,
z.TRUSTEE_INCOME_100678,
z.RD_FLAG_100696,
z.RD_TAX_CREDIT_100694,
z.SPS_RD_AMOUNT_100695,
z.ADJUSTED_LTC_INCOME_100794,
z.NON_ALLOWBLE_DEDUCTIONS_100793,
z.TOTAL_ACTIVE_LTC_INCOME_100792,
z.TOTAL_LTC_TAX_CREDITS_100791,
z.NALLW_DEDUCTION_CLAIMED_100825,
z.TAX_PAY_TRUST_100824,
z.DIS_FOREIGN_INT_100823,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.dss_returns_keypoints_ir6 z
;
