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

insert into muser values
(cast('ird0qal' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0mxp' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0mxw' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0sxw' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0mxd' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0sxd' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0lxf' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0nxl' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0nxa' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0dxm' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0dxi' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30))),
(cast('ird0rxw' as varchar(20)),cast('platform' as varchar(20)),cast('dev_raw' as varchar(30)));


create view dev_raw.user_query as
select q.*
from    dev_raw.mquery q
inner join 
        dev_raw.muser u on u.user_id=q.user
where u.team='covid-19'        
;
