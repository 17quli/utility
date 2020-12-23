%macro logging_hwm(table=, high_water_mark_variable=, high_water_mark_value=);
/*
    Macro name:                                     Logging_HWM
    Author:                                         Laurie Fleming
    Date-written:                                   7 February 2020
    Remarks:                                        Pull the high-water mark from the target table - used by %logging,
                                                    %full_comparison and %load_journal.

    Modification history:                           (in reverse chronological order)
    Laurie Fleming                                  max_timestamp is now an internal value, not a SAS date.
    27 March 2020                                   
    
    Laurie Fleming                                  First written
    7 February 2020
*/    
%let &high_water_mark_value = %sysevalf("1jan1800:0:0"dt);
proc sql noprint;
connect to &_target_engine(&_target_connect);
select coalesce(max_timestamp, '1jan1800:0:0'dt) as max_timestamp format=23.3
  into :&high_water_mark_value trimmed
  from connection to &_target_engine
  (select max(`&high_water_mark_variable`) as max_timestamp
     from &table);
%check_status
disconnect from &_target_engine;
quit;
%mend logging_hwm;