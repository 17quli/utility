CREATE TABLE lab_nzsr4_raw.ptn_tbltransoffsetdetail (
flngoffsetkey INT,
  fintseq SMALLINT,
  flngver INT,
  flngverlast INT,
  flngaccountkey INT,
  flngcredittranskey INT,
  flngcreditbillitemkey INT,
  fcurcreditamount DECIMAL(19,4),
  fstrcredittranstype VARCHAR(12),
  fstrcreditimpact VARCHAR(60),
  fdtmcreditperiod TIMESTAMP,
  fdtmcrediteffect TIMESTAMP,
  flngdebittranskey INT,
  flngdebitbillitemkey INT,
  fcurdebitamount DECIMAL(19,4),
  fstrdebittranstype VARCHAR(12),
  fstrdebitimpact VARCHAR(60),
  fdtmdebitperiod TIMESTAMP,
  fdtmdebiteffect TIMESTAMP,
  fcuramount DECIMAL(19,4),
  fdtmeffective TIMESTAMP,
  fblnmanualoffset SMALLINT,
  fblntransreversed SMALLINT,
  fblnoffsetreversed SMALLINT,
  fcurdebitbalancedelta DECIMAL(19,4),
  fcurdebitbalance DECIMAL(19,4),
  fcurcreditbalancedelta DECIMAL(19,4),
  fcurcreditbalance DECIMAL(19,4),
  fdtmprocess TIMESTAMP,
  fstrwho VARCHAR(20),
  fdtmwhen TIMESTAMP
)
partitioned by (effective_year bigint)
STORED AS PARQUET;

insert into lab_nzsr4_raw.ptn_tbltransoffsetdetail partition(effective_year)
select z.* ,extract(year from z.fdtmeffective) 
from lab_nzsr4_raw.tbltransoffsetdetail z;

compute incremental stats lab_nzsr4_raw.ptn_tbltransoffsetdetail;

select count(1) from lab_nzsr4_raw.tbltransoffsetdetail;
select count(1) from lab_nzsr4_raw.ptn_tbltransoffsetdetail;


--recreate views
DROP VIEW if exists lab_nzsr4_raw_full_access.app_tbltransoffsetdetail;
CREATE VIEW lab_nzsr4_raw_full_access.app_tbltransoffsetdetail AS
SELECT z.flngOffsetKey, z.fintSeq, z.FLNGVER, z.FLNGVERLAST, z.FLNGACCOUNTKEY, z.FLNGCREDITTRANSKEY, z.flngCreditBillItemKey, z.fcurCreditAmount, z.fstrCreditTransType, z.fstrCreditImpact, z.fdtmCreditPeriod, z.fdtmCreditEffect, z.FLNGDEBITTRANSKEY, z.flngDebitBillItemKey, z.fcurDebitAmount, z.fstrDebitTransType, z.fstrDebitImpact, z.fdtmDebitPeriod, z.fdtmDebitEffect, z.FCURAMOUNT, z.FDTMEFFECTIVE, z.FBLNMANUALOFFSET, z.fblnTransReversed, z.fblnOffsetReversed, z.fcurDebitBalanceDelta, z.fcurDebitBalance, z.fcurCreditBalanceDelta, z.fcurCreditBalance, z.fdtmProcess, z.FSTRWHO, z.FDTMWHEN,z.effective_year FROM lab_nzsr4_raw.tbltransoffsetdetail z;
DROP VIEW if exists lab_nzsr4_raw_restricted_access.app_tbltransoffsetdetail;
CREATE VIEW lab_nzsr4_raw_restricted_access.app_tbltransoffsetdetail AS
SELECT z.flngOffsetKey, z.fintSeq, z.FLNGVER, z.FLNGVERLAST, z.FLNGACCOUNTKEY, z.FLNGCREDITTRANSKEY, z.flngCreditBillItemKey, z.fcurCreditAmount, z.fstrCreditTransType, z.fstrCreditImpact, z.fdtmCreditPeriod, z.fdtmCreditEffect, z.FLNGDEBITTRANSKEY, z.flngDebitBillItemKey, z.fcurDebitAmount, z.fstrDebitTransType, z.fstrDebitImpact, z.fdtmDebitPeriod, z.fdtmDebitEffect, z.FCURAMOUNT, z.FDTMEFFECTIVE, z.FBLNMANUALOFFSET, z.fblnTransReversed, z.fblnOffsetReversed, z.fcurDebitBalanceDelta, z.fcurDebitBalance, z.fcurCreditBalanceDelta, z.fcurCreditBalance, z.fdtmProcess, z.FSTRWHO, z.FDTMWHEN,z.effective_year FROM lab_nzsr4_raw.tbltransoffsetdetail z;

