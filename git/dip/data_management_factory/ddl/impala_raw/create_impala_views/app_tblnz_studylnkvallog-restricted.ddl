CREATE VIEW ${var:view_db}.app_tblnz_studylnkvallog
AS SELECT
z.fi64ValidateLogKey,
z.flngDocKey,
z.flngCustomerKey,
z.fstrCorrelationID,
z.fstrIRDNumber,
z.fstrFamilyName,
z.fstrMiddleName,
z.fstrFirstName,
z.fdtmApplicationDate,
z.fdtmDOB,
z.fstrAccountType,
z.fintValidateIRD,
z.fintValidateDOB,
z.fintValidateName,
z.fintValidateDebt,
z.fblnPassedValidation,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
FROM ${var:source_db}.app_tblnz_studylnkvallog z
left outer join 
${var:source_db}.app_tblcustomerlevel cl 
on z.flngcustomerkey = cl.flngcustomerkey
where nvl(cl.fstrcustomerlevel, 'STD') = 'STD' 
  and nvl(cl.record_active_flag, 'Y') = 'Y' 
  and nvl(cl.record_deleted_flag, 'N') = 'N';