CREATE VIEW ${var:view_db}.dss_returns_keypoints_ir3nr 

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

z.AMOUNT_OF_TRANSFER_100042, 

z.ASSESSMENT_850, 

z.CALC_DIV_NRWT_100239, 

z.CALC_INT_NRWT_100237, 

z.CALC_ROY_NRWT_100242, 

z.DEEMED_LOSS_102, 

z.DIVIDEND_NRWT_W_HOLD_CR_100238, 

z.GROSS_EARNINGS_407, 

z.INCOME_AFTER_EXPENSES_101, 

z.INTEREST_AND_DIVIDENDS_100068, 

z.INTEREST_NRWT_859, 

z.INTERIM_REPAYMENT_AMOUNT_854, 

z.INTERIM_REPAYMENT_OPTION_853, 

z.IR12_IR13_GROSS_EARNINGS_820, 

z.IR12_IR13_TOTAL_TAX_DEDS_819, 

z.LESS_REPAYMENT_THRESHOLD_856, 

z.LIABLE_INCOME_100252, 

z.LOSS_BROUGHT_FORWARD_136, 

z.LOSS_CLAIMED_133, 

z.MANUAL_NZ_SURCHGE_CALC_100253, 

z.MANUAL_REBATE_CALC_100254, 

z.NET_PROFIT_702, 

z.NET_RENTS_826, 

z.NZ_SUPER_RECEIVED_IND_816, 

z.OTHER_INCOME_827, 

z.OTHER_LOSS_CARRIED_FWD_112, 

z.OTHER_TAX_DEDUCTIONS_801, 

z.PRE_ENCRIPTION_CHECK_100018, 

z.PRE_ENCRIPTION_IRD_NO_100019, 

z.PRE_ENCRIPTION_LOC_NO_100020, 

z.PROVISIONAL_TAX_OPTION_501, 

z.PROVISIONAL_TAX_PAYABLE_502, 

z.PROV_TAX_OVER_PAYMENT_504, 

z.QUALIFYING_COMPANY_LOSS_143, 

z.REFUND_BY_CHEQUE_146, 

z.REFUND_DISTRIBUTION_100250, 

z.REFUND_TAX_TO_PAY_100067, 

z.REFUND_TAX_TO_PAY_701, 

z.RESIDUAL_INCOME_TAX_108, 

z.RETURN_NOT_12_MONTHS_117, 

z.ROYALTIES_NRWT_100240, 

z.SPEC_FARM_FISH_REBATE_100248, 

z.SPEC_LOSS_CARRIED_FWD_113, 

z.STD_DISCLAIMER_APPLIES_100045, 

z.TAX_ON_TAXABLE_INCOME_721, 

z.TOTAL_ANY_OTHER_INCOME_100247, 

z.TOTAL_CALC_NRWT_100244, 

z.TOTAL_ESTATE_TRUST_INCOME_806, 

z.TOTAL_EXPENSES_CLAIMED_100026, 

z.TOTAL_GROSS_DIVIDENDS_804, 

z.TOTAL_GROSS_ROYALTIES_100241, 

z.TOTAL_INTEREST_802, 

z.TOTAL_LOSS_CARRIED_FWD_114, 

z.TOTAL_NRWT_TAX_CREDITS_100243, 

z.TOTAL_OTHER_INCOME_100246, 

z.TOTAL_PARTNERSHIP_INCOME_808, 

z.TOTAL_PARTNERSHIP_TAX_CRS_858, 

z.TOTAL_REBATES_100255, 

z.TOTAL_REFUND_100251, 

z.TOTAL_TAX_CREDITS_100173, 

z.TOTAL_TAX_PAID_BY_TRUSTEES_807, 

z.TOT_TAX_CR_OTHER_INC_100245, 

z.TRANSFER_TO_IRD_NO_1, 

z.TRANSFER_TO_LOCATION_NO_2, 

z.TRANSFER_TO_PERIOD_3, 

z.TRANS_TO_PROV_TAX_100043, 

z.WORK_IN_NZ_INDICATOR_100249, 

z.MANUAL_FS_CALC_100494, 

z.ACC_CLASS_NUMBER_1_412, 

z.AC_PREMIUM_EXCL_GST_401, 

z.AMOUNT_TRANSFERRED_100537, 

z.ARE_YOU_ASSOCIATED_100572, 

z.CALC_EMPLOYER_PREMIUM_403, 

z.CREDIT_ADJ_RED_OF_FIT_100540, 

z.EARNER_PREM_EAL_EP_100533, 

z.EARNER_PREM_OVERDEDUCT_414, 

z.EMPL_PREM_IND_LEVY_IND_100531, 

z.EPR_RESID_CLAIM_LEVY_RT_100532, 

z.EXCESS_TO_EMP_OVER_MAX_100529, 

z.FIT_PAYABLE_100541, 

z.FS_ASSESSMENT_602, 

z.GST_ON_EAL_EARNER_PREM_100534, 

z.GST_ON_RESID_CLAIMS_LEVY_402, 

z.ICA_CLOSING_BALANCE_NU_100538, 

z.NZS_SURCHARGE_704, 

z.PAY_AFTER_1ST_WK_REIMB_100528, 

z.PAY_EMP_1ST_WK_AFTR_ACC_100527, 

z.STUDENT_LOANS_DEDUCTIONS_1336, 

z.TAXABLE_ACTIVITY_COM_DT_100526, 

z.TAXABLE_INCOME_109, 

z.TAX_ON_TRUSTEE_INCOME_111, 

z.TOTAL_FSTC_601, 

z.TOTAL_REBATES_703, 

z.TOT_EAL_EARNER_PREM_LBL_100535, 

z.TOT_EARN_LBLE_FOR_LEVY_100530, 

z.TOT_RCL_EAL_EP_PBL_SEA_100536, 

z.WPA_CLOSING_BALANCE_NU_100539, 

z.ARE_YOU_ASSOCIATED_1546, 

z.TOT_MAORI_AUTH_CREDITS_100585, 

z.TOT_MAORI_AUTH_DIST_100586, 

z.ENT_EARLY_PYMT_DISC_YN_100609, 

z.DATE_FROM_100679, 

z.DATE_TO_100680, 

z.RD_FLAG_100696, 

z.RD_TAX_CREDIT_100694, 

z.SITUATION_100693, 

z.SPS_RD_AMOUNT_100695, 

z.TOTAL_LTC_TAX_CREDITS_100791, 

z.TOTAL_ACTIVE_LTC_INCOME_100792, 

z.NON_ALLOWBLE_DEDUCTIONS_100793, 

z.ADJUSTED_LTC_INCOME_100794, 

z.PR_YR_N_ALLW_DED_CLAIMD_100829, 

z.record_effective_timestamp, 

z.record_expiry_timestamp, 

z.record_active_flag,  

z.record_deleted_flag, 

z.insert_object_run_key, 

z.update_object_run_key 

 FROM ${var:source_db}.dss_returns_keypoints_ir3nr z 

LEFT OUTER JOIN ${var:source_db}.dss_special_clients_all sc 

ON CAST(z.IRD_NUMBER AS INT) = CAST(sc.IRD_NUMBER as INT)  

WHERE nvl(sc.special_classification, 'STD')='STD' 

AND nvl( sc.record_active_flag,'Y')='Y' 

AND nvl(sc.record_deleted_flag, 'N') = 'N' 
; 