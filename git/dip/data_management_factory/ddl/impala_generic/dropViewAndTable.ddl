DROP VIEW if exists ${VAR:view_db}_${VAR:view_type}_access.${VAR:table_name}; 
DROP TABLE if exists ${VAR:view_db}_${VAR:view_type}_access.${VAR:table_name}; 
INVALIDATE METADATA ${VAR:view_db}_${VAR:view_type}_access.${VAR:table_name}; 
