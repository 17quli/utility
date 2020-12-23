drop table if exists ptn;
create table ptn 
(
id 		bigint,
value		string,
is_active	char(1),
create_timestamp timestamp,
update_timestamp timestamp
) 
partitioned by (year int,month int)
stored as parquet
;

insert into ptn partition(year,month) values 
(0,'zero',cast('Y' as char(1)),'1998-7-1 08:00:00','1998-7-1 08:00:00',extract(year from cast(('1998-7-1 08:00:00') as timestamp)),extract(month from cast(('1998-7-1 08:00:00') as timestamp))),
(1,'cai',cast('Y' as char(1)),'1998-7-1 08:00:00','1998-7-1 08:00:00',extract(year from cast(('1998-7-1 08:00:00') as timestamp)),extract(month from cast(('1998-7-1 08:00:00') as timestamp))),
(2,'robbins',cast('Y' as char(1)),'2001-4-1 08:00:00','2001-4-1 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp)),extract(month from cast(('2001-4-1 08:00:00') as timestamp))),
(3,'shirley',cast('Y' as char(1)),'2001-4-1 08:00:00','2001-4-1 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp)),extract(month from cast(('2001-4-1 08:00:00') as timestamp))),
(6,'bruce',cast('Y' as char(1)),'2001-5-1 08:00:00','2001-5-1 08:00:00',extract(year from cast(('2001-5-1 08:00:00') as timestamp)),extract(month from cast(('2001-5-1 08:00:00') as timestamp))),
(4,'quan',cast('Y' as char(1)),'2019-12-16 08:00:00','2019-12-16 08:00:00',extract(year from cast(('2019-12-16 08:00:00') as timestamp)),extract(month from cast(('2019-12-16 08:00:00') as timestamp))), 
(5,'kaitlyn',cast('Y' as char(1)),'2019-12-16 08:00:00','2019-12-16 08:00:00',extract(year from cast(('2019-12-16 08:00:00') as timestamp)),extract(month from cast(('2019-12-16 08:00:00') as timestamp)))
;

compute incremental stats ptn;

--test scenario 6

drop table if exists ptn_change;
create table ptn_change
(
id              bigint,
value           string,
is_active	char(1),
crate_timestamp  timestamp,
update_timestamp timestamp
)
partitioned by (year int,month int)
stored as parquet
;

drop table if exists ptn_stage;
create table ptn_stage 
(
id              bigint,
value           string,
is_active	char(1),
crate_timestamp  timestamp,
update_timestamp timestamp
)
partitioned by (year int,month int)
stored as parquet
;


insert into ptn_change partition(year,month) values
(7,'rachel',cast('Y' as char(1)),'2001-04-01 08:00:00','2001-04-01 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp)),extract(month from cast(('2001-4-1 08:00:00') as timestamp))),
(1,'Cai',cast('Y' as char(1)),'1998-7-1 08:00:00','1998-8-1 08:00:00',extract(year from cast(('1998-8-1 08:00:00') as timestamp)),extract(month from cast(('1998-8-1 08:00:00') as timestamp))),
(2,'Robbins',cast('Y' as char(1)),'2001-04-01 08:00:00','2001-05-01 08:00:00',extract(year from cast(('2001-5-1 08:00:00') as timestamp)),extract(month from cast(('2001-5-1 08:00:00') as timestamp))),
(8,'Andy',cast('Y' as char(1)),'2019-02-18 08:00:00','2019-02-18 08:00:00',extract(year from cast(('2019-02-18 08:00:00') as timestamp)),extract(month from cast(('2019-2-18 08:00:00') as timestamp)))
;


truncate ptn_stage;

with pi as
(
select c.*
from	ptn_change c
	left outer join
	ptn p
	on c.id=p.id),
pu as 
(select p.id,
	p.value,
	cast('N' as char(1)) as is_active,
	p.create_timestamp,
	p.update_timestamp,
	p.year,
	p.month
from	ptn p
	join 
	ptn_change c
	on p.id=c.id
),
pa as
(
select distinct year,month
from	pi
union 
select distinct year,month
from 	pu
)
insert into ptn_stage partition(year,month)
select * 
from 	pi 
union all
select pu.* 
from	pu
union all
select p.*
from 	ptn p
	left outer join 
	ptn_change pc
	on p.id=pc.id 
	join pa
	on p.year= pa.year and p.month=pa.month
	where pc.id is null
;
	
insert overwrite ptn partition (year,month) select * from ptn_stage;
compute incremental stats ptn;
