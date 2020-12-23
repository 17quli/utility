select '\t' union all
select case '${var:deploy_type}'
when 'table' then table_ddl
when 'full_view' then full_view_ddl
when 'restricted_view' then restricted_view_ddl
else 'invalid deploy type'
end
from ${var:db_env}_${var:db_layer}.mdm
where table_name in (${var:tblist})
;
