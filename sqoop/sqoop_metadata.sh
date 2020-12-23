target_table=mobject_def

sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irdprd20.vsp.sas.com --query "select table_name,column_name, data_type,data_length,data_precision,data_scale,column_id from user_tab_columns where  \$CONDITIONS" --username lcf --password e651b2ylm --hive-import --hive-database prod_dw --hive-overwrite  --hive-table $target_table --delete-target-dir --target-dir /user/ird0qal/user_tab_columns -m 1

./run_db_sql.sh prod_dw "refresh $target_table"

