with v as
(
select object_name from mtable where object_type='view' and db_name='prod_raw_restricted_access' and upper(create_statement) like '%WHERE%'  and substr(object_name,1,instr(object_name,'_')-1) not in ('dss','pow')
),
v1 as
(
select object_name from mtable where object_type='view' and db_name='prod_refined_restricted_access' and upper(create_statement) like '%WHERE%' and object_name not in ('account_dim_current')
)
select concat('select *,( case when c3 between c2 and c1 then \'passed\' else \'failed\' end) result from (','select \'',v.object_name,'\' as c0',') o join ',' (select count(1) as c1 from ${var:p1}_raw.',v.object_name,') a join (select count(1) as c2 from ${var:p1}_raw_restricted_access.',v.object_name,') b join ','(select count(1) as c3 from ${var:p1}_raw_full_access.',v.object_name,') c;') from v
union all
select concat('select *,( case when c3 between c2 and c1 then \'passed\' else \'failed\' end) result from (','select \'',v1.object_name,'\' as c0',') o join ',' (select count(1) as c1 from ${var:p1}_refined.',v1.object_name,') a join (select count(1) as c2 from ${var:p1}_refined_restricted_access.',v1.object_name,') b join ','(select count(1) as c3 from ${var:p1}_refined_full_access.',v1.object_name,') c;') from v1
;
