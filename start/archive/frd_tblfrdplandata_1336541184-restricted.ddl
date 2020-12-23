CREATE VIEW ${var:view_db}.frd_tblfrdplandata_1336541184
AS SELECT
z.`flngReturnKey`,
z.`fblnAccountAuditExists`,
z.`fblnAccountingBasisChanged`,
z.`fblnAfter15DaysReceived`,
z.`fblnAgentRedList`,
z.`fblnAmended`,
z.`fblnAuditAmended`,
z.`fblnAuditExists`,
z.`fblnAuditGroupExists`,
z.`fblnAuditInLast5Years`,
z.`fblnAuditStageUpdCnvReturns`,
z.`fblnBankAccountFlaggedAsFraud`,
z.`fblnBankAccountPrevCleared`,
z.`fblnComComIndicator`,
z.`fblnCreditOriginal`,
z.`fblnCreditTransfer`,
z.`fblnDeceased`,
z.`fblnDefaultAssessment`,
z.`fblnDifferentFormFiledThenExpe`,
z.`fblnDynamicADLExceedsRefund`,
z.`fblnEarlyFiled`,
z.`fblnExceedsModelThreshold`,
z.`fblnExcessiveSourceFieldModifi`,
z.`fblnExpExceedIncHasCrdDebAdj`,
z.`fblnExporter`,
z.`fblnFirstCreditReturn`,
z.`fblnFirstTimeFiler`,
z.`fblnForeignBankAccount`,
z.`fblnGreenList`,
z.`fblnGSTOnElectronicServices`,
z.`fblnHasICRCase`,
z.`fblnHasPrisonAddress`,
z.`fblnHasTaxAgent`,
z.`fblnHighestRefund`,
z.`fblnHighPriorIncomeToExpenses`,
z.`fblnHighRiskSector`,
z.`fblnHospiceFiler`,
z.`fblnIdenticalExpensesAndCrdGrs`,
z.`fblnIdenticalExpensesAndCredit`,
z.`fblnIdenticalGSTPaidAndCreditA`,
z.`fblnIdenticalSalesAndExpenses`,
z.`fblnIdenticialGSTPaidAndGSTCol`,
z.`fblnIncIncomeToLowForExpenses`,
z.`fblnInsolvent`,
z.`fblnIPAnonymizerUsed`,
z.`fblnIPMarkedAsFraud`,
z.`fblnIsNegativeCreditLast6Retur`,
z.`fblnLargeEnterprise`,
z.`fblnLE_SpecialAudit`,
z.`fblnLongStartup`,
z.`fblnNoCreditReviewInLastYear`,
z.`fblnNoIncomeExpensesAboveZero`,
z.`fblnNoSalesPrior3ExpensesClaim`,
z.`fblnOutOfTradingPattern`,
z.`fblnOverseasAddress`,
z.`fblnPredictedCreditAdjSpikeMid`,
z.`fblnPredictedExpensesSpikeHigh`,
z.`fblnPredictedExpensesSpikeMid`,
z.`fblnPredictedGSTSpikeHigh`,
z.`fblnPredictedGSTSpikeMid`,
z.`fblnPredictedSalesDipHigh`,
z.`fblnPredictedSalesDipMid`,
z.`fblnPredictedZeroSalesSpike`,
z.`fblnPricesIncGST`,
z.`fblnPriorSalesLTExpCrdAdjGross`,
z.`fblnProsecution`,
z.`fblnReceivesACC`,
z.`fblnReceivesMSDBenefit`,
z.`fblnReceivesMSDPension`,
z.`fblnReceivesStudentAllowance`,
z.`fblnRedList`,
z.`fblnRefundExceedsThreshold`,
z.`fblnRelatedEntityHasIssues`,
z.`fblnRiskyIPCountry`,
z.`fblnSalesLTExpAndCreditAdjGros`,
z.`fblnSelfInvoicing`,
z.`fblnShortfallPenaltyEvasion`,
z.`fblnSpecialAuditWork`,
z.`fblnSpecialTaxResidency`,
z.`fblnSuspiciousSourceFields`,
z.`fblnZeroRatedFinancialServices`,
z.`fcurAutomatedDisbursementLimit`,
z.`fcurCreditAdjustments`,
z.`fcurDynamicADL`,
z.`fcurDynamicADLToRefundRatio`,
z.`fcurGSTCollected`,
z.`fcurGSTNegative`,
z.`fcurGSTPaid_1`,
z.`fcurGSTPositive`,
z.`fcurIncIncomeToExpenses`,
z.`fcurIncomeToCreditAdj`,
z.`fcurIncomeToExpenses`,
z.`fcurIncreaseInTaxToPay`,
z.`fcurIncreasingRefundSlope`,
z.`fcurNilReturnRatio`,
z.`fcurPercentCreditReturnsEarlyF`,
z.`fcurPercentReturnsEarlyFiled`,
z.`fcurPredictedCreditAdjDiff`,
z.`fcurPredictedExpensesDiff`,
z.`fcurPredictedGSTDiff`,
z.`fcurPredictedGSTLinearDiff`,
z.`fcurPredictedSalesDiff`,
z.`fcurPredictedZeroSalesDiff`,
z.`fcurPriorIncomeToExpenses`,
z.`fcurPriorIncToExpForMonth`,
z.`fcurPriorSumCreditAdjustments`,
z.`fcurPriorSumExpenses`,
z.`fcurPriorSumGSTDebit`,
z.`fcurPriorSumSales`,
z.`fcurPriorTrendSlope`,
z.`fcurPrivateAssets`,
z.`fcurRefundToTurnoverRatio`,
z.`fcurSize`,
z.`fcurTaxChangeAbs`,
z.`fcurTaxDue`,
z.`fcurTaxDueAbs`,
z.`fcurTotalExpenses`,
z.`fcurTotalSales`,
z.`fcurTurnover`,
z.`fcurZeroRatedSupplies`,
z.`fdblModelScore`,
z.`fdtmAccountCease`,
z.`fdtmAccountCommence`,
z.`fdtmAccountReopened`,
z.`fdtmCustomerCease`,
z.`fdtmCustomerCommence`,
z.`fdtmDueDate`,
z.`fdtmDynamicADLFilingPeriod`,
z.`fdtmDynamicADLInvalidDate`,
z.`fdtmDynamicADLValidDate`,
z.`fdtmFilingPeriod`,
z.`fdtmForeignBankAccountUpdated`,
z.`fdtmIntegrityEvaluatedDate`,
z.`fdtmLastReceivedCrdReturn`,
z.`fdtmOriginalDateReceived`,
z.`fdtmReceived`,
z.`fdtmReleaseOrLetterDate`,
z.`flngAccountKey`,
z.`flngAmendedCount`,
z.`flngAnonymousTipCount`,
z.`flngAttachmentCount`,
z.`flngBackdatedDaysCount`,
z.`flngCompanyAge`,
z.`flngCreditReturnsLateFiled`,
z.`flngCustomerKey`,
z.`flngDaysEarlyFiled`,
z.`flngIncreasingRefundCount`,
z.`flngIndividualAge`,
z.`flngIndPartnerOver85`,
z.`flngIndPartnerUnder25`,
z.`flngIndShareholderOver85`,
z.`flngIndShareholderUnder25`,
z.`flngOutstandingReturns`,
z.`flngPriorAvgDaysEarlyFiled`,
z.`flngPriorDiscrepancyCount`,
z.`flngPriorNegativeIntegrityActi`,
z.`flngRelatedOnACC`,
z.`flngRelatedOnBenefit`,
z.`flngRelatedOnPension`,
z.`flngRelatedOnStudentAllowance`,
z.`flngRelatedSuspectedOfFraud`,
z.`flngReopendAfterMonths`,
z.`flngReturnDocVer`,
z.`flngWebRequestKey`,
z.`fstrAccountingBasisRtn`,
z.`fstrAccountName`,
z.`fstrAmendReason`,
z.`fstrBankAccountNumber`,
z.`fstrBankRoutingNumber`,
z.`fstrChangeReason`,
z.`fstrContributions_ModelData`,
z.`fstrCustomerClass`,
z.`fstrCustomerLevel`,
z.`fstrCustomerType`,
z.`fstrDistrictOffice`,
z.`fstrEntitySuspectedOfFraud`,
z.`fstrFilingFreq`,
z.`fstrFormFiled`,
z.`fstrFormTypeExpected`,
z.`fstrIPAddress`,
z.`fstrIPCity`,
z.`fstrIPCountry`,
z.`fstrIPLatitude`,
z.`fstrIPLongitude`,
z.`fstrIPRegion`,
z.`fstrIRDNumber_1`,
z.`fstrMissingFields`,
z.`fstrMissingFields_1`,
z.`fstrModelRiskBanding`,
z.`fstrNewBankAccount`,
z.`fstrOnlineFilingMethod`,
z.`fstrSectorDescription`,
z.`fstrSourceType`,
z.`fblnPreAudGroupProgramExists`,
z.`fcurPredictedGST`,
z.`fcurPredictedGSTAccuracy`,
z.`fcurPredictedGSTLinear`,
z.`fcurPredictedGSTLinearAccuracy`,
z.`fblnBankChanged`,
z.`fblnCreditColExceeds3TimesDebi`,
z.`fblnCreditColExceeds4TimesDebi`,
z.`fblnCreditReturnWithPaymentRec`,
z.`fblnCustomerIsChild`,
z.`fblnEmailChanged`,
z.`fblnExpensesCRAdjSales`,
z.`fblnFinalReturnIndicatedWithCr`,
z.`fblnHasCurrentAnonLead`,
z.`fblnHasPreviousAnonLead`,
z.`fblnHasSuspiciousAmount`,
z.`fblnIncreasingRefundPercentage`,
z.`fblnInitialFiling`,
z.`fblnIsBackdatedRegistration`,
z.`fblnIsBankrupt`,
z.`fblnIsFirstReturnAndRefund`,
z.`fblnIsNonResidentIndividual`,
z.`fblnIsNZIPAddress`,
z.`fblnIsOnHybridBasis`,
z.`fblnIsOverseasCompany`,
z.`fblnIsStruckOff`,
z.`fblnModelNegativeResultThresho`,
z.`fblnModelScoreThreshold`,
z.`fblnMultipleBankAccountChanges`,
z.`fblnOnlineGSTKnown`,
z.`fblnOpenAuditOnAccount`,
z.`fblnOutstandingReturnAndCredit`,
z.`fblnPreviousNegativeResult`,
z.`fblnPriorReturnExists`,
z.`fblnRedListAssociated`,
z.`fblnRedListOtherAccounts`,
z.`fblnShortfallPenalty`,
z.`fblnTempRelease`,
z.`fblnTotalCreditExceeds3TimesDe`,
z.`fblnTotalCreditExceeds4TimesDe`,
z.`fcurDiscrepancyEstimate`,
z.`fcurPercentCreditReturns`,
z.`fcurPriorCreditAmount`,
z.`fcurSuspiciousNumberCreditAdj`,
z.`fcurUpliftPriorYear`,
z.`fcurUpliftPriorYearCredit`,
z.`fdblDiscrepancyLikelihoodNumer`,
z.`fdtmAccountCeasedDate`,
z.`fdtmCustomerCeaseDate`,
z.`fdtmDateOneYearAgo`,
z.`fdtmLastReviewCompleted`,
z.`fdtmPriorCreditPeriod`,
z.`flngConsecRefundIncreaseCount`,
z.`flngCreditReturnCount`,
z.`flngEarlyFileReturnCount`,
z.`flngExpensesCalculationModifie`,
z.`flngExpensesModifiedCount`,
z.`flngHadChangeToAccountingBasis`,
z.`flngNumberReturnsHeldAccount`,
z.`flngSalesModifiedCount`,
z.`flngSusPrcntCreditAdjustments`,
z.`flngSusPrcntExpenses`,
z.`flngSusPrcntGSTCollected`,
z.`flngSusPrcntGSTPaid`,
z.`flngSusPrcntSales`,
z.`flngSusPrcntWeightedTotal`,
z.`flngTotalExpensesModifiedCount`,
z.`flngYearsSinceOriginalFiled`,
z.`flngZeroRatedSuppliesModifiedC`,
z.`fstrModelScore`,
z.`fstrModelScore2`,
z.`fstrModelScore3`,
z.`fstrNegativeResultLikelihood`,
z.`fstrSector`,
z.`fstrSpike`,
z.`fstrTaxChangeLikelihood`,
z.`fstrIRDNumber`,
z.`fblnCreditAdjSpikeFromZero`,
z.`fblnCreditColExceeds2TimesDebi`,
z.`fblnCreditColExceedsDebitCol`,
z.`fblnCurrentAudit`,
z.`fblnDifferentFormFiledThanExpe`,
z.`fblnExpensesSpikeFromZero`,
z.`fblnFirstRefundRisky`,
z.`fblnFirstVersionAfterConverted`,
z.`fblnImporter`,
z.`fblnIsTaxAgent`,
z.`fblnLastVersionAmended`,
z.`fblnSalesSpikeFromZero`,
z.`fblnSpike1CreditAdjustments`,
z.`fblnSpike1Expenses`,
z.`fblnSpike1GSTCredit`,
z.`fblnSpike1Sales`,
z.`fblnSpike1ZeroSupplies`,
z.`fblnSpike2CreditAdjustments`,
z.`fblnSpike2Expenses`,
z.`fblnSpike2GSTCredit`,
z.`fblnSpike2Sales`,
z.`fblnSpike2ZeroSupplies`,
z.`fblnSpike3CreditAdjustments`,
z.`fblnSpike3Expenses`,
z.`fblnSpike3GSTCredit`,
z.`fblnSpike3Sales`,
z.`fblnSpike3ZeroSupplies`,
z.`fblnSpike4CreditAdjustments`,
z.`fblnSpike4Expenses`,
z.`fblnSpike4GSTCredit`,
z.`fblnSpike4Sales`,
z.`fblnSpike4ZeroSupplies`,
z.`fblnTotalCreditExceeds2TimesDe`,
z.`fblnTotalCreditExceedsDebit`,
z.`fblnTotalDebitExceeds2TimesCre`,
z.`fblnTotalDebitExceeds3TimesCre`,
z.`fblnTotalDebitExceedsCredits`,
z.`fblnUnpolicedFiler`,
z.`fblnZeroRatedSpikeFromZero`,
z.`fcurConvertedTax`,
z.`fcurIncomeToCreditAdjChange`,
z.`fcurInitialReturnTotalAmount`,
z.`fcurPriorAvgCreditAdjustments`,
z.`fcurPriorAvgCreditGST`,
z.`fcurPriorAvgExpenses`,
z.`fcurPriorAvgSuspiciousCreditAd`,
z.`fcurPriorAvgSuspiciousExpenses`,
z.`fcurPriorAvgSuspiciousSales`,
z.`fcurPriorAvgSuspiciousZeroSupp`,
z.`fcurPriorAvgTotalSales`,
z.`fcurPriorAvgZeroSupplies`,
z.`fcurPriorIncomeToCreditAdj`,
z.`fcurPriorStdevCreditAdjustme_1`,
z.`fcurPriorStdevCreditAdjustment`,
z.`fcurPriorStdevExpenses`,
z.`fcurPriorStdevExpenses2`,
z.`fcurPriorStdevGSTCredit`,
z.`fcurPriorStdevGSTCredit2`,
z.`fcurPriorStdevSales`,
z.`fcurPriorStdevSales2`,
z.`fcurPriorStdevZeroSupplies`,
z.`fcurPriorStdevZeroSupplies2`,
z.`fcurPriorSumGSTCredit`,
z.`fcurPriorSumGSTCreditCollected`,
z.`fcurPriorSumGSTDebtCollected`,
z.`fcurPriorSumZeroSupplies`,
z.`fcurPriorYearTax`,
z.`fcurSuspiciousNumberExpenses`,
z.`fcurSuspiciousNumberSales`,
z.`fcurSuspiciousNumberZeroSuppli`,
z.`flngAccountAge`,
z.`flngDocVerLast`,
z.`flngIndividualPartnerCount`,
z.`flngIndividualShareholderCount`,
z.`flngNonIndividualPartnerCount`,
z.`flngNonIndividualShareholderCo`,
z.`flngNumberReturnsHeldCustomer`,
z.`flngPreviousReturnDocKey`,
z.`flngPriorCrdRtnRecWithin10Days`,
z.`flngPriorCreditReturnCount`,
z.`flngPriorCreditReturnsEarlyF_1`,
z.`flngPriorCreditReturnsEarlyFil`,
z.`flngPriorNilReturnCount`,
z.`flngPriorNoSalesReturnCount`,
z.`flngPriorReturnCount`,
z.`flngPriorReturnsEarlyFiled`,
z.`flngPriorRtnRecWithin10Days`,
z.`flngReturnsLateFiled`,
z.`flngTaxAgentClientCount`,
z.`fstrForeignBankAccountHash`,
z.`fstrPriorAccountingBasis`,
z.`fstrRegCircumstance`,
z.`fstrSectorLevel1`,
z.`fblnhasFAMAccount`,
z.`fblnInPrisonFile`,
z.`fblnIsFAMPartner`,
z.`fblnPrisonerOrRelatedInPrison`,
z.`fblnRelatedinPrisonFile`,
z.`fcurDebitAdjustments`,
z.`fcurReceivesAssitanceModel`,
z.`fstrAssistance_ModelData`,
z.`fblnCompromisedIdentity`,
z.`fblnBackdatedRegistration`,
z.`fblnFIRSTAccountHaltIndicator`,
z.`fblnMSDSuspectedofFraudIndicat`,
z.`fblnReturnHoldIndicator`,
z.`fblnSuspectedofFraudIndicator`,
z.`fdtmGreenListCeaseDate`,
z.`flngGSTAccountDocKey`,
z.`fstrAccountingBasis`,
z.`fstrAccountingBasisForPeriod`,
z.`fstrSuspectedofFraudIndicatorR`,
z.insert_object_run_key
 FROM ${var:source_db}.frd_tblfrdplandata_1336541184 z
left outer JOIN ${var:source_db}.app_tblCustomerLevel cl on 
z.flngcustomerkey=cl.flngcustomerkey 
WHERE 
(nvl(cl.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N')
;


