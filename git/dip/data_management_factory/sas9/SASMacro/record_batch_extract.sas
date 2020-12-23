%macro record_batch_extract;
/*
    Name:                           Record Batch Extract
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   20 January 2020
    Remarks:                        Change Extract H3 (History Type 3) was originally devised for tblnamerecord,
                                    as the source contained effective-from and -to values. It was predicated on 
                                    these being populated as is the standard fashion for SCD-2 tables. But oh no!
                                    The clever developers have come up with way of perverting the timeline.
                                    Imagine a natural key with three rows - one current and two historical.
                                    When a new line is added, there are now four rows. But in fact there are four
                                    completely new rows, because the previous three rows have been moved into the
                                    tblnamehistory table. This shouldn't really matter, but the fdtmwhen value for
                                    the new four rows is the same.
                                    
                                    On top of this perversion, it is quite possible for the number of rows for a key
                                    to drop - where there were seventeen, there is now one.
                                    
                                    By versioning over fdtmwhen and making the most recent fdtmwhen values all active,
                                    the target table is now consistent but not readable by anyone who has not been 
                                    thoroughly informed of its structure. This transformation has been written to make 
                                    some little sense of it; it is far from perfect, but it does have its own weird 
                                    internal logic. Modify this code with extreme care.
                                    
    Method:
    %pattern_common_setup           Check all the parameters and load the source data
                                    into the staging area.
                                    
    execute (create table &stg...   Join the *_nr data with the target to create the target's replacement 
                                    in raw (_new).                                    
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  %select_cols parameter changed from effective_timestamp to
    6 April 2020                    include_timestamp.

    Laurie Fleming                  Fixed population of insert_ and update_object_run_keys - it uses the 
    late Feburary 2019              &object_run_key instead of the batch key, or update_object_run_key from
                                    previous runs.
    
    Laurie Fleming                  First written
    20 January 2019
*/
%putmsg(type=info, msg=Starting Journaling for Record Batch Extract);
%global status_msg task_label warning_label;
/*
    These variables are available within this macro, and all that are called by it.
*/
%local i _source_name _target_name _target_library copy_count generated_copy lengths current_date 
       _staging_cols object_run_key current_date full_target pattern left_count right_count target_nobs
       ask_label object_key max_timestamp stg_schema tgt_schema stg_auth tgt_auth
       jnl_schema pjnl_schema environment primary_journal_exist journal_exist ingestion_mode earliest_batch
       _target_library_connect _target_library_engine high_water_mark_value_jnl partitioned_by sort_by numrows;
%let pattern = Record Batch Extract;
%pattern_common_setup;
%put &=ingestion_mode;
%if %eval(&job_rc > 4 or &left_count = 0 or &ingestion_mode = jnl) %then
    %goto EndMac;
%let task_label = Insert New Batches;
%logging(phase=start);

