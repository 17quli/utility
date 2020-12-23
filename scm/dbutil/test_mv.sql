create view lab_fcp_raw_cas_views.vw_app_tblnz_rtnpsoemployeeinfo as
select 
z.flngreturnkey                ,
z.flngitemnumber               ,
z.flngrelationshipkey          ,
z.flngver                      ,
z.flngverlast                  ,
z.fblninerror                  ,
z.fstrirdnumber                ,
z.fblninvalidird               ,
z.fstremployeename             ,
z.fstrsurname                  ,
z.fstrfirstname                ,
z.fstrtaxcode                  ,
z.fdtmstart                    ,
z.fdtmfinish                   ,
z.fdtmpayperiodstart           ,
z.fdtmpayperiodend             ,
z.fstrpayfrequency             ,
z.fblnpayment                  ,
z.fstrcscode                   ,
z.fcurgross                    ,
z.fcurearnings                 ,
z.fcurpaye                     ,
z.fcurchildsupport             ,
z.fcurstudentloan              ,
z.fcurkiwisaverdeductions      ,
z.fcurkiwisavercontributions   ,
z.fcurtaxcreditsdonations      ,
z.fcuresctdeductions           ,
z.fcurtaxcreditsextinguish     ,
z.fcuremployercontributionsadj ,
z.fcurfamilytaxcredits         ,
z.fstrgatewayreferenceid       ,
z.fdtmdeleted                  ,
z.fdtmprocessed                ,
z.fblnduplicateirdtaxcode      ,
z.fblnoverridekiwisaverdedrule ,
z.fstrwho                      ,
z.fdtmwhen                     ,
z.record_effective_timestamp   ,
z.record_expiry_timestamp      ,
z.record_active_flag           ,
z.record_deleted_flag          ,
z.insert_object_run_key        ,
z.update_object_run_key        
from prod_raw.app_tblnz_rtnpsoemployeeinfo z
left outer join 
prod_raw.app_tblcustomerinfo ci
on ci.fstrid = z.fstrirdnumber
 where 
  ci.fstridtype = 'IRD'
  and ci.record_active_flag = 'Y'
  and ci.record_deleted_flag = 'N'
  and nvl(ci.fstrCustomerLevel, 'STD') = 'STD';

create view lab_fcp_raw_cas_views.vw_app_tblreturn as
SELECT z.flngReturnKey,
       z.flngVer,
       z.flngVerLast,
       z.fi64DocSetKey,
       z.flngDockey,
       z.fintVerLastGood,
       z.flngJointReturnKey,
       z.flngAccountKey,
       z.flngSecondaryAccountKey,
       z.fdtmFilingPeriod,
       z.fstrDocType,
       z.fintDocVer,
       z.fdtmReturnGen,
       z.fdtmDataCapture,
       z.fdtmInAccount,
       z.fdtmReceived,
       z.fdtmDue,
       z.fblnInError,
       z.fstrFilingStatus,
       z.fstrId,
       z.fstrIdType,
       z.fstrNameControl,
       z.fstrSecondaryId,
       z.fstrSecondaryIdType,
       z.fstrSecondaryNameControl,
       z.fstrURI,
       z.fstrURIType,
       z.fstrAccountType,
       z.fstrMedia,
       z.fcurPayment,
       z.fstrStatus,
       z.flngBatchKey,
       z.fintSequence,
       z.fstrRtnBatchId,
       z.fstrReason,
       z.fblnEstimated,
       z.fblnPreliminary,
       z.fblnReceived,
       z.fblnRequired,
       z.flngCrmKey,
       z.flngFolderKey,
       z.fstrWho,
       z.fdtmWhen,
       z.record_effective_timestamp,
       z.record_expiry_timestamp,
       z.record_active_flag,
       z.record_deleted_flag,
       z.insert_object_run_key,
       z.update_object_run_key
FROM prod_raw.app_tblreturn z
LEFT OUTER JOIN prod_raw.app_tblaccount ac ON z.flngaccountkey = ac.flngaccountkey
AND ac.record_active_flag = 'Y'
LEFT OUTER JOIN prod_raw.app_tblcustomerlevel cl ON ac.flngcustomerkey = cl.flngcustomerkey
WHERE nvl(cl.fstrCustomerLevel, 'STD') = 'STD'
  AND nvl(cl.record_active_flag, 'Y') = 'Y'
  AND nvl(cl.record_deleted_flag, 'N') = 'N'
  ;

