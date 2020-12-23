
CREATE VIEW ${var:view_db}.app_tblnz_rtnrwt
AS SELECT
z.flngDocKey,
z.fstrPayeeIRDNumber,
z.fdtmPeriod,
z.fblnJointOwnership,
z.fcurGrossDividends,
z.fcurImputationCredits,
z.fcurFDPCredits,
z.fcurRWTDeducted,
z.fstrPayerIRDNumber,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_rtnrwt z
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
  ) idcl1
on cast(z.fstrPayeeIRDNumber as INT) = cast(idcl1.fstrID as INT)
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
  ) idcl2
on cast(z.fstrPayerIRDNumber as INT) = cast(idcl2.fstrID as INT)


where
nvl(idcl1.fstrcustomerlevel, 'STD') = 'STD' and 
nvl(idcl2.fstrcustomerlevel, 'STD') = 'STD'

;