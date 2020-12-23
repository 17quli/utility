%macro validate(derived_columns=, check_exclusion=Yes) / minoperator mindelimiter=',';
/*
    Name:                           validate
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        Compares (SAS's view of) the metadata of the source
                                    and target tables, checking for missing columns in the
                                    source and potential truncation.
                                    This code cannot detect problems (very well, or at all)
                                    for derived columns, but it gives it a good go.
                                
    Method:
    create table _source_meta...    Extract the metadata for the source and target tables.
    data _source_metadata;          Manipulate the source data because of character/byte
                                    discrepancies (depending on source engine).
    data mismatched_error           Merge the metadata datasets together, spitting out
                                    errors, warnings (non-truncation length differences)
                                    and matches.
    proc print data=mismatched...   Print out the errors and warnings. If this is submitted
                                    as a batch job, duplicate the name of the log file, replacing
                                    the file type with ".lst".
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Publish the error/warning tables in global variables (for explicit
    9 April 2020                    messages in the email sent when this is called from metadata_compare).
    
    Laurie Fleming                  Use excluded_columns from lcf.object to stop some columns from being
    6 March 2020                    being adversely reported upon. Removed verbose logging.
    
    Laurie Fleming                  Added more columns to the notin clauses, to allow for the validate
    28 February 2020                call to be made in more places.

    Laurie Fleming                  If run from metadata_compare, only use the 'new' parameter on printto
    6 Feb 2020                      on the first comparison. (qv first_run macro variable).
    
    Laurie Fleming                  Removed temporary column _change_capture_timestamp from validation list.
    19 September 2019
    
    Laurie Fleming                  Allowed for non-matching of clob/blob columns ($hexn format).
    19 August 2019
    
    Laurie Fleming                  First written
    April 2019
*/
        
/*
    Check the structure of the underlying source table against the Hadoop target.
    If columns are in the target that aren't in the source, or target character columns
    are shorter than the source's, report and error. Vice versa, in most cases, report as
    a warning.
    
    However if the source is the result of user coding (joining multiple source tables together,
    for example), allow through without comment.
*/
%global first_run warning_tables error_tables;
%if &first_run = %then
    %let first_run = Yes;
%local i word compress missing log mprint notes symbolgen mlogic excluded_columns_quoted;
%let compress = %sysfunc(getoption(compress));
%let missing = %sysfunc(getoption(missing));
%let mprint = %sysfunc(getoption(mprint));
%let notes = %sysfunc(getoption(notes));
%let symbolgen = %sysfunc(getoption(symbolgen));
%let mlogic = %sysfunc(getoption(mlogic));
option compress=no missing=' ' 
%if &debug = Yes
    %then %do;
          mprint notes
          %end;
    %else %do;
          nomprint nonotes 
          %if &symbolgen = SYMBOLGEN %then %do;
              nosymbolgen
              %end;
          %if &mlogic = MLOGIC %then %do;
              nomlogic
              %end;
          %end;
    ;
%let excluded_columns_quoted =;
%if %eval(%symexist(excluded_columns) = 0) %then
    %local excluded_columns;
%if &excluded_columns ne and &check_exclusion = Yes %then %do;
    data _null_;
    array excluded $ 1 %sysfunc(translate(%quote(&excluded_columns), %str( ), %str(,)));
    length excluded_columns_quoted $ 32767;
    do over excluded;
       excluded_columns_quoted = catx(', ', excluded_columns_quoted, cats("'", vname(excluded), "'"));
       end;
    call symput('excluded_columns_quoted', ', ' || strip(excluded_columns_quoted));   /* Put an extra comma before to fit in with the notin later */
    run;
    %end;
    
proc sql noprint;
/*
    Using SAS metadata from dictionary.columns (qv sashelp.vcolumn), create a list of the
    columns sorted by name from the actual source and targets (not the registered metadata).
    
    Metadata problems should be noticeable from the job itself. This is imperfect, but by
    looking at the underlying metadata, most potential problems should be picked up.
*/
create table _source_metadata as
   select "&_source_engine" as source_engine length=10,
          "&_source_memtype" as memtype length=10,
          lowcase(name) as name length=32,
          type as source_type,
          length as source_length,
          format as source_format,
          varnum
     from dictionary.columns
    where libname = "%sysfunc(upcase(&source_library))" 
      and lowcase(memname) = "&source_table"
      and calculated name notin('record_effective_timestamp', 'record_expiry_timestamp', 'checksum', 'record_active_flag',
                                'record_deleted_flag', 'insert_object_run_key', 'update_object_run_key', 'batch_key'
                                &excluded_columns_quoted)
    order by lowcase(name); 
create table _target_metadata as
   select lowcase(name) as name,
          type as target_type,
          length as target_length,
          format as target_format
     from dictionary.columns
    where libname = "%sysfunc(upcase(&_target_library))" 
      and upcase(memname) = "%sysfunc(upcase(&sas_table))"
      and calculated name notin('record_effective_timestamp', 'record_expiry_timestamp', 'checksum', 'record_active_flag',
                                'record_deleted_flag', 'insert_object_run_key', 'update_object_run_key', 'batch_key')
    order by lowcase(name);
quit;

data _source_metadata;
set _source_metadata;
array source_cols $ 1 &source_columns;
array target_cols $ 1 &_staging_cols;
if dim(source_cols) = dim(target_cols) and missing("&derived_columns") then do over source_cols;   /* If number of metadata columns the same as selected columns, */
   if name = lowcase(vname(source_cols)) then                      /* allow for renaming of columns */
      name = lowcase(vname(target_cols[_i_]));
   end;
if source_type = 'num' then
   return;
select;
/*
    This is incomplete, and unsatisfactory. Oracle, SQL Server and Hadoop report character lengths; SAS
    annoyingly reports byte lengths. By using DBCLIENT_MAX_BYTES=2 for Oracle tables, the unencoded length
    has to be divided by two.
*/
   when(source_engine in('ORACLE', 'SQLSVR')) unencoded_length = source_length / 2;
   when(memtype in('DATA', 'VIEW')) unencoded_length = source_length / 2;
   otherwise;
   end;
keep source_engine memtype name source_type source_length source_format varnum unencoded_length unencoded_length;
run;

proc sort data=_source_metadata noequals;
by name;
run;

/*
    Report errors, warnings and matches
*/
data mismatched_error
     mismatched_warning
     matched;
retain name source_type source_length source_engine source_format source_length unencoded_length 
       target_type target_length target_format;
merge _source_metadata(in=in_source)
      _target_metadata(in=in_target);
by name;
select;
   %if &derived_columns ne %then %do;                             /* Don't report on mismatched derived columns */
       when(indexw("&derived_columns", strip(name))) putlog "Derived found: " name;           /* New columns won't match on source, of course */
       %end;
   when(in_source and in_target) select;
      when(source_type ne target_type)                        /* If changed from character to numeric or vice versa */
         output mismatched_error;
      when(target_length = 32767)
         output matched;
      when(source_length < target_length) select;
         when(unencoded_length < target_length)               /* Target length > source length isn't even a warning */
            output mismatched_warning;
         when(unencoded_length ne target_length)
            output mismatched_error;
         otherwise
            output matched;
         end;
      when(source_length > target_length) 
         if unencoded_length ne target_length and source_length ne 32767
            then output mismatched_error;
            else output matched;
      when(source_format =: 'DATE' and target_format ne: 'DATE')
         output mismatched_error;
      when(source_format ne: 'DATE' and target_format =: 'DATE')
         output mismatched_error;
      otherwise
         output matched;
      end;
   when(in_source and source_format = '$HEX32767.');              /* If the source column is a clob/blob */
   when(in_target) output mismatched_error;
   %if &_source_engine ne %then %do;                    /* Only check for missing columns for DBMS source; if source is SAS dataset/view, ignore */
       when(in_source and source_length ne 32767) output mismatched_warning;
       %end;
   otherwise;
   end;
keep source_engine memtype name source_type source_length source_format target_length varnum;
run;

%count(dsn=mismatched_error, debug=No);
%let mismatched_error = &_nobs;

%count(dsn=mismatched_warning, debug=No);
%let mismatched_warning = &_nobs;

%if %eval(&mismatched_error = 0 and &mismatched_warning = 0) %then
    %goto EndMac;

%let status_msg = Mismatched columns between source and target;
%if %eval(&mismatched_error ne 0)
    %then %do;
          %rcset(8);
          %if &error_tables =
              %then %let error_tables = &sas_table;
              %else %let error_tables = &error_tables || &sas_table;
          %end;
    %else %do;
          %rcset(4);
          %if &warning_tables =
              %then %let warning_tables = &sas_table;
              %else %let warning_tables = &warning_tables || &sas_table;
          %let warning_label = &task_label;
          %end;
%check_status;
%let log = %qsysfunc(getoption(log));
%if &log ne %then %do;                  /* If run from the scheduler, send the output to the log directory. */
    %if &first_run = Yes %then
        %put &=log;
    proc printto print="%sysfunc(tranwrd(&log, %str(.log), %str(.lst)))" 
    %if &first_run = Yes %then %do;
        new
        %let first_run = No;
        %end;
        ;
    run;
    %end;
              
proc sort data=mismatched_error noequals;
by varnum;                              /* varnum stores the actual order of variables, instead of the variable name */
run;

/*
    Dump the mismatches (errors and warning - there can be both) to the log directory.
*/
proc print data=mismatched_error noobs width=min;
title1 "Mismatched Errors between &source_table and &sas_table";
var source_engine memtype name source_type source_length source_format target_length;
run;

proc sort data=mismatched_warning noequals;
by varnum;
run;

proc print data=mismatched_warning noobs width=min;
title1 "Mismatched Warnings between &source_table and &sas_table";
var source_engine memtype name source_type source_length source_format target_length;
run;

%if &log ne %then %do;
    proc printto;
    run;
    %end;
%EndMac:
%if &debug = No %then %do;
    proc datasets lib=work nolist nowarn mt=data;
    delete _source_metadata
           _target_metadata
           mismatched_error
           mismatched_warning 
           matched;
    %end;
quit;
option compress=&compress missing="&missing" &mprint &notes
%if &symbolgen = SYMBOLGEN %then %do;
    &symbolgen
    %end;
%if &mlogic = MLOGIC %then %do;
    &mlogic
    %end;
    ;
%mend validate;