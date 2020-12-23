%macro event_extract;
/*
    Name:                           Event Extract
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        Detects changes in the source by a change timestamp
                                    exceeding the high watermark for the target table.
                                    Rows that aren't in the target are inserted into it.
                                    
    Method:
    %pattern_common_setup           Check all the parameters and load the source data
                                    into the staging area.
                                    
    execute (insert into &tgt...    Insert new rows into the target table
    
    %unwind;                        If the insertion fails, recreate the target without the batch.
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Converted to process source rows from a journal, instead of directly from the source.
    5 November 2019

    Laurie Fleming                  First written
    April 2019
*/

/*
    These variables are available within this macro, and all that are called by it.
*/
%global status_msg task_label warning_label;
%local i _source_name _target_name _target_library copy_count generated_copy lengths current_date 
       _staging_cols object_run_key current_date full_target pattern left_count right_count 
       task_label object_key max_timestamp stg_schema tgt_schema stg_auth tgt_auth target_nobs
       jnl_schema pjnl_schema environment primary_journal_exist journal_exist earliest_batch
       ingestion_mode _target_library_connect _target_library_engine high_water_mark_value_jnl
       create_table partitioned_by sort_by numrows;
%let pattern = Event Extract;
%putmsg(type=info, msg=Starting Journaling for &pattern);
%pattern_common_setup;                  /* Load source date into staging, correcting date/time fields and so on */
%put &=ingestion_mode;
%if %eval(&job_rc > 4 or &left_count = 0 or &ingestion_mode = jnl) %then %do;
    %let right_count = 0;
    %goto EndMac;
    %end;

%let task_label = Apply Event;
%logging(phase=start)
%refresh_libname(library_prefix=staging_library _target_library);

%get_impala_details(engine=&_target_engine, connect=&_target_connect, table=&tgt_schema..&hadoop_table);

proc sql noprint;
connect to &_target_engine(&_target_connect);
%if &sysuserid ne irdrun %then %do;
    execute (set buffer_pool_limit = 12g)
       by &staging_library_engine;
    execute (set mem_limit = 0)
       by &staging_library_engine;
    %end;
execute (insert into &tgt_schema..&hadoop_table
            (&hadoop_cols, 
             `insert_object_run_key`)
             /* Directly insert new rows into the target table */
%if &sort_by ne and %eval(&numrows = 0) %then %do;
    %str(/)* +noshuffle *%str(/)
    %end;
            select &hadoop_cols,
                   cast(&object_run_key as int) as `insert_object_run_key`
              from &stg_schema..&hadoop_table_nr)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) and &partitioned_by = %then %do;                           /* If there are any problems, remove the current run_key's rows, if any */
    %unwind;
    %goto EndMac;
    %end;
execute (refresh &tgt_schema..&hadoop_table)
   by &_target_engine;
%if &partitioned_by = 
    %then %do; 
          execute (compute stats &tgt_schema..&hadoop_table)
             by &_target_engine;
          %end;
    %else %do;
          execute (compute incremental stats &tgt_schema..&hadoop_table)
             by &_target_engine;
          %end;
%check_status;
disconnect from &_target_engine;
quit;

%if %eval(&job_rc > 4) %then
    %goto EndMac;

%refresh_libname(library_prefix=staging_library _target_library);
%count(dsn=&_target_library..&sas_table, dbms=impala, authdomain=&tgt_auth, 
       where=`insert_object_run_key` = &object_run_key);
%let right_count = &_nobs;
%logging(phase=end);

%let task_label = Reconciliation;
%logging(phase=start);
%reconciliation;                                        /* Check the inserts in the target against the source, and check it all adds up */
%logging(phase=end);

%if %eval(&job_rc > 4) %then %do;
    %if %eval(&right_count ne 0) and &partitioned_by = %then %do;
        %unwind;                                        /* If not, unwind the new rows */
        %end;
    %goto EndMac;
    %end;
    
%EndMac:
%logging(task=Finish);
%if &debug = No and %eval(&job_rc le 4) %then %do;
    %tidyup;
    %end;
%exit_return_code;
%mend event_extract;