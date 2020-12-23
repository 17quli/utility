00:load metadata in full mode:./sqoop_metadata.sh
10:create table:./create_table.sh {dev_raw|test_dw|prod_dw} create_table.sql object
11:create table:./create_table.sh {dev_raw|test_dw|prod_dw} create_table.sql object_run

20: ./run_db_file.sh {dev_raw|test_dw|prod_dw} ct_mobject.sql
21: ./run_db_file.sh {dev_raw|test_dw|prod_dw} ct_mobject_run.sql

30:sqoop full import:./sqoop_object.sh 
31:sqoop incremental import:./sqoop_object.sh inc

40:sqoop full import:./sqoop_object_run.sh
41:sqoop full import:./sqoop_object_run.sh inc
