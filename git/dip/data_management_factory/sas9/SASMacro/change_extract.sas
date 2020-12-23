%macro change_extract / minoperator mindelimiter=','; 
/*
    Name:                           Change Extract
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        Detects changes in the source by a change timestamp
                                    exceeding the high watermark for the target table.
                                    The changes are incorporated into the target through
                                    circuitous logic to decide which are unchanged rows,
                                    which are updated and which are newly inserted.
                                    
    Method:
    %pattern_common_setup           Check all the parameters and load the source data
                                    into the staging area.
                                    
    execute (create table &stg...   Create a table of change transactions (keys and ELT-specific
                                    data) (_chgt).
    execute (create table &stg...   Join this with the target to create the target's replacement 
                                    in raw (_new).                                    
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Added partitioning logic. So far only one partition column is allowed;
    19 June 2020                    this may change in future iterations.
    
    Laurie Fleming                  Moved change-detail logic to the _new table creation, to simplify (and
    12 June 2020                    correct) H1 sub-pattern change made on 19 May. Rmoved cartesian join
                                    in _new logic.
    
    Laurie Fleming                  Change to H1 sub-pattern to allow for splits - that is, multiple rows
    19 May 2020                     within a version (flngverlast). This involved joining flngverlast to
                                    the natural key to get the maximum batch_key and minimum change capture
                                    timestamp. The only area changed is in the _chgt creation.
    
    Laurie Fleming                  %select_cols parameter changed from effective_timestamp to
    6 April 2020                    include_timestamp.

    Laurie Fleming                  Put two new check_status calls in, to improve error reporting.
    2 March 2020
    
    Laurie Fleming                  Converted to process source rows from a journal, instead of directly from the source.
    5 November 2019
    
    Laurie Fleming                  Reversed out much of the effective_from_timestamp change (qv 15-19 Sep). It
    16 October 2019                 is now only done for Change Extract for the initial load. All other loads derive from
                                    the change-capture or source effective-from timestamps.
    
    Laurie Fleming                  Big change to set effective_from_date to low for the initial load
    15-19 September 2019            of a key. Most of the work is, as ever, done in pattern_common_setup,
                                    but the actual setting of record_effective_timestamp is done here.
    
    Laurie Fleming                  Pick up the new p2h3_cols value from %select_cols to re-populate
    20 August 2019                  the effective_to timestamp for Change Extract History Type 3.
    
    Laurie Fleming                  Introduced four new history models to cope with the
    mid-July 2019                   vagaries of Start and EDW data.
    
    Laurie Fleming                  First written
    April 2019
*/
%global status_msg task_label warning_label;
/*
    These variables are available within this macro, and all that are called by it.
*/
%local i _source_name _target_name _target_library copy_count generated_copy lengths current_date 
       _staging_cols object_run_key current_date full_target pattern left_count right_count target_nobs
       bytes_read bytes_written task_label object_key max_timestamp stg_schema tgt_schema stg_auth tgt_auth
       earliest_batch jnl_schema pjnl_schema environment primary_journal_exist journal_exist ingestion_mode
       _target_library_connect _target_library_engine high_water_mark_value_jnl partitioned_by sort_by numrows;

%let pattern = Change Extract;
%if %symexist(external_read_primary_journal) %then 
    %let read_primary_journal = &external_read_primary_journal;

%pattern_common_setup;

%if %eval(&job_rc > 4 or &left_count = 0 or &ingestion_mode = jnl) %then
    %goto EndMac;
%let task_label = Capture Changes;
%logging(phase=start);

