%macro parse_parameters / minoperator mindelimiter=',';
/*
    Name:                           Parse Columns
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        Checks table and column column names, mfassaging them into a 
                                    standardised form for processing by Hadoop.
                                    
    Method:
    data _null_                     Tidy up table names.
    %logging(task=Begin);           Create template logging row. This is done here, because it's 
                                    dependant on tidied table names.
    data _null_;                    Get components of the source and target libnames.
    do suffix = '', '_chgt', ...    Create macro variables for all the possible Impala tables in
                                    staging and raw/dw.
    %get_object_and_timestamp;      Get object key from lcf.object, and hwm from the target table.
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  %select_cols parameter changed from effective_timestamp to
    6 April 2020                    include_timestamp.
    
    Laurie Fleming                  When checking existence of the target table, save the results
    26 March 2020                   in _target_exist explicitly, then use that in %logging.
    
    Laurie Fleming                  Checking of nk_column_names moved to get_object_and_timestamp,
    17 March 2020                   for consistency.    
    
    Laurie Fleming                  Fixed long-standing bug in reverting from the _old target table,
    10 March 2020                   for the vanishingly small (!) chance of the _old table existing 
                                    but the target doesn't. The warning message in the log is also fixed.
    
    Laurie Fleming                  Reintroduced check for tabs in nk_column_names, converting them to spaces.
    2 March 2020                    (the check had been logically removed)
    
    Laurie Fleming                  Check for mismatch between lcf object nk column names and selected
    6 Nov 2019                      natural key columns in the transformation.
    
    Laurie Fleming                  Allowed for non-existant flngver column for P2H1 processing.
    16 August 2019          

    Laurie Fleming                  First written
    April 2019
*/          
%local version_column_found version_last_column_found nk_column_names _target_col_name keys_match _old_exist;
%let status_msg = %sysfunc(sysmsg());            /* Get sysmsg, which automatically resets it to null */
%let status_msg =;                               /* Just in case... */
%let source_library = %sysfunc(lowcase(%sysfunc(scan(&_source, 1, %str(.)))));
%let source_table = %sysfunc(lowcase(%sysfunc(scan(&_source, 2, %str(.)))));
%let full_target = %unquote(&_target);             /* Save the full (two-part) target table's name */
%let _target_library = %sysfunc(lowcase(%sysfunc(scan(&_target, 1, %str(.)))));
%let _target_library_connect = &_target_connect;   /* These two assignments are made for refresh_libname (qv). */
%let _target_library_engine = &_target_engine;
%let _target_name = %sysfunc(dequote(%sysfunc(lowcase(%sysfunc(scan(&_target, 2, %str(.)))))));
%let staging_library_connect = %nrquote(&staging_library_connect); /* Allow double quotes inside the variables */
%let _target_connect = %nrquote(&_target_connect);
%if &pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) %then %do;
    %let jnl_library_connect = %nrquote(&jnl_library_connect);
    %let primary_jnl_library_connect = %nrquote(&primary_jnl_library_connect);
    %end;
data _null_;
i = 0;
prefix_array = 'stg tgt jnl pjnl';
length prefix $ 4;
do connect = "&staging_library_connect", "&_target_connect"
%if &pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) %then %do;
    , "&jnl_library_connect", "&primary_jnl_library_connect"
    %end;
    ;
   i + 1;
   prefix = scan(prefix_array, i, ' ');
   schema_length = 6;
   schema_index = index(connect, 'SCHEMA');
   if schema_index = 0 then do;
      schema_index = index(connect, 'DATABASE');
      schema_length = 8;
      end;
   schema = dequote(scan(substr(connect, schema_index + schema_length + 1), 1, ' '));
   auth_index = index(connect, 'AUTHDOMAIN'); 
   if auth_index
      then auth = dequote(scan(substr(connect, auth_index + 10 + 1), 1, ' '));
      else call missing(auth);
   call symput(strip(prefix) || '_schema', cats('`', schema, '`'));
   call symput(strip(prefix) || '_auth', strip(auth));
   end;
run;
%let _staging_lib = &staging_library;
%let _target_lib = %sysfunc(scan(&_target, 1, %str(.)));

data _null_;
/*
    Strip off quotes from non-standard table names, and convert to lower case.
    For example "tblCustomerSTD"n -> tblcustomerstd
*/
call missing(&source_table, &_target_name);
call symput('source_table', lowcase(vname(&source_table)));
call symput('_target_name', lowcase(vname(&_target_name)));
run;

