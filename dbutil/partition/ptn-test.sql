drop table if exists ptn;
create table ptn 
(
id 		bigint,
value		string,
create_timestamp timestamp,
update_timestamp timestamp
) 
partitioned by (create_date char(10))
stored as parquet
;

insert into ptn partition(create_date) values 
(0,'zero','1998-7-1 08:00:00','1998-7-1 08:00:00',cast(('1998-07-01') as char(10))),
(1,'cai','1998-7-1 08:00:00','1998-7-1 08:00:00',cast(('1998-07-01') as char(10))),
(2,'robbins','2001-4-1 08:00:00','2001-4-1 08:00:00',cast(('2001-04-01') as char(10))),
(3,'shirley','2001-4-1 08:00:00','2001-4-1 08:00:00',cast(('2001-04-01') as char(10))),
(4,'quan','2019-12-16 08:00:00','2019-12-16 08:00:00',cast(('2019-12-16') as char(10))),
(5,'kaitlyn','2019-12-16 08:00:00','2019-12-16 08:00:00',cast(('2019-12-16') as char(10)))
;

compute incremental stats ptn;

--test scenario 1

drop table if exists ptn_staging;
create table ptn_staging 
(
id 		bigint,
value		string,
crate_timestamp  timestamp,
update_timestamp timestamp
) 
partitioned by (create_date char(10))
stored as parquet
;

insert into ptn_change partition(create_date) values 
(6,'rachel','2001-04-01 08:00:00','2001-04-01 08:00:00',cast(('2001-04-01') as char(10))),
(2,'Robbins','2001-04-01 08:00:00','2020-02-17 08:00:00',cast(('2001-04-01') as char(10)))
;

insert overwrite ptn partition(update_date) select * from ptn_staging; 



--test scenario 2

drop table if exists ptn_staging;
create table ptn_staging 
(
id 		bigint,
value		string,
update_timestamp timestamp
) 
stored as parquet
;

insert into ptn_staging values 
(4,'kaitalyn','2020-02-17 08:00:00'),
(2,'Robbins','2001-4-1 08:00:00'),
(5,'rachel','2001-4-1 08:00:00')
;

insert overwrite ptn partition(update_date) select *,cast(update_timestamp as char(10)) from ptn_staging; 

compute incremental stats ptn;
compute incremental stats ptn partition (update_date='2001-04-01');


--test scenario 3

drop table if exists ptn_change;
create table ptn_change
(
id              bigint,
value           string,
crate_timestamp  timestamp,
update_timestamp timestamp
)
partitioned by (create_date char(10))
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
partitioned by (create_date char(10))
stored as parquet
;


insert into ptn_change partition(create_date) values
(6,'rachel','2001-04-01 08:00:00','2001-04-01 08:00:00',cast('2001-04-01' as char(10))),
(2,'Robbins','2001-04-01 08:00:00','2020-02-17 08:00:00',cast('2001-04-01' as char(10))),
(7,'Andy','2020-02-18 08:00:00','2020-02-18 08:00:00',cast('2020-02-18' as char(10)))
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
insert overwrite  ptn_stage partition(create_date)
select * 
from 	pi 
union all
select p.* 
from 	ptn p
	join 
	po
	on p.create_date=cast(po.create_timestamp as char(10))
;
	
insert overwrite ptn partition (create_date) select * from ptn_stage;
compute incremental stats ptn;
