create table ${var:target_db}.wrq_tblweblogonactivity (
fi64weblogonactivitykey bigint,
flngweblogonkey int,
fdtmlogon timestamp,
fstrsource varchar(40),
fstrtype varchar(40),
flngcustomerkey int,
flngaccountkey int,
fdtmfilingperiod timestamp,
flngadditionalkey int,
fstrwho varchar(20),
fdtmwhen timestamp,
record_effective_timestamp timestamp,
record_expiry_timestamp timestamp,
record_active_flag varchar(1),
record_deleted_flag varchar(1),
insert_object_run_key int,
update_object_run_key int
 ) stored as parquet;
