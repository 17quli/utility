select count (*) as num_rows,  "Table" as table_or_view from ${VAR:table_db}.${VAR:table_name}
union all
select count (*) as num_rows,  "Full View" as table_or_view  from ${VAR:full_db}.${VAR:table_name}
union all
select count (*) as num_rows,  "Restricted View" as table_or_view  from ${VAR:restricted_db}.${VAR:table_name}
;