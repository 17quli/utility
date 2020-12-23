00:load metadata:./sqoop_metadata.sh
10:create table:./create_table.sh dev_raw create_table.sql object
11:create table:./create_table.sh dev_raw create_table.sql object_run
20:sqoop import:./sqoop_object.sh
21:sqoop import:./sqoop_object_run.sh