%select_cols(include_timestamp=No);           /* Generates select_key_cols, first_key_col and join_cols macro variables */
proc sql noprint;
connect to &_target_engine(&_target_connect);
select count format=best20.                     /* If the target is empty (target_nobs = 0), */
  into :target_nobs trimmed                     /* all original batches in the source start from 1 Jan 1800 */
  from connection to &_target_engine
  (select count(*) as `count`
     from &tgt_schema..&hadoop_table);
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
/*
    current_max and new_min are used to generate the update records; new_ranked and previous active for inserts
    (including the new states for existing records). &hadoop_table_nr contains rows which don't exist on the 
    target for the business key and effective date; &hadoop_table is the existing target.
*/
execute (create table &stg_schema..&hadoop_table_chgt &impala_options as with           /* Create transaction records */
            `current_max` as                                                            /* Maximum timestamp of existing keys */
            (select distinct &left_key_cols,
             %if &history_type = H1 %then %do;
                    _l.`flngverlast`, 
                %end;
                    _l.`record_effective_timestamp` as `effective_ts`,
                    _l.`insert_object_run_key`
               from &tgt_schema..&hadoop_table as _l
              inner join (select &select_key_cols,
                                 max(`record_effective_timestamp`) as `record_effective_timestamp`
                            from &tgt_schema..&hadoop_table
                           group by &select_key_cols) as _r
                 on &join_cols
                and _l.`record_effective_timestamp` = _r.`record_effective_timestamp`),
              
            `new_min` as                                                                /* New keys that aren't in the target */
            (select &select_key_cols,
            %if &history_type = H1 %then %do;
                    min(`flngverlast`) as `flngverlast`, 
                %end; 
                    min(&hadoop_effective_column) as `effective_ts`,
                    max(`batch_key`) as `max_batch_key`
               from &stg_schema..&hadoop_table_nr                                   
              group by &select_key_cols),
              
            `new_ranked` as                                                         
            (select &select_key_cols,
            %if &history_type = H1 %then %do;
                    `flngverlast`,
                %end;                         
                    `effective_ts`,
            %if &history_type = H3 %then %do;
                    &hadoop_effective_column,
                    &hadoop_to_timestamp,
                 %end;
                    `batch_key`,
                    rank() over(partition by &select_key_cols
                                    order by `effective_ts`) as `rank`
               from (select distinct &select_key_cols, 
                   %if &history_type = H1 %then %do;
                       `flngverlast`,
                       %end;
                   &hadoop_effective_column as `effective_ts`,
            %if &history_type = H3 %then %do;
                    &hadoop_effective_column,
                    &hadoop_to_timestamp,
                 %end;
                   `batch_key`
              from &stg_schema..&hadoop_table_nr) as alias),
               
            `previous_active` as
            (select &select_key_cols,
                    `effective_ts`,
            %if &history_type = H3 %then %do;
                &hadoop_effective_column,
                &hadoop_to_timestamp,
                %end;
                    `rank` - 1 as `rank`
               from `new_ranked`)
               
            select &left_key_cols, 
            %if &history_type = H1 %then %do;
                    _l.`flngverlast`,
                 %end;            
                   _l.`effective_ts`,
                   _l.`effective_ts` as `record_effective_timestamp`,
                   milliseconds_sub(_r.`effective_ts`, 1) as `record_expiry_timestamp`,
                   cast('U' as varchar(1)) as `operation`,
                   _l.`insert_object_run_key`,
                   cast(&object_run_key as int) as `update_object_run_key`
              from `current_max` as _l
              left join `new_min` as _r
                on &join_cols
             where _r.&first_key_col is not null                /* Where there's a match on business key, but not date */
             
             union all
             
            select distinct &left_key_cols,
            %if &history_type = H1 %then %do;
                    _l.`flngverlast`,
                 %end;             
                    _l.`effective_ts`,
             %if %eval(&target_nobs = 0)                             /* Initial load for the table */
                 %then %do;
                       case
                          when _l.`batch_key` = &earliest_batch and _l.`rank` = 1 /* Earliest batch, earliest row from the journal */
                             then cast('1800-01-01T00:00:00' as timestamp)
                             else _l.`effective_ts`
                          end
                      %end;
                %else %do;
                      _l.`effective_ts`
                      %end;
                      as `record_effective_timestamp`,
             %if &history_type in(H1, H2, H4)
                 %then %do;
                       coalesce(milliseconds_sub(_r.`effective_ts`, 1), cast('9000-12-31T00:00:00' as timestamp)) 
                       %end;
                 %else %if &history_type = H3 %then %do;
                       coalesce(milliseconds_sub(_r.`effective_ts`, 1), _l.&hadoop_to_timestamp)   /* H3 */
                       %end;
                       as `record_expiry_timestamp`,
                   cast('I' as varchar(1)) as `operation`,
                   cast(&object_run_key as int) as `insert_object_run_key`,
                   cast(&object_run_key as int) as `update_object_run_key`
              from `new_ranked` as _l
              left join `previous_active` as _r
                on &join_cols
               and _l.`rank` = _r.`rank`)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute(refresh &stg_schema..&hadoop_table_chgt)
   by &_target_engine;
%check_status;
execute(compute stats &stg_schema..&hadoop_table_chgt)
   by &_target_engine;
%check_status;
select count 
  into :_nobs trimmed
  from connection to &_target_engine
  (select count(*) as `count`
     from &stg_schema..&hadoop_table_chgt
    where `record_effective_timestamp` > `record_expiry_timestamp`);
%check_status;
%if %eval(&_nobs > 0) %then %do;
    %rcset(8);
    %let status_msg = Expiry date before effective date;
    %check_status;
    %goto EndMac;
    %end;    
select count
  into :_nobs
  from connection to &_target_engine
  (select count(*) as `count`
     from &stg_schema..&hadoop_table_chgt);
%check_status;
%let right_count = &_nobs;
disconnect from &_target_engine;
quit;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
%if %eval(&_nobs ne 1)
    %then %let number_rows = %quote(are %refnumv(val=&_nobs) rows);
    %else %let number_rows = is one row;
%putmsg(type=info, msg=%quote(There &number_rows in &sas_table_chgt));
%logging(phase=end);

%let task_label = Apply Changes;
%logging(phase=start);

proc sql;
/*
    Merge the new records with the existing target, along with the change transactions (chgt)
    to create the replacement target. Previously there was a change detail table (chgd), but its
    function has been merged in with the following code, saving time and work spaces.
*/
connect to &_target_engine(&_target_connect);
%if &sysuserid ne irdrun %then %do;                         /* Override memory settings if run from DI instead of batch */
    execute (set buffer_pool_limit = 12g)
       by &staging_library_engine;
    execute (set mem_limit = 0)
       by &staging_library_engine;
    %end;
