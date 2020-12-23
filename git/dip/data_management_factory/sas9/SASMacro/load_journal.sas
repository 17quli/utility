%macro load_journal / minoperator mindelimiter=',';
/*
    Name:                           Load Journal
    Author:                         Laurie Fleming, Tenzing / Daemons Ltd
    Date-written:                   November 2019
    Remarks:                        Loads data into a journal table, prior to normal processing.
    
    Method:
    I   Flag prod journal exists and count rows     (These two are done in %setup_journal, called earlier)
        Flag environment journal exists and count rows
                            
    C   Environment                                 primary  primary  not primary  not primary   not primary
        Primary journal exists and populated           Y        N         Y            -             -
        Environment journal exists and populated       -        -         -            Y             N
        Read primary journal switch = ?                -        -         Y            N             N
                            
    A   Create environment journal from source         -        X         -            -             X
        Copy target table to local journal             -        X         -            -             X
        Insert to environment journal                  X        X         -            X             X
        Update target from ? journal                primary  primary   primary        env           env
                            
    * If primary, the environment journal is primary.
    
    Modification History                            (reverse chronological order)
    Laurie Fleming                                  Removed conditional deletion of journal table for production. It is no
    5 May 2020                                      required. The code was set up to be too cautious, requiring the production
                                                    journal table to be manually dropped.
    
    Laurie Fleming                                  Removed check for pattern - already checked in pattern_common_setup
    16 March 2020
    
    Nataliya Alkhimova                              Updated Task labels for creating/loading Journal table to be consistent
    06 March 2020                                   

    Laurie Fleming                                  First written
    November-December 2019
*/
%local structure initial_load source source_library source_table insert_clause jnl_nobs primary_jnl_nobs journal_columns
       max_timestamp_variable;
%let jnl_nobs = 0;
%let primary_jnl_nobs = 0;
%if &journal_exist = Yes
    %then %let task_label = Load into Journal;
    %else %let task_label = Create Journal from &tgt_schema;
%logging(phase=start);

%refresh_libname(library_prefix=staging_library _target_library jnl_library);

%let source = &staging_library..&sas_table_tr;
%let max_timestamp_variable = &change_capture_timestamp;

%let source_library = %sysfunc(scan(&source, 1, %str(.)));
%let source_table = %sysfunc(lowcase(%sysfunc(scan(&source, 2, %str(.)))));

%let journal_columns =;
%let insert_clause =;

proc sql noprint;
select ifc(name ne 'batch_key', cats('`', name, '`'), '`insert_object_run_key` as `batch_key`') length=32767,
       cats('`', name, '`') length=32767
  into :journal_columns separated by ', ',
       :insert_clause separated by ', '
  from dictionary.columns
 where libname = "%sysfunc(upcase(&source_library))"
   and lowcase(memname) = "&source_table";
%if &insert_clause = %then %do;
    %rcset(8);
    %let status_msg = Columns not readable from &source_library..&source_table;
    %goto EndMac;
    %end;
quit;

%if &journal_exist = No %then %do;
/*
    If the journal is empty, or doesn't exist, create it as a copy of the target, without 
    the ETL columns (but with a new one batch_key).
*/
    proc sql noprint;
    connect to &jnl_library_engine(&jnl_library_connect);
    execute (drop table if exists &jnl_schema..&hadoop_table)
       by &jnl_library_engine;       
    execute (create table &jnl_schema..&hadoop_table &impala_options as   
                select &journal_columns
                  from &tgt_schema..&hadoop_table)
        by &jnl_library_engine;
    %check_status;
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    %let status_msg = Journal loaded from &tgt_schema..&hadoop_table;
    disconnect from &_target_engine;
    quit;
    %logging(phase=end);
    %let task_label = Load into Journal;
    %logging(phase=start);
    %end;
         
proc sql noprint;
connect to &jnl_library_engine(&jnl_library_connect);
/*
    Insert all the rows from the transaction table into the journal.
*/
execute (insert into &jnl_schema..&hadoop_table (&insert_clause)
            select &insert_clause
              from &stg_schema..&hadoop_table_tr)
    by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (refresh &jnl_schema..&hadoop_table)
   by &_target_engine;
execute (compute stats &jnl_schema..&hadoop_table) 
   by &_target_engine;
disconnect from &jnl_library_engine;
%check_status;
quit;

%logging_hwm(table=&jnl_schema..&hadoop_table, high_water_mark_variable=&max_timestamp_variable, 
             high_water_mark_value=high_water_mark_value_jnl);

%if %eval(&job_rc le 4) %then %do;
    %logging(phase=end);
    %end;
%EndMac:
%mend load_journal;