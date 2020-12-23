CREATE TABLE dev_dw.dev_jnl_app_tbltaskqueue_20200819_ird0qal STORED AS PARQUET as select * from dev_jnl.app_tbltaskqueue;
CREATE TABLE dev_dw.dev_raw_app_tbltaskqueue_20200819_ird0qal STORED AS PARQUET as select * from dev_raw.app_tbltaskqueue;
DROP TABLE dev_raw.app_tbltaskqueue ;
DROP TABLE dev_jnl.app_tbltaskqueue ;
DROP VIEW dev_raw_full_access.app_tbltaskqueue ;
DROP VIEW dev_raw_restricted_access.app_tbltaskqueue ;
