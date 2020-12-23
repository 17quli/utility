drop table if exists mhost_stg;
create table mhost_stg
(
  host string,
  category string,
  component string,
  run_date timestamp,
  v1 string,
  v2 string,
  v3 string,
  v4 string,
  v5 string,
  v6 string 
)
row format delimited
fields terminated by '\002'
lines terminated by '\003'
stored as textfile
;
drop table if exists mhost;
create table mhost
(
  host string,
  category string,
  component string,
  run_date timestamp,
  v1 int,
  v2 int,
  v3 int,
  v4 int,
  v5 int,
  v6 int,
  primary key (host,category,component,run_date) 
)
partition by hash(host) partitions 50
stored as kudu
;

create view mhost_cpu as
select   host ,
  run_date ,
  v1 as usr,
  v2 as sys,
  v3 as wa,
  v4 as steal,
  v5 as ni,
  v6 as idle
from mhost
where category='cpu'
;

create view mhost_mem as
select   host ,
  component,
  run_date ,
  v1 as used,
  v2 as total,
  v3 as free
from mhost
where category='memory'
;

create view mhost_disk as
select   host ,
  component as mount_point,
  run_date ,
  v1 as used,
  v2 as total,
  v3 as available,
  trunc(v1/v2*100) as usep	
from mhost
where category='disk'
;

create view mdatanode_cpu as
select   host ,
  run_date ,
  v1 as usr,
  v2 as sys,
  v3 as io,
  v4 as steal,
  v5 as guest,
  v6 as idle
from mhost
where category='cpu'
and host in (select host from mci where description='Data Node')
;

