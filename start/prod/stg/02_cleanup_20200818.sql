CREATE TABLE prod_dw.prod_jnl_app_tbltaskgroupqueue_20200818_ird0qal STORED AS PARQUET as select * from prod_jnl.app_tbltaskgroupqueue;
CREATE TABLE prod_dw.prod_raw_app_tbltaskgroupqueue_20200818_ird0qal STORED AS PARQUET as select * from prod_raw.app_tbltaskgroupqueue;
DROP TABLE prod_raw.app_tbltaskgroupqueue ;
DROP TABLE prod_jnl.app_tbltaskgroupqueue ;
DROP VIEW prod_raw_full_access.app_tbltaskgroupqueue ;
DROP VIEW prod_raw_restricted_access.app_tbltaskgroupqueue ;
