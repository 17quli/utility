%macro pattern_common_setup / minoperator mindelimiter=',';
/*
    Name:                           Pattern Common Setup
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   April 2019
    Remarks:                        All the preliminary processes are pretty much identical
                                    across the different patterns and sub-patterns. This
                                    processes all the transformations' parameters, loads
                                    the source data (Oracle/SQL Server/SAS) data into
                                    the staging database gets the data ready for posting into the
                                    raw database.
                                    
    Method:
    %parse_parameters;              Check table names and columns for invalid characters; clean
                                    them up.
    create view _source_v as...     Create a SAS view of the source data, and track mapped columns,
                                    including expressions and renaming. If the pattern has a hwm,
                                    generate a 'where' clause.
    data _source_v2 / view=_sou...  Create a view of the source view, converting dates to datetimes,
                                    processing history type 1 etc.
    %validate(derived_columns=&...  Validate the source's metadata against the target's. This can't
                                    be done before the creation of _source_v2, because of the casting
                                    of dates to datetimes (incredibly rare though that may be).
    data _source_v3 / view=_sou...  If the source contains datetimes, convert to text strings to 
                                    correct problematic rounding.
    insert into &stg_hive..&sas...  Insert the rows from source views into the staging area.
    execute(create view &stg_sc...  Create a view of the staging data to limit to natural keys that are *not*
                                    already on the target table.
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Add "partitioned" column to those being defined if not existing, and set it to No.
    19 June 2020
    
    Laurie Fleming                  Replaced previous change capture timestamp processing in reading the source to
    April-May 2020                  use stratification timestamps if appropriate.
    
    Laurie Fleming                  Created a global variable _target_exist, used by %parse_parameters and %logging.
    26 March 2020
    
    Laurie Fleming                  Remove order by clause from source extraction. Only sort in SAS, not in the
    19 March 2020                   source DBMS - too much strain on the server. Sorting now only done for P2H1,
                                    because the flngverlast value can overwrite fdtmwhen order.

    Laurie Fleming                  Changed task_label settings to make more readable, as per request
    6 March 2020                    by Nataliya and Nalaka.

    Laurie Fleming                  Symbolgen/mlogic only active where debug=Yes
    2 March 2020                    Added a validate call for ingestion-only or running from primary journal in 
                                    non-primary environment.
    
    Nataliya Alkhimova              Changed option statement to set symbolgen mlogic to be ON to facilitate debugging.
    17 February 2020                Previously they were set as nosymbolgen nomlogic.

    Laurie Fleming                  Stopped P2H3 expiry dates < effective dates from being processed.
    27 November 2019

    Laurie Fleming                  Converted to process source rows from a journal, instead of directly from the source.
    5 November 2019                 Journal loaded in %load_journal, then compared against the target in %create_not_in_target.

    Laurie Fleming                  Reversed out much of the effective_from_timestamp change (qv 15-19 Sep). It
    16 October 2019                 is now only done for Change Extract for the initial load. All other loads derive from
                                    the change-capture or source effective-from timestamps.
    
    Laurie Fleming                  Corrected bug in 'where' clause for reading source.
    14 October 2019                 ((&change_capture_timestamp < (&to_timestamp - &purge_grain)) or &to_timestamp is null)
                                    is correct. Previously it read "&to_timestamp + &purge_grain", which is quite different.
    
    Laurie Fleming                  Extra logging added before and after reading the source. Now there are 
    24 September 2019               seven, not six, potential process tasks.
    
    Laurie Fleming                  Big change to set effective_from_timestamp to low for the initial load
    15-19 September 2019            of a key. This involved extensive re-writing of the processing of the source
                                    after the initial extract (now expanded to allow a dataset as well as a view).
                                    This only logically relates to Change Extract (P2), but since this code is
                                    common, the other patterns are affected as well.

    Laurie Fleming                  Compensated for very early timestamps (sometime in 1191!) by converting them to 1 Jan 1800.
    27 August 2019
    
    Laurie Fleming                  Added new option Purge Grain to detect very short durations for P2H3, and remove
    21 August 2019                  them. The duration gap can be anywhere from 1 second up to 2 hours. (Default 1 second)
    
    Laurie Fleming                  Added Effective Timestamp Grain for Change Extract History Type 3, to correct
    20 August 2019                  Effective_to_timestamp values when they were previously the active row.
                                    Also for P2H3, correct the effective_to timestamp to year 9000 instead of 9999.
    
    Laurie Fleming                  Introduced four new history models to cope with the
    mid-July 2019                   vagaries of Start and EDW data. (qv Change Extract)

    Laurie Fleming                  First written
    April 2019
*/
%global hadoop_table hadoop_table_chgt hadoop_table_chgd hadoop_table_new hadoop_table_old hadoop_table_dt 
        hadoop_table_unwd hadfoop_cols select_cols p2h3_cols sas_table sas_table_chgt sas_table_chgd 
        sas_table_new sas_table_old sas_table_dt sas_table_unwd sas_table_v _target_exist stratify_load;

