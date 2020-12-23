CREATE TABLE test_dw.test_jnl_app_tbltaskgroupqueue_20200818_ird0qal STORED AS PARQUET as select * from test_jnl.app_tbltaskgroupqueue;
CREATE TABLE test_dw.test_raw_app_tbltaskgroupqueue_20200818_ird0qal STORED AS PARQUET as select * from test_raw.app_tbltaskgroupqueue;
DROP TABLE test_raw.app_tbltaskgroupqueue ;
DROP TABLE test_jnl.app_tbltaskgroupqueue ;
DROP VIEW test_raw_full_access.app_tbltaskgroupqueue ;
DROP VIEW test_raw_restricted_access.app_tbltaskgroupqueue ;
