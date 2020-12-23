select count(1) from dev_raw.${var:table_name};
select count(1) from dev_dw.${var:table_name};
select count(1) from dev_raw_full_access.${var:table_name};
select count(1) from dev_raw_restricted_access.${var:table_name};
select count(1) from ${var:lab_project}.${var:table_name};
