CREATE VIEW ${var:view_db}.dss_returns_keypoints_ir3 AS
SELECT z.IRD_NUMBER, z.LOCATION_NUMBER, z.RETURN_PERIOD_DATE, z.RETURN_TYPE, z.RETURN_VERSION_NO, z.RETURN_STATUS, z.FORM_VERSION_NO, z.NUMBER_OF_ERROR_ITEMS, z.`TIMESTAMP`, z.ACCOUNTS_INCLUDED_FLAG_100023, z.ACC_CLASS_NUMBER_1_412, z.ACC_INCOME_INDICATOR_100088, z.ACC_START_DATE_1_100090, z.ACC_START_DATE_2_100092, z.ACC_START_DATE_3_100094, z.ACC_START_DATE_4_100096, z.ACC_STOP_DATE_1_100091, z.ACC_STOP_DATE_2_100093, z.ACC_STOP_DATE_3_100095, z.ACC_STOP_DATE_4_100097, z.AC_PREMIUM_EXCL_GST_401, z.AMOUNT_OF_TRANSFER_100042, z.ASSESSMENT_850, z.A_50_OSEAS_PVT_PENSION_100086, z.CALC_EARNER_PREMIUM_424, z.CALC_EMPLOYER_PREMIUM_403, z.CALC_EMP_EARNER_EXC_GST_420, z.CALC_GST_EMP_EARNER_PREM_421, z.CALC_GST_OTH_EARN_PREM_100076, z.CALC_LIABLE_EARNINGS_100074, z.CALC_LIABLE_EARNINGS_IR12_416, z.CALC_OTH_EARNER_PREMIUM_423, z.CALC_OTH_EARN_PREM_GST_100075, z.CALC_OTH_LIABLE_EARN_100079, z.CALC_RCL_EARNER_PREMIUM_422, z.CHILDCARE_HSEKEEPER_PD_100038, z.CHILDCARE_HSEKEEPER_REB_100039, z.CHILD_1_DATE_OF_BIRTH_924, z.CHILD_2_DATE_OF_BIRTH_925, z.CHILD_3_DATE_OF_BIRTH_926, z.CHILD_4_DATE_OF_BIRTH_927, z.CHILD_5_DATE_OF_BIRTH_928, z.CHILD_6_DATE_OF_BIRTH_929, z.CHILD_7_DATE_OF_BIRTH_930, z.CHILD_REBATE_100035, z.CREDIT_ADJUSTMENTS_957, z.DATE_MARITAL_CHANGE_1_100051, z.DATE_MARITAL_CHANGE_2_100073, z.DEBIT_ADJUSTMENTS_956, z.DEEMED_LOSS_102, z.DIV_RWT_WITHHOLDING_CR_805, z.DOC_ATTACHED_1_100058, z.DOC_ATTACHED_2_100059, z.DOC_ATTACHED_3_100060, z.DOC_ATTACHED_4_100061, z.DOC_ATTACHED_5_100062, z.DOC_ATTACHED_6_100063, z.DOC_ATTACHED_7_100064, z.DONATIONS_REBATE_100037, z.EARNER_PREMIUM_100069, z.EARNER_PREMIUM_PAYABLE_425, z.EARNER_PREM_OVERDEDUCT_414, z.EARNINGS_IR12_119, z.EARNINGS_IR13_120, z.EXTRA_PAY_REBATE_100033, z.FOREIGN_DISCLOSURE_129, z.FOREIGN_PENSION_1002, z.FROZEN_RATE_OF_NZS_IND_100084, z.FS2_ATTACHED_100071, z.FSTC_ENTITLEMENT_IND_100021, z.FSTC_MARITAL_CHANGE_IND_953, z.FS_ASSESSMENT_602, z.FS_ENTITLEMENT_1004, z.FS_PAID_BY_IRD_100080, z.GMFI_ENTITLEMENT_1007, z.GMFI_INC_IN_FAM_ASSMT_Y_N_959, z.GROSS_EARNINGS_407, z.GROSS_NZ_SUPER_100054, z.GROSS_NZ_SUPER__1183, z.GST_ON_RESID_CLAIMS_LEVY_402, z.HALF_NON_TAX_PENSION_100055, z.IFTC_ENTITLEMENT_1005, z.INCOME_AFTER_EXPENSES_101, z.INC_UNDER_9880_REBATE_100032, z.INTEREST_AND_DIVIDENDS_100068, z.INTERIM_REPAYMENT_AMOUNT_854, z.INTERIM_REPAYMENT_OPTION_853, z.IR12_DN_FSTC_821, z.IR12_IR13_GROSS_EARNINGS_820, z.IR12_IR13_TOTAL_TAX_DEDS_819, z.IR12_TOTAL_DEDUCTIONS_121, z.LAQC_LOSS_144, z.LESS_REPAYMENT_THRESHOLD_856, z.LIABLE_EARNINGS_419, z.LIABLE_EARNINGS_IR12_417, z.LOSS_BROUGHT_FORWARD_136, z.LOSS_CLAIMED_133, z.MANUAL_OVERIDE_FOR_NS60_100085, z.MARITAL_CHANGE_1_100050, z.MARITAL_CHANGE_2_100072, z.MARITAL_INDICATOR_100049, z.MORE_ACC_PERIODS_100089, z.MORE_OTHER_IFTC_INC_PER_100099, z.NET_PROFIT_702, z.NET_RENTS_826, z.NON_QUAL_TRUST_INCOME_723, z.NON_RESIDENT_IND_100022, z.NOT_USED_100024, z.NOT_USED_100025, z.NOT_USED_100072, z.NOT_USED_100073, z.NO_OF_WKS_FULL_TIME_100031, z.NS60_ATTACHED_100070, z.NUMBER_LIABLE_CERTS_415, z.NUMBER_OF_CHILDREN_936, z.NZS_EXEMPTION_100057, z.NZS_RECD_PERIOD_FROM_100046, z.NZS_RECEIVED_PERIOD_TO_100047, z.NZS_SPOUSES_IRD_NUMBER_100048, z.NZS_SPOUSES_OTHER_INC_100056, z.NZS_SURCHARGE_704, z.OFFSET_AGAINST_SL_849, z.OTHER_IFTC_INCOME_IND_100098, z.OTHER_IFTC_STOP_DATE_1_100101, z.OTHER_IFTC_STOP_DATE_2_100103, z.OTHER_IFTC_STOP_DATE_3_100105, z.OTHER_IFTC_STOP_DATE_4_100107, z.OTHER_IFTC_STOP_DATE_5_100109, z.OTHER_IFTC_STRT_DATE_1_100100, z.OTHER_IFTC_STRT_DATE_2_100102, z.OTHER_IFTC_STRT_DATE_3_100104, z.OTHER_IFTC_STRT_DATE_4_100106, z.OTHER_IFTC_STRT_DATE_5_100108, z.OTHER_INCOME_827, z.OTHER_INCOME_LIABLE_100087, z.OTHER_REBATE_100041, z.OTHER_TAX_DEDUCTIONS_801, z.OVERSEAS_INCOME_828, z.OVERSEAS_TAX_CREDITS_107, z.PARTNERS_TAXABLE_INCOME_955, z.PARTNER_IRD_NUMBER_901, z.PARTNER_WEEKS_100066, z.PAYE_EP_ADJUSTED_100077, z.PCC_START_DATE_CHILD_1_939, z.PCC_START_DATE_CHILD_2_941, z.PCC_START_DATE_CHILD_3_943, z.PCC_START_DATE_CHILD_4_945, z.PCC_START_DATE_CHILD_5_947, z.PCC_START_DATE_CHILD_6_949, z.PCC_START_DATE_CHILD_7_951, z.PCC_STOP_DATE_CHILD_1_940, z.PCC_STOP_DATE_CHILD_2_942, z.PCC_STOP_DATE_CHILD_3_944, z.PCC_STOP_DATE_CHILD_4_946, z.PCC_STOP_DATE_CHILD_5_948, z.PCC_STOP_DATE_CHILD_6_950, z.PCC_STOP_DATE_CHILD_7_952, z.PRE_ENCRIPTION_CHECK_100018, z.PRE_ENCRIPTION_IRD_NO_100019, z.PRE_ENCRIPTION_LOC_NO_100020, z.PRINCIPAL_CARER_WEEKS_100065, z.PRINCIPLE_CHILD_CARER_Y_N_958, z.PROVISIONAL_TAX_OPTION_501, z.PROVISIONAL_TAX_PAYABLE_502, z.PROV_TAX_OVER_PAYMENT_504, z.REFUND_BY_CHEQUE_146, z.REFUND_TAX_TO_PAY_100067, z.REFUND_TAX_TO_PAY_701, z.RESIDUAL_CLAIMS_LEVY_IND_418, z.RESIDUAL_INCOME_TAX_108, z.RESIDUAL_REPAYMENT_OBL_869, z.RETURN_NOT_12_MONTHS_117, z.RWT_AND_OTHER_TAX_CR_803, z.SHARED_CUST_AGREEMENT_IND_954, z.SHARE_OF_IMP_CREDITS_705, z.SL_LIABLE_INCOME_868, z.SPEC_SAVS_ACCT_REBATE_100040, z.SPOUSE_RCVD_NZS_PER_TO_100053, z.SPOUSE_RECEIVED_NS_IND_100169, z.SPSE_RCVD_NZS_PER_FROM_100052, z.STD_DISCLAIMER_APPLIES_100045, z.STUDENT_LOANS_DEDUCTIONS_851, z.TAXABLE_INCOME_109, z.TAX_ON_TAXABLE_INCOME_721, z.TOTAL_DONATIONS_PAID_100036, z.TOTAL_ESTATE_TRUST_INCOME_806, z.TOTAL_EXPENSES_CLAIMED_100026, z.TOTAL_FSTC_601, z.TOTAL_GROSS_DIVIDENDS_804, z.TOTAL_INTEREST_802, z.TOTAL_LOSS_CARRIED_FWD_114, z.TOTAL_PARTNERSHIP_INCOME_808, z.TOTAL_PARTNERSHIP_TAX_CRS_858, z.TOTAL_PAYS_ON_IR12_100034, z.TOTAL_REBATES_703, z.TOTAL_SHAREHOLDER_SALARY_809, z.TOTAL_TAX_CREDITS_115, z.TOTAL_TAX_PAID_BY_TRUSTEES_807, z.TOT_FAMILY_ASSISTANCE_ENT_603, z.TOT_RESID_CLAIMS_PAYABLE_426, z.TOT_SLS_REPMNTS_TO_IRD_100081, z.TOT_TAX_CREDITS_ADJ_EP_100078, z.TOT_TAX_DEDS_NZ_SUPER_1182, z.TRANSFER_TO_IRD_NO_1, z.TRANSFER_TO_LOCATION_NO_2, z.TRANSFER_TO_PERIOD_3, z.TRANS_TO_AC_EARNER_PREM_100044, z.TRANS_TO_PROV_TAX_100043, z.UNDER_34200_REBATE_100028, z.UNDER_34200_REBATE_ADJ_100027, z.UNDER_38000_REBATE_100030, z.UNDER_38000_REBATE_ADJ_100029, z.VET_PENS_TOTAL_GROSS_100083, z.VET_PENS_TOTAL_TAX_DED_100082, z.AMOUNT_OF_TRANSFER_100512, z.CALC_TOTAL_DEDUCTIONS_100134, z.EARNINGS_NOT_LIABLE_100187, z.FINAL_DR_CR_1000513, z.FSTC_ENTITLEMENT_IND_1515, z.GROSS_GRI_100493, z.GST_DATE_SUPPLY_100492, z.IRD_LOCATION_TRANSFER_TO_1510, z.IRD_NO_TRANSFER_TO_1509, z.NZ_SUPER_100522, z.OSEAS_LIABLE_EARNINGS_100515, z.OTHER_TAX_DEDUCTIONS_799, z.OVERSEAS_EARNER_PREMIUM_100516, z.PAYMENTS_FROM_IRD_1514, z.PERIOD_TRANSFER_TO_1511, z.PREVIOUS_ISSUE_DATE_406, z.PREVIOUS_NOTICE_TYPE_405, z.PREVIOUS_PREMIUM_AMOUNT_404, z.PROVISIONAL_INCOME_503, z.PTC_ENTITLMENT_1508, z.SELF_EMPLOYED_CEASE_DATE_1470, z.TFR_TO_OWN_STUDENT_LOAN_100511, z.TOTAL_FAMILY_INCOME_1507, z.TOTAL_PAYMENTS_FROM_WINZ_1513, z.TOT_W_HOLDING_DEDUCTS_800, z.TOT_W_HOLDING_PAYMENTS_100514, z.UNDER_30875_REBATE_100028, z.UNDER_30875_REBATE_ADJ_100027, z.VETERANS_PENSION_Y_N_100523, z.AMOUNT_TRANSFERRED_100537, z.ARE_YOU_ASSOCIATED_100572, z.CREDIT_ADJ_RED_OF_FIT_100540, z.EARNER_PREM_EAL_EP_100533, z.EMPL_PREM_IND_LEVY_IND_100531, z.EPR_RESID_CLAIM_LEVY_RT_100532, z.EXCESS_TO_EMP_OVER_MAX_100529, z.FIT_PAYABLE_100541, z.GST_ON_EAL_EARNER_PREM_100534, z.ICA_CLOSING_BALANCE_NU_100538, z.PAY_AFTER_1ST_WK_REIMB_100528, z.PAY_EMP_1ST_WK_AFTR_ACC_100527, z.STUDENT_LOANS_DEDUCTIONS_1336, z.TAXABLE_ACTIVITY_COM_DT_100526, z.TAX_ON_TRUSTEE_INCOME_111, z.TOTAL_TAX_CREDITS_100173, z.TOT_EAL_EARNER_PREM_LBL_100535, z.TOT_EARN_LBLE_FOR_LEVY_100530, z.TOT_RCL_EAL_EP_PBL_SEA_100536, z.WPA_CLOSING_BALANCE_NU_100539, z.ARE_YOU_ASSOCIATED_SLS_100574, z.TOT_MAORI_AUTH_CREDITS_100585, z.TOT_MAORI_AUTH_DIST_100586, z.ALLOWABLE_IMP_CREDITS_100607, z.ENT_EARLY_PYMT_DISC_YN_100609, z.EXCESS_IMP_CREDITS_100608, z.REDUCED_IMP_CREDITS_100606, z.EXCESS_IMP_CREDITS_BF_100610, z.IN_WORK_PAYMENT_ENT_100611, z.DATE_FROM_100679, z.DATE_TO_100680, z.FAM_TOTAL_100700, z.BUDGET_WRITE_OFF_AMOUNT_100702, z.BUDGET_WRITE_OFF_FLAG_100701, z.RD_FLAG_100696, z.RD_TAX_CREDIT_100694, z.SITUATION_100693, z.SPS_RD_AMOUNT_100695, z.FAM_TAX_CREDIT_ENT_100710, z.WFF_ASSESSMENT_100747, z.CALC_IETC_CREDIT_100757, z.CALC_QUALIFYING_MONTHS_100756, z.ELIGIBLE_IETC_TAX_CR_100748, z.NUM_QUALIFYING_MONTHS_100754, z.OVERSEAS_INCOME_END_DT_100750, z.OVERSEAS_INCOME_ST_DT_100749, z.TAX_CREDITS_CLAIMED_100755, z.WFFTC_IR215_ATTACHED_100788, z.INTRST_PSHIP_LTC_TRUST_100789, z.DIVDNDS_PSHIP_LTC_TRUST_100790, z.TOTAL_LTC_TAX_CREDITS_100791, z.TOTAL_ACTIVE_LTC_INCOME_100792, z.NON_ALLOWBLE_DEDUCTIONS_100793, z.ADJUSTED_LTC_INCOME_100794, z.FUTUR_SHR_EMPLOYEE_SLRY_100795, z.INTERIM_LIABLE_INCOME_100796, z.SLS_NULL_ASSMT_IND_100826, z.SL_ADJUSTED_NET_INCOME_100831, z.PR_YR_N_ALLW_DED_CLAIMD_100829, z.NET_SCHEDULAR_PAYMENTS_100828, z.SL_UNUSD_REPYMT_THRSHLD_100830, z.SCHEDULAR_EXPENSES_100827, z.OVERSEAS_SUPER_LUMP_SUM_100864, z.NOT_USED_100022, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.dss_returns_keypoints_ir3 z;