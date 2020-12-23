%macro full_comparison;
/*
    Name:                           Full Comparison
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        Detects changes in the source by comparing with the key and 
                                    checksum of the data columns for active records on the target.
                                    circuitous logic to decide which are unchanged rows,
                                    which are updated and which are newly inserted.
                                    
    Method:
    %pattern_common_setup           Check all the parameters and load the source data
                                    into the staging area.
    execute (create table &stg...   Create a table of change transactions (keys and ELT-specific
                                    data) (_chgt).
    execute (create table &stg...   From this table, flesh out the transactions with the
                                    non-key data from the staging table (_chgd).
    
    execute (create table &jnl...   Join this with the journal to create the journal's replacement 
                                    in the journal schema (_new).                     
                                    
    execute (insert into &tgt...    Insert from journal into target
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Removed two spurious debugging %put statements.
    5 May 2020
    
    Laurie Fleming                  Reversal of 1 Jan 1800 change of late February. Now all initial
    21 April 2020                   loads have an effective timestamp of 1 Jan 1800.
    
    Laurie Fleming                  %select_cols parameter changed from effective_timestamp to
    6 April 2020                    include_timestamp. (For this pattern, for consistency only;
                                    the default is no, so it has no effect)

    Laurie Fleming                  Stopped exclude_columns being used when copying from journal to target
    12 March 2020                   validation.
    
    Laurie Fleming                  Changed task_label settings to make more readable. As per request
    6 March 2020                    by Nataliya and Nalaka.
    
    Laurie Fleming                  Added validation between journal and target for ingestion-only.
    28 February 2020
    
    Laurie Fleming                  Fixed bug for ingestion-only, or running prod journal in non-prod.
    late February, 2020             Fixed 1800 bug for non-initial loads.
    
    Laurie Fleming                  The journal table is now updated, instead of the target. This is not
    November 2020                   truly journaling - but it does provide a backup layer.
    
    Laurie Fleming                  First written
    April 2019
*/          

/*
    These variables are available within this macro, and all that are called by it.
*/
%global status_msg task_label warning_label;
%local i _source_name _target_name _target_library copy_count generated_copy _staging_cols 
       stg_schema tgt_schema lengths current_date fmt_object_run_key full_target initial_load
       pattern left_count right_count task_label object_key object_run_key stg_auth tgt_auth
       max_timestamp target_nobs effective_column jnl_schema pjnl_schema environment high_water_mark_value_jnl
       primary_journal_exist journal_exist ingestion_mode _target_library_connect _target_library_engine
       library library_engine library_connect copy_columns partitioned_by sort_by numrows;

%let pattern = Full Comparison;
%let effective_column = record_effective_timestamp;
%pattern_common_setup;                  /* Load source date into staging, correcting date/time fields and so on */
%if %eval(&job_rc > 4) %then
    %goto EndMac;
%put &=ingestion_mode;
%put &=primary_journal_exist &=read_primary_journal &=environment;
%if &ingestion_mode = ing %then
    %goto Copy_To_Target;
%if &primary_journal_exist = Yes and &read_primary_journal = Yes and &environment = NotPrimary %then
    %goto Copy_To_Target;

%if %eval(&target_nobs = 0)           /* See get_object_and_timestamp/parse_parameters for population of _nobs -> target_nobs */
    %then %let initial_load = Yes;    /* Set record_effective_timestamp to 1Jan1800:0:0 */
    %else %let initial_load = No;
%put &=initial_load;
%if &journal_exist = No %then %do;
/*
    If the target exists (by definition) and the "journal" doesn't, copy the target to the journal. Then
    do the comparison against the table_tr (source).
*/
    %let task_label=Create journal from &tgt_schema;
    %logging(phase=start);
    proc sql noprint;
    connect to &_target_engine(&_target_connect);
    execute (drop table if exists &jnl_schema..&hadoop_table)
        by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (create table &jnl_schema..&hadoop_table &impala_options as
                select *
                  from &tgt_schema..&hadoop_table)
       by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (refresh &jnl_schema..&hadoop_table)
       by &_target_engine;
    %check_status
    execute (compute stats &jnl_schema..&hadoop_table)
       by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    disconnect from &_target_engine;
    quit;
    %logging(phase=end);
    %end;
