CREATE VIEW ${var:view_db}.app_tblnz_studylinkmaintainlg
AS SELECT 
z.fi64MaintainLogKey,
z.flngAccountKey,
z.fstrCorrelationID,
z.fstrIRDNumber,
z.fstrFamilyName,
z.fstrFirstName,
z.fstrMiddleName,
z.fdtmDOB,
z.fstrAccountType,
z.fstrAddressLine1,
z.fstrAddressLine2,
z.fstrSuburb,
z.fstrCity,
z.fstrPostCode,
z.fstrAddressAction,
z.fblnAddressProcessed,
z.fstrPhoneHome,
z.fstrPhoneHomeAction,
z.fblnPhoneHomeProcessed,
z.fstrPhoneWork,
z.fstrPhoneWorkAction,
z.fblnPhoneWorkProcessed,
z.fstrPhoneMobile,
z.fstrPhoneMobileAction,
z.fblnPhoneMobileProcessed,
z.fstrEmail,
z.fstrEmailAction,
z.fblnEmailProcessed,
z.fdtmReceived,
z.fdtmProcessed,
z.fstrWho,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag, 
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.app_tblnz_studylinkmaintainlg z
left join 
${var:source_db}.app_tblaccount ac
ON z.flngAccountKey = ac.flngAccountKey
left join 
${var:source_db}.app_tblcustomerinfo cl 
ON ac.flngcustomerkey = cl.flngcustomerkey
WHERE
nvl(ac.record_active_flag, 'Y') = 'Y'
AND nvl(ac.record_deleted_flag, 'N') = 'N'
AND nvl(cl.fstrcustomerlevel, 'STD') = 'STD'
AND nvl(cl.record_active_flag, 'Y') = 'Y'
AND nvl(cl.record_deleted_flag, 'N') = 'N'

;