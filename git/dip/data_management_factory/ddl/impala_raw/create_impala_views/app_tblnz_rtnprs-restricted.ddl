CREATE VIEW ${var:view_db}.app_tblnz_rtnprs
AS SELECT
z.flngReturnKey,
z.flngItemNumber,
z.flngVer,
z.flngVerLast,
z.fblnInError,
z.fstrEmployerIRD,
z.fstrEmployerName,
z.fstrEmployeeIRD,
z.fstrEmployeeName,
z.flngTimesPaid,
z.fblnOverrideValidation,
z.fblnInvalidFilingHistory,
z.fblnDuplicate,
z.fblnInvalidNumberEmployees,
z.fblnNoPILink,
z.fblnNoReturn,
z.fblnNoPayment,
z.fblnLateReturn,
z.fblnLargeEmployer,
z.fdtmDeleted,
z.fdtmProcessed,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
FROM ${var:source_db}.app_tblnz_rtnprs z
left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${var:source_db}.app_tblid where fstrIDType = 'IRD' AND record_active_flag = 'Y' AND record_deleted_flag= 'N') id1
on cast(z.fstrEmployerIRD as int) = cast(id1.fstrID as int) 
left outer JOIN ${var:source_db}.app_tblCustomerLevel cl1 on 
id1.flngcustomerkey=cl1.flngcustomerkey 
left join (select DISTINCT fstrID,fstrIDType,flngcustomerkey from ${var:source_db}.app_tblid where fstrIDType = 'IRD' AND record_active_flag = 'Y' AND record_deleted_flag= 'N') id2
on cast(z.fstrEmployeeIRD as int) = cast(id2.fstrID as int) 
left outer JOIN ${var:source_db}.app_tblCustomerLevel cl2 on 
id2.flngcustomerkey=cl2.flngcustomerkey 
WHERE 
(nvl(cl1.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl1.record_active_flag, 'Y') = 'Y' AND nvl(cl1.record_deleted_flag, 'N') = 'N')
and
(nvl(cl2.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl2.record_active_flag, 'Y') = 'Y' AND nvl(cl2.record_deleted_flag, 'N') = 'N')
;



;