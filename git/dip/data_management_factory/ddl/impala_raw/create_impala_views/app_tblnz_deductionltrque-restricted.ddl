CREATE VIEW ${VAR:view_db}.app_tblnz_deductionltrque
AS SELECT
z.flngDeductionQueueKey,
z.flngGarnisheeCustKey,
z.flngGarnisheeKey,
z.flngGarnishKey,
z.flngFolderKey,
z.fstrIRD,
z.fstrBehalfIRD,
z.fstrFormattedName,
z.fcurDebt,
z.fdtmReIssue,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
FROM ${VAR:source_db}.app_tblnz_deductionltrque z
left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${VAR:source_db}.app_tblid where fstrIDType = 'IRD' AND record_active_flag = 'Y' AND record_deleted_flag= 'N') id1
on cast(z.fstrIRD as int) = cast(id1.fstrID as int) 
left outer JOIN ${VAR:source_db}.app_tblCustomerLevel cl1 on 
id1.flngcustomerkey=cl1.flngcustomerkey 
left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${VAR:source_db}.app_tblid where fstrIDType = 'IRD' AND record_active_flag = 'Y' AND record_deleted_flag= 'N') id2
on cast(z.fstrBehalfIRD as int) = cast(id2.fstrID as int) 
left outer JOIN ${VAR:source_db}.app_tblCustomerLevel cl2 on 
id2.flngcustomerkey=cl2.flngcustomerkey 
WHERE 
(nvl(cl1.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl1.record_active_flag, 'Y') = 'Y' AND nvl(cl1.record_deleted_flag, 'N') = 'N')
and
(nvl(cl2.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl2.record_active_flag, 'Y') = 'Y' AND nvl(cl2.record_deleted_flag, 'N') = 'N')
;