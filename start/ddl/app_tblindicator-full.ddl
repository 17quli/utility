CREATE VIEW ${var:view_db}.app_tblindicator AS
SELECT z.FLNGINDICATORKEY, z.FLNGVER, z.FLNGVERLAST, z.FINTLEVEL, z.FLNGCUSTOMERKEY, z.FINTPROFILENUMBER, z.FLNGACCOUNTKEY, z.FSTRINDICATOR, z.FDTMCOMMENCE, z.FDTMFILINGPERIOD, z.FDTMFILINGPERIODTO, z.FCURAMOUNT, z.FDTMCEASE, z.FSTRREASON, z.FDTMCOMMENCE1, z.FDTMCEASE1, z.flngCrmKey, z.FSTRCOMMENT, z.FSTRUSER, z.flngDocKey, z.fblnActive, z.FSTRWHO, z.FDTMWHEN, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblindicator z;
