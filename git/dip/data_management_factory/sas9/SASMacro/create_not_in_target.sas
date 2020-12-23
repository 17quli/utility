%macro create_not_in_target / minoperator mindelimiter=','
                              des="Create table of transactions that aren't already in the target";
/*
    Name:                           Create Not In Target
    Author:                         Laurie Fleming, Tenzing / Daemons Ltd
    Date-written:                   December 2019
    Remarks:                        Creates table of rows that aren't yet in the target. Called from
                                    pattern_common_setup for Change/Event/Record Batch Extract patterns.

    Modification history            (in reverse chronological order)
    Laurie Fleming                  Add partition column, if populated, to select clause.
    19 June 2020
    
    Laurie Fleming                  Fixed macro quoting problem in parsing the where clause.
    27 March 2020                   Art Carpenter would be proud.
    
    Laurie Fleming                  The check against the journal columns is now done in lower case, because the in
    25 March 2020                   clause is case sensitive.
    
    Laurie Fleming                  Use &left_where clause instead of &where when calculating the earliest batch key 
    18 March 2020                   after creating the _nr table. Parse where clause for SAS dates and convert them to 
                                    ISO 8601 format for Impala queries.

    Laurie Fleming                  Corrected comparison with target to get rows not before the highwater mark,
    24 February 2020                instead of the batch key. Improved internal documentation.
    
    Laurie Fleming                  Converted to read from the journal instead of staging table.
    January 2020
    
    Laurie Fleming                  First written (previously in pattern_common_setup)
    December 2019
*/
%local max_key source target_key schema word i left_where;
%if &pattern = Change Extract
    %then %let target_key = update_object_run_key;
    %else %let target_key = insert_object_run_key;
/*
    For non-primary jobs, use the primary journal as the source where possible.
    The primary_journal_exist value will be No if the transformation switch has 
    overridden it.
*/
%if &environment = NotPrimary and &primary_journal_exist = Yes
    %then %do;
          %let schema = &pjnl_schema;
          %let _library_journal = primary_jnl_library;
          %end;
    %else %do;
          %let schema = &jnl_schema;
          %let _library_journal = jnl_library;
          %end;
%refresh_libname(library_prefix=_target_library staging_library &_library_journal);
%if %eval(&job_rc > 4) %then
    %goto EndMac;
%select_cols(include_timestamp=Yes);
%if &where ne %then %do;
/*
    Walk along the where clauses, prefixing each variable in the clause with '_l' 
    alias.
*/
    %let where = %sysfunc(compbl(&where));
    proc sql noprint;
    select name
      into :journal_columns separated by ', '
      from dictionary.columns
     where lowcase(libname) = "&&&_library_journal"
       and lowcase(memname) = "&sas_table";
    quit;

    %let i = 0;
    %let word =;
    %let left_where =;
    %do %until(&word =);
        %let i = %eval(&i + 1);
        %let word = %qsysfunc(scan(&where, &i, %str( )));  /* Make sure that special characters are not misinterpreted: ( ) , et al */
        %if %nrbquote(&word) ne %then
            %if %qsysfunc(lowcase(&word)) in(&journal_columns)
                %then %let left_where = &left_where _l.`%sysfunc(lowcase(&word))`;
                %else %if %eval(%length(&word) = 1)
                %then %let left_where = &left_where &word;
                %else %if %qsysfunc(substr(&word, %eval(%length(&word) - 1), 2)) = dt      /* Simplistically check for SAs date strings and convert to ISO 8601. */
                %then %let left_where = &left_where %tslit(%sysfunc(putn(%sysevalf(&word), is8601dt23.3)));
                %else %let left_where = &left_where &word;
       %end;
   %end;
proc sql noprint;
connect to &staging_library_engine(&staging_library_connect);
%if &sysuserid ne irdrun %then %do;
    execute (set buffer_pool_limit = 12g)
       by &staging_library_engine;
    execute (set mem_limit = 0)
       by &staging_library_engine;
    %end;
