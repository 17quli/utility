insert into ${var:db_env}_${var:db_layer}.mdm
(
db_layer                ,
table_name              ,
table_ddl               ,
full_view_ddl           ,
restricted_view_ddl     ,
last_modified           
)
values
(
'${var:db_layer}',
'${var:table_name}',
'${var:table_ddl}',
'${var:full_view_ddl}',
'${var:restricted_view_ddl}',
now()
);