%if %symexist(ep_key_cols) %then %do;
    %global key_cols;
    %let key_cols = &ep_key_cols;
    %end;
%if %eval(not %symexist(read_primary_journal)) %then %do;
    %global read_primary_journal;
    %let read_primary_journal = %quote(NA);                         /* Full Replacement only - not applicable. */
    %end;
%if %eval(not %symexist(duplication_grain)) %then %do;
    %local duplication_grain;
    %let duplication_grain = 1;                             /* 1 second */
    %end;
%if %eval(not %symexist(effective_column)) %then %do;
    %global effective_column;
    %end;
%if %eval(not %symexist(tagsort)) %then %do; 
    %global tagsort;
    %let targsort = No;
    %end;
%if %eval(not %symexist(purge_grain)) %then %do;            /* P2H3/P4 only - removes rows where the duration is within the value */
    %global purge_grain;
    %let purge_grain = 1;
    %end;
%if %eval(not %symexist(change_capture_timestamp)) %then %do;
    %global to_timestamp change_capture_timestamp; 
    %end;
%if %eval(not %symexist(effective_timestamp_grain)) %then %do;
    %global effective_timestamp_grain;
    %let effective_timestamp_grain = Second;
    %end;
%if %eval(not %symexist(effective_column)) %then %do;
    %local effective_column to_timestamp;                   /* Make sure they exist, so that get_object_and_timestamp doesn't fail */
    %end;
%if %eval(not %symexist(partitioned)) %then %do;
    %global partitioned;
    %let partitioned = No;
    %end;
%if &tagsort = Yes %then                                                     /* Tagsort doesn't work on views, of course */
    %let source_table_type = dataset;
%if %eval(not %symexist(history_type)) %then
    %global history_type;
%if &pattern = Change Extract 
    %then %let history_type = %unquote(&history_type);
    %else %let history_type = NA;
%let duplication_grain = %unquote(&duplication_grain);
%let read_primary_journal = %unquote(&read_primary_journal);

%local schema_index schema_length _staging_formats format length table object_name select_count
       generated_select_count calculated derived_columns object_found target_table source_columns 
       source_library source_table full_target date_vars key_order by_order dbms_source _library_journal
       excluded_columns excluded_columns_found max_range_timestamp max_range_timestamp_display
       stratify_column_name stratification_timestamp;

/*
    The default assignment has a 2-character year. Come on, SAS!
*/
%let etls_startTime = %sysfunc(datetime(), datetime19.);
/*
    Set up options for SAS logging. The installed default is for fullstimer, but that bulks the
    log out too much and makes it hard to read. The buffer numbers and sizes help force as much
    processing as possible into memory.
*/
option validvarname=any validmemname=extend spool mprint mprintnest
       notes bufno=3000 bufsize=65535 ibufno=10000 ibufsize=32767 compress=no
%if &debug = Yes
    %then %do;
          nosymbolgen nomlogic 
          %end;
    %else %do;
          nosymbolgen nomlogic
          %end;
%if &fullstimer = Yes
    %then %do;
          fullstimer 
          %end;
    %else %do;
          nofullstimer
          %end;
    ;
%let task_label = Pattern Common Setup;
%let select_count = 0;                        /* Initialise count of columns being copied from source */
%let _staging_formats =;
%let left_count = 0;
%let right_count = 0;

