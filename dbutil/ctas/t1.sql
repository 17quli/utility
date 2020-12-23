drop table if exists t1;
select now();
explain create table t1 as select * from test_refined.account_dim;
create table t1 stored as parquet as select * from test_refined.account_dim;
summary;
select now(); 
