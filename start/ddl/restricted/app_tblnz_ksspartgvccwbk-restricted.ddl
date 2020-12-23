CREATE VIEW ${var:view_db}.app_tblnz_ksspartgvccwbk AS
SELECT z.flngGVCClawbackRequestKey, z.flngMemberCustomerKey, z.flngMemberAccountKey, z.flngSchemeCustomerKey, z.flngSchemeAccountKey, z.fdtmStart, z.fdtmEnd, z.fdtmProcessed, z.insert_object_run_key FROM ${var:source_db}.app_tblnz_ksspartgvccwbk z;