%if %eval(&job_rc > 4) %then %do;
/*
    If any errors detected before the job has started - ramp up the error code.
    (This could happen because of failed libname statements).
*/
    %let status_msg = %nrquote(Job not started because of external error: %sysfunc(sysmsg()));
    %put &status_msg;
    %rcset(24);
    %check_status;
    %goto EndMac;
    %end;

proc datasets lib=work nolist nowarn mt=(data view);
delete _source_v _source_v_dedup _source_v2 _source_v3 existing_keys _source_date_selection max_timestamp_v;
quit;

%parse_parameters;
%if %eval(&job_rc > 4) %then
    %goto EndMac;

/*
    Drop all the target's work tables and view from staging and raw/dw/whatever the target schema is.
*/
%tidyup(force=Yes);                   /* Don't check the return code. Just do it. */
%if %eval(&job_rc > 4) %then
    %goto EndMac;
%let status_msg = %sysfunc(sysmsg()); /* Clear sysmsg, just in case */
%let status_msg =;
%let _journal_library =;
%if &pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) %then %do;
    %setup_journal;                   /* Set up journaling parameters, and the Environment variable (Primary/NotPrimary) */
    %if &primary_journal_exist = Yes and &read_primary_journal = Yes and &environment = NotPrimary %then %do;
        %put;
        %putmsg(type=info, msg=%quote(Reading from primary journal; bypassing reading from source));
        %put;
        %goto Ingestion;              /* Ingestion is effectively bypassed for Full Comparison */
        %end;
    %if &ingestion_mode = ing %then
        %goto Ingestion;
    %end;

%let task_label = Read Source;
%logging(phase=start);
/*
    Create a view of the source table. The target names will possibly, but not necessarily, be represented in the
    form "var_name"n, which is not recognised by Hadoop - these will be cleaned up by the next step.
    _staging_cols contain all the source variables, and _staging_formats their formats (particularly important for
    datetime and (MS/SQL) date columns. 
    
    _staging_formats is used in %concatenated_values, for calculating the checksum.
*/
%let calculated=;
%let derived_columns=;
%let source_columns=;
%let excluded_columns_found =;
%let excluded_columns_found_count = 0;
%if %eval(&pattern in(Change Extract, Event Extract, Record Batch Extract)) %then %do;
    %if &max_range_timestamp = %then %do;
        %let max_range_timestamp = %sysfunc(datetime());
        %let max_range_timestamp_display = %timestamp_display(sas_internal=&max_range_timestamp);
        %end;
    data _%sysfunc(substr(%sysfunc(translate(%sysfunc(putn(&max_timestamp, datetime19.)), _, :)), 1, 15))_%sysfunc(substr(%sysfunc(translate(%sysfunc(putn(&max_range_timestamp, datetime19.)), _, :)), 1, 15));
    stop;
    run;
    %end;

proc sql noprint;
%if &source_table = dataset or &history_type = H1
    %then %do;
          create table _source(compress=binary) as
          %let dbms_source = _source;
          %end;
    %else %do;
          create view _source_v as
          %let dbms_source = _source_v;
          %end;
   select 
   %let generated_select_count = 0;
   %do i = 0 %to %eval(&_target_col_count - 1);
       %if %eval(&&_target_col&i._input_count = 0) %then 
           %goto Continue;
       %if &excluded_columns ne %then %do;
           %if %sysfunc(lowcase(&&_target_col&i._input)) in(&excluded_columns) %then %do;
               %let excluded_columns_found = &excluded_columns_found %sysfunc(lowcase(&&_target_col&i._input));
               %let excluded_columns_found_count = %eval(&excluded_columns_found_count + 1);
               %end;
           %end;
       %let generated_select_count = %eval(&generated_select_count + 1); 
       %let _target_col_name = %sysfunc(lowcase(%sysfunc(dequote(&&_target_col&i._name))));
       %let format = &&_target_col&i._format;
       %let length = &&_target_col&i._length;
       %if &format = %then                                  /* All variables require a format, for calculating checksum for Full Comparison */
           %if &&_target_col&i._type = $                    /* Character */
               %then %let format = $char&length..;
               %else %let format = best16.;
       %let _staging_formats = &_staging_formats &format;
       %if %nrbquote(&&_target_col&i._exp) ne 
           %then %do;
                 (&&_target_col&i._exp) as                  /* Allow expressions instead of straight column copying */
                 %if %eval(&pattern in(Change Extract, Event Extract, Record Batch Extract)) %then %do;
                     %if %eval(%sysfunc(compare(&_target_col_name, &change_capture_timestamp, nl)) = 0) %then /* Compares (eg) "TimeStamp"n with timestamp, and returns 0 (success - matched) */
                         %let calculated = calculated;
                     %end;
                 %end;
           %else %if %eval(%sysfunc(compare(&&_target_col&i._input, &_target_col_name, nl)) ne 0) %then %do;
                 &&_target_col&i._input as                  /* If column name is changing */
                 %end;
       &_target_col_name length=&length
       %if &format ne %then %do;
           format=&format
           %end;
