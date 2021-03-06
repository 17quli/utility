CREATE VIEW ${var:view_db}.web_tblwebaccount
AS SELECT
z.flngAccountKey,
z.fintProfileNumber,
z.flngCustomerKey,
z.flngJointCustomerKey,
z.flngJointAccountKey,
z.fblnPrime,
z.fstrAccountType,
z.fintNameKey,
z.fstrNameType,
z.fstrFamilyName,
z.fstrMiddleName,
z.fstrFirstName,
z.fstrNameControl,
z.fdtmCommence,
z.fdtmCease,
z.fstrFilingFrq,
z.fstrTitle,
z.fstrSuffix,
z.fstrFreeFormatName,
z.fstrListFormatName,
z.fstrAdditionalName,
z.fstrAdditionalName2,
z.fintAddressKey,
z.fstrAddressType,
z.fstrStreet,
z.fstrStreet2,
z.fstrUnitType,
z.fstrUnit,
z.fstrCity,
z.fstrCounty,
z.fstrState,
z.fstrZip,
z.fstrDistrictOffice,
z.fstrCountry,
z.fstrAttention,
z.fstrLocationCode,
z.fstrUrbanization,
z.fstrMunicipality,
z.fstrDistrict,
z.fstrSubDistrict,
z.fstrSubProvince,
z.fstrAddressDescription,
z.fstrListFormatAddress,
z.fstrIDType,
z.fstrID,
z.fstrFormattedID,
z.fstrStatus,
z.fstrClosureReason,
z.fstrProfileType,
z.fstrProfileIdType,
z.fstrProfileId,
z.fstrProfileFormattedId,
z.flngDocKey,
z.fcurBalance,
z.fintParentProfileNumber,
z.fstrParentProfileType,
z.fstrParentProfileIdType,
z.fstrParentProfileId,
z.fstrParentProfileFormattedId,
z.fdtmWhen,
z.record_effective_timestamp,
z.record_expiry_timestamp,
z.record_active_flag,
z.record_deleted_flag,
z.insert_object_run_key,
z.update_object_run_key
 FROM ${var:source_db}.web_tblwebaccount z;