drop table if exists ptn;
create table ptn
(
id              bigint,
update_timestamp timestamp,
value           string,
is_active       string,
create_timestamp timestamp,
primary key (id,update_timestamp) 
)
partition by hash(id) partitions 6,
range(update_timestamp) 
(
	partition values<'2000-1-1', 
	partition '2000-1-1'<=values<'2010-1-1', 
	partition '2010-1-1'<=values<'2020-1-1', 
	partition '2020-1-1'<=values
)  
stored as kudu
;

insert into ptn values 
(0,'1998-7-1 08:00:00','zero','Y','1998-7-1 08:00:00'),
(1,'1998-7-1 08:00:00','cai','Y','1998-7-1 08:00:00'),
(2,'2001-4-1 08:00:00','robbins','Y','2001-4-1 08:00:00'),
(3,'2001-4-1 08:00:00','shirley','Y','2001-4-1 08:00:00'),
(4,'2019-12-16 08:00:00','quan','Y','2019-12-16 08:00:00'),
(5,'2019-12-16 08:00:00','kaitlyn','Y','2019-12-16 08:00:00'),
(6,'2001-5-1 08:00:00','bruce','Y','2001-5-1 08:00:00')
;

compute incremental stats ptn;

--test scenario kudu

drop table if exists ptn_change;
create table ptn_change
(
id              bigint,
update_timestamp timestamp,
value           string,
is_active	char(1),
crate_timestamp  timestamp
)
stored as parquet
;


insert into ptn_change  values
(7,'2001-04-01 08:00:00','rachel',cast('Y' as char(1)),'2001-04-01 08:00:00'),
(1,'1998-8-1 08:00:00','Cai',cast('Y' as char(1)),'1998-7-1 08:00:00'),
(2,'2001-05-01 08:00:00','Robbins',cast('Y' as char(1)),'2001-04-01 08:00:00'),
(8,'2019-02-18 08:00:00','Andy',cast('Y' as char(1)),'2019-02-18 08:00:00')
;

update ptn
set is_active='N' 
where id in (
select id from ptn_change);

upsert into ptn
select * from ptn_change;

compute incremental stats ptn;
explain 
select * from ptn where update_timestamp<'2000-1-1';


explain 
select * from ptn where id=1;
