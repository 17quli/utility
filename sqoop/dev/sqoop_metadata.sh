target_table=mobject_def

sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irddev20.vsp.sas.com --query "select table_name,column_name, data_type,data_length,data_precision,data_scale,column_id from user_tab_columns where  \$CONDITIONS" --username lcf --password ntwB3Sjo2 --hive-import --hive-database dev_raw --hive-overwrite  --hive-table $target_table --delete-target-dir --target-dir /user/ird0qal/user_tab_columns -m 1

./run_db_sql.sh dev_raw "refresh $target_table"

