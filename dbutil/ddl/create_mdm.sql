create table mdm (
db_layer 		string comment 'raw,refined',
table_name 		string,
table_ddl		string,
full_view_ddl		string,
restricted_view_ddl	string,
last_modified		timestamp,
primary key (db_layer,table_name)
)
partition by hash(db_layer,table_name) partitions 6
stored as kudu
;

create table mdm_stg (
db_layer 		string comment 'raw,refined',
table_name 		string,
table_ddl		string,
full_view_ddl		string,
restricted_view_ddl	string,
last_modified		timestamp
)
row format delimited
fields terminated by '\002'
lines terminated by '\003'
stored as textfile
;
