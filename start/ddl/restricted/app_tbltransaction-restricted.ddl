CREATE VIEW ${var:view_db}.app_tbltransaction AS
SELECT z.FLNGTRANSKEY, z.FLNGVER, z.FLNGACCOUNTKEY, z.FSTRTRANSTYPE, z.FCURAMOUNT, z.FDTMFILINGPERIOD, z.FLNGLINKTRANS, z.FDTMEFFECT, z.FSTRWHO, z.FDTMWHEN, z.insert_object_run_key FROM ${var:source_db}.app_tbltransaction z;
