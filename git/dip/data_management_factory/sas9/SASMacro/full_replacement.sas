%macro full_replacement;
/*
    Name:                           Full Replacement
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   June 2019
    Remarks:                        Completely replaces the target from source.
    
    Method:
    %pattern_common_setup           Check all the parameters and load the source data
                                    into the staging area.
                                    
    execute (insert into &tgt...    Insert new rows into the target table
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Because frdplandata_numbers takes such a long time to get to the reconciliation,
    23 April 2020                   Hadoop is dropping the library reference. %refresh_libname added just before that.
    
    Laurie Fleming                  Documentation updated.
    10 February 2020

    Laurie Fleming                  First written
    June 2019
*/

/*
    These variables are available within this macro, and all that are called by it. Some aren't relevant
    (for example, ingestion_mode), but are referenced by the called macros so need to have then defined
    even if they aren't used.
*/
%global status_msg task_label warning_label;
%local i _source_name _target_name _target_library copy_count generated_copy _staging_cols 
       stg_schema tgt_schema lengths current_date fmt_object_run_key current_date full_target 
       pattern left_count right_count task_label object_key object_run_key stg_auth tgt_auth target_nobs
       _target_library_connect _target_library_engine high_water_mark_value_jnl ingestion_mode;
%let pattern = Full Replacement;
%pattern_common_setup;                  /* Load source date into staging, correcting date/time fields and so on */
%if %eval(&job_rc > 4) %then
    %goto EndMac;
%put Full Replacement;
%let task_label = Apply Event;
%logging(task=4, phase=start);

proc sql noprint;
connect to &_target_engine(&_target_connect);
execute (truncate &tgt_schema..&hadoop_table)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (insert into &tgt_schema..&hadoop_table             /* Fill it all back up again */
            select &hadoop_cols,
                   cast(&object_run_key as int) as insert_object_run_key
              from &stg_schema..&hadoop_table_tr)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (refresh &tgt_schema..&hadoop_table)
   by &_target_engine;
%check_status;
execute (compute stats &tgt_schema..&hadoop_table)
   by &_target_engine;
%check_status;
disconnect from &_target_engine;
quit;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
%logging(task=4, phase=end);

%let task_label = Reconciliation;
%logging(task=5, phase=start);
%refresh_libname(library_prefix=_target_library);
%count(dsn=&_target_library..&sas_table, dbms=impala, authdomain=&tgt_auth);
%let right_count = &_nobs;
%reconciliation;                                /* The only reconciliation is to check that the target looks like the source */
%if %eval(&job_rc > 4) %then
    %goto EndMac;
%logging(task=5, phase=end);

%EndMac:
%logging(task=Finish);
%if &debug = No and %eval(&job_rc le 4) %then %do;
    %tidyup;
    %end;
%exit_return_code;
%mend full_replacement;