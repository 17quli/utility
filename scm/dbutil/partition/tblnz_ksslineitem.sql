CREATE TABLE lab_nzsr4_raw.ptn_tblnz_ksslineitem (
  flngreturnkey INT,
  flngitemnumber INT,
  flngaccountkey INT,
  fdtmfilingperiod TIMESTAMP,
  fdtmpaydayperiod TIMESTAMP,
  fi64ksecontributionkey BIGINT,
  fi64ksrcontributionkey BIGINT,
  fblnreversed SMALLINT,
  fblnkseconverted SMALLINT,
  fblnksrconverted SMALLINT,
  fstrcnvirdnumber VARCHAR(18),
  fstrcnvemployeename VARCHAR(510),
  fstrcnvtaxcode VARCHAR(18),
  fcurcnvkiwisaverdeductions DECIMAL(19,4),
  fcurcnvkiwisavercontributions DECIMAL(19,4),
  fstrwho VARCHAR(20),
  fdtmwhen TIMESTAMP
)
partitioned by (filing_period_year bigint)
STORED AS PARQUET;

insert into lab_nzsr4_raw.ptn_tblnz_ksslineitem partition(filing_period_year)
select z.* ,extract(year from z.fdtmfilingperiod) 
from lab_nzsr4_raw.tblnz_ksslineitem z;

compute incremental stats lab_nzsr4_raw.ptn_tblnz_ksslineitem;

select count(1) from lab_nzsr4_raw.tblnz_ksslineitem;
select count(1) from lab_nzsr4_raw.ptn_tblnz_ksslineitem;

drop table lab_nzsr4_raw.tblnz_ksslineitem;
alter table lab_nzsr4_raw.ptn_tblnz_ksslineitem rename to lab_nzsr4_raw.tblnz_ksslineitem;
--recreate views
DROP VIEW if exists lab_nzsr4_raw_full_access.app_tblnz_ksslineitem;
CREATE VIEW lab_nzsr4_raw_full_access.app_tblnz_ksslineitem AS
SELECT z.flngReturnKey, z.flngItemNumber, z.flngAccountKey, z.fdtmFilingPeriod, z.fdtmPayDayPeriod, z.fi64KSEContributionKey, z.fi64KSRContributionKey, z.fblnReversed, z.fblnKSEConverted, z.fblnKSRConverted, z.fstrCnvIRDNumber, z.fstrCnvEmployeeName, z.fstrCnvTaxCode, z.fcurCnvKiwiSaverDeductions, z.fcurCnvKiwiSaverContributions, z.fstrWho, z.fdtmWhen,z.filing_period_year FROM lab_nzsr4_raw.tblnz_ksslineitem z
;

DROP VIEW if exists lab_nzsr4_raw_restricted_access.app_tblnz_ksslineitem;
CREATE VIEW lab_nzsr4_raw_restricted_access.app_tblnz_ksslineitem AS
SELECT z.flngReturnKey, z.flngItemNumber, z.flngAccountKey, z.fdtmFilingPeriod, z.fdtmPayDayPeriod, z.fi64KSEContributionKey, z.fi64KSRContributionKey, z.fblnReversed, z.fblnKSEConverted, z.fblnKSRConverted, z.fstrCnvIRDNumber, z.fstrCnvEmployeeName, z.fstrCnvTaxCode, z.fcurCnvKiwiSaverDeductions, z.fcurCnvKiwiSaverContributions, z.fstrWho, z.fdtmWhen,z.filing_period_year FROM lab_nzsr4_raw.tblnz_ksslineitem z
;
