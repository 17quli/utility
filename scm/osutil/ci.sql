drop table if exists mci;
create table mci 
(
host		varchar(64),
category	varchar(20),
environment	varchar(4),
description	varchar(256),
component	varchar(256),
cpu		int,
memory		int,
swap		int
)
row format delimited
fields terminated by '\t'
stored as textfile
tblproperties('skip.header.line.count'='1')
;
