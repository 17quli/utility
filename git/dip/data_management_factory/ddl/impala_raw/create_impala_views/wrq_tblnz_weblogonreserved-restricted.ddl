CREATE VIEW ${var:view_db}.wrq_tblnz_weblogonreserved
AS SELECT
z.fi64ReservationKey,
z.flngVer,
z.flngVerLast,
z.flngCustomerKey,
z.flngWebLogonKey,
z.fstrWebLogon,
z.fstrWebName,
z.fstrEmail,
z.fstrCountryCode,
z.fstrPhone,
z.fstrNotificationPreference,
z.fdtmReserved,
z.fdtmInvalidated,
z.fstrReservedApplication,
z.fi64ReservedSourceKey,
z.fstrReservedSourceCategory,
z.fstrReservedSourceType,
z.fstrActivationType,
z.fstrSMSCode,
z.fdtmReminderTimerStart,
z.fdtmReminderSent,
z.flngReminderEmailKey,
z.fblnNoExpire,
z.fblnActivated,
z.fdtmWLCreatedDate,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.wrq_tblnz_weblogonreserved z
LEFT OUTER JOIN
(select wl.fstrWebLogon, cl.fstrcustomerlevel
 from ${var:source_db}.wrq_tblweblogon  wl
 inner join ${var:source_db}.app_tblcustomerlevel cl
 on wl.flngCustomerKey = cl.flngCustomerKey
  where 
 nvl(wl.record_active_flag, 'Y') = 'Y'
  and nvl(wl.record_deleted_flag, 'N') = 'N'
  and nvl(cl.record_active_flag, 'Y') = 'Y'
  and nvl(cl.record_deleted_flag, 'N') = 'N'
  ) wlcl
on z.fstrWebLogon=wlcl.fstrWebLogon 
where
nvl(wlcl.fstrcustomerlevel, 'STD') = 'STD';