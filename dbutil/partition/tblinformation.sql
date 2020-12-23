CREATE TABLE lab_fcp_raw.ptn_tblinformation (
  flnginformationkey INT,
  flngver INT,
  flngverlast INT,
  fstrinformationsource VARCHAR(40),
  fstrinformationaction VARCHAR(24),
  fi64sourcekey BIGINT,
  fstrsourcecategory VARCHAR(60),
  fstrsourcetype VARCHAR(60),
  flngsourcefolderkey INT,
  flngcustomerkey INT,
  fintprofilenumber SMALLINT,
  flngaccountkey INT,
  fdtmfilingperiod TIMESTAMP,
  flngbillitemkey INT,
  fstrexternalid VARCHAR(200),
  fintgenre SMALLINT,
  fintimportance SMALLINT,
  fblnprivate SMALLINT,
  fdtmsourcedate TIMESTAMP,
  fdtmsourcedateto TIMESTAMP,
  fblndata SMALLINT,
  fstrxmltype VARCHAR(24),
  fstrxmlview VARCHAR(24),
  flngxmlkey INT,
  flngimagekey INT,
  fcuramount DECIMAL(19,4),
  fstrexternallink VARCHAR(510),
  fblnsystem SMALLINT,
  flnginformationfolderkey INT,
  flngcrmkey INT,
  fdtmcreated TIMESTAMP,
  fstrcreatedby VARCHAR(20),
  fintprotectlevel SMALLINT,
  fstrwho VARCHAR(20),
  fdtmwhen TIMESTAMP
)
partitioned by (filing_period_year bigint)
STORED AS PARQUET;

insert into lab_fcp_raw.ptn_tblinformation partition(filing_period_year)
select z.* ,extract(year from z.fdtmfilingperiod) 
from lab_fcp_raw.tblinformation z;

compute incremental stats lab_fcp_raw.ptn_tblinformation;

select count(1) from lab_fcp_raw.tblinformation;
select count(1) from lab_fcp_raw.ptn_tblinformation;

--recreate views
DROP VIEW if exists lab_fcp_raw_full_access.app_tblinformation;
CREATE VIEW lab_fcp_raw_full_access.app_tblinformation AS
SELECT z.flngInformationKey, z.flngVer, z.flngVerLast, z.fstrInformationSource, z.fstrInformationAction, z.fi64SourceKey, z.fstrSourceCategory, z.fstrSourceType, z.flngSourceFolderKey, z.flngCustomerKey, z.fintProfileNumber, z.flngAccountKey, z.fdtmFilingPeriod, z.flngBillItemKey, z.fstrExternalId, z.fintGenre, z.fintImportance, z.fblnPrivate, z.fdtmSourceDate, z.fdtmSourceDateTo, z.fblnData, z.fstrXmlType, z.fstrXmlView, z.flngXmlKey, z.flngImageKey, z.fcurAmount, z.fstrExternalLink, z.fblnSystem, z.flngInformationFolderKey, z.flngCrmKey, z.fdtmCreated, z.fstrCreatedBy, z.fintProtectLevel, z.fstrWho, z.fdtmWhen ,z.filing_period_year FROM lab_fcp_raw.tblinformation z
;

DROP VIEW if exists lab_fcp_raw_restricted_access.app_tblinformation;
CREATE VIEW lab_fcp_raw_restricted_access.app_tblinformation AS
SELECT z.flngInformationKey, z.flngVer, z.flngVerLast, z.fstrInformationSource, z.fstrInformationAction, z.fi64SourceKey, z.fstrSourceCategory, z.fstrSourceType, z.flngSourceFolderKey, z.flngCustomerKey, z.fintProfileNumber, z.flngAccountKey, z.fdtmFilingPeriod, z.flngBillItemKey, z.fstrExternalId, z.fintGenre, z.fintImportance, z.fblnPrivate, z.fdtmSourceDate, z.fdtmSourceDateTo, z.fblnData, z.fstrXmlType, z.fstrXmlView, z.flngXmlKey, z.flngImageKey, z.fcurAmount, z.fstrExternalLink, z.fblnSystem, z.flngInformationFolderKey, z.flngCrmKey, z.fdtmCreated, z.fstrCreatedBy, z.fintProtectLevel, z.fstrWho, z.fdtmWhen ,z.filing_period_year FROM lab_fcp_raw.tblinformation z
;

