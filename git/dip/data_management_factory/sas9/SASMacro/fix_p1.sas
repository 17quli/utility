%macro fix_p1(table=, key=, schema=prod_raw);
%local i word join_cols min_keys earliest_batch columns count;
%let i = 0;
%do %until(&word =);
    %let i = %eval(&i + 1);
    %let word = %sysfunc(scan(&key, &i, %str( )));
    %if &word ne %then %do;
        %if %eval(&i = 1) 
            %then %do;
                  %let join_cols = %quote(l.&word = r.&word);
                  %let min_keys = &word;
                  %end;
            %else %do;
                  %let join_cols = &join_cols %quote(and l.&word = r.&word);
                  %let min_keys = %str(&min_keys, &word);
                  %end;
        %end;
    %end;
%let join_cols = &join_cols %quote(and l.record_effective_timestamp = r.record_effective_timestamp);
%let min_keys = %str(&min_keys, min(record_effective_timestamp) as record_effective_timestamp);
%let columns =;
%check_status;
proc sql noprint;
connect to impala(dsn=ClouderaImpala64 schema=&schema);
select cats('l.`', name, '`') length=32767
  into :columns separated by ', '
  from dictionary.columns
 where libname = 'IMPRAW'
   and memname = "&table"
   and varnum < (select varnum
                   from dictionary.columns
                  where libname = 'IMPRAW'
                    and memname = "&table"
                    and name = 'record_effective_timestamp');
%if %eval(&sqlobs = 0) %then %do;
    %rcset(4);
    %let status_msg = Table &table does not exist in &schema;
    %check_status;
    %goto EndMac;
    %end;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (drop table if exists `&schema`.`&table._new` purge)       
     by impala;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (drop table if exists `&schema`.`&table._new` purge)
   by impala;
execute (drop table if exists `&schema`.`&table._old` purge)
   by impala; 
execute (create table `&schema`.`&table._new` stored as parquet as
            select &columns,
                   case
                      when r.%sysfunc(scan(&key, 1, %str( ))) is not null
                         then '1800-01-01T00:00:00'
                         else l.record_effective_timestamp
                         end as `record_effective_timestamp`,
                      l.`record_expiry_timestamp`,
                      l.`checksum`,
                      l.`record_active_flag`,
                      l.`record_deleted_flag`,
                      l.`insert_object_run_key`,
                      l.`update_object_run_key`
                 from `&schema.`.&table as l
                 left join (select &min_keys
                              from `&schema.`.&table
                             group by %sysfunc(tranwrd(&key, %str( ), %str(, )))) as r
                   on &join_cols)
     by impala;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (refresh `&schema`.`&table._new`)
     by impala;
%check_status;
execute (compute stats `&schema`.`&table._new`)
     by impala;
%check_status;
select count
  into :count trimmed
  from connection to impala
  (select count(*) as `count`
     from `&schema`.`&table._new`
    where `record_effective_timestamp` is null);
%if %eval(&count ne 0) %then %do;
    %rcset(8)
    %let status_msg = At least one null record_effective_timestamp in &table;
    %check_status
    %goto EndMac;
    %end;
execute(alter table &schema..&table            
           rename to &schema..&table._old)
                 by impala;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute(alter table &schema..&table._new
           rename to &schema..&table)
    by impala;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (drop table &schema..&table._old purge)
   by impala;
%check_status;
execute (compute stats &schema..&table)
   by impala;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
disconnect from impala;
quit;
%EndMac:
%mend fix_p1;