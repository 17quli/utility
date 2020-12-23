CREATE VIEW ${var:view_db}.app_tblvisit AS
SELECT z.flngVisitKey, z.flngVer, z.flngVerLast, z.fstrVisitSource, z.fstrVisitCategory, z.fstrVisitSubCategory, z.flngFolderKey, z.flngcustomerkey, z.fblnUnregisteredVisitor, z.fi64NameKey, z.fi64AddressKey, z.fstrVisitId, z.fstrTicketId, z.fstrExternalId, z.fstrIdType, z.fstrId, z.fstrCountry, z.fintCountryCode, z.fstrAreaCode, z.fstrPhoneNumber, z.fblnVisitorVerified, z.fstrVerifyDocType, z.fintVerifyDocVer, z.fi64VerifyDocEditInProgressKey, z.flngVerifyDocKey, z.fstrDocType, z.fintDocVer, z.fi64DocEditInProgressKey, z.flngDockey, z.flngXmlKey, z.fstrOwner, z.fstrDistrictOffice, z.fblnHold, z.fdtmVisitStart, z.fdtmVisitEnd, z.flngDuration, z.flngWaitTime, z.fblnActive, z.fdtmReversed, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblvisit z LEFT OUTER JOIN ${var:source_db}.app_tblcustomerlevel cl ON z.flngcustomerkey = cl.flngcustomerkey WHERE nvl(cl.fstrCustomerLevel, 'STD') = 'STD' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N';
