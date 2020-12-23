create view ${var:view_db}.wrq_tblweblogonactivity
as select 
z.fi64weblogonactivitykey,
z.flngweblogonkey,
z.fdtmlogon,
z.fstrsource,
z.fstrtype,
z.flngcustomerkey,
z.flngaccountkey,
z.fdtmfilingperiod,
z.flngadditionalkey,
z.fstrwho,
z.fdtmwhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.wrq_tblweblogonactivity z
;
