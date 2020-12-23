CREATE VIEW ${var:view_db}.app_tblnz_rtnitnshrlineitem
AS SELECT 
z.fi64LineItemKey,
z.flngVer,
z.flngVerLast,
z.fstrShareholderIRD,
z.fcurAIMShareholderTaxCredits,
z.fcurShareholderRemuneration,
z.fcurShareholderLoans,
z.fcurShareholderBalance,
z.fcurShareholderOffsets,
z.fcurShareholderSubventions,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_rtnitnshrlineitem z
left outer join 
${var:source_db}.app_tblcustomerinfo ci
on ci.fstrid = z.fstrShareholderIRD
 where 
  ci.fstridtype = 'IRD'
AND nvl(ci.record_active_flag,'Y')='Y' 
AND nvl(ci.record_deleted_flag, 'N') = 'N' 
  and nvl(ci.fstrCustomerLevel, 'STD') = 'STD';
;