/*
    If new columns are being created (qv app_tblcrmextendedlog) in the target, create a concatenated string
    of them for exclusion in the validation process.
*/         
       %if %eval(&&_target_col&i._input_count = 1) %then
           %let source_columns = &source_columns &&_target_col&i._input0;
       %if %sysfunc(lowcase(&&_target_col&i._input)) ne %sysfunc(lowcase(&_target_col_name)) %then
           %let derived_columns = &derived_columns &_target_col_name;
       %if %eval(&generated_select_count ne &select_count) %then
           %str(,);
       %Continue:
       %end;
   from &_source
%if &_source_options ne %then %do;
    (&_source_options)
    %end;
%if %eval(&pattern in(Change Extract, Event Extract, Record Batch Extract)) or (&history_type = H3) or (&where ne) %then %do;
    where 
    %if %eval(&pattern in(Change Extract, Event Extract, Record Batch Extract)) %then %do;
/*
    If the stratify column is not the change capture timestamp, make sure that any rows read are not after the 
    change capture timestamp HWM as well; otherwise they will be read now, and the HWM will be too high for when the load
    reverts to normal.
*/
        %if &stratify_load = Yes and &stratify_column_name ne &change_capture_timestamp
            %then %do;
                  (    &stratify_column_name ge "%timestamp_display(sas_internal=&max_timestamp, dateformat=sas)"dt
                   and &stratify_column_name < "&max_range_timestamp_display"dt
                   and &calculated &change_capture_timestamp le "%timestamp_display(sas_internal=&stratification_timestamp, dateformat=sas)"dt)
                   %end;
            %else %do;
                  (    &calculated &change_capture_timestamp ge "%timestamp_display(sas_internal=&max_timestamp, dateformat=sas)"dt
                   and &calculated &change_capture_timestamp < "&max_range_timestamp_display"dt)
                  %end;
        %if (&history_type = H3 or &pattern = Record Batch Extract) or &where ne %then %do;
            and
            %end;
        %end;
    %if &history_type = H3 or &pattern = Record Batch Extract %then %do;
        ((&effective_column < (&to_timestamp                                                              /* qv select_cols for additional use within p2h3_cols */
        %if &effective_timestamp_grain ne Days %then %do;
            - &purge_grain                                                                                /* Defaults to 1 (second) */
            %end;
        )) or &to_timestamp is null)
        %if &where ne %then %do;
            and 
            %end;
        %end;
    %if &where ne %then %do;
        (%unquote(&where))
        %end;
    %end;
;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
%if &excluded_columns_found ne %then %do;
    %rcset(8);
    %if %eval(&excluded_columns_found_count = 1)
        %then %let columns_word = column;
        %else %let columns_word = columns;
    %let status_msg = Excluded &columns_word &excluded_columns_found mapped;
    %check_status;
    %goto EndMac;
    %end;
quit;

%if &history_type = H1 %then %do;      /* Change Extract H1 only: sort after extract - good for very wide tables */
    proc sort data=&dbms_source equals 
    %if &tagsort = Yes %then %do;
        tagsort
        %end;
    ;                     /* Tagsort great for narrow keys/many wide columns; equals for reliability of row order */
    by &by_order descending flngverlast;
    run;
    %check_status;
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
/*
    Because there can be legitimate multiple rows for each version (qv Start fam tables), deduplicate
    to have only one row, and do the duplication grain processing on that table. Once the version duplicates
    have been take out (by the timestamps being within duplication grain), merge the result in with the 
    main dataset, keeping only the non-duplicates.
*/
    data duplication_grain(compress=no);
    set &dbms_source(keep=&by_order flngverlast &change_capture_timestamp);
    by &by_order descending flngverlast;
    if first.flngverlast;
    run;
  
