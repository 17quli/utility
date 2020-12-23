CREATE VIEW ${var:view_db}.app_tbldocposttransaction AS SELECT 
z.flngDocKey, z.fstrField, z.flngTableRow, z.flngDocVerLast, z.flngVer, z.flngVerLast, z.fintPosting, 
z.fi64SourceKey, z.fstrSource, z.fstrIdType, z.fstrId, z.fstrNameControl, z.flngcustomerkey, z.flngAccountKey, z.fstrAccountType, 
z.fdtmFilingPeriod, z.flngBillItemKey, z.fstrBillType, z.fdtmBillDue, z.fstrGroup, z.flngTransKey, z.fstrTransType, 
z.fdtmEffect, z.fdtmReport, z.fcurAmount, z.fintWorkStatus, z.fblnProcessed, z.fdtmReviewed, z.fdtmPosted, z.fdtmReversed, z.fblnUpdatePeriod, z.fstrWho, z.fdtmWhen, 
z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key 

FROM ${var:source_db}.app_tbldocposttransaction z

left outer join ${var:source_db}.app_tblcustomerlevel cl
on z.flngCustomerKey = cl.flngCustomerKey
where 
nvl(cl.record_active_flag, 'Y') = 'Y'
and nvl(cl.record_deleted_flag, 'N') = 'N'
and nvl(cl.fstrcustomerlevel, 'STD') = 'STD';