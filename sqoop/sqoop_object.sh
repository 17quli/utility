#!/bin/bash
mode=$1
source_table=OBJECT
target_table=mobject
if [ -z "$mode" ]
then
#default to full
	sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irdprd20.vsp.sas.com -m 1 --table $source_table --username lcf --password e651b2ylm --target-dir /env/3_prod/hive/dw/$target_table --delete-target-dir --fields-terminated-by '\001' --bindir /home/ird0qal/sqoop/stg --temporary-rootdir /user/ird0qal/temporary_root  --columns OBJECT_KEY,SYSTEM_SCHEMA_KEY,TARGET_OBJECT_NAME,OBJECT_SHORT_NAME,TARGET_DB,SOURCE_OBJECT_NAME,SOURCE_OBJECT_TYPE,SAS_LIB_REF,PK_COLUMN_NAMES,NK_COLUMN_NAMES,LOAD_PATTERN_NAME,SENSITIVE_DATA_FLAG,RETENTION_KEY,CHANGE_CAPTURE_TIMESTAMP_COLUMN,HISTORY_LOADED_FROM_TDW,HISTORY_TYPE,EFFECTIVE_FROM_TIMESTAMP_COLUMN,EFFECTIVE_TO_TIMESTAMP_COLUMN,EFFECTIVE_TIMESTAMP_GRAIN,PURGE_GRAIN,DUPLICATION_TIMESTAMP_GRAIN,LAYER,PARTITION_KEY,CREATED_BY,CREATED_ON,UPDATED_BY,UPDATED_ON,DERIVED_COLUMNS

else
	lv=`./run_db_sqlb.sh prod_dw "select max(created_on) from mobject"`
	sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irdprd20.vsp.sas.com -m 1 --table $source_table --username lcf --password e651b2ylm --target-dir /env/3_prod/hive/dw/$target_table --fields-terminated-by '\001' --incremental lastmodified --check-column CREATED_ON --last-value "$lv" --merge-key OBJECT_KEY --bindir /home/ird0qal/sqoop/stg --temporary-rootdir /user/ird0qal/temporary_root --map-column-java EXCLUDED_COLUMNS=String,CUSTOM_SQL=String
fi

./run_db_sql.sh prod_dw "refresh $target_table"

#sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irddev20.vsp.sas.com -m 1 --table $source_table --username lcf --password ntwB3Sjo2 --hive-import --hive-database dev_raw --hive-table $target_table --incremental lastmodified --check-column created_date --merge-key object_key
#sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irddev20.vsp.sas.com -m 1 --table LCF.OBJECT --username lcf --password ntwB3Sjo2 --target-dir /env/1_dev/hive/raw/object --delete-target-dir --fields-terminated-by '|'
#jdbc:datadirect:oracle://server1:1521;ServiceName=ORCL;InitializationString=ALTER SESSION SET NLS_DATE_FORMAT='DD-MON-YY'
#sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irddev20.vsp.sas.com --table LCF.OBJECT --username lcf --password ntwB3Sjo2 --as-parquetfile --target-dir /env/1_dev/hive/raw/object --delete-target-dir --map-column-java CREATED_DATE=Timestamp

#sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irddev20.vsp.sas.com --table LCF.OBJECT --username lcf --password ntwB3Sjo2 --hive-import --hive-database dev_raw --hive-overwrite --hive-table object
#sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irddev20.vsp.sas.com --table LCF.OBJECT_RUN --username lcf --password ntwB3Sjo2 --hive-import --create-hive-table --hive-database dev_raw --hive-overwrite  --hive-table object_run --delete-target-dir
#sqoop import --connect jdbc:oracle:thin:@//ird74au.vsp.sas.com:6660/irddev20.vsp.sas.com --query "select table_name,column_name, data_type,data_length,data_precision,data_scale,column_id from user_tab_columns where  \$CONDITIONS" --username lcf --password ntwB3Sjo2 --hive-import --create-hive-table --hive-database dev_raw --hive-overwrite  --hive-table object_def --delete-target-dir --target-dir /user/ird0qal/user_tab_columns -m 1