%let _exist = Yes;                      /* Used by the final %logging call - by this stage the "journal" must exist. */
%let schema = &jnl_schema;
%let task_label = Capture Changes - &schema;
%putmsg(type=info, msg=&task_label);
%logging(phase=start);
%select_cols;                           /* Generate isnull, select_key_cols, first_key_col and join_cols macro variables */
proc sql noprint;
connect to &_target_engine(&staging_library_connect);
/*
    Checksum is a 32-byte string containing the md5-encoded hash of the data columns.
    It *could* be stored in 16 bytes, but it's unreadable then.
*/
execute (create table &stg_schema..&hadoop_table_chgt &impala_options as    /* impala_options normally just contains "stored as parquet" */
         select &isnull,
                cast(case
                        when _l.&first_key_col is null then 'D'
                        when _r.&first_key_col is null then 'I'
                        when _l.checksum != _r.checksum then 'U'
                        end as varchar(1)) as operation
           from &stg_schema..&hadoop_table_tr as _l            /* current */ 
           full join (select &select_key_cols,
                             checksum
                        from &schema..&hadoop_table
                       where record_active_flag = 'Y') as _r
             on &join_cols
          where _l.&first_key_col is null                /* Deleted row */
             or _r.&first_key_col is null                /* New row */
             or _l.checksum != _r.checksum)              /* Updated row */
   by &_target_engine;
execute (refresh &stg_schema..&hadoop_table_chgt)
   by &_target_engine;
%check_status
execute (compute stats &stg_schema..&hadoop_table_chgt)
   by &_target_engine;
select count
  into :chgt_nobs trimmed
  from connection to &_target_engine
  (select count(*) as `count`
     from &stg_schema..&hadoop_table_chgt);
disconnect from &_target_engine;
quit;

%if %eval(&chgt_nobs = 0) %then %do;
    %putmsg(type = INFO, msg=No changes detected);
    %let status_msg = No changes detected;
    %logging(phase=end);
    %if &ingestion_mode = jnl
        %then %goto EndMac;
        %else %goto Copy_To_Target;
    %end;

/*
    Insert the change log into the change detail table.
*/
proc sql noprint;
connect to &_target_engine(&staging_library_connect);
/*
    Augment the change transactions with the other rows' data.
*/
execute (create table &stg_schema..&hadoop_table_chgd &impala_options as
         select &select_cols,
                &current_date as record_effective_timestamp,
                _l.checksum,
                _r.operation,
                cast(&object_run_key as int) as _object_run_key
           from &stg_schema..&hadoop_table_tr as _l
          inner join &stg_schema..&hadoop_table_chgt as _r
             on &join_cols
            and _r.operation in('I', 'U')       /* Inserts and Updates */
            
          union all
          
         select &select_cols,
                &current_date as record_effective_timestamp,
                _l.checksum,
                _r.operation,
                cast(&object_run_key as int) as _object_run_key
           from &schema..&hadoop_table as _l
          inner join &stg_schema..&hadoop_table_chgt as _r
             on &join_cols
            and _l.record_active_flag = 'Y'
            and _r.operation = 'D')            /* Deletions - record no longer exists in the source */
   by &_target_engine;
%check_status;
select count
  into :chgd_nobs trimmed
  from connection to &_target_engine
  (select count(*) as `count`
     from &stg_schema..&hadoop_table_chgd);
disconnect from &_target_engine;
quit;
%logging(phase=end);

%if %eval(&chgt_nobs ne &chgd_nobs) %then %do;
    %rcset(8);
    %let status_msg = %nrquote(Change counts differ: %refnumv(val=&chgt_nobs) change transaction rows and %refnumv(val=&chgd_nobs) change detail rows. Check natural keys.);
    %putmsg(type=error, msg=&status_msg);
    %check_status;
    %goto EndMac;
    %end;

%let right_count = &chgd_nobs;
%let task_label = Apply Changes - &jnl_schema;
%logging(phase=start);

