drop table if exists ptn;
create table ptn 
(
id 		bigint,
value		string,
create_timestamp timestamp,
update_timestamp timestamp
) 
partitioned by (year int)
stored as parquet
;

insert into ptn partition(year) values 
(0,'zero','1998-7-1 08:00:00','1998-7-1 08:00:00',extract(year from cast(('1998-7-1 08:00:00') as timestamp))),
(1,'cai','1998-7-1 08:00:00','1998-7-1 08:00:00',extract(year from cast(('1998-7-1 08:00:00') as timestamp))),
(2,'robbins','2001-4-1 08:00:00','2001-4-1 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp))),
(3,'shirley','2001-4-1 08:00:00','2001-4-1 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp))),
(4,'quan','2019-12-16 08:00:00','2019-12-16 08:00:00',extract(year from cast(('2019-12-16 08:00:00') as timestamp))),
(5,'kaitlyn','2019-12-16 08:00:00','2019-12-16 08:00:00',extract(year from cast(('2019-12-16 08:00:00') as timestamp)))
;

compute incremental stats ptn;

--test scenario 4

drop table if exists ptn_change;
create table ptn_change
(
id              bigint,
value           string,
crate_timestamp  timestamp,
update_timestamp timestamp
)
partitioned by (year int)
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
partitioned by (year int)
stored as parquet
;


insert into ptn_change partition(year) values
(6,'rachel','2001-04-01 08:00:00','2001-04-01 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp))),
(2,'Robbins','2001-04-01 08:00:00','2020-02-17 08:00:00',extract(year from cast(('2001-4-1 08:00:00') as timestamp))),
(7,'Andy','2020-02-18 08:00:00','2020-02-18 08:00:00',extract(year from cast(('2020-02-18 08:00:00') as timestamp)))
;

with pi as
(
select c.*
from	ptn_change c
	left outer join
	ptn p
	on c.id=p.id),
po as 
(select p.*
from	ptn p
	join 
	ptn_change c
	on p.id=c.id
)
insert overwrite  ptn_stage partition(year)
select * 
from 	pi 
union all
select p.* 
from 	ptn p
	join 
	po
	on p.year=extract(year from po.create_timestamp)
;
	
insert overwrite ptn partition (year) select * from ptn_stage;
compute incremental stats ptn;
