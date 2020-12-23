drop table if exists ptn;
create table ptn 
(
id 		bigint,
value		string,
create_timestamp timestamp,
update_timestamp timestamp
) 
partitioned by (year int,month int)
stored as parquet
;

insert into ptn partition(year,month) values 
(0,'zero','1998-7-1 08:00:00','1998-7-1 08:00:00',extract(year from cast(('1998-7-1 08:00:00') as timestamp)),extract(month from cast(('1998-7-1 08:00:00') as timestamp))),
(1,'cai','1998-7-1 08:00:00','1998-7-1 08:00:00',extract(year from cast(('1998-7-1 08:00:00') as timestamp)),extract(month from cast(('1998-7-1 08:00:00') as timestamp))),
(2,'robbins','2001-4-1 08:00:00','2001-4-1 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp)),extract(month from cast(('2001-4-1 08:00:00') as timestamp))),
(3,'shirley','2001-4-1 08:00:00','2001-4-1 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp)),extract(month from cast(('2001-4-1 08:00:00') as timestamp))),
(6,'bruce','2001-5-1 08:00:00','2001-5-1 08:00:00',extract(year from cast(('2001-5-1 08:00:00') as timestamp)),extract(month from cast(('2001-5-1 08:00:00') as timestamp))),
(4,'quan','2019-12-16 08:00:00','2019-12-16 08:00:00',extract(year from cast(('2019-12-16 08:00:00') as timestamp)),extract(month from cast(('2019-12-16 08:00:00') as timestamp))), 
(5,'kaitlyn','2019-12-16 08:00:00','2019-12-16 08:00:00',extract(year from cast(('2019-12-16 08:00:00') as timestamp)),extract(month from cast(('2019-12-16 08:00:00') as timestamp)))
;

compute incremental stats ptn;

--test scenario 5

drop table if exists ptn_change;
create table ptn_change
(
id              bigint,
value           string,
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
crate_timestamp  timestamp,
update_timestamp timestamp
)
partitioned by (year int,month int)
stored as parquet
;


insert into ptn_change partition(year,month) values
(7,'rachel','2001-04-01 08:00:00','2001-04-01 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp)),extract(month from cast(('2001-4-1 08:00:00') as timestamp))),
(2,'Robbins','2001-04-01 08:00:00','2001-05-01 08:00:00',extract(year from cast(('2001-5-1 08:00:00') as timestamp)),extract(month from cast(('2001-5-1 08:00:00') as timestamp))),
(8,'Andy','2019-02-18 08:00:00','2019-02-18 08:00:00',extract(year from cast(('2019-02-18 08:00:00') as timestamp)),extract(month from cast(('2019-2-18 08:00:00') as timestamp)))
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
(select distinct p.year,p.month
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
select year,month
from 	pu
)
insert into ptn_stage partition(year,month)
select * 
from 	pi 
union all
select p.* 
from 	ptn p
	join 
	pa
	on p.year= pa.year and p.month=pa.month
;
	
insert overwrite ptn partition (year,month) select * from ptn_stage;
compute incremental stats ptn;
