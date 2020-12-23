CREATE VIEW ${var:view_db}.app_tblnz_calllog 
AS SELECT
z.flngVisitKey, z.flngVer, z.flngVerLast, 
z.fstrIrdNumber, 
z.fstrAuthIRDNumber, 
z.flngChildVisitKey, z.fstrUpdateReason, 
z.fstrIvrPath, z.fstrWho, 
z.fdtmWhen, 
z.record_effective_timestamp, 
z.record_expiry_timestamp, 
z.record_active_flag, 
z.record_deleted_flag, 
z.insert_object_run_key, 
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_calllog z 
LEFT OUTER JOIN 
(select fstrID, cl.fstrcustomerlevel
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
ON idcl1.fstrid = z.fstrIrdNumber 
LEFT OUTER JOIN 
(select fstrID, cl.fstrcustomerlevel
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
ON idcl2.fstrid = z.fstrAuthIRDNumber 
WHERE 
nvl(idcl1.fstrcustomerlevel, 'STD') = 'STD'
and nvl(idcl2.fstrcustomerlevel, 'STD') = 'STD';