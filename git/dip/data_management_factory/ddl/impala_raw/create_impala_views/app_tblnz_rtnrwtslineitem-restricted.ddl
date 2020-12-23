CREATE VIEW ${var:view_db}.app_tblnz_rtnrwtslineitem
AS SELECT
z.fi64LineItemKey,
z.flngVer,
z.flngVerLast,
z.fdtmPeriod,
z.fstrRecipientIRD,
z.fstrRecipientStatus,
z.fstrRecipientName,
z.fstrRecipientAddress1,
z.fstrRecipientAddress2,
z.fblnJointOwnership,
z.fcurGrossDividends,
z.fcurImputationCredits,
z.fcurFDPCredits,
z.fcurRWTDeducted,
z.fstrPayerIRD,
z.fstrPayerName,
z.fstrPayerAddress1,
z.fstrPayerAddress2,
z.fdtmPayerDateDeducted,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_rtnrwtslineitem z 
left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${source_db}.app_tblid where fstrIDType = 'IRD' AND record_active_flag = 'Y' AND record_deleted_flag= 'N') id1
on cast(z.fstrPayerIRDint AS int) = cast(id1.fstrID as int) 
left outer JOIN ${source_db}.app_tblCustomerLevel cl1 on 
id1.flngcustomerkey=cl1.flngcustomerkey 
left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${source_db}.app_tblid where fstrIDType = 'IRD' AND record_active_flag = 'Y' AND record_deleted_flag= 'N') id2
on cast(z.fstrRecipientIRD as int) = cast(id2.fstrID as int) 
left outer JOIN ${source_db}.app_tblCustomerLevel cl2 on 
id2.flngcustomerkey=cl2.flngcustomerkey 
WHERE 
(nvl(cl1.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl1.record_active_flag, 'Y') = 'Y' AND nvl(cl1.record_deleted_flag, 'N') = 'N')
and
(nvl(cl2.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl2.record_active_flag, 'Y') = 'Y' AND nvl(cl2.record_deleted_flag, 'N') = 'N');