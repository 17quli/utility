CREATE TABLE lab_nzsr4_raw.ptn_tbldoctrn (
  flngtranskey INT,
  flngdockey INT,
  flngverlast INT,
  flngaccountkey INT,
  fdtmfilingperiod TIMESTAMP
)
partitioned by (filing_period_year bigint)
STORED AS PARQUET;

insert into lab_nzsr4_raw.ptn_tbldoctrn partition(filing_period_year)
select z.* ,extract(year from z.fdtmfilingperiod) 
from lab_nzsr4_raw.tbldoctrn z;

compute incremental stats lab_nzsr4_raw.ptn_tbldoctrn;

select count(1) from lab_nzsr4_raw.tbldoctrn;
select count(1) from lab_nzsr4_raw.ptn_tbldoctrn;

drop table lab_nzsr4_raw.tbldoctrn;
alter table lab_nzsr4_raw.ptn_tbldoctrn rename to lab_nzsr4_raw.tbldoctrn;

--recreate views
DROP VIEW if exists lab_nzsr4_raw_full_access.app_tbldoctrn;
CREATE VIEW lab_nzsr4_raw_full_access.app_tbldoctrn AS
SELECT z.flngTransKey, z.flngDocKey, z.flngVerLast, z.flngAccountKey, z.fdtmFilingPeriod,z.filing_period_year FROM lab_nzsr4_raw.tbldoctrn z
;

DROP VIEW if exists lab_nzsr4_raw_restricted_access.app_tbldoctrn;
CREATE VIEW lab_nzsr4_raw_restricted_access.app_tbldoctrn AS
SELECT z.flngTransKey, z.flngDocKey, z.flngVerLast, z.flngAccountKey, z.fdtmFilingPeriod,z.filing_period_year FROM lab_nzsr4_raw.tbldoctrn z
;