/*
    If a history 1 type, create a temporary new column from the effective timestamp. Compare the (absolute) difference 
    between this and the previous row's value against the duplication grain. If it's greater, keep it; otherwise throw it
    away.
    
    The option for duplication grain is 1 second, but it can be millisecond, two seconds, 30 seconds or a number
    of other options)
*/
    data duplication_grain(compress=no);
    set duplication_grain;
    by &by_order;
    attrib _save_timestamp length=8 format=datetime23.3;
    retain _save_timestamp;
    select;
       when(first.%sysfunc(scan(&key_cols, -1, %str( ))))
          call missing(_save_timestamp);
       when(abs(&change_capture_timestamp - _save_timestamp) > &duplication_grain);
       otherwise
          delete;                       /* Too close to the more recent observation */
       end;
    _save_timestamp = &change_capture_timestamp;
    drop _save_timestamp;
    run;
/*
    Only those keys in duplication grain are to remain in _source_date_selection.
*/
    data _source_date_selection(compress=binary sortedby=&key_cols descending flngverlast);
    merge &dbms_source
          duplication_grain(in=in_retain);
    by &by_order descending flngverlast;
    if in_retain;
    run;
    %check_status;
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    %let dbms_source = _source_date_selection;
    %end;

%if &derived_columns ne %then %do;
/*
    Create a macro variable of all derived columns, to be passed to the validation process.
*/
    data _null_;
    array cols $ 1 &derived_columns;
    attrib derived_cols length=$ 32767;
    do over cols;
       derived_cols = catx(' ', derived_cols, lowcase(vname(cols)));
       end;
    call symput('derived_columns', strip(derived_cols));
    run;
    %end;

%let date_vars =;
proc sql noprint;
/*
    If there are any date columns, identify them so they can be converted to datetime.
*/
select name
  into :date_vars separated by ' '
  from dictionary.columns
 where libname = 'WORK'
   and memname = '_SOURCE_V'
   and format like 'DATE%'
   and format not like 'DATETIME%';
quit;

%if &pattern = Full Comparison %then %do;
/*
    Generate the code for the checksum variable from the staging columns.
    The cat family of functions uses the underlying value of a variable, not its formatted value. 
    (This is particularly problematic with datetime values).
    
    For example:
    %concatenated_values(variable=checksum, columns="TEST_ID"n "TEST_VALUE"n "DATE_APPLIED"n "TEST_DATE"n,
                         formats=8. $8. DATETIME23.3 datetime.);
    puts the string catx("~", put(TEST_ID, best8.), TEST_VALUE, put(DATE_APPLIED, datetime23.3) etc into checksum.
   
    If there's no checksum, and there are no dates to convert to datetime, create a view of a view which does nothing.
    There is (virtually) no cost to processing this.
*/  
    %concatenated_values(variable=checksum, columns=&_staging_cols, formats=&_staging_formats);
    %end;
    
/*
    Populate checksum, and convert dates to datetimes.
*/
%if &date_vars ne or &history_type = H3 or &pattern = Full Comparison %then %do;
    data _source_v2 / view=_source_v2;
    retain &_staging_cols                         /* Force order of variables */
    %if &pattern = Full Comparison %then %do;
        checksum    
        %end;
        ;
    set &dbms_source;
    %if &date_vars ne %then %do;
        array _dates &date_vars;
        do over _dates;
           _dates = _dates * 86400;                 /* Convert from date to datetime (seconds in a day) */
           end;
        format &date_vars datetime23.0; 
        %end;
    %if &history_type = H3 %then %do;
        &effective_column = max(&effective_column, '1jan1800:0:0'dt);           /* This should fix timestamps in 1191 (!), and any genuinely null values */
        &to_timestamp = min(&to_timestamp, '31dec9000:0:0'dt);                  /* If to_timestamp is null, it gets set to 31 Dec 9000 */
        %end;
    %if &pattern = Full Comparison %then %do;
        attrib checksum length=$ 32;
        checksum = putc(md5(&checksum), '$hex32.');                             /* Without formatting as hex, it's not readable. */
        %end;
    run;
    %let dbms_source = _source_v2;
    %end;

