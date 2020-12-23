CREATE TABLE test_dw.test_jnl_app_tbltaskqueue_20200819_ird0qal STORED AS PARQUET as select * from test_jnl.app_tbltaskqueue;
CREATE TABLE test_dw.test_raw_app_tbltaskqueue_20200819_ird0qal STORED AS PARQUET as select * from test_raw.app_tbltaskqueue;
DROP TABLE test_raw.app_tbltaskqueue ;
DROP TABLE test_jnl.app_tbltaskqueue ;
DROP VIEW test_raw_full_access.app_tbltaskqueue ;
DROP VIEW test_raw_restricted_access.app_tbltaskqueue ;
