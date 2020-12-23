CREATE VIEW ${var:view_db}.app_tblnz_accailsecurities
AS SELECT
z.flngDocKey,
z.fintSeq,
z.fstrSecurity,
z.fstrDescription,
z.fcurAmount,
z.fstrTerm,
z.fstrPurpose,
z.fblnZeroRating,
z.fstrPrincipal,
z.fdtmIssue,
z.fdtmRedemption,
z.fdtmCeaseDate,
z.fcurValueFace,
z.fcurValueRedemption,
z.fcurRate,
z.fblnAssociated,
z.fstrBorrowerName,
z.fstrBorrowerType,
z.fstrLenderName,
z.fstrLenderType,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_accailsecurities z
left join ${var:source_db}.app_tblaccount ac ON
Z.flngdockey = ac.flngdockey and ac.record_active_flag = 'Y' AND ac.record_deleted_flag= 'N'
left outer JOIN ${var:source_db}.app_tblCustomerLevel cl on 
ac.flngcustomerkey=cl.flngcustomerkey 
WHERE 
(nvl(cl.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N')
;