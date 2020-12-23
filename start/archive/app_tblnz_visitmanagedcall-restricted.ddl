CREATE VIEW ${var:view_db}.app_tblnz_visitmanagedcall 
AS SELECT z.flngDockey, z.fstrCallerIrdNumber, z.fstrAuthorisedIrdNumber,
 z.fstrTaxAgentName, z.fstrVoiceEnrolStatus, z.fstrVoiceOptOutStatus, 
z.fstrTransferReason, z.fstrCallerIntentCorrect, z.fstrCallerIntent, 
z.fstrCorrectedIntent, z.fstrCallQueue, z.fstrStageOneFeedback, z.fblnVirtualHold, 
z.fblnContactDetailsChecked, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, 
z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, 
z.update_object_run_key 
FROM ${var:source_db}.app_tblnz_visitmanagedcall z 
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
ON idcl1.fstrid = z.fstrcallerirdnumber 
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
ON idcl2.fstrid = z.fstrAuthorisedIrdNumber 
WHERE 
nvl(idcl1.fstrcustomerlevel, 'STD') = 'STD'
and nvl(idcl2.fstrcustomerlevel, 'STD') = 'STD';