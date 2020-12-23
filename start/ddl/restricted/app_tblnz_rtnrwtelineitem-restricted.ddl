CREATE VIEW ${var:view_db}.app_tblnz_rtnrwtelineitem AS
SELECT z.fi64LineItemKey, z.flngVer, z.flngVerLast, z.fstrRecipientIdentifier, z.fstrRecipientName, z.fstrRecipientIRD, z.fdtmRecipientDOB, z.fstrRecipientPhone, z.fstrRecipientEmail, z.fstrRecipientAddress, z.fstrRecipientCountry, z.fstrRecipientCountryCode, z.fcurRecipientPercentage, z.fblnJointAccountIndicator, z.flngJointAccountHolders, z.fcurGrossAmount, z.fcurDeducted, z.fblnOverridePercentages, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblnz_rtnrwtelineitem z LEFT OUTER JOIN (SELECT fstrID, cl.fstrcustomerlevel FROM ${var:source_db}.app_tblid id INNER JOIN ${var:source_db}.app_tblcustomerlevel cl ON id.flngCustomerKey = cl.flngCustomerKey WHERE id.fstrIDtype = 'IRD' AND id.flngver = 0 AND id.fblnDefault = 1 AND nvl(id.record_active_flag, 'Y') = 'Y' AND nvl(id.record_deleted_flag, 'N') = 'N' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N') idcl ON CAST(z.fstrRecipientIRD AS INT) = CAST(idcl.fstrID AS INT) WHERE nvl(idcl.fstrcustomerlevel, 'STD') = 'STD';