/*
    Validate the table structures between source and target. On error, drop out.
*/
%logging(phase=end);

%let task_label = Validation;
%logging(phase=start);
%refresh_libname(library_prefix=staging_library _target_library);
%validate(derived_columns=&derived_columns, check_exclusion=Yes);                /* Check the metadata for source and target tables */
%logging(phase=end);
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
%if &source_table_type = dataset and &source_library ne work and %sysfunc(lowcase(%sysfunc(scan(&lcf, 1, %str(.))))) ne lcf %then %do;
    libname &source_library clear;
    %end;

%let task_label = Staging Table Load;
%logging(phase=start);
%if %eval(&job_rc > 4) %then
    %goto EndMac;

/*
    SAS stores datetime fields as the number of seconds since 1 Jan 1960. Since the current value is around 1.6 billion,
    and the values are stored as numerics with a decimal portion, rounding will always occur. To get around this,
    the source datetime field has to be converted into a text string, loaded as such into Hadoop then re-cast to an
    Hadoop timestamp on the other side. Because the variable type is changing, duplicates are created suffixed with '_x',
    renamed to the original column then dropped. This very simple query creates those statements.
*/
%let datetime_names =;
proc sql noprint;
select name as datetime_names,
       cats(name, '_x') as datetime_names_char,
       catx(' = ', cats(name, '_x'), name) as datetime_rename /* Column rename string */
  into :datetime_names separated by ' ',
       :datetime_names_char separated by ' ',
       :datetime_rename separated by ' '
  from dictionary.columns
 where libname = 'WORK'
   and lowcase(memname) = "&dbms_source"
   and format like 'DATETIME%';                     
/*
    Create the select clause for the creation of the initial Hadoop staging table. Set up the timestamp columns
    as varchar(23) - these will be recast back to timestamps later. Don't include the ETL columns, *except* for
    checksum.
*/
select ifc(format not like 'DATE%', cats('`', name, '`'), cat('cast(null as varchar(23)) as `', strip(name), '`')),
       ifc(format like 'DATETIME%', cat('cast(`', strip(name), '` as timestamp) as `', strip(name), '`'), cats('`', name, '`'))
  into :create_string separated by ', ',
       :recreate_string separated by ', '
  from dictionary.columns
 where libname = "WORK"
   and lowcase(memname) = "&dbms_source";
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
quit;
%let create_string = &create_string, cast(null as int) as `batch_key`;

/*
    It's possible that there are none, so don't bother with the extra pass of the data.
*/
%if &datetime_names ne %then %do;    
    data _source_v3(label="Datetimes converted to ISO8601 timestamps") / view=_source_v3;
    set &dbms_source;
    array from_dt &datetime_names;
    array to_dt $ 23 &datetime_names_char;
    do over from_dt;
       to_dt[_i_] = putn(from_dt, 'is8601dt23.3');      /* Convert datetimes to character, rounded to 3 decimal places. */
       end;
    drop &datetime_names;
    rename &datetime_rename;
    run;
    %let dbms_source = _source_v3;
    %end;

proc sql noprint;
connect to &staging_library_engine(&staging_library_connect);
/*
    Using this create_string, create an empty table to be inserted into. It is created with Impala, because
    that's the only way to set it up with serdeproperties and *as textfile*. The insertion is into the Hive
    view of the table, but all later processing is in Impala (with parquet).
*/
execute (create table &stg_schema..&hadoop_table_tr &hive_creation_options as
            select &create_string
              from &tgt_schema..&hadoop_table
             where false)
   by &staging_library_engine;
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac; 
disconnect from &staging_library_engine;
/*
    Load into the staging datetime table (using Hive), and store the number of rows loaded into left_count.
*/
insert into &hive_library..&sas_table_tr
   select &sas_cols
%if &pattern = Full Comparison %then %do;
          , 
          checksum
    %end;
          , 
          &object_run_key as batch_key
     from &dbms_source;