%select_cols(include_timestamp=No);           /* Generates select_key_cols, first_key_col and join_cols macro variables */
proc sql noprint;
connect to &_target_engine(&_target_connect);
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (create table &tgt_schema..&hadoop_table_new &impala_options as with
            `history_and_new` as
            (select &select_cols,                                           /* Rows already in the target */
                    _l.`record_effective_timestamp`,
                    _l.`insert_object_run_key`,
                    _l.`update_object_run_key`,
                    _l.`insert_object_run_key` as `batch_key`
              from &tgt_schema..&hadoop_table as _l
              
             union all
              
            select &select_cols,                                            /* Newly extract from the journal, not yet in target */
                   cast(null as timestamp) as `record_effective_timestamp`,
                   cast(&object_run_key as int) as `insert_object_run_key`,
                   cast(&object_run_key as int) as `update_object_run_key`,
                   _l.`batch_key`
              from &stg_schema..&hadoop_table_nr as _l),

            `distinct_version` as                                            /* Distinct keys, timestamps and batch keys */
            (select distinct 
                    &select_key_cols,
                    `&change_capture_timestamp`,
                    `record_effective_timestamp`,
                    `batch_key`,
                    `insert_object_run_key`,
                    `update_object_run_key`
               from `history_and_new`),
    
            `date_bounds` as                                                 /* Order and rank, so timestamps can be compared with previous ones */
            (select &select_key_cols,
                    `&change_capture_timestamp`,
                    `record_effective_timestamp`,
                    `batch_key`,
                    `insert_object_run_key`,
                    `update_object_run_key`,
                    rank() over (partition by &select_key_cols
                                     order by `&change_capture_timestamp` desc) as `rank`                 /* Most recent timestamp: rank = 1 */
               from `distinct_version`),
               
            `record_timestamps` as
            (select &left_key_cols,
                    _l.`&change_capture_timestamp`,
                    case
                       when _l.`batch_key` = &earliest_batch                           /* Earliest batch, earliest row from the journal */
                          then cast('1800-01-01T00:00:00' as timestamp)
                       when _l.record_effective_timestamp = '1800-01-01T00:00:00'      /* Retain earlier-assigned low timestamp */
                          then _l.record_effective_timestamp
                       else _l.`&change_capture_timestamp`                             /* All rows from a timestamp (fdtmwhen) have the same record_effective_timestamp */
                       end as `record_effective_timestamp`,
                    coalesce(milliseconds_sub(_r.`&change_capture_timestamp`, 1), cast('9000-12-31T00:00:00' as timestamp)) as `record_expiry_timestamp`,
                    _l.`rank`,
                    _l.`insert_object_run_key`,
                    coalesce(_r.`update_object_run_key`, _l.`update_object_run_key`) as `update_object_run_key`
               from `date_bounds` as _l
               left join `date_bounds` as _r
                 on &join_cols
                and _l.`rank` = _r.`rank` + 1)
              
             select &select_cols,
                    _r.`record_effective_timestamp`,
                    _r.`record_expiry_timestamp`,
                    cast(case _r.`rank`                              /* All records from the most recent batch (proxy for change capture timestamp) are active */
                            when 1
                               then 'Y'
                            else 'N'
                            end as varchar(1)) as `record_active_flag`,
                    cast('N' as varchar(1)) as `record_deleted_flag`,
                    _r.`insert_object_run_key`,
                    _r.`update_object_run_key`
               from `history_and_new` as _l
              inner join `record_timestamps` as _r
                 on &join_cols
                and _l.`&change_capture_timestamp` = _r.`&change_capture_timestamp`)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (invalidate metadata &tgt_schema..&hadoop_table_new)
   by &_target_engine;
%check_status;
execute(refresh &tgt_schema..&hadoop_table_new)
   by &_target_engine;
%check_status;
execute(compute stats &tgt_schema..&hadoop_table_new)
   by &_target_engine;
%check_status;
select count
  into :_nobs trimmed
  from connection to &_target_engine
  (select count(*) as `count`
     from &tgt_schema..&hadoop_table_new
    where `record_effective_timestamp` > `record_expiry_timestamp`);
%check_status;
%if %eval(&_nobs > 0) %then %do;
    %rcset(8);
    %let status_msg = Expiry date before effective date;
    %goto EndMac;
    %end;    
select count
  into :_nobs
  from connection to &_target_engine
  (select count(*) as `count`
     from &tgt_schema..&hadoop_table_new
    where `insert_object_run_key` = &object_run_key);
%check_status;
%let right_count = &_nobs;
disconnect from &_target_engine;
quit;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
%if %eval(&_nobs ne 1)
    %then %let number_rows = %quote(are %refnumv(val=&_nobs) new rows);
    %else %let number_rows = is one new row;
%putmsg(type=info, msg=%quote(There &number_rows in &sas_table_new));
%logging(phase=end);

%let task_label = Reconciliation;       
%refresh_libname(library_prefix=staging_library _target_library);
%logging(phase=start);

%reconciliation;                        /* Count up the updates and inserts on _new and source, and check it all adds up */
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
%let _nobs = 0;
proc sql noprint;
connect to &_target_engine(&_target_connect);
select count
  into :_nobs trimmed
  from connection to &_target_engine
  (select count(*) as `count`
     from &tgt_schema..&hadoop_table_new
    where `record_effective_timestamp` > `record_expiry_timestamp`);
%if %eval(&_nobs > 0) %then %do;
    %rcset(8);
    %let status_msg = Expiry date before effective date;
    %goto EndMac;
    %end;    
%logging(phase=end);
%if %eval(&job_rc > 4) %then %do;
    %goto EndMac;
    %end;

%let task_label = Commit;
%logging(phase=start);
%commit_changes;                        /* Swap the existing target and _new around, being very careful to not throw everything away */
%logging(phase=end);
%if %eval(&job_rc > 4) %then %do;
    %goto EndMac;
    %end;

%EndMac:
%refresh_libname(library_prefix=_target_library);
%logging(task=Finish);
%if &debug = No and %eval(&job_rc le 4) %then %do;
    %tidyup;
    %end;
%exit_return_code;
%mend record_batch_extract;