create view lab_fcp_raw_cas_views.app_tblaccount as
SELECT z.flngAccountKey, 
       z.flngVer, 
       z.flngVerLast, 
       z.flngcustomerkey, 
       z.fintParentProfileNumber, 
       z.fintProfileNumber, 
       z.fstrAccountType, 
       z.fstrFiling, 
       z.fdtmCommence, 
       z.fdtmCease, 
       z.fstrStatus, 
       z.fstrClosureReason, 
       z.fblnMailForm, 
       z.flngDocKey, 
       z.flngFolderKey, 
       z.fdtmCreated, 
       z.fstrWho, 
       z.fdtmWhen, 
       z.record_effective_timestamp, 
       z.record_expiry_timestamp, 
       z.record_active_flag, 
       z.record_deleted_flag, 
       z.insert_object_run_key, 
       z.update_object_run_key 
FROM prod_raw.app_tblaccount z ;

create view lab_fcp_raw_cas_views.vw_app_tblcustomerinfo as
SELECT z.flngcustomerkey, 
       z.flngJointCustomerKey, 
       z.fblnPrime, 
       z.fstrCustomerType, 
       z.flngDocKey, 
       z.flngFolderKey, 
       z.fblnDefault, 
       z.fintProfileNumber, 
       z.fdtmCommence, 
       z.fdtmCease, 
       z.fdtmCreated, 
       z.fi64NameKey, 
       z.fintNameKey, 
       z.fstrDisplay, 
       z.fblnFormatted, 
       z.fstrNameType, 
       z.fstrFamilyName, 
       z.fstrMiddleName, 
       z.fstrFirstName, 
       z.fstrNameControl, 
       z.fstrTitle, 
       z.fstrSuffix, 
       z.fstrFreeFormatName, 
       z.fstrListFormatName, 
       z.fstrAdditionalName, 
       z.fstrAdditionalName2, 
       z.fi64AddressKey, 
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
       z.flngIDKey, 
       z.fstrIDType, 
       z.fstrID, 
       z.fstrFormattedID, 
       z.fstrDistrictOffice, 
       z.fstrCollectDistrictOffice, 
       z.fstrReviewType, 
       z.fstrCustomerLevel, 
       z.fi64ProtectedDataSource, 
       z.fdtmWhen, 
       z.record_effective_timestamp, 
       z.record_expiry_timestamp, 
       z.record_active_flag, 
       z.record_deleted_flag, 
       z.insert_object_run_key, 
       z.update_object_run_key 
FROM prod_raw.app_tblcustomerinfo z 
LEFT OUTER JOIN prod_raw.app_tblcustomerlevel cl ON z.flngcustomerkey = cl.flngcustomerkey 
WHERE nvl(cl.fstrCustomerLevel, 'STD') = 'STD' 
  AND nvl(cl.record_active_flag, 'Y') = 'Y' 
  AND nvl(cl.record_deleted_flag, 'N') = 'N' ;

create table lab_fcp_raw_cas_views.app_tblnz_rtnpsoemployeeinfo like prod_raw.app_tblnz_rtnpsoemployeeinfo;
create table lab_fcp_raw_cas_views.app_tblreturn like prod_raw.app_tblreturn;
create table lab_fcp_raw_cas_views.app_tblcustomerinfo like prod_raw.app_tblcustomerinfo;

insert into lab_fcp_raw_cas_views.app_tblnz_rtnpsoemployeeinfo select * from lab_fcp_raw_cas_views.vw_app_tblnz_rtnpsoemployeeinfo;
insert into lab_fcp_raw_cas_views.app_tblreturn select * from lab_fcp_raw_cas_views.vw_app_tblreturn;
insert into lab_fcp_raw_cas_views.app_tblcustomerinfo select * from lab_fcp_raw_cas_views.vw_app_tblcustomerinfo;
compute stats  lab_fcp_raw_cas_views.app_tblnz_rtnpsoemployeeinfo;
compute stats  lab_fcp_raw_cas_views.app_tblreturn;
compute stats  lab_fcp_raw_cas_views.app_tblcustomerinfo;