execute (create table &tgt_schema..&hadoop_table_new like &tgt_schema..&hadoop_table)   /* Create the table first, then insert into it */
   by &_target_engine;  
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
execute(invalidate metadata &tgt_schema..&hadoop_table_new)    /* Forces the new table registration across all Impala nodes - unintuitively */
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
execute (insert overwrite &tgt_schema..&hadoop_table_new 
        %if &partitioned = Yes %then %do;
            partition(`&partition_column`)
            %str(/)* +noshuffle *%str(/)
            %end;
/*
    Existing records that aren't being changed. This includes updates from previous
    runs.
*/
           select &select_cols,                                
                   _l.`record_effective_timestamp`,
                   _l.`record_expiry_timestamp`,
                   _l.`record_active_flag`,
                   _l.`record_deleted_flag`,
                   _l.`insert_object_run_key`,
                   _l.`update_object_run_key`
               %if &partitioned = Yes %then %do;
                   ,
                   _l.`&partition_column`
                   %end;
              from &tgt_schema..&hadoop_table as _l
              left join &stg_schema..&hadoop_table_chgt as _r
                on &join_cols
            %if &history_type = H1 %then %do;
                and _l.`flngverlast` = _r.`flngverlast`
                %end;
               and _l.`record_effective_timestamp` = _r.`record_effective_timestamp`
               and _l.`insert_object_run_key` = _r.`insert_object_run_key`
             where _r.&first_key_col is null                    /* Only exists in the target, not chgt */
             
             union all
/*
    New records, or replacements to existing ones (inserts)
*/
            select &select_cols,
                   _r.`record_effective_timestamp`,
                   _r.`record_expiry_timestamp`,
                   cast(case
                           when _r.`record_expiry_timestamp` >= cast("9000-12-31T00:00:00" as timestamp)
                              then 'Y'
                              else 'N'
                              end as varchar(1)) as `record_active_flag`,
                   cast('N' as varchar(1)) as `record_deleted_flag`,
                   _r.`insert_object_run_key`,
                   _r.`update_object_run_key`
               %if &partitioned = Yes %then %do;
                   ,
                   _l.`&partition_column`
                   %end;
              from &stg_schema..&hadoop_table_nr as _l
             inner join &stg_schema..&hadoop_table_chgt as _r
                on &join_cols
            %if &history_type = H1 %then %do;
                and _l.`flngverlast` = _r.`flngverlast`
                %end;
               and _l.&hadoop_effective_column = _r.`effective_ts`
               and _r.operation = 'I'
               
             union all
/*
    Previous versions of existing records (updates)
*/
            select 
            %if &history_type ne H3 
                %then %do;
                      &select_cols,
                      %end;
                %else %do;
                      &p2h3_cols,                     /* See definition in select_cols - patches date_ceased/fdtmeffectiveto on an update */
                      %end;
                   _r.`record_effective_timestamp`,
                   _r.`record_expiry_timestamp`,
                   cast('N' as varchar(1)) as `record_active_flag`,
                   cast('N' as varchar(1)) as `record_deleted_flag`,
                   _r.`insert_object_run_key`,
                   _r.`update_object_run_key`
               %if &partitioned = Yes %then %do;
                   ,
                   _l.`&partition_column`
                   %end;
              from &tgt_schema..&hadoop_table as _l
             inner join &stg_schema..&hadoop_table_chgt as _r
                on &join_cols
            %if &history_type = H1 %then %do;
                and _l.`flngverlast` = _r.`flngverlast`
                %end;
               and _l.`record_effective_timestamp` = _r.`record_effective_timestamp`
               and _l.`insert_object_run_key` = _r.`insert_object_run_key`
               and _r.operation = 'U')
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
execute(refresh &tgt_schema..&hadoop_table_new)
   by &_target_engine;
%check_status;
execute(compute stats &tgt_schema..&hadoop_table_new)
   by &_target_engine;
%check_status;
disconnect from &_target_engine;
quit;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
%logging(phase=end);

%let task_label = Reconciliation;       
%logging(phase=start);

%reconciliation;                        /* Count up the updates and inserts on _new and source, and check it all adds up */
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
%let _nobs = 0;
proc sql noprint;
connect to &_target_engine(&_target_connect);
select count                            /* Should be picked up in the change transaction phase above, but just in case */
  into :_nobs trimmed
  from connection to &_target_engine
  (select count(*) as `count`
     from &tgt_schema..&hadoop_table_new
    where `record_effective_timestamp` > `record_expiry_timestamp`);
%if %eval(&_nobs > 0) %then %do;
    %rcset(8);
    %let status_msg = Expiry date before effective date;
    %check_status;
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
%if %eval(&job_rc > 4) %then %do;       /* In case any extra steps get added after committing */
    %goto EndMac;
    %end;
    
%EndMac:
%refresh_libname(library_prefix=_target_library);
%logging(task=Finish);
%if &debug = No and %eval(&job_rc le 4) %then %do;
    %tidyup;
    %end;
%exit_return_code;
%mend change_extract;