%macro select_cols(include_timestamp=No);
/*
    Name:                           Select Cols
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        Creates generalised macro variables for selected columns, joins and so on.
                                    Referred to by parse_parameters (primarily), full_comparison, pattern_common_setup, 
                                    change_extract, record_batch_extract and reconciliation.

    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Explicitly remove the partition column, if populated, from select_cols, allowing it to
    19 June 2020                    be appended in change_extract.
    
    Laurie Fleming                  In line with changes to parse_parameters to validate settings in the object 
    6 April 2020                    table, the macro parameter effective_timestamp has been changed to include_timestamp,
                                    and differentiation made beetween P2H3 and other (sub-)patterns.
    
    Laurie Fleming                  For Change Extract History Type 3, create a new global variable p2h3_cols,
    20 August 2019                  to correct the effective_to value when it has been updated by a new row.
                            
    Laurie Fleming                  Added syslibrc (libname return code) to list of variables to check.
    6 August 2019
    
    Laurie Fleming                  First written
    April 2019
*/

/*
    Create SQL query phrases to be used throughout all the processes. The proviso is that
    the primary table is always known as _l (left), and the joined table as _r (right). It makes this
    code much simpler.
*/
%local mprint notes;
%let mprint = %sysfunc(getoption(mprint));
%let notes = %sysfunc(getoption(notes));
%if &debug = No %then %do;
    option nomprint nonotes;
    %end;
data _null_;
array cols $ 1 &key_cols
%if &include_timestamp = Yes %then 
    %if &history_type = H3 or &pattern = Record Batch Extract
        %then %do;
              &effective_column
              %end;
        %else %do;
              &change_capture_timestamp
              %end;
    ;
length col $ 32
       join_cols left_key_cols key_cols isnull key_cols_null $ 32767;
do over cols;
   col = cats('`', lowcase(vname(cols)), '`');
   if _i_ = 1 then
      call symputx('first_key_col', strip(col), 'g');
   join_cols = catx(' and ', join_cols, cat("_l.", strip(col), " = _r.", strip(col)));
   left_key_cols = catx(', ', left_key_cols, cats("_l.", col));
   key_cols = catx(', ', key_cols, col);
/*
    isnull is a synonym for coalesce/coalescec. This is only used by Full Comparison.
*/
   isnull = catx(', ', isnull, cat("isnull(_l.", strip(col), ", _r.", strip(col), ') as ', strip(col)));
   key_cols_null = catx(' or ', key_cols_null, cat(strip(col), " is null"));
   end;
call symputx('join_cols', strip(join_cols), 'g');
call symputx('select_key_cols', strip(key_cols), 'g');
call symputx('left_key_cols', strip(left_key_cols), 'g');
call symputx('isnull', strip(isnull), 'g');
call symputx('key_cols_null', strip(key_cols_null), 'g');
run;   

data _null_;
array all_cols $ 32 &_staging_cols;         /* All columns, barring those from record_effective_timestamp onwards */
length select_cols $ 32767;
call missing(select_cols);
%if &pattern = Change Extract %then 
    %if &history_type = H3 %then %do;
        length to_timestamp $ 32 p2h3_cols $ 32767;
        to_timestamp = lowcase(vname(&to_timestamp));
        call missing(p2h3_cols);
        %end;
do over all_cols;
   all_cols = lowcase(vname(all_cols));
   %if &partitioned = Yes %then %do;
       if all_cols = "%sysfunc(lowcase(&partition_column))" then     /* Stop partition column from being added to select_cols */
          continue;
       %end;
   select_cols = catx(', ', select_cols, cats("_l.`", all_cols, '`'));
   %if &pattern = Change Extract %then 
       %if &history_type = H3 %then %do;
/*
    For P2H3, the updated row's (older) record_expiry_timestamp is the current row's effective_from_timestamp's value minus a millisecond. By adding
    that millisecond back on, then subtracting the effective_from/to's grain (for tblNameRecord, a day), the effective_to_timestamp's value is reset
    to what it is, or should be, in the source DBMS. Effective_timestamp_grain is millisecond, second, day, etc.
*/
           p2h3_cols = catx(', ', p2h3_cols, ifc(all_cols ne to_timestamp,
                                             cats("_l.`", all_cols, '`'),    
                                             "&effective_timestamp_grain._sub(milliseconds_add(_r.`record_expiry_timestamp`, 1), 1) as `" || to_timestamp || '`'));
           %end;
   end;
call symputx('select_cols', strip(select_cols), 'g');
%if &pattern = Change Extract %then 
    %if &history_type = H3 %then %do;
        call symputx('p2h3_cols', strip(p2h3_cols), 'g');
        %end;
run;
option &mprint &notes;
%mend select_cols;