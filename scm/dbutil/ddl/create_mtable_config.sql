drop table if exists mtable_config;
create table mtable_config
(
db_name string,
table_name string,
pattern string,
small_file_size_threshold int,
small_file_count_threshold int,
average_file_size_threshold int,
primary key (db_name,table_name)
)
partition by hash(table_name) partitions 6
stored as kudu
;
insert into mtable_config values ('dev_raw','mobject_run','event',67108864,16,67108864);
insert into mtable_config values ('dev_raw','dss_transactions','event',67108864,16,67108864);
insert into mtable_config values ('dev_raw','ptn_app_tblnz_rtngst','change extract',67108864,16,67108864);
upsert into mtable_config values ('dev_raw','tx4','event',67108864,4,67108864);
