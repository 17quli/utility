CREATE VIEW ${var:view_db}.app_tblnz_incomepsoattributes
AS SELECT
z.fi64IncomeKey,
z.flngVer,
z.flngVerLast,
z.flngReturnKey,
z.flngItemNumber,
z.flngRtnPsoVerLast,
z.fstrIRDNumber,
z.fstrEmployeeName,
z.fstrSurname,
z.fstrFirstName,
z.fstrTaxCode,
z.fdtmStart,
z.fdtmStop,
z.fdtmPayPeriodStart,
z.fdtmPayPeriodEnd,
z.fstrPayFrequency,
z.fblnPayment,
z.fstrCSCode,
z.fcurGross,
z.fcurPAYE,
z.fcurEarnings,
z.fcurChildSupport,
z.fcurStudentLoan,
z.fcurKiwiSaverDeductions,
z.fcurKiwiSaverContributions,
z.fcurTaxCreditsDonations,
z.fcurTaxCreditsExtinguish,
z.fcurESCTDeductions,
z.fcurFamilyTaxCredits,
z.fcurHoursPaid,
z.fcurSLCIRDedPosting,
z.fcurSLBORDedPosting,
z.fcurKSEmployeeContRate,
z.fcurCECPosting,
z.fcurVECPosting,
z.fcurESSDedPosting,
z.fcurPriorPeriodGrossAdj,
z.fcurPriorPeriodPAYEAdj,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
from ${var:source_db}.app_tblnz_incomepsoattributes z
left outer join 
(select fstrID, cl.fstrcustomerlevel
 from ${var:source_db}.app_tblID id 
 inner join ${var:source_db}.app_tblcustomerlevel cl
 on id.flngCustomerKey = cl.flngCustomerKey
  where 
  id.fstrIDtype = 'IRD' 
  and id.flngver = 0 
  and id.fblnDefault = 1
  and nvl(id.record_active_flag, 'Y') = 'Y'
  and nvl(id.record_deleted_flag, 'N') = 'N'
  and nvl(cl.record_active_flag, 'Y') = 'Y'
  and nvl(cl.record_deleted_flag, 'N') = 'N'
  ) idcl
on cast(z.fstrirdNumber as INT) = cast(idcl.fstrID as INT)  
where
nvl(idcl.fstrcustomerlevel, 'STD') = 'STD';