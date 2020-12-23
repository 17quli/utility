./run_db_sql.sh dev_raw "drop table if exists account_dim; select now(); create table account_dim like test_refined.account_dim;"
./run_sh_parallel.sh t3.sh
./run_db_sql.sh dev_raw " refresh account_dim; select now(); "
