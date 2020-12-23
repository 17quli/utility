CREATE VIEW ${var:view_db}.app_tblnz_rtnpropertysale
AS
SELECT
z.flngDocKey,
z.fblnBrightLineTest,
z.fstrPropertyTitleNumber,
z.fstrAddressLine1,
z.fstrAddressLine2,
z.fstrSuburb,
z.fstrCity,
z.fstrPostCode,
z.fdtmDateOfPurchase,
z.fdtmDateOfSale,
z.fcurSalePrice,
z.fcurPurchasePrice,
z.fcurDeductibleCosts,
z.fcurTotalCosts,
z.fcurNetProfitLoss,
z.fdblPercentageOwnership,
z.fcurShareOfNetProfitLoss,
z.fdtmWhen,
z.fstrWho,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
FROM ${var:source_db}.app_tblnz_rtnpropertysale z
WHERE z.flngdockey IN
	(SELECT DISTINCT dsd.flngdockey 
	FROM ${var:source_db}.app_tbldocsetdoc dsd
	JOIN ${var:source_db}.app_tblreturn tblret 
		on tblret.fi64docsetkey = dsd.fi64docsetkey
	JOIN ${var:source_db}.app_tblaccount tblacc 
		on tblacc.flngaccountkey = tblret.flngaccountkey
	INNER JOIN ${var:source_db}.app_tblcustomerinfo cl ON tblacc.flngcustomerkey = cl.flngcustomerkey
	WHERE
		nvl(tblacc.record_active_flag, 'Y') = 'Y'
		AND nvl(tblacc.record_deleted_flag, 'N') = 'N'
		AND nvl(cl.fstrcustomerlevel, 'STD') = 'STD'
		AND nvl(cl.record_active_flag, 'Y') = 'Y'
		AND nvl(cl.record_deleted_flag, 'N') = 'N'
	)
;