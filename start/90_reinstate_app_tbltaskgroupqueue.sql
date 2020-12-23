--create journal table
create table ${var:db_env}_jnl.${var:table_name}
(
  flnggroupkey INT,
  flngqueuekey INT,
  flngver INT,
  flngverlast INT,
  flngorder INT,
  fintpriority SMALLINT,
  fstrqueuemethod VARCHAR(24),
  fintnotificationtype SMALLINT,
  fblninteractive SMALLINT,
  fblnactive SMALLINT,
  fstrwho VARCHAR(20),
  fdtmwhen TIMESTAMP, 	
  batch_key INT
)
stored as parquet;

insert into ${var:db_env}_jnl.${var:table_name}
(
flnggroupkey,
flngqueuekey,
flngver,
flngverlast,
flngorder,
fintpriority,
fstrqueuemethod,
fintnotificationtype,
fblninteractive,
fblnactive,
fstrwho,
fdtmwhen,
batch_key)
select 
flnggroupkey,
flngqueuekey,
flngver,
flngverlast,
flngorder,
cast(0 as smallint),
fstrqueuemethod,
cast(0 as smallint),
fblninteractive,
fblnactive,
fstrwho,
fdtmwhen,
batch_key
from ${var:db_env}_dw.${var:db_env}_jnl_${var:table_name}_${var:table_suffix}
;

insert into ${var:db_name}.${var:table_name}
(
flnggroupkey,
flngqueuekey,
flngver,
flngverlast,
flngorder,
fintpriority,
fstrqueuemethod,
fintnotificationtype,
fblninteractive,
fblnactive,
fstrwho,
fdtmwhen,
record_effective_timestamp,
record_expiry_timestamp,
record_active_flag,
record_deleted_flag,
insert_object_run_key,
update_object_run_key)
select
flnggroupkey,
flngqueuekey,
flngver,
flngverlast,
flngorder,
cast(0 as smallint),
fstrqueuemethod,
cast(0 as smallint),
fblninteractive,
fblnactive,
fstrwho,
fdtmwhen,
record_effective_timestamp,
record_expiry_timestamp,
record_active_flag,
record_deleted_flag,
insert_object_run_key,
update_object_run_key
from ${var:db_env}_dw.${var:db_name}_${var:table_name}_${var:table_suffix}
;