%if &pattern in(Change Extract, Event Extract) %then %do;
/*
    Get the highwater mark from the target, less ten seconds if there it's populated. The code still works
    if the value is 1 Jan 1800, because duplicates are eliminated, but it's *much* faster doing it this way.
*/
    select cats("'", putn(floor(max(max_target_timestamp - 10, '1jan1800:0:0'dt)), 'is8601dt23.3'), "'")
      into :max_target_timestamp trimmed
      from connection to &_target_engine
      (select coalesce(max(`&change_capture_timestamp`), '1800-01-01T00:00:00') as `max_target_timestamp`
         from &tgt_schema..&hadoop_table);
    %check_status;
    %if %eval(&job_rc > 4) %then 
        %goto EndMac;
    %put &=max_target_timestamp;
    %end;
execute (create table &stg_schema..&hadoop_table_nr &impala_options as                   
%if &pattern in(Change Extract, Event Extract) 
/*
    Get all rows where the change capture timestamp (fdtmwhen, for Start) is on or after the HWM and the natural keys
    (including the change capture timestamp) aren't already on the target.
*/
    %then %do;
       with `new_rows` as
            (select &select_cols,
               %if &partitioned = Yes %then %do;
                   _l.`&partition_column`,
                   %end;
                    _l.`batch_key`
               from &schema..&hadoop_table as _l
               left join &tgt_schema..&hadoop_table as _r
                 on &join_cols                                           /* Includes comparison of _l and _r &change_capture_timestamp */
             where  _l.`&change_capture_timestamp` >= &max_target_timestamp
          %if &left_where ne %then %do;
              and (%unquote(&left_where))
              %end;
              and _r.&first_key_col is null),
  
            `newest_new_rows` as
/*
    If there are duplicates in the journal (very common), identify the keys with the highest batch key.
*/
            (select &select_key_cols,
                    max(`batch_key`) as `max_batch_key`
               from `new_rows` as _l
              group by &select_key_cols)
          %end;
    %else %if &pattern = Record Batch Extract
    %then %do;
/*
    Record Batch Extract is special - not in a good way. Because each RBE batch has the same timestamp,
    the join has to be against distinct values. And it still has to allow for multiple batches, in case
    the ingestion part of the process hasn't been run for a while (particularly for running in Development).
*/
       with `new_rows` as
       (select &select_cols,
               _l.`batch_key`
          from &schema..&hadoop_table as _l
          left join (select distinct
                            &select_key_cols,
                            `&change_capture_timestamp`
                       from &tgt_schema..&hadoop_table) as _r
            on &join_cols                             /* Includes fdtmeffectivefrom */
           and _l.`&change_capture_timestamp` = _r.`&change_capture_timestamp`
          where
          %if &left_where ne %then %do;
              (%unquote(&left_where))
              and 
              %end;
                  _r.&first_key_col is null),

/*
    Get the keys with the maximum batch key for each change capture timestamp.
*/
            `newest_new_rows` as
            (select &select_key_cols,
                    `&change_capture_timestamp`,
                    max(`batch_key`) as `max_batch_key`
               from `new_rows` as _l
              group by &select_key_cols,
                       `&change_capture_timestamp`)
          %end;                 
  
    select &select_cols, 
       %if &partitioned = Yes %then %do;
           _l.`&partition_column`,
           %end;
           _l.`batch_key`
      from `new_rows` as _l
     inner join `newest_new_rows` as _r
        on &join_cols
%if &pattern = Record Batch Extract %then %do;
       and _l.`&change_capture_timestamp` = _r.`&change_capture_timestamp`
    %end;
       and _l.`batch_key` = _r.`max_batch_key`)                
    by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
execute (invalidate metadata &stg_schema..&hadoop_table_nr)
   by &_target_engine;
%check_status;
execute(refresh &stg_schema..&hadoop_table_nr)
   by &_target_engine;
%check_status;
execute(compute stats &stg_schema..&hadoop_table_nr)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
select earliest_batch
  into :earliest_batch trimmed
  from connection to &_target_engine
  (select min(`batch_key`) as `earliest_batch`              /* Used for 1Jan1800:0:0 assignment */
     from &schema..&hadoop_table as _l
%if &left_where ne %then %do;
    where (%unquote(&left_where))
    %end;
     );
select count
  into :_nobs trimmed
  from connection to &_target_engine
  (select coalesce(count(*), 0) as `count`
     from &stg_schema..&hadoop_table_nr);
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
disconnect from &_target_engine;
quit;
%let left_count = &_nobs;
%EndMac:
%mend create_not_in_target;