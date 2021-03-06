CREATE TABLE ${var:target_db}.frd_tblfrdplandata_1336541184 (
`flngReturnKey` INT,
`fblnAccountAuditExists` SMALLINT,
`fblnAccountingBasisChanged` SMALLINT,
`fblnAfter15DaysReceived` SMALLINT,
`fblnAgentRedList` SMALLINT,
`fblnAmended` SMALLINT,
`fblnAuditAmended` SMALLINT,
`fblnAuditExists` SMALLINT,
`fblnAuditGroupExists` SMALLINT,
`fblnAuditInLast5Years` SMALLINT,
`fblnAuditStageUpdCnvReturns` SMALLINT,
`fblnBankAccountFlaggedAsFraud` SMALLINT,
`fblnBankAccountPrevCleared` SMALLINT,
`fblnComComIndicator` SMALLINT,
`fblnCreditOriginal` SMALLINT,
`fblnCreditTransfer` SMALLINT,
`fblnDeceased` SMALLINT,
`fblnDefaultAssessment` SMALLINT,
`fblnDifferentFormFiledThenExpe` SMALLINT,
`fblnDynamicADLExceedsRefund` SMALLINT,
`fblnEarlyFiled` SMALLINT,
`fblnExceedsModelThreshold` SMALLINT,
`fblnExcessiveSourceFieldModifi` SMALLINT,
`fblnExpExceedIncHasCrdDebAdj` SMALLINT,
`fblnExporter` SMALLINT,
`fblnFirstCreditReturn` SMALLINT,
`fblnFirstTimeFiler` SMALLINT,
`fblnForeignBankAccount` SMALLINT,
`fblnGreenList` SMALLINT,
`fblnGSTOnElectronicServices` SMALLINT,
`fblnHasICRCase` SMALLINT,
`fblnHasPrisonAddress` SMALLINT,
`fblnHasTaxAgent` SMALLINT,
`fblnHighestRefund` SMALLINT,
`fblnHighPriorIncomeToExpenses` SMALLINT,
`fblnHighRiskSector` SMALLINT,
`fblnHospiceFiler` SMALLINT,
`fblnIdenticalExpensesAndCrdGrs` SMALLINT,
`fblnIdenticalExpensesAndCredit` SMALLINT,
`fblnIdenticalGSTPaidAndCreditA` SMALLINT,
`fblnIdenticalSalesAndExpenses` SMALLINT,
`fblnIdenticialGSTPaidAndGSTCol` SMALLINT,
`fblnIncIncomeToLowForExpenses` SMALLINT,
`fblnInsolvent` SMALLINT,
`fblnIPAnonymizerUsed` SMALLINT,
`fblnIPMarkedAsFraud` SMALLINT,
`fblnIsNegativeCreditLast6Retur` SMALLINT,
`fblnLargeEnterprise` SMALLINT,
`fblnLE_SpecialAudit` SMALLINT,
`fblnLongStartup` SMALLINT,
`fblnNoCreditReviewInLastYear` SMALLINT,
`fblnNoIncomeExpensesAboveZero` SMALLINT,
`fblnNoSalesPrior3ExpensesClaim` SMALLINT,
`fblnOutOfTradingPattern` SMALLINT,
`fblnOverseasAddress` SMALLINT,
`fblnPredictedCreditAdjSpikeMid` SMALLINT,
`fblnPredictedExpensesSpikeHigh` SMALLINT,
`fblnPredictedExpensesSpikeMid` SMALLINT,
`fblnPredictedGSTSpikeHigh` SMALLINT,
`fblnPredictedGSTSpikeMid` SMALLINT,
`fblnPredictedSalesDipHigh` SMALLINT,
`fblnPredictedSalesDipMid` SMALLINT,
`fblnPredictedZeroSalesSpike` SMALLINT,
`fblnPricesIncGST` SMALLINT,
`fblnPriorSalesLTExpCrdAdjGross` SMALLINT,
`fblnProsecution` SMALLINT,
`fblnReceivesACC` SMALLINT,
`fblnReceivesMSDBenefit` SMALLINT,
`fblnReceivesMSDPension` SMALLINT,
`fblnReceivesStudentAllowance` SMALLINT,
`fblnRedList` SMALLINT,
`fblnRefundExceedsThreshold` SMALLINT,
`fblnRelatedEntityHasIssues` SMALLINT,
`fblnRiskyIPCountry` SMALLINT,
`fblnSalesLTExpAndCreditAdjGros` SMALLINT,
`fblnSelfInvoicing` SMALLINT,
`fblnShortfallPenaltyEvasion` SMALLINT,
`fblnSpecialAuditWork` SMALLINT,
`fblnSpecialTaxResidency` SMALLINT,
`fblnSuspiciousSourceFields` SMALLINT,
`fblnZeroRatedFinancialServices` SMALLINT,
`fcurAutomatedDisbursementLimit` DECIMAL(19,4),
`fcurCreditAdjustments` DECIMAL(19,4),
`fcurDynamicADL` DECIMAL(19,4),
`fcurDynamicADLToRefundRatio` DECIMAL(19,4),
`fcurGSTCollected` DECIMAL(19,4),
`fcurGSTNegative` DECIMAL(19,4),
`fcurGSTPaid_1` DECIMAL(19,4),
`fcurGSTPositive` DECIMAL(19,4),
`fcurIncIncomeToExpenses` DECIMAL(19,4),
`fcurIncomeToCreditAdj` DECIMAL(19,4),
`fcurIncomeToExpenses` DECIMAL(19,4),
`fcurIncreaseInTaxToPay` DECIMAL(19,4),
`fcurIncreasingRefundSlope` DECIMAL(19,4),
`fcurNilReturnRatio` DECIMAL(19,4),
`fcurPercentCreditReturnsEarlyF` DECIMAL(19,4),
`fcurPercentReturnsEarlyFiled` DECIMAL(19,4),
`fcurPredictedCreditAdjDiff` DECIMAL(19,4),
`fcurPredictedExpensesDiff` DECIMAL(19,4),
`fcurPredictedGSTDiff` DECIMAL(19,4),
`fcurPredictedGSTLinearDiff` DECIMAL(19,4),
`fcurPredictedSalesDiff` DECIMAL(19,4),
`fcurPredictedZeroSalesDiff` DECIMAL(19,4),
`fcurPriorIncomeToExpenses` DECIMAL(19,4),
`fcurPriorIncToExpForMonth` DECIMAL(19,4),
`fcurPriorSumCreditAdjustments` DECIMAL(19,4),
`fcurPriorSumExpenses` DECIMAL(19,4),
`fcurPriorSumGSTDebit` DECIMAL(19,4),
`fcurPriorSumSales` DECIMAL(19,4),
`fcurPriorTrendSlope` DECIMAL(19,4),
`fcurPrivateAssets` DECIMAL(19,4),
`fcurRefundToTurnoverRatio` DECIMAL(19,4),
`fcurSize` DECIMAL(19,4),
`fcurTaxChangeAbs` DECIMAL(19,4),
`fcurTaxDue` DECIMAL(19,4),
`fcurTaxDueAbs` DECIMAL(19,4),
`fcurTotalExpenses` DECIMAL(19,4),
`fcurTotalSales` DECIMAL(19,4),
`fcurTurnover` DECIMAL(19,4),
`fcurZeroRatedSupplies` DECIMAL(19,4),
`fdblModelScore` DOUBLE,
`fdtmAccountCease` TIMESTAMP,
`fdtmAccountCommence` TIMESTAMP,
`fdtmAccountReopened` TIMESTAMP,
`fdtmCustomerCease` TIMESTAMP,
`fdtmCustomerCommence` TIMESTAMP,
`fdtmDueDate` TIMESTAMP,
`fdtmDynamicADLFilingPeriod` TIMESTAMP,
`fdtmDynamicADLInvalidDate` TIMESTAMP,
`fdtmDynamicADLValidDate` TIMESTAMP,
`fdtmFilingPeriod` TIMESTAMP,
`fdtmForeignBankAccountUpdated` TIMESTAMP,
`fdtmIntegrityEvaluatedDate` TIMESTAMP,
`fdtmLastReceivedCrdReturn` TIMESTAMP,
`fdtmOriginalDateReceived` TIMESTAMP,
`fdtmReceived` TIMESTAMP,
`fdtmReleaseOrLetterDate` TIMESTAMP,
`flngAccountKey` INT,
`flngAmendedCount` INT,
`flngAnonymousTipCount` INT,
`flngAttachmentCount` INT,
`flngBackdatedDaysCount` INT,
`flngCompanyAge` INT,
`flngCreditReturnsLateFiled` INT,
`flngCustomerKey` INT,
`flngDaysEarlyFiled` INT,
`flngIncreasingRefundCount` INT,
`flngIndividualAge` INT,
`flngIndPartnerOver85` INT,
`flngIndPartnerUnder25` INT,
`flngIndShareholderOver85` INT,
`flngIndShareholderUnder25` INT,
`flngOutstandingReturns` INT,
`flngPriorAvgDaysEarlyFiled` INT,
`flngPriorDiscrepancyCount` INT,
`flngPriorNegativeIntegrityActi` INT,
`flngRelatedOnACC` INT,
`flngRelatedOnBenefit` INT,
`flngRelatedOnPension` INT,
`flngRelatedOnStudentAllowance` INT,
`flngRelatedSuspectedOfFraud` INT,
`flngReopendAfterMonths` INT,
`flngReturnDocVer` INT,
`flngWebRequestKey` INT,
`fstrAccountingBasisRtn` VARCHAR(510),
`fstrAccountName` VARCHAR(510),
`fstrAmendReason` VARCHAR(510),
`fstrBankAccountNumber` VARCHAR(510),
`fstrBankRoutingNumber` VARCHAR(510),
`fstrChangeReason` VARCHAR(510),
`fstrContributions_ModelData` VARCHAR(32767),
`fstrCustomerClass` VARCHAR(510),
`fstrCustomerLevel` VARCHAR(510),
`fstrCustomerType` VARCHAR(510),
`fstrDistrictOffice` VARCHAR(510),
`fstrEntitySuspectedOfFraud` VARCHAR(32767),
`fstrFilingFreq` VARCHAR(510),
`fstrFormFiled` VARCHAR(510),
`fstrFormTypeExpected` VARCHAR(510),
`fstrIPAddress` VARCHAR(510),
`fstrIPCity` VARCHAR(510),
`fstrIPCountry` VARCHAR(510),
`fstrIPLatitude` VARCHAR(510),
`fstrIPLongitude` VARCHAR(510),
`fstrIPRegion` VARCHAR(510),
`fstrIRDNumber_1` VARCHAR(510),
`fstrMissingFields` VARCHAR(510),
`fstrMissingFields_1` VARCHAR(510),
`fstrModelRiskBanding` VARCHAR(510),
`fstrNewBankAccount` VARCHAR(510),
`fstrOnlineFilingMethod` VARCHAR(510),
`fstrSectorDescription` VARCHAR(510),
`fstrSourceType` VARCHAR(510),
`fblnPreAudGroupProgramExists` SMALLINT,
`fcurPredictedGST` DECIMAL(19,4),
`fcurPredictedGSTAccuracy` DECIMAL(19,4),
`fcurPredictedGSTLinear` DECIMAL(19,4),
`fcurPredictedGSTLinearAccuracy` DECIMAL(19,4),
`fblnBankChanged` SMALLINT,
`fblnCreditColExceeds3TimesDebi` SMALLINT,
`fblnCreditColExceeds4TimesDebi` SMALLINT,
`fblnCreditReturnWithPaymentRec` SMALLINT,
`fblnCustomerIsChild` SMALLINT,
`fblnEmailChanged` SMALLINT,
`fblnExpensesCRAdjSales` SMALLINT,
`fblnFinalReturnIndicatedWithCr` SMALLINT,
`fblnHasCurrentAnonLead` SMALLINT,
`fblnHasPreviousAnonLead` SMALLINT,
`fblnHasSuspiciousAmount` SMALLINT,
`fblnIncreasingRefundPercentage` SMALLINT,
`fblnInitialFiling` SMALLINT,
`fblnIsBackdatedRegistration` SMALLINT,
`fblnIsBankrupt` SMALLINT,
`fblnIsFirstReturnAndRefund` SMALLINT,
`fblnIsNonResidentIndividual` SMALLINT,
`fblnIsNZIPAddress` SMALLINT,
`fblnIsOnHybridBasis` SMALLINT,
`fblnIsOverseasCompany` SMALLINT,
`fblnIsStruckOff` SMALLINT,
`fblnModelNegativeResultThresho` SMALLINT,
`fblnModelScoreThreshold` SMALLINT,
`fblnMultipleBankAccountChanges` SMALLINT,
`fblnOnlineGSTKnown` SMALLINT,
`fblnOpenAuditOnAccount` SMALLINT,
`fblnOutstandingReturnAndCredit` SMALLINT,
`fblnPreviousNegativeResult` SMALLINT,
`fblnPriorReturnExists` SMALLINT,
`fblnRedListAssociated` SMALLINT,
`fblnRedListOtherAccounts` SMALLINT,
`fblnShortfallPenalty` SMALLINT,
`fblnTempRelease` SMALLINT,
`fblnTotalCreditExceeds3TimesDe` SMALLINT,
`fblnTotalCreditExceeds4TimesDe` SMALLINT,
`fcurDiscrepancyEstimate` DECIMAL(19,4),
`fcurPercentCreditReturns` DECIMAL(19,4),
`fcurPriorCreditAmount` DECIMAL(19,4),
`fcurSuspiciousNumberCreditAdj` DECIMAL(19,4),
`fcurUpliftPriorYear` DECIMAL(19,4),
`fcurUpliftPriorYearCredit` DECIMAL(19,4),
`fdblDiscrepancyLikelihoodNumer` DOUBLE,
`fdtmAccountCeasedDate` TIMESTAMP,
`fdtmCustomerCeaseDate` TIMESTAMP,
`fdtmDateOneYearAgo` TIMESTAMP,
`fdtmLastReviewCompleted` TIMESTAMP,
`fdtmPriorCreditPeriod` TIMESTAMP,
`flngConsecRefundIncreaseCount` INT,
`flngCreditReturnCount` INT,
`flngEarlyFileReturnCount` INT,
`flngExpensesCalculationModifie` INT,
`flngExpensesModifiedCount` INT,
`flngHadChangeToAccountingBasis` INT,
`flngNumberReturnsHeldAccount` INT,
`flngSalesModifiedCount` INT,
`flngSusPrcntCreditAdjustments` INT,
`flngSusPrcntExpenses` INT,
`flngSusPrcntGSTCollected` INT,
`flngSusPrcntGSTPaid` INT,
`flngSusPrcntSales` INT,
`flngSusPrcntWeightedTotal` INT,
`flngTotalExpensesModifiedCount` INT,
`flngYearsSinceOriginalFiled` INT,
`flngZeroRatedSuppliesModifiedC` INT,
`fstrModelScore` VARCHAR(510),
`fstrModelScore2` VARCHAR(510),
`fstrModelScore3` VARCHAR(510),
`fstrNegativeResultLikelihood` VARCHAR(510),
`fstrSector` VARCHAR(510),
`fstrSpike` VARCHAR(510),
`fstrTaxChangeLikelihood` VARCHAR(510),
`fstrIRDNumber` VARCHAR(510),
`fblnCreditAdjSpikeFromZero` SMALLINT,
`fblnCreditColExceeds2TimesDebi` SMALLINT,
`fblnCreditColExceedsDebitCol` SMALLINT,
`fblnCurrentAudit` SMALLINT,
`fblnDifferentFormFiledThanExpe` SMALLINT,
`fblnExpensesSpikeFromZero` SMALLINT,
`fblnFirstRefundRisky` SMALLINT,
`fblnFirstVersionAfterConverted` SMALLINT,
`fblnImporter` SMALLINT,
`fblnIsTaxAgent` SMALLINT,
`fblnLastVersionAmended` SMALLINT,
`fblnSalesSpikeFromZero` SMALLINT,
`fblnSpike1CreditAdjustments` SMALLINT,
`fblnSpike1Expenses` SMALLINT,
`fblnSpike1GSTCredit` SMALLINT,
`fblnSpike1Sales` SMALLINT,
`fblnSpike1ZeroSupplies` SMALLINT,
`fblnSpike2CreditAdjustments` SMALLINT,
`fblnSpike2Expenses` SMALLINT,
`fblnSpike2GSTCredit` SMALLINT,
`fblnSpike2Sales` SMALLINT,
`fblnSpike2ZeroSupplies` SMALLINT,
`fblnSpike3CreditAdjustments` SMALLINT,
`fblnSpike3Expenses` SMALLINT,
`fblnSpike3GSTCredit` SMALLINT,
`fblnSpike3Sales` SMALLINT,
`fblnSpike3ZeroSupplies` SMALLINT,
`fblnSpike4CreditAdjustments` SMALLINT,
`fblnSpike4Expenses` SMALLINT,
`fblnSpike4GSTCredit` SMALLINT,
`fblnSpike4Sales` SMALLINT,
`fblnSpike4ZeroSupplies` SMALLINT,
`fblnTotalCreditExceeds2TimesDe` SMALLINT,
`fblnTotalCreditExceedsDebit` SMALLINT,
`fblnTotalDebitExceeds2TimesCre` SMALLINT,
`fblnTotalDebitExceeds3TimesCre` SMALLINT,
`fblnTotalDebitExceedsCredits` SMALLINT,
`fblnUnpolicedFiler` SMALLINT,
`fblnZeroRatedSpikeFromZero` SMALLINT,
`fcurConvertedTax` DECIMAL(19,4),
`fcurIncomeToCreditAdjChange` DECIMAL(19,4),
`fcurInitialReturnTotalAmount` DECIMAL(19,4),
`fcurPriorAvgCreditAdjustments` DECIMAL(19,4),
`fcurPriorAvgCreditGST` DECIMAL(19,4),
`fcurPriorAvgExpenses` DECIMAL(19,4),
`fcurPriorAvgSuspiciousCreditAd` DECIMAL(19,4),
`fcurPriorAvgSuspiciousExpenses` DECIMAL(19,4),
`fcurPriorAvgSuspiciousSales` DECIMAL(19,4),
`fcurPriorAvgSuspiciousZeroSupp` DECIMAL(19,4),
`fcurPriorAvgTotalSales` DECIMAL(19,4),
`fcurPriorAvgZeroSupplies` DECIMAL(19,4),
`fcurPriorIncomeToCreditAdj` DECIMAL(19,4),
`fcurPriorStdevCreditAdjustme_1` DECIMAL(19,4),
`fcurPriorStdevCreditAdjustment` DECIMAL(19,4),
`fcurPriorStdevExpenses` DECIMAL(19,4),
`fcurPriorStdevExpenses2` DECIMAL(19,4),
`fcurPriorStdevGSTCredit` DECIMAL(19,4),
`fcurPriorStdevGSTCredit2` DECIMAL(19,4),
`fcurPriorStdevSales` DECIMAL(19,4),
`fcurPriorStdevSales2` DECIMAL(19,4),
`fcurPriorStdevZeroSupplies` DECIMAL(19,4),
`fcurPriorStdevZeroSupplies2` DECIMAL(19,4),
`fcurPriorSumGSTCredit` DECIMAL(19,4),
`fcurPriorSumGSTCreditCollected` DECIMAL(19,4),
`fcurPriorSumGSTDebtCollected` DECIMAL(19,4),
`fcurPriorSumZeroSupplies` DECIMAL(19,4),
`fcurPriorYearTax` DECIMAL(19,4),
`fcurSuspiciousNumberExpenses` DECIMAL(19,4),
`fcurSuspiciousNumberSales` DECIMAL(19,4),
`fcurSuspiciousNumberZeroSuppli` DECIMAL(19,4),
`flngAccountAge` INT,
`flngDocVerLast` INT,
`flngIndividualPartnerCount` INT,
`flngIndividualShareholderCount` INT,
`flngNonIndividualPartnerCount` INT,
`flngNonIndividualShareholderCo` INT,
`flngNumberReturnsHeldCustomer` INT,
`flngPreviousReturnDocKey` INT,
`flngPriorCrdRtnRecWithin10Days` INT,
`flngPriorCreditReturnCount` INT,
`flngPriorCreditReturnsEarlyF_1` INT,
`flngPriorCreditReturnsEarlyFil` INT,
`flngPriorNilReturnCount` INT,
`flngPriorNoSalesReturnCount` INT,
`flngPriorReturnCount` INT,
`flngPriorReturnsEarlyFiled` INT,
`flngPriorRtnRecWithin10Days` INT,
`flngReturnsLateFiled` INT,
`flngTaxAgentClientCount` INT,
`fstrForeignBankAccountHash` VARCHAR(510),
`fstrPriorAccountingBasis` VARCHAR(510),
`fstrRegCircumstance` VARCHAR(510),
`fstrSectorLevel1` VARCHAR(510),
`fblnhasFAMAccount` SMALLINT,
`fblnInPrisonFile` SMALLINT,
`fblnIsFAMPartner` SMALLINT,
`fblnPrisonerOrRelatedInPrison` SMALLINT,
`fblnRelatedinPrisonFile` SMALLINT,
`fcurDebitAdjustments` DECIMAL(19,4),
`fcurReceivesAssitanceModel` DECIMAL(19,4),
`fstrAssistance_ModelData` VARCHAR(32767),
`fblnCompromisedIdentity` SMALLINT,
`fblnBackdatedRegistration` SMALLINT,
`fblnFIRSTAccountHaltIndicator` SMALLINT,
`fblnMSDSuspectedofFraudIndicat` SMALLINT,
`fblnReturnHoldIndicator` SMALLINT,
`fblnSuspectedofFraudIndicator` SMALLINT,
`fdtmGreenListCeaseDate` TIMESTAMP,
`flngGSTAccountDocKey` INT,
`fstrAccountingBasis` VARCHAR(510),
`fstrAccountingBasisForPeriod` VARCHAR(510),
`fstrSuspectedofFraudIndicatorR` VARCHAR(510),
`fblnIncorrectlyReleasedGSTRetu` SMALLINT,
`fblnOtherReturnHasAction` SMALLINT,
`fblnOtherReturnsNotProcessed` SMALLINT,
`fblnOtherReturnHeld` SMALLINT,
insert_object_run_key INT

 )

  STORED AS PARQUET;