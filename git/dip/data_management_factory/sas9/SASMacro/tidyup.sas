%macro tidyup(force=No);
/*
    Name:                           Tidyup
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        Remove staging tables from Impala. This is called
                                    at the beginning of the job, and also at the end.

    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Add _unwd table to the drop list (oversight)
    19 June 2020
    
    Laurie Fleming                  First written
    April 2019
*/

/*
    Remove the staging tables. When force is Yes (when called at the top of pattern common setup), clean
    everything up no matter the state of the job (otherwise the process could easily fail through
    'table already exists'-type errors.
*/
proc sql noprint; 
connect to &_target_engine(&staging_library_connect);
%local schema;
%if &pattern = Full Comparison
    %then %let schema = &jnl_schema;
    %else %let schema = &tgt_schema;
%if %eval(&job_rc le 4 or &force = Yes) %then %do;
    execute (drop table if exists &stg_schema..&hadoop_table_tr purge)
        by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (drop table if exists &stg_schema..&hadoop_table_dt purge)
        by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (drop table if exists &stg_schema..&hadoop_table_nr purge)
        by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (drop table if exists &stg_schema..&hadoop_table_chgt purge)
        by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (drop table if exists &stg_schema..&hadoop_table_chgd purge)
        by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (drop table if exists &schema..&hadoop_table_new purge)
        by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (drop table if exists &schema..&hadoop_table_old purge)
        by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (drop table if exists &schema..&hadoop_table_unwd purge)
        by &_target_engine;
    %check_status
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    %end;
%EndMac:
disconnect from &_target_engine;
quit;
%if %eval(&job_rc > 4) %then %do;
    %putmsg(type=error, msg=Tidy up: &status_msg);
    %end;
%mend tidyup;