create view ${var:view_db}.app_tblnz_ledccactions
as select 
z.flngdockey,
z.fstraction1,
z.fstraction1override,
z.fstraction1comment,
z.fdtmaction1suggested,
z.fstraction2,
z.fstraction2override,
z.fstraction2comment,
z.fdtmaction2suggested,
z.fstraction3,
z.fstraction3override,
z.fstraction3comment,
z.fdtmaction3suggested,
z.fblnfromdiscovery,
z.fstrportfolio,
z.fstrcampaignname,
z.flngcollectkey,
z.fstrwho,
z.fdtmwhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 from ${var:source_db}.app_tblnz_ledccactions z
;