/*
    Get the names of the staging and target schemas and authority domains stored in the library reference in the job.
    If there is no 'schema' string, look for 'database' instead.
*/
data _null_;
call missing(&_target_name);                                        /* Prevent warning message */
call symputx('meta_target_name', strip(lowcase(vname(&_target_name))), 'g'); /* vname strips the trailing 'n' and quotes */
%if &history_type = H3 %then %do;
    call missing(&effective_column);
    call symput('effective_column', lowcase(vname(&effective_column)));
    %end;
run;

/*
    As well as the target table, different stages require different suffixes. Not all of them
    are required by each pattern, but creating the names doesn't make any difference.
*/
data _null_;
retain table "&meta_target_name";
length table_suffix $ 40
       suffix $ 5;
do suffix = '', '_chgt', '_chgd', '_new', '_old', '_dt', '_unwd', '_nr', '_tr';
   table_suffix = cats(table, suffix);
   if suffix = '_nr' and length(table_suffix) > 32 then do;
      status_msg = catx(' ', 'Table name length too long:', table_suffix);
      putlog status_msg;
      call symput('status_msg', strip(status_msg));
      call execute('%rcset(8);');
      stop;
      end;
   call symputx('hadoop_table' || suffix, cats('`', table_suffix, '`'), 'g');
   call symputx('sas_table' || suffix, table_suffix, 'g');
   end;
run;
proc datasets lib=work nolist nowarn mt=(data view);
delete _:;
quit;

