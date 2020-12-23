CREATE TABLE dev_dw.dev_jnl_app_tbltaskgroupqueue_20200818110905 STORED AS PARQUET as select * from dev_jnl.app_tbltaskgroupqueue;
CREATE TABLE dev_dw.dev_raw_app_tbltaskgroupqueue_20200818110905 STORED AS PARQUET as select * from dev_raw.app_tbltaskgroupqueue;
DROP TABLE dev_raw.app_tbltaskgroupqueue ;
DROP TABLE dev_jnl.app_tbltaskgroupqueue ;
DROP VIEW dev_raw_full_access.app_tbltaskgroupqueue ;
DROP VIEW dev_raw_restricted_access.app_tbltaskgroupqueue ;
