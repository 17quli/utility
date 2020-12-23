create table muser 
(user_id varchar(20),
 team varchar(20),
 view_db varchar(30)
)
stored as parquet;

insert into muser values 
(cast('ird0axp' as varchar(20)),cast('covid-19' as varchar(20)),cast('lab_covid19_project' as varchar(30))), 
(cast('ird0jxb' as varchar(20)),cast('covid-19' as varchar(20)),cast('lab_covid19_project' as varchar(30))),
(cast('ird0dxt' as varchar(20)),cast('covid-19' as varchar(20)),cast('lab_covid19_project' as varchar(30))),
(cast('ird0rxm' as varchar(20)),cast('covid-19' as varchar(20)),cast('lab_covid19_project' as varchar(30))),
(cast('ird0pxd' as varchar(20)),cast('covid-19' as varchar(20)),cast('lab_covid19_project' as varchar(30)));

create view lab_covid19_project.user_query as
select q.*
from    dev_raw.mquery q
inner join 
        dev_raw.muser u on u.user_id=q.user
where u.team='covid-19'        
;
