select concat(right(left(create_statement,length(create_statement)-1),length(create_statement)-2),';') from mtable where object_type='view' and db_name='lab_fcp_raw_restricted_access' and upper(create_statement) like '%WHERE%' and substr(object_name,1,instr(object_name,'_')-1) in ('app','wrq') 
