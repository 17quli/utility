%macro hwm / minoperator mindelimiter=',';
/*
    Name:                           HWM
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   August 2019
    Remarks:                        Code for transformation High Watermark. Mostly only 
                                    used for tables like app_tblaccount, where the hwm should
                                    be calculated before the change_extract code is called.
                                        
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  First written
    August 2019
*/
%global hwm_max;
%local rc _schema max_timestamp _target_name;
%if not %symexist(status_msg) %then
    %local status_msg;
%let _target_name = %sysfunc(scan(&_target, 2, %str(.)));
option nosymbolgen nomlogic spool mprint mprintnest nofullstimer notes bufno=3000 bufsize=65535 
       ibufno=10000 ibufsize=32767 compress=no;
%if &_target_engine in(SASIOIMP, IMPALA)
    %then %do;
          %global external_read_primary_journal;
          %let external_read_primary_journal = &read_primary_journal;
          %get_object_and_timestamp(hwm=Yes);
          %end;
    %else %do;
          proc sql noprint;
/*
    Allow for the target to be a non-Hadoop table. This will probably never be used.
*/
          select coalesce(max(&effective_column), '1jan1800:0:0'dt) format=best15.3
            into :max_timestamp trimmed
            from &_input;
          %if &max_timestamp ne %sysevalf('1jan1800:0:0'dt) %then
              %let max_timestamp = %sysevalf(&max_timestamp + 0.001);
          %let max_timestamp = %sysfunc(putn(&max_timestamp, is8601dt23.3));
          %end;
%let hwm_max = %tslit(%timestamp_display(sas_internal=&max_timestamp, dateformat=iso));          /* Puts single quotes around the hwm value */
%mend hwm;