/*
    Apply changes by preparing the new table.
*/
proc sql noprint;
connect to &_target_engine(&staging_library_connect);
select earliest_batch
  into :earliest_batch trimmed
  from connection to &_target_engine
  (select min(`insert_object_run_key`) as `earliest_batch`
     from &schema..&hadoop_table);
execute (create table &jnl_schema..&hadoop_table_new &impala_options as with
/*
    If a key has been deleted, get its most recent expiry timestamp (because
    if may have been deleted more than once). This is 'left-joined' in the second
    union for where a key has been re-inserted.
*/
            most_recent_deletion as
            (select &select_key_cols,
                    max(record_expiry_timestamp) as last_deleted_timestamp,
                    max(insert_object_run_key) as last_insert_key
               from &schema..&hadoop_table
              where record_deleted_flag = 'Y'
              group by &select_key_cols)
             
/*
    The current primary key doesn't exist on the change detail table, so copy the target's observation.
*/
         select &select_cols,
                _l.record_effective_timestamp,
                _l.record_expiry_timestamp,
                _l.checksum,
                cast(_l.record_active_flag as varchar(1)) as record_active_flag,
                cast(_l.record_deleted_flag as varchar(1)) as record_deleted_flag,
                cast(_l.insert_object_run_key as int) as insert_object_run_key,
                cast(_l.update_object_run_key as int) as update_object_run_key
           from &schema..&hadoop_table as _l
           left join &stg_schema..&hadoop_table_chgd as _r
             on &join_cols
            and _l.record_active_flag = 'Y'
          where _r.&first_key_col is null
          
          union all
/*
    Insert: if a deleted record already exists, set the effective timestamp to
    one millisecond after the deleted record's expiry; otherwise, set it to dawn-of-time.
*/
          select &select_cols,
                 coalesce(milliseconds_add(_r.last_deleted_timestamp, 1), cast('1800-01-01T00:00:00' as timestamp))
                     as record_effective_timestamp,
                 cast('9000-12-31T00:00:00' as timestamp) as record_expiry_timestamp,
                 _l.checksum,
                 cast('Y' as varchar(1)) as record_active_flag,
                 cast('N' as varchar(1)) as record_deleted_flag,
                 coalesce(_r.last_insert_key, cast(&object_run_key as int)) as insert_object_run_key,
                 cast(&object_run_key as int) as update_object_run_key
            from &stg_schema..&hadoop_table_chgd as _l
            left join most_recent_deletion as _r
              on &join_cols
           where _l._object_run_key = &object_run_key
             and _l.operation = 'I'
                 
          union all
/*
    Update: current record, with end-of-time as the expiry.
*/
          select &select_cols,
                 _l.record_effective_timestamp,
                 cast('9000-12-31T00:00:00' as timestamp) as record_expiry_timestamp,
                 _l.checksum,
                 cast('Y' as varchar(1)) as record_active_flag,
                 cast('N' as varchar(1)) as record_deleted_flag,
                 cast(&object_run_key as int) as insert_object_run_key,
                 cast(&object_run_key as int) as update_object_run_key
            from &stg_schema..&hadoop_table_chgd as _l
           inner join &schema..&hadoop_table as _r
              on &join_cols
             and _l.operation = 'U'
             and _r.record_active_flag = 'Y'
                              
           union all
/*
    Deletion, or previous active record for an update.
*/
           select &select_cols,
                  _l.record_effective_timestamp,
                  milliseconds_sub(_r.record_effective_timestamp, 1) as record_expiry_timestamp,
                  _l.checksum,
                  cast('N' as varchar(1)) as record_active_flag,
                  cast(case _r.operation
                          when 'U' then 'N'
                          else 'Y'
                          end as varchar(1)) as record_deleted_flag,
                  cast(_l.insert_object_run_key as int) as insert_object_run_key,
                  _r._object_run_key as update_object_run_key
             from &schema..&hadoop_table as _l
            inner join &stg_schema..&hadoop_table_chgd as _r
               on &join_cols
              and _r.operation in('D', 'U')
              and _l.record_active_flag = 'Y')
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac; 
execute (invalidate metadata &jnl_schema..&hadoop_table_new)
   by &_target_engine;
execute (compute stats &jnl_schema..&hadoop_table_new)
     by &_target_engine;
select count
  into :_nobs trimmed
  from connection to &_target_engine
  (select count(*) as `count`
     from &jnl_schema..&hadoop_table_new);
disconnect from &_target_engine;
quit;   
%logging(phase=end);
%if %eval(&job_rc > 4) %then 
    %goto EndMac;

%let task_label = Reconciliation - &jnl_schema;
%logging(phase=start);
%if %eval(&job_rc > 4) %then
    %goto EndMac;

%reconciliation;                      /* Count up the updates, inserts and deletes on _new and source, and check it all adds up */
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
%logging(phase=end);
%if %eval(&job_rc > 4) %then 
    %goto EndMac;

%let task_label = Commit - &jnl_schema;
%logging(phase=start);
%if %eval(&job_rc > 4) %then
    %goto EndMac;

%commit_changes;                        /* Swap the existing target and _new around, being very careful to not throw everything away */
%if %eval(&job_rc > 4) %then 
    %goto EndMac;

%logging(phase=end);
%logging_hwm(table=&jnl_schema..&hadoop_table, high_water_mark_variable=record_effective_timestamp, 
             high_water_mark_value=high_water_mark_value_jnl);
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;

%if &ingestion_mode = jnl %then         /* Don't replace the target. Note that this is completely different to other journalling jobs. */
    %goto EndMac;
    
%Copy_To_Target:
/*
    Copy the table in the journal schema to the target. Unlike the other journal table, the full comparison tables in the journal
    schema are identical to the target (when the job is successful).
*/
%if &environment = NotPrimary and &primary_journal_exist = Yes 
    %then %do;
          %let library = &primary_jnl_library;
          %let library_engine = &primary_jnl_library_engine;
          %let library_connect = &primary_jnl_library_connect;
          %let library_schema = &pjnl_schema;
          %end;
    %else %do;
          %let library = &jnl_library;
          %let library_engine = &jnl_library_engine;
          %let library_connect = &jnl_library_connect;
          %let library_schema = &jnl_schema;
          %end;
%refresh_libname(library_prefix=library _target_library);
%if &ingestion_mode = ing or (&environment = NotPrimary and &primary_journal_exist = Yes) %then %do;
    %let task_label = Ingestion-only validation;
    %logging(phase=start);
    %let source_library = &library;
    %let source_table = &sas_table;
    %let source_columns = &_staging_cols;
    %let _source_engine = SASIOIMP;
    %let _source_memtype = DATA;
    %validate(check_exclusion=No);      /* Don't check for excluded_columns - journal and target must match */
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    %logging(phase=end);
    %end;
%let task_label = Copy to target from &library;
%if &primary_journal_exist = Yes and &read_primary_journal = Yes and &environment = NotPrimary
    %then %let task_label = %quote(&task_label.-Primary Journal);
    %else %let task_label = %quote(&task_label.-Env. Journal);

%logging(phase=start);
%logging_hwm(table=&library_schema..&hadoop_table, high_water_mark_variable=record_effective_timestamp, 
             high_water_mark_value=high_water_mark_value_jnl);
proc sql noprint;
connect to &_target_engine(&_target_connect);
select name
  into :copy_columns separated by ', '
  from dictionary.columns
 where libname = "%sysfunc(upcase(&library))"
   and lowcase(memname) = "&sas_table";
%if %quote(&copy_columns) = %then %do;
    %let status_msg = No columns read from &sas_table: table not found in &library;
    %rcset(8);
    %check_status;
    %goto EndMac;
    %end;
execute (truncate table &tgt_schema..&hadoop_table)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
execute (insert into &tgt_schema..&hadoop_table(&copy_columns)
            select &copy_columns
              from &library_schema..&hadoop_table)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
execute (refresh &tgt_schema..&hadoop_table)
   by &_target_engine;
execute (compute stats &tgt_schema..&hadoop_table)
     by &_target_engine;
%check_status;
disconnect from &_target_engine;
quit;
%count(dsn=&library..&sas_table, dbms=impala, debug=&debug);
%logging(phase=end);
%EndMac:
%logging(task=Finish);
%if &debug = No and %eval(&job_rc le 4) %then %do;
    %tidyup;
    %end;
%exit_return_code;
%mend full_comparison;