%macro unwind;
/*
    Name:                           Unwind
    Author:                         Laurie Fleming, Tenzing / Daemons Ltd
    Date-written:                   April 2019
    Remarks:                        If an Event Extract job fails after the rows have been inserted into the
                                    target, remove those rows. This doesn't take advantage (yet) of partitioning.
                                    Because it's Hadoop, it's not straight-forward. To get to this stage, job_rc 
                                    will be > 4, so save it and reset to zero, replacing its value at the end.

    Modification History            (in reverse chronological order)
    Laurie Fleming                  Dropping of tables now uses purge facility, to ensure tidy removal.
    12 May 2020                   

    Laurie Fleming                  First written
    April 2019
*/
%local syntaxcheck save_jobrc;
%let syntaxcheck = %sysfunc(getoption(syntaxcheck));
option nosyntaxcheck;
%let save_jobrc = &job_rc;
%let job_rc = 0;
%let task_label = Unwinding Event Extract inserts because of error;
%logging(phase=start)

proc sql noprint;
reset exec;
connect to &_target_engine(&_target_connect);
execute (drop table if exists &tgt_schema..&hadoop_table_unwd purge)
   by &_target_engine;
execute (drop table if exists &tgt_schema..&hadoop_table_old purge)
   by &_target_engine;
execute (create table &tgt_schema..&hadoop_table_unwd &impala_options as        /* Remove the object run key's rows */
           select *
             from &tgt_schema..&hadoop_table
            where insert_object_run_key != &object_run_key)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (alter table &tgt_schema..&hadoop_table 
            rename to &tgt_schema..&hadoop_table_old)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (alter table &tgt_schema..&hadoop_table_unwd 
            rename to &tgt_schema..&hadoop_table)
   by &_target_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
execute (refresh &tgt_schema..&hadoop_table)
   by &_target_engine;
execute (compute stats &tgt_schema..&hadoop_table)
   by &_target_engine;
execute (drop table &hadoop_table_old purge)
   by &_target_engine;
%check_status;
disconnect from &_target_engine;
quit;
%logging(phase=end);
%EndMac:
%let job_rc = %sysfunc(max(&job_rc, &save_jobrc));
quit;
option &syntaxcheck;
%mend unwind;