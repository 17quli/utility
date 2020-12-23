CREATE TABLE prod_dw.prod_jnl_app_tbltaskqueue_20200819_ird0qal STORED AS PARQUET as select * from prod_jnl.app_tbltaskqueue;
CREATE TABLE prod_dw.prod_raw_app_tbltaskqueue_20200819_ird0qal STORED AS PARQUET as select * from prod_raw.app_tbltaskqueue;
DROP TABLE prod_raw.app_tbltaskqueue ;
DROP TABLE prod_jnl.app_tbltaskqueue ;
DROP VIEW prod_raw_full_access.app_tbltaskqueue ;
DROP VIEW prod_raw_restricted_access.app_tbltaskqueue ;