%let left_count = &sqlobs;                  /* Number of rows inserted into the landing table. */
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
quit;
libname &hive_library clear;                /* Reduce the number of connections to the Hadoop cluster */
%putmsg(type=info, msg=%refnumv(val=&left_count) observations inserted);
%if &source_table_type = view and &source_library ne work and %sysfunc(lowcase(%sysfunc(scan(&lcf, 1, %str(.))))) ne lcf %then %do;
    libname &source_library clear;
    %end;

proc sql noprint;
connect to &staging_library_engine(&staging_library_connect);
execute (invalidate metadata &stg_schema..&hadoop_table_tr)
    by &staging_library_engine;
execute (refresh &stg_schema..&hadoop_table_tr)
    by &staging_library_engine;
%check_status;
%if %eval(&job_rc > 4) %then 
    %goto EndMac;
%if %eval(&pattern in(Change Extract, Event Extract, Record Batch Extract, Full Replacement) and &left_count = 0) %then %do;
    %putmsg(type=info, msg=No change/event records found.);
    %end;
%if &datetime_names ne %then %do;                               /* Convert varchar(23) to timestamp even if the table is empty */
    execute (create table &stg_schema..&hadoop_table_dt &impala_options as
                select &recreate_string,
                       `batch_key`
                  from &stg_schema..&hadoop_table_tr)
      by &_target_engine;
    %check_status;
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (invalidate metadata &stg_schema..&hadoop_table_dt)
       by &staging_library_engine;
    execute (compute stats &stg_schema..&hadoop_table_dt)
       by &staging_library_engine;
    execute (drop table &stg_schema..&hadoop_table_tr purge)
       by &staging_library_engine;
    %check_status;
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (alter table &stg_schema..&hadoop_table_dt 
               rename to &stg_schema..&hadoop_table_tr)
       by &staging_library_engine;
    %check_status;
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    execute (refresh &stg_schema..&hadoop_table_tr)
       by &staging_library_engine;
    execute (compute stats &stg_schema..&hadoop_table_tr)
       by &staging_library_engine;
    %check_status;
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    %end;
disconnect from &staging_library_engine;
quit;

%if %eval(&pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract)) %then %do;
    %count(dsn=&staging_library..&sas_table_tr, dbms=impala, authdomain=&stg_auth, debug=&debug,
           where=&key_cols_null);
    %if %eval(&_nobs ne 0) %then %do;
        %rcset(8);
        %let status_msg = At least one row has a null key;
        %check_status;
        %goto EndMac;
        %end;
    %end;
%logging(phase=end);

%if &pattern in(Change Extract, Event Extract, Record Batch Extract) %then %do;
    %load_journal;
    %if %eval(&job_rc > 4) %then 
        %goto EndMac;
    %end;

%Ingestion:
%if &pattern in(Full Comparison, Full Replacement)
    or &ingestion_mode = jnl %then
    %goto EndMac;
/*
    Change/Event/Record Batch Extract, ingestion_mode ing|all only.
*/
%if &primary_journal_exist = Yes and &read_primary_journal = Yes and &environment = NotPrimary
    %then %let source_library = &primary_jnl_library;
    %else %let source_library = &jnl_library;
%if    (&primary_journal_exist = Yes and &read_primary_journal = Yes and &environment = NotPrimary)
    or (&ingestion_mode = ing) %then %do;
    %let task_label = Ingestion-only validation;
    %logging(phase=start);
    %let source_table = &sas_table;
    %let source_columns = &_staging_cols;               /* Source (journal) is the same the target (row), so there's no possibility for column renaming */
    %let _source_engine = SASIOIMP;
    %let _source_memtype = DATA;
    %validate(check_exclusion=No);
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    %logging(phase=end);
    %end;
%let task_label = Create Not In Target from &source_library;
%if &primary_journal_exist = Yes and &read_primary_journal = Yes and &environment = NotPrimary
    %then %let task_label = %quote(&task_label.-Primary Journal);
    %else %let task_label = %quote(&task_label.-Env. Journal);
%logging(phase=start);
%create_not_in_target;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
%logging(phase=end);
libname &jnl_library clear;
%if &primary_journal_exist = Yes %then %do;
    libname &primary_jnl_library clear;
    %end;
%EndMac:
%mend pattern_common_setup;