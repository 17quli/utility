CREATE TABLE lab_fcp_raw.ptn_pty_pd_property_taxyear (
  property_taxyear_sk BIGINT,
  title_sk BIGINT,
  taxyear_sk TIMESTAMP,
  owner_sk BIGINT,
  property_purchase_date TIMESTAMP,
  property_start_date TIMESTAMP,
  property_end_date TIMESTAMP,
  top_count BIGINT,
  last_top_owner_sk BIGINT,
  buyer_taxstmt_sk BIGINT,
  seller_taxstmt_sk BIGINT,
  buyer_cl_owner_sk BIGINT,
  seller_cl_owner_sk BIGINT,
  ownership_status_sk BIGINT,
  property_detail_sk BIGINT,
  property_type_sk BIGINT,
  property_address_sk BIGINT,
  mortgage_status_sk BIGINT,
  year_start_count BIGINT,
  title_issue_count BIGINT,
  purchase_count BIGINT,
  notional_purchase_count BIGINT,
  title_cancel_count BIGINT,
  sell_count BIGINT,
  notional_sell_count BIGINT,
  year_end_count BIGINT,
  tenure_at_start DECIMAL(18,2),
  tenure_at_end DECIMAL(18,2),
  cv_at_purchase BIGINT,
  cv_at_start BIGINT,
  cv_at_end BIGINT,
  mv_at_purchase BIGINT,
  mv_at_start BIGINT,
  mv_at_end BIGINT,
  mortgage_start_count BIGINT,
  mortgage_end_count BIGINT
)
partitioned by (tax_year bigint)
STORED AS PARQUET;

insert into lab_fcp_raw.ptn_pty_pd_property_taxyear partition(tax_year)
select z.* ,extract(year from taxyear_sk)
from lab_fcp_raw.pty_pd_property_taxyear z;

compute incremental stats lab_fcp_raw.ptn_pty_pd_property_taxyear;

select count(1) from lab_fcp_raw.pty_pd_property_taxyear;
select count(1) from lab_fcp_raw.ptn_pty_pd_property_taxyear;

--recreate views
DROP VIEW if exists lab_fcp_raw_full_access.pty_pd_property_taxyear;
CREATE VIEW lab_fcp_raw_full_access.pty_pd_property_taxyear AS
SELECT z.PROPERTY_TAXYEAR_SK, z.TITLE_SK, z.TAXYEAR_SK, z.OWNER_SK, z.PROPERTY_PURCHASE_DATE, z.PROPERTY_START_DATE, z.PROPERTY_END_DATE, z.TOP_COUNT, z.LAST_TOP_OWNER_SK, z.BUYER_TAXSTMT_SK, z.SELLER_TAXSTMT_SK, z.BUYER_CL_OWNER_SK, z.SELLER_CL_OWNER_SK, z.OWNERSHIP_STATUS_SK, z.PROPERTY_DETAIL_SK, z.PROPERTY_TYPE_SK, z.PROPERTY_ADDRESS_SK, z.MORTGAGE_STATUS_SK, z.YEAR_START_COUNT, z.TITLE_ISSUE_COUNT, z.PURCHASE_COUNT, z.NOTIONAL_PURCHASE_COUNT, z.TITLE_CANCEL_COUNT, z.SELL_COUNT, z.NOTIONAL_SELL_COUNT, z.YEAR_END_COUNT, z.TENURE_AT_START, z.TENURE_AT_END, z.CV_AT_PURCHASE, z.CV_AT_START, z.CV_AT_END, z.MV_AT_PURCHASE, z.MV_AT_START, z.MV_AT_END, z.MORTGAGE_START_COUNT, z.MORTGAGE_END_COUNT,z.tax_year FROM lab_fcp_raw.pty_pd_property_taxyear z
;
DROP VIEW if exists lab_fcp_raw_restricted_access.pty_pd_property_taxyear;
CREATE VIEW lab_fcp_raw_restricted_access.pty_pd_property_taxyear AS
SELECT z.PROPERTY_TAXYEAR_SK, z.TITLE_SK, z.TAXYEAR_SK, z.OWNER_SK, z.PROPERTY_PURCHASE_DATE, z.PROPERTY_START_DATE, z.PROPERTY_END_DATE, z.TOP_COUNT, z.LAST_TOP_OWNER_SK, z.BUYER_TAXSTMT_SK, z.SELLER_TAXSTMT_SK, z.BUYER_CL_OWNER_SK, z.SELLER_CL_OWNER_SK, z.OWNERSHIP_STATUS_SK, z.PROPERTY_DETAIL_SK, z.PROPERTY_TYPE_SK, z.PROPERTY_ADDRESS_SK, z.MORTGAGE_STATUS_SK, z.YEAR_START_COUNT, z.TITLE_ISSUE_COUNT, z.PURCHASE_COUNT, z.NOTIONAL_PURCHASE_COUNT, z.TITLE_CANCEL_COUNT, z.SELL_COUNT, z.NOTIONAL_SELL_COUNT, z.YEAR_END_COUNT, z.TENURE_AT_START, z.TENURE_AT_END, z.CV_AT_PURCHASE, z.CV_AT_START, z.CV_AT_END, z.MV_AT_PURCHASE, z.MV_AT_START, z.MV_AT_END, z.MORTGAGE_START_COUNT, z.MORTGAGE_END_COUNT,z.tax_year FROM lab_fcp_raw.pty_pd_property_taxyear z
;
