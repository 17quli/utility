CREATE VIEW ${var:view_db}.app_tblnz_kssresidual
AS SELECT
z.flngReturnKey,
z.flngItemNumber,
z.fstrContributionType,
z.fcurContributionAmount,
z.fdtmPayDayPeriod,
z.fi64ContributionKey,
z.flngMemberAccountKey,
z.fstrMemberIRD,
z.flngRelationshipKey,
z.flngEmployerCustomerKey,
z.flngEmployerAccountKey,
z.fblnRegister,
z.flngCaseKey,
z.fblnWorkItem,
z.flngWorkKey,
z.fblnPartialOptOut,
z.fblnComplete,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_kssresidual z
LEFT OUTER JOIN ${var:source_db}.app_tblaccount ac 
ON CAST (z.flngMemberAccountKey AS INT) = CAST(ac.flngAccountKey as INT)
LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel cl ON ac.flngcustomerkey = cl.flngcustomerkey 
WHERE nvl(cl.fstrCustomerLevel, 'STD') = 'STD' 
  AND nvl(cl.record_active_flag, 'Y') = 'Y' 
  AND nvl(cl.record_deleted_flag, 'N') = 'N' ;