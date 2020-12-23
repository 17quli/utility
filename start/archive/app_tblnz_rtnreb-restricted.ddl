
CREATE VIEW ${var:view_db}.app_tblnz_rtnreb
AS SELECT
z.flngDocKey,
z.fcurSchoolDonations,
z.fcurReligiousDonations,
z.fcurRemainingDonations,
z.fcurTotalReceipt,
z.fcurCareAndHousePayments,
z.fcurCareAndHouseCredits,
z.fcurFinalTotal,
z.fstrPartnerIRD,
z.fstrTransferIRD,
z.fcurTransferAmount,
z.fblnWaitingOnIncome,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_rtnreb z
left outer join 
(select fstrID, 'Y' as tblcustmatch, cl.fstrcustomerlevel
 from ${var:source_db}.app_tblID id 
 inner join ${var:source_db}.app_tblcustomerlevel cl
 on id.flngCustomerKey = cl.flngCustomerKey
  where 
  id.fstrIDtype = 'IRD' 
  AND id.flngver = 0 
  AND id.fblnDefault = 1
  and nvl(id.record_active_flag, 'Y') = 'Y'
  and nvl(id.record_deleted_flag, 'N') = 'N'
  and nvl(cl.record_active_flag, 'Y') = 'Y'
  and nvl(cl.record_deleted_flag, 'N') = 'N'
  ) idcl1
on cast(z.fstrPartnerIRD as INT) = cast(idcl1.fstrID as INT)  
left outer join 
(select fstrID, 'Y' as tblcustmatch, cl.fstrcustomerlevel
 from ${var:source_db}.app_tblID id 
 inner join ${var:source_db}.app_tblcustomerlevel cl
 on id.flngCustomerKey = cl.flngCustomerKey
  where 
  id.fstrIDtype = 'IRD' 
  AND id.flngver = 0 
  AND id.fblnDefault = 1
  and nvl(id.record_active_flag, 'Y') = 'Y'
  and nvl(id.record_deleted_flag, 'N') = 'N'
  and nvl(cl.record_active_flag, 'Y') = 'Y'
  and nvl(cl.record_deleted_flag, 'N') = 'N'
  ) idcl2
on cast(z.fstrTransferIRD as INT) = cast(idcl2.fstrID as INT)  

where(
nvl(idcl1.fstrcustomerlevel, 'STD') = 'STD' and
nvl(idcl2.fstrcustomerlevel, 'STD') = 'STD' )
; 
