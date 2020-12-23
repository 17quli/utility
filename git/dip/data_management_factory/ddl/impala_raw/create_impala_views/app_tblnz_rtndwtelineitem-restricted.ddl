CREATE VIEW ${var:view_db}.app_tblnz_rtndwtelineitem
AS SELECT
z.fi64LineItemKey,
z.flngVer,
z.flngVerLast,
z.fstrRecipientIdentifier,
z.fstrRecipientName,
z.fstrRecipientIRD,
z.fdtmRecipientDOB,
z.fstrRecipientPhone,
z.fstrRecipientEmail,
z.fstrRecipientAddress,
z.fstrRecipientCountry,
z.fstrRecipientCountryCode,
z.fcurRecipientPercentage,
z.fblnJointAccountIndicator,
z.flngJointAccountHolders,
z.fcurGrossAmount,
z.fcurDeducted,
z.fblnOverridePercentages,
z.flngShares,
z.fdtmPayment,
z.fdtmDeclared,
z.fblnBonus,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_rtndwtelineitem z
left outer join 
(select fstrID, 'Y' as tblcustmatch, cl.fstrcustomerlevel
 from dev_raw.app_tblID id 
 inner join dev_raw.app_tblcustomerlevel cl
 on id.flngCustomerKey = cl.flngCustomerKey
  where 
  id.fstrIDtype = 'IRD' 
  and id.fblnDefault = 1
  and nvl(id.record_active_flag, 'Y') = 'Y'
  and nvl(id.record_deleted_flag, 'N') = 'N'
  and nvl(cl.record_active_flag, 'Y') = 'Y'
  and nvl(cl.record_deleted_flag, 'N') = 'N'
  ) idcl
on cast(z.fstrRecipientIRD as INT) = cast(idcl.fstrID as INT)  
where
nvl(idcl.fstrcustomerlevel, 'STD') = 'STD' 
;