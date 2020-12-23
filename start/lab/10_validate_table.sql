select count(1) from ${var:db_name}.${var:table_name};
select count(1) from ${var:db_name}_full_access.${var:table_name};
select count(1) from ${var:db_name}_restricted_access.${var:table_name};
--select count(1) from ${var:db_env}_jnl.${var:table_name};
--select count(1) from ${var:lab_project}.${var:table_name};
