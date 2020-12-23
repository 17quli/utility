update mfile_ls set db_name=concat(substr(substr(substr(file_name,instr(file_name,'/',1,4)+1),1,instr(substr(file_name,instr(file_name,'/',1,4)+1),'/',1)-1),3),'_',
        substr( decode(substr(substr(file_name,instr(file_name,'/hive/')+6),1,instr(substr(file_name,instr(file_name,'/hive/')+6),'/')-1),'teams',substr(file_name,instr(file_name,'/hive/')+12),
                       'projects',substr(file_name,instr(file_name,'/hive/')+15),
                       substr(file_name,instr(file_name,'/hive/')+6)
                )
            ,1,instr(decode(substr(substr(file_name,instr(file_name,'/hive/')+6),1,instr(substr(file_name,instr(file_name,'/hive/')+6),'/')-1),'teams',substr(file_name,instr(file_name,'/hive/')+12)
                            ,'projects',substr(file_name,instr(file_name,'/hive/')+15),substr(file_name,instr(file_name,'/hive/')+6)
                    )
                ,'/')-1
        )
        ,decode(substr(substr(file_name,instr(file_name,'/hive/')+6),1,instr(substr(file_name,instr(file_name,'/hive/')+6),'/')-1),'teams','_team','projects','_project',''))
where run_date='${var:v1}';
update mfile_ls set table_name=decode(instr(
                    decode(instr(substr(file_name,instr(file_name,'/',-1,2)+1,instr(substr(file_name,instr(file_name,'/',-1,2)+1),'/')-1),'='),
                    0,substr(file_name,instr(file_name,'/',-1,2)+1,instr(substr(file_name,instr(file_name,'/',-1,2)+1),'/')-1),
                    substr(file_name,instr(file_name,'/',-1,3)+1,instr(substr(file_name,instr(file_name,'/',-1,3)+1),'/')-1)
                    )  
                ,'='
              ),
        0,    decode(instr(substr(file_name,instr(file_name,'/',-1,2)+1,instr(substr(file_name,instr(file_name,'/',-1,2)+1),'/')-1),'='),
                                    0,substr(file_name,instr(file_name,'/',-1,2)+1,instr(substr(file_name,instr(file_name,'/',-1,2)+1),'/')-1),
                                    substr(file_name,instr(file_name,'/',-1,3)+1,instr(substr(file_name,instr(file_name,'/',-1,3)+1),'/')-1)
                    )
        ,substr(file_name,instr(file_name,'/',-1,4)+1,instr(substr(file_name,instr(file_name,'/',-1,4)+1),'/')-1)            
        )        
where run_date='${var:v1}';

update mfile_ls set if_partitioned=if(instr(file_name,'=')=0,'N','Y')
where run_date='${var:v1}';

with t as 
(
select to_date(now()) as inc_on_date,l.* from mfile_ls l where run_date=to_date(now())
),
y as 
(
select to_date(now()) as inc_on_date,l.* from mfile_ls l where run_date=to_date(date_add(now(),-1))
),
deleted as
(
select y.* 
from y
left join t on y.file_name=t.file_name
where t.run_date is null
),
new as
(
select t.* 
from t
left join y on y.file_name=t.file_name
where y.run_date is null
),
changed_current as
(
select t.* 
from t
join y on t.file_name=y.file_name
where t.last_modified<>y.last_modified
),
changed_old as
(
select y.* 
from y
join t on y.file_name=t.file_name
where y.last_modified<>t.last_modified
),
unchanged as
(
select t.* 
from t
join y on t.file_name=y.file_name and t.last_modified=y.last_modified
)
insert into mfile_ls_inc
select 'new' as change_type,* from new union all
select 'deleted' as change_type,* from deleted union all
select 'changed_current' as change_type,* from changed_current union all
select 'changed_old' as change_type,* from changed_old union all
select 'unchanged' as change_type,* from unchanged
;
