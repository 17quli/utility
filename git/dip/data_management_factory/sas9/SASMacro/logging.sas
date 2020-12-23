%macro logging(task=, phase=) / minoperator mindelimiter=',';
/*
    Macro name:                                     Logging
    Author:                                         Laurie Fleming
    Date-written:                                   April 2019
    Remarks:                                        Write successive updates to the current run's row in the object_run table.

    Modification history:                           (in reverse chronological order)
    Laurie Fleming                                  Added empty datasets at each task start to show job progress in the work directory.
    29 May 2020
    
    Laurie Fleming                                  Find the previous HWM from the target, not the journal. It makes the object_run
    20 April 2020                                   clearer. (See just after %if &task ne Finish %then %do;)
    
    Laurie Fleming                                  When calculating rows in the target, use &_target_exist (set in %parse_parameters)
    26 March 2020
    
    Laurie Fleming                                  Only count the target rows if the target exists - timing issue in writing
    10 March 2020                                   to object_run (lcf) if object_run (Impala) does not exist!
    
    Laurie Fleming                                  Corrected current and previous hwm calculation.
    14 October 2019                                 Updated internal documentation.
    
    Laurie Fleming                                  First written
    April 2019
*/    
%global logging_started task_number;
%local syntaxcheck mprint notes timestamp jobstat row save_jobrc where_run_key max_timestamp_variable
       prev_high_water_mark_value dataset_label;
%let syntaxcheck = %sysfunc(getoption(syntaxcheck));
%let mprint = %sysfunc(getoption(mprint));
%let notes = %sysfunc(getoption(notes));
options nosyntaxcheck mprint notes;         /* Run this code, no matter what */
%if &phase = %then
    %let phase = end;
%let save_jobrc = &job_rc;                  /* Clear out any return codes and statuses (already saved in job_rc, anyway) */
%if %eval(&job_rc > 4) %then %do;
    proc sql;
    reset exec;
    quit;
    
    data _null_;                                
    run;
    %let job_rc = 0;
    %end;
%if &task = Begin %then %do;                
/*
    Create a dummy logging row in object_run, to be progressively augmented by later steps
*/
    %let logging_started = Yes;
    proc sql noprint;
    connect to &lcf_engine(&lcf_connect);
    select object_run_key format=best.
      into :object_run_key trimmed
      from connection to &lcf_engine
         (select lcf.seq_object_run_key.nextval as object_run_key       /* Read this Oracle sequence to get a new unique identifier */
            from dual);
    %check_status;
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    disconnect from &lcf_engine;
    quit;

/*
    Put the bare minimum into the logging record.
*/
    data _object_run(compress=no);
    if 0 then
       set &logging;                                /* Get the metadata for all columns in the logging table. */
    target_object_name = "%sysfunc(upcase(&target_table))";
    object_run_key = &object_run_key;
    start_time = "&etls_startTime"dt;
    object_prg_name = "%unquote(&etls_jobName)";
    status = 'Job incomplete';
    status_message = 'Job incomplete';
    records_read = 0;
    records_written = 0;
    log_position = getoption('log');
    if not missing(log_position) then               /* If run from batch, this will contain the full pathname to the *.log file */
       object_log_name = substr(log_position, index(log_position, 'Logs/') + 5);
    load_pattern_name = "&pattern";
    output;
    stop;
    drop log_position;
    run;
    
/*
    Append to the logging table
*/
    proc append base=&logging data=_object_run;
    run;
    %check_status;
    
    proc delete data=_object_run;
    run;
    %let task_number = 1;
    %goto EndMac;
    %end;
    