%let target_table = %sysfunc(compress(&hadoop_table, %str(`)));
data _&_target_name(compress=no);                                   /* Create an work empty dataset, purely for documentation. */
stop;
run;

%if &pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) %then %do;
    data _null_;
    array col $ 1 &key_cols;
    length key_cols by_cols $ 32767;
    call missing(key_cols, by_cols);
    do over col;
       key_cols = catx(', ', key_cols, lowcase(vname(col)));
       by_cols = catx(' ', by_cols, lowcase(vname(col)));
       end;
    call symput('key_order', strip(key_cols));
    call symput('by_order', strip(by_cols));
    run;
    %end;

%if %eval(%sysfunc(exist(&_source, data)) = 0 and %sysfunc(exist(&_source, view)) = 0) %then %do;
/* 
    When one of the two exist functions above fails, as it must, status_msg is populated in check_status, even though
    it's expected behaviour. So by setting it to null, following error messages will be less confusing!
*/
    %rcset(8);
    %let status_msg = Source &source_library..&source_table does not exist;
    %check_status;
    %end;    
%logging(task=Begin);
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
%let status_msg =;
option mprint notes;

/*
    Hadoop-formatted date formula, taken from the start time for the (DI portion of the) job. %tslit puts
    single quotes around the formatted result.
*/
%let current_date = to_timestamp(%tslit(&etls_startTime), 'ddMMMyyyy:HH:mm:ss');
%get_object_and_timestamp;
%let target_nobs = &_nobs;
%refresh_libname(library_prefix=staging_library _target_library);
LIBNAME impraw SASIOIMP  DATABASE=dev_raw  DBMAX_TEXT=32767  DSN=ClouderaImpala64  SCHEMA=dev_raw ;
%hadoop_exist(schema=%sysfunc(compress(&tgt_schema, `)), table=&_target_name);
%let _target_exist = &_exist;
%if &_exist = No and %eval(&job_rc le 4) %then %do;
    %hadoop_exist(schema=%sysfunc(compress(&tgt_schema, `)), table=&_target_name._old);
    %if &_exist = No %then %do;
        %rcset(8);
        %let status_msg = &_target_name does not exist and there is no &_target_name._old to revert from;
        %check_status;
        %goto EndMac;
        %end;
    %let task_label = Reverting from &_target_name._old;
    %let status_msg = &_target_library..&_target_name does not exist;
    %check_status;
    %logging(phase=start);
    %if &_exist = Yes %then %do;
        %rcset(4);
        %let status_msg = Previous target reverting from &_target_name._old;
        proc sql;
        connect to &_target_engine(&staging_library_connect);
        execute (alter table &tgt_schema..`&_target_name._old`
                    rename to &tgt_schema..`&_target_name`)
           by &_target_engine;
        %check_status;
        %if %eval(&job_rc > 4) %then %do;
            %let status_msg = Cannot revert &_target_name._old to &_target_name..;
            %goto EndMac;
            %end;
        execute(refresh &tgt_schema..`&_target_name`)
           by &_target_engine;
        execute(compute stats &tgt_schema..`&_target_name`)
           by &_target_engine;
        %check_status;
        disconnect from &_target_engine;
        quit;
        %let _target_exist = Yes;
        %end;
    %logging(phase=end);
    %end;
/*
    If there are multiple DB options, concatenate them together.
*/
%let impala_options =;
%if %eval(&impala_options_count ne 0) %then %do i = 1 %to &impala_options_count;
    %let impala_options = &impala_options %sysfunc(strip(&&impala_options&i));
    %end;
%let _staging_cols =;
%let version_last_column_found = No;
%let version_column_found = No;
%do i = 0 %to %eval(&_target_col_count - 1);
    %if (&&_target_col&i._input_count ne 0) %then %do;
        %let select_count = %eval(&select_count + 1);
        %let _target_col_name = %sysfunc(lowcase(%sysfunc(dequote(&&_target_col&i._name))));
        %let _staging_cols = &_staging_cols &_target_col_name;
        %end;
    %if %eval(%sysfunc(compare(&&_target_col&i._name, flngverlast, nl)) = 0)   /* Compares (eg) "flngVerLast"n with flngverlast, and returns 0 (success - matched) */
        %then %let version_last_column_found = Yes;
        %else %if %eval(%sysfunc(compare(&&_target_col&i._name, flngver, nl)) = 0)
        %then %let version_column_found = Yes;
    %end;
%if %eval(&select_count = 0) %then %do;
    %rcset(8);
    %let status_msg = No columns mapped;
    %check_status;
    %goto EndMac;
    %end;
%if &pattern = Change Extract %then %do;
    %if &history_type = H1 and &version_last_column_found = No %then %do;
        %rcset(8);
        %let status_msg = %quote(Flngverlast required but no flngverlast column exists in &source_library..&source_table);
        %check_status;
        %goto EndMac;                               /* Just in case more code gets added after this block */
        %end;
    %end;

data _null_;
array cols $ 1 &_staging_cols; /* Since this step only refers to metadata, the actual lengths and types are irrelevant. */
attrib sas_cols hadoop_cols length=$ 32767;
/*
    Convert (for example) "var_1"n "var_2"n into `var_1`, `var_2` and publish as a global macro variable. Strip
    extraneous characters from the target table and publish that too.
*/
do over cols;
   sas_cols = catx(', ', sas_cols, strip(lowcase(vname(cols))));
   hadoop_cols = catx(', ', hadoop_cols, cats("`", lowcase(vname(cols)), "`"));
   end;
call symputx('sas_cols', strip(sas_cols), 'g');
call symputx('hadoop_cols', strip(hadoop_cols), 'g');
%if &history_type = H3 or &pattern = Record Batch Extract 
    %then %do;
          call symputx('hadoop_effective_column', cats('`', lowcase(vname(&effective_column)), '`'), 'g');
          call symputx('hadoop_to_timestamp', cats('`', lowcase(vname(&to_timestamp)), '`'), 'g');
          %end;
    %else %if &pattern in(Change Extract, Event Extract) %then %do;
          call symputx('hadoop_effective_column', cats('`', lowcase(vname(&change_capture_timestamp)), '`'), 'g');
          %end;
run;
%if &pattern in(Change Extract, Event Extract, Record Batch Extract) 
    %then %do;
          data _null_;
          array cols $ 1 &key_cols;
          attrib key_cols length=$ 32767;
          do over cols;
             key_cols = catx(' ', key_cols, lowcase(vname(cols)));
             end;
          call symputx('key_cols', strip(key_cols), 'g');
          run;
          %if    (&history_type = H3 and %eval(%sysfunc(find(&key_cols, &effective_column)) ne 0))
              or (&history_type ne H3 and %eval(%sysfunc(find(&key_cols, &change_capture_timestamp)) ne 0)) %then %do;
              %rcset(8);
              %let status_msg = Change capture/Effective timestamp column is not permitted in natural key columns;
              %check_status;
              %goto EndMac;
              %end;
/*
          Construct the select and join clauses for the Hadoop queries.
*/
          %select_cols(include_timestamp=Yes);
          %end;
    %else %if &pattern = Full Comparison %then %do;
              %select_cols(include_timestamp=No);
              %end;
%EndMac:
%mend parse_parameters;