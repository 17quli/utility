CREATE TABLE lab_nzsr4_raw.ptn_tblnz_ksscontributiondetail (
 fi64contributiondetailkey BIGINT,
  flngver INT,
  flngverlast INT,
  fstrtype VARCHAR(12),
  fi64contributionkey BIGINT,
  fcuramount DECIMAL(19,4),
  fcurinterest DECIMAL(19,4),
  fblninterestcalculated SMALLINT,
  fi64interestcontributionkey BIGINT,
  fdtmeffectivedate TIMESTAMP,
  fdtmsent TIMESTAMP,
  fdtmcreated TIMESTAMP,
  fstrstatus VARCHAR(12),
  fdtmstatusdate TIMESTAMP,
  fdtmholdtill TIMESTAMP,
  fdtmfinal TIMESTAMP,
  fblnpending SMALLINT,
  flngtranskey INT,
  fstrlegacyreferencenumber VARCHAR(24),
  fstrlegacylinenumber VARCHAR(8),
  fblnsmallbalance SMALLINT,
  fstrwho VARCHAR(20),
  fdtmwhen TIMESTAMP
)
partitioned by (effective_year bigint)
STORED AS PARQUET;

insert into lab_nzsr4_raw.ptn_tblnz_ksscontributiondetail partition(effective_year)
select z.* ,extract(year from z.fdtmeffectivedate) 
from lab_nzsr4_raw.tblnz_ksscontributiondetail z;

compute incremental stats lab_nzsr4_raw.ptn_tblnz_ksscontributiondetail;

select count(1) from lab_nzsr4_raw.tblnz_ksscontributiondetail;
select count(1) from lab_nzsr4_raw.ptn_tblnz_ksscontributiondetail;

--recreate views
DROP VIEW if exists lab_nzsr4_raw_full_access.app_tblnz_ksscontributiondetail;
CREATE VIEW lab_nzsr4_raw_full_access.app_tblnz_ksscontributiondetail AS
SELECT z.fi64ContributionDetailKey, z.flngVer, z.flngVerLast, z.fstrType, z.fi64ContributionKey, z.fcurAmount, z.fcurInterest, z.fblnInterestCalculated, z.fi64InterestContributionKey, z.fdtmEffectiveDate, z.fdtmSent, z.fdtmCreated, z.fstrStatus, z.fdtmStatusDate, z.fdtmHoldTill, z.fdtmFinal, z.fblnPending, z.flngTransKey, z.fstrLegacyReferenceNumber, z.fstrLegacyLineNumber, z.fblnSmallBalance, z.fstrWho, z.fdtmWhen, z.effective_year FROM lab_nzsr4_raw.tblnz_ksscontributiondetail z;

DROP VIEW if exists lab_nzsr4_raw_restricted_access.app_tblnz_ksscontributiondetail;
CREATE VIEW lab_nzsr4_raw_restricted_access.app_tblnz_ksscontributiondetail AS
SELECT z.fi64ContributionDetailKey, z.flngVer, z.flngVerLast, z.fstrType, z.fi64ContributionKey, z.fcurAmount, z.fcurInterest, z.fblnInterestCalculated, z.fi64InterestContributionKey, z.fdtmEffectiveDate, z.fdtmSent, z.fdtmCreated, z.fstrStatus, z.fdtmStatusDate, z.fdtmHoldTill, z.fdtmFinal, z.fblnPending, z.flngTransKey, z.fstrLegacyReferenceNumber, z.fstrLegacyLineNumber, z.fblnSmallBalance, z.fstrWho, z.fdtmWhen, z.effective_year FROM lab_nzsr4_raw.tblnz_ksscontributiondetail z;
