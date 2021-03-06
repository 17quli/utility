create view lab_fcp_raw_restricted_access.dss_returns_keypoints_ir44
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
z.BALANCE_DATE_100270,
z.CESSATION_DATE_100272,
z.DEEMED_LOSS_102,
z.DISC_OF_FOREIGN_INT_100283,
z.DISPOSAL_OF_INVESTMENTS_100284,
z.DIVIDEND_IMP_CREDITS_100288,
z.FINANCIAL_ARRANGEMENT_100281,
z.GAIN_LOSS_INCLUSIVE_100285,
z.GAIN_LOSS_SECTION_232B_100286,
z.GOVT_ACTUARY_NO_100271,
z.INCOME_AFTER_EXPENSES_101,
z.LIFE_INSURANCE_IND_100273,
z.LOSS_BROUGHT_FORWARD_136,
z.LOSS_CLAIMED_133,
z.LOSS_ON_DISPOSAL_S225A_100276,
z.LOSS_ON_DISPOSAL_S232B_100277,
z.LOSS_ON_SALE_OF_INVESTS_100278,
z.NEW_PROV_TAX_DATE_505,
z.OVERSEAS_TAX_CREDITS_107,
z.PRE_ENCRIPTION_CHECK_100018,
z.PRE_ENCRIPTION_IRD_NO_100019,
z.PRE_ENCRIPTION_LOC_NO_100020,
z.PROF_ON_DISPOSAL_S225A_100279,
z.PROF_ON_DISPOSAL_S232B_100280,
z.PROF_ON_SALE_OF_INVESTS_100275,
z.PROPERTY_DISCLOSURE_100282,
z.PROVISIONAL_TAX_OPTION_501,
z.PROVISIONAL_TAX_PAYABLE_502,
z.PROV_TAX_OVER_PAYMENT_504,
z.REFUND_BY_CHEQUE_146,
z.REFUND_TAX_TO_PAY_701,
z.RESIDUAL_INCOME_TAX_108,
z.STD_DISCLAIMER_APPLIES_100045,
z.TAXABLE_INCOME_109,
z.TAX_ON_INCOME_CAT_1_100291,
z.TAX_ON_INCOME_CAT_2_100290,
z.TAX_ON_TAXABLE_INCOME_721,
z.TOTAL_ASSETS_INDICATOR_100274,
z.TOTAL_INCOME_139,
z.TOTAL_LOSS_CARRIED_FWD_114,
z.TOTAL_TAX_CREDITS_100173,
z.TRANSFER_AMOUNT_100131,
z.TRANSFER_TO_IRD_NO_1,
z.TRANSFER_TO_LOCATION_NO_2,
z.TRANSFER_TO_PERIOD_3,
z.TRANS_TO_PROV_TAX_100043,
z.TREAT_AS_TRADING_STOCK_100287,
z.WITHOLDING_TAX_PAYE_DED_100289,
z.GAIN_LOSS_DISPOSED_OF_100519,
z.ACC_CLASS_NUMBER_1_412,
z.AC_PREMIUM_EXCL_GST_401,
z.AMOUNT_TRANSFERRED_100537,
z.ASSESSMENT_850,
z.CALC_EMPLOYER_PREMIUM_403,
z.CALC_TOT_TAXABLE_INCOME_100117,
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
z.NOT_USED_100072,
z.NZS_SURCHARGE_704,
z.OTHER_TAX_DEDUCTIONS_801,
z.PAY_AFTER_1ST_WK_REIMB_100528,
z.PAY_EMP_1ST_WK_AFTR_ACC_100527,
z.STUDENT_LOANS_DEDUCTIONS_1336,
z.SUPER_FUND_WITHDRL_TAX_10571,
z.TAX_ON_TRUSTEE_INCOME_111,
z.TOTAL_FSTC_601,
z.TOTAL_REBATES_703,
z.TOT_EAL_EARNER_PREM_LBL_100535,
z.TOT_EARN_LBLE_FOR_LEVY_100530,
z.TOT_RCL_EAL_EP_PBL_SEA_100536,
z.WPA_CLOSING_BALANCE_NU_100539
from lab_fcp_raw.returns_keypoints_ir44 z
left outer join prod_raw.dss_special_clients_all sc
on sc.ird_number= z.ird_number
where nvl(sc.special_classification, 'STD')='STD'
and nvl( sc.record_active_flag,'Y')='Y'
and nvl(sc.record_deleted_flag, 'N') = 'N'
;