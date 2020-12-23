CREATE VIEW ${var:view_db}.app_tblmailitem AS
SELECT z.flngMailItemKey, z.flngVerLast, z.flngMailTypeKey, z.flngTemplateKey, z.flngCRMKey, z.fstrRecipientKey, z.flngNameAddressHash, z.fstrSortKey, z.fdtmSortDate, z.fintMailTypeSort, z.fstrLanguage, z.fstrAddressBlock, z.fstrEmailTo, z.fstrName, z.fstrDLN, z.fstrCity, z.fstrCountry, z.fstrZip, z.fblnValidAddress, z.fdtmCreated, z.fstrCreatedWho, z.fdtmBatched, z.fdtmPrinted, z.fstrPrintedWho, z.fstrPrinter, z.fdtmRePrinted, z.fstrReprintedWho, z.fstrRePrintPrinter, z.fdtmReady, z.fstrReadyWho, z.fdtmEmailedOn, z.flngPrintGroupKey, z.fblnValid, z.fstrValidatedWho, z.fdtmValidatedWhen, z.fblnElectronicOnly, z.fstrRenderType, z.fstrDatabase, z.flngImageKey, z.fblnLock, z.fstrWho, z.fdtmWhen, z.record_effective_timestamp, z.record_expiry_timestamp, z.record_active_flag, z.record_deleted_flag, z.insert_object_run_key, z.update_object_run_key FROM ${var:source_db}.app_tblmailitem z WHERE z.flngMailItemKey IN (SELECT DISTINCT cm.flngMailItemKey FROM ${var:source_db}.app_tblcustomermail cm INNER JOIN ${var:source_db}.app_tblcustomerlevel cl ON cl.flngcustomerkey = cm.flngcustomerkey WHERE nvl(cl.fstrCustomerLevel, 'STD') != 'SPCAD2' AND nvl(cl.record_active_flag, 'Y') = 'Y' AND nvl(cl.record_deleted_flag, 'N') = 'N');