%if &task ne Finish %then %do;
    %if &phase = start %then %do;
        %let dataset_label = _%sysfunc(translate(&task_label, %str(____), %str( .-`)));
        %let dataset_label = %sysfunc(substr(&dataset_label, 1, %sysfunc(min(%length(&dataset_label), 32))));
        data &dataset_label;
        stop;
        run;
    %end;
/*
    For each phase, update the logging record with more data. At the very worst, if an error can't be diagnosed, this state will
    show where the process got up to.
*/
    %if %eval(&task_number = 1 and &phase = start and &pattern ne Full Replacement) %then %do;
        %if &pattern in(Change Extract, Event Extract, Record Batch Extract)
            %then %let max_timestamp_variable = &change_capture_timestamp;
            %else %let max_timestamp_variable = &effective_column;              /* Full comparison */
        %logging_hwm(table=&tgt_schema..&hadoop_table, high_water_mark_variable=&max_timestamp_variable,
                     high_water_mark_value=prev_high_water_mark_value) 
        %end;
    proc sql;
    update &logging
       set records_read = &left_count,
           object_key = &object_key,
       %if &pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) %then %do;
           ingestion_mode = "%sysfunc(upcase(&ingestion_mode))",
           %end;
       %if %eval(&task_number = 1) and &phase = start %then %do;            /* These values aren't known at the dummy creation stage above */
           %if &pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) %then %do;
               prev_high_water_mark_value = "%timestamp_display(sas_internal=&prev_high_water_mark_value, dateformat=sas)"dt,
               %end;
           %end;
       %if %quote(&high_water_mark_value_jnl) ne %then %do;
           high_water_mark_value_jnl = "%timestamp_display(sas_internal=&high_water_mark_value_jnl, dateformat=sas)"dt,
           %end;
           task&task_number = "&task_label",
           task&task_number._&phase._time = datetime()
     where object_run_key = &object_run_key;
    %check_status;
    quit;
    %if &phase = end %then
        %let task_number = %eval(&task_number + 1);
    %goto EndMac;
    %end;

%Finish:    
/*
    Finish - the last wash-up values are posted to the logging row, with as much clarification of the success or otherwise of the
    process.
*/
%if &logging_started ne Yes %then %do; /* This should be near-impossible now - this macro is called initially right at the top of the process */
    %rcset(8);
    %if %nrquote(&status_msg) = 
        %then %do;
              %putmsg(type=error, msg=Insufficient setup information to create logging data);
              %end;
        %else %do;
              %putmsg(type=error, msg=%nrquote(&status_msg));
              %end;
    %goto EndMac;
    %end;
%if %eval(&pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) and &save_jobrc le 4) %then %do;
/*
    Calculate the new HWM from the target.
*/

    %if &pattern in(Change Extract, Event Extract, Record Batch Extract)
        %then %let max_timestamp_variable = &change_capture_timestamp;
        %else %let max_timestamp_variable = &effective_column;
    %logging_hwm(table=&tgt_schema..&hadoop_table, high_water_mark_variable=&max_timestamp_variable,
                 high_water_mark_value=max_timestamp) 
    %end;

%if &pattern in(Full Comparison, Change Extract, Record Batch Extract)
    %then %let where_run_key = `update_object_run_key`;
    %else %let where_run_key = `insert_object_run_key`;
%if %eval(&job_rc le 4 and &_target_exist = Yes) %then %do;           /* _target_exist is set in %parse_parameters */
    proc sql noprint;
    connect to &_target_engine(&_target_connect);
    select count,
           rows_written
      into :_nobs trimmed,
           :_rows_written trimmed
      from connection to &_target_engine
      (select coalesce(sum(&where_run_key = &object_run_key), 0) as `count`,
              coalesce(count(*), 0) as `rows_written`
         from &tgt_schema..&hadoop_table
    %if &pattern in(Full Replacement, Change Extract, Event Extract, Record Batch Extract) %then %do;
        where &where_run_key = &object_run_key
        %end;
        );
    %check_status;
    disconnect from &_target_engine;
    quit;
    %if %eval(&_nobs ne 1)
        %then %let row = rows;
        %else %let row = row;
    %let status_msg = %quote(%sysfunc(strip(%sysfunc(putn(&_nobs, comma16.)))) &row updated on &sas_table);  /* Jazz up the readibility of the update count */
    %end;
%if %eval(&save_jobrc = 0)
    %then %let jobstat = Job Successful;
    %else %if %eval(&save_jobrc = 4) 
              %then %do; 
                    %let jobstat = Job Ended with Warnings in &warning_label;
                    %putmsg(type=warning, msg=&jobstat);
                    %end;
              %else %do;
                    %let jobstat = Job Ended with Errors in &task_label;
                    %putmsg(type=error, msg=&jobstat);
                    %end;
proc sql noprint;
update &logging
   set end_time = datetime(),
%if &object_key ne . %then %do;
       object_key = &object_key,
       %end;    
   %if %eval(&save_jobrc le 4) %then %do;
       %if &pattern = Full Comparison and &ingestion_mode ne jnl
           %then %do;
                 records_written = &_rows_written,
                 %end;
           %else %do;
                 records_written = &_nobs,
                 %end;
       %end;
   %if %eval(&pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) and &save_jobrc le 4) %then %do;
       high_water_mark_value = "%timestamp_display(sas_internal=&max_timestamp, dateformat=sas)"dt,
       %end;
       status = "&jobstat",
       status_message = "&status_msg"
 where object_run_key = &object_run_key;
%check_status;
quit;
%EndMac:
%let job_rc = %sysfunc(max(&save_jobrc, &job_rc));
option &syntaxcheck &mprint &notes;
%mend logging;