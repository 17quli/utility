CREATE VIEW ${var:view_db}.app_tblpayment AS
SELECT z.flngPaymentKey, z.flngVer, z.flngVerLast, z.fintAllocation, z.fstrSource, z.fstrPaymentType, 
z.fcurAmount, z.fdtmEffect, z.fintRetry, z.fblnQueued, z.fblnUser, z.fblnActive, z.fblnDirected, z.flngDockey, z.fstrIdType, z.fstrId, z.fstrAssociatedId, z.fstrAccountType,
 z.fdtmFilingPeriod, z.fstrVoucherType, z.fstrOvrIdType, z.fstrOvrId, z.fstrOvrAssociatedId, z.fstrOvrAccountType, z.fstrOvrVoucherType, z.fdtmOvrFilingPeriod, z.fstrDetails, 
z.fdtmCreated, z.fstrMedia, z.fstrEffType, z.fstrTraceType, z.fstrTrace, z.fstrFrgCurrType, z.fcurFrgAmount, z.fdblFrgRate, z.fstrTransitNum, z.fstrAccountNum, z.flngBatchKey, 
z.fintBatchSeq, z.fstrReason, z.fintProfile, z.fstrStatus, z.fstrValidationParms, z.fstrUnknown, z.fblnSuspended, z.fstrPaymentChanel, z.fstrDepositType, z.fdtmDeposit, z.fdtmReceived, z.fdtmStatus, 
z.fstrExternalId, z.flngCrmKey, z.fdtmBankAdjusted, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key,
 z.update_object_run_key FROM ${var:source_db}.app_tblpayment z	

left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${var:source_db}.app_tblid where record_active_flag = 'Y' AND record_deleted_flag= 'N') id
on (cast(z.fstrID as int) = cast(id.fstrID as int) AND (z.fstrIDType = id.fstrIDType))
left outer JOIN ${var:source_db}.app_tblCustomerLevel cl on 
id.flngcustomerkey=cl.flngcustomerkey 
WHERE 
(nvl(cl.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N');