%macro stratify;
/*
    Macro name:                                     Stratify
    Author:                                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                                   April-May 2019
    Remarks:                                        Examine source tables to work out strata for initial loads.
                                                    These strata are written to an LCF table, and read by 
                                                    get_object_and_timestamp and passed to pattern_common_setup to
                                                    limit the rows read in a particular run.
                                                    
                                                    Because multiple runs for a table may be run with different levels
                                                    (for example, a largish table set at ten may well run OK at five),
                                                    the next step after this deletes all rows for that table, so that
                                                    the new rows can be inserted.

    Modification history:                           (in reverse chronological order)
    Laurie Fleming                                  Documentation completed.
    12 May 2020                                     
    
    Laurie Fleming                                  First written
    April 2019
*/    
option nofullstimer nostsuffix compress=no nosymbolgen nomlogic mprint notes
       bufno=3000 bufsize=65535 ibufno=10000 ibufsize=32767 nocenter;
%global source_library source_table object_key;
%local stratify_date stratify_count status_msg change_capture_timestamp_column;
%let stratify_var = %sysfunc(lowcase(%sysfunc(dequote(&stratify_var))));
%let source_library = %sysfunc(lowcase(%sysfunc(scan(&_source, 1, %str(.)))));
%let source_table = %sysfunc(lowcase(%sysfunc(scan(&_source, 2, %str(.)))));
%let object_key = ;
/*
    Get the object key from LCF object, and pull out the job's change capture timestamp column
    (usually timestamp or fdtmwhen). If this differs from the stratification variable, the
    code used in the ingestion phase is handled slightly differently.
*/
data _null_;
set &lcf;
where 
%if &source_library ne %then %do;
    %if &source_library ne work and &source_library ne %then %do; /* For custom code, the source will be a work view */
        lowcase(sas_lib_ref) = "&source_library"
        and
        %end;
    %end;
       lowcase(source_object_name) = "&source_table";
call symput('object_key', strip(putn(object_key, 'best.')));
call symput('change_capture_timestamp_column', strip(lowcase(translate(change_capture_timestamp_column, ' ', '09'x))));
run;
%if &object_key = %then %do;
    %rcset(8);
    %let status_msg = Entry &source_library..&source_table not found in &lcf;
    %check_status;
    %exit_return_code;
    %goto EndMac;
    %end;

/*
    Read the source table (using implicit pass-through) to summarise the stratification variable. Even with 
    something as huge as EDW transactions, this can run in under half an hour.
*/
%let current_timestamp = "%sysfunc(datetime(), datetime23.3)"dt;
proc sql noprint undo_policy=none;
create table stratify as
   select &stratify_var as stratify format=datetime27.3,
          count(*) as count format=comma14.
     from &_source
    where (&stratify_var le &current_timestamp
    %if &change_capture_timestamp_column ne &stratify_var %then %do;
      and &change_capture_timestamp_column le &current_timestamp                /* In case they're different */
     %end;
         )
         or &stratify_var is null
    group by &stratify_var
    order by &stratify_var;
quit;

/*
    Check that the chosen column is fit for purpose.
*/
%count(dsn=stratify, where=stratify is null, weight=count);
%if %eval(&_nobs ne 0) %then %do;
    %rcset(8);
    %let status_msg = Stratification variable &stratify_var has %refnumv(val=&_nobs) missing values;
    %check_status;
    %exit_return_code;
    %goto EndMac;
    %end;

/*
    Stratify_count contains the total rows (_nobs) divided by the number of levels, giving the minimum number
    of rows that will be in each stratum.
*/
%count(dsn=stratify, weight=count)
%let stratify_count = %eval(&_nobs / &stratify_level);

data stratify_percentile;
set stratify end=eof;
by stratify;
retain percentile stratify percentile_sum 0;
percentile_sum + count;
if    (percentile_sum ge &stratify_count and percentile < %eval(&stratify_level - 1))    /* Stop rounding errors in stratify_count above. */
   or eof;   
put stratify= percentile_sum=;
percentile + 1;
output;
percentile_sum = 0;
format stratify datetime23.3
       percentile_sum comma14.;
keep percentile stratify percentile_sum;                  /* Percentile gets overwritten in the next data step; keeping it here aids debugging. */
run;

proc sort data=stratify_percentile noequals nodupkey;     /* Get rid of duplicates (happens with skewed distribution) */
by stratify;
run;

data &_output0;
attrib object_key length=8
       source_library length=$ 8
       source_table length=$ 40
       percentile length=8
       min_value max_value length=8 format=datetime27.3
       percentile_sum length=8 format=comma14.
       stratify_column_name length=$ 60;
retain object_key &object_key
       source_library "&source_library"
       source_table "&source_table"
       percentile min_value max_value percentile_sum .
       stratify_column_name "&stratify_var";
set stratify_percentile;
retain save_stratify;
percentile = _n_;                                /* Recalculate percentile, for skewed distribution */
stratify + 0.001;                                /* Add on a millisecond, because of the construction of the source selection */
if percentile = 1
   then min_value = '1jan1800:0:0'dt;            /* First, oldest percentile */
   else min_value = save_stratify;               /* Previous stratify value */
max_value = stratify;
output;
save_stratify = stratify;
keep &keep;
run;

/*
    Dump the strata to the output area.
*/
proc print data=&_output0 noobs width=min;
run;
%EndMac:
%mend stratify;