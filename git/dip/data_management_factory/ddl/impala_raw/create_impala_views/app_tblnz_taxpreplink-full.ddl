create view ${var:view_db}.app_tblnz_taxpreplink
as select 
z.flngdockey,
z.flngfromcustomerkey,
z.flnglinkkey,
z.fintfromprofilenumber,
z.flngfromaccountkey,
z.flngtocustomerkey,
z.finttoprofilenumber,
z.flngtoaccountkey,
z.fstrlinktype,
z.fblnmailredirect,
z.fblndisbursementredirect,
z.fdtmcommence,
z.fdtmcease,
z.fblnactive,
z.fstrwho,
z.fdtmwhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.app_tblnz_taxpreplink z
;
