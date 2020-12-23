%macro get_object_and_timestamp(hwm=No) / minoperator mindelimiter=',';
/*
    Name:                           Get Object and Timestamp
    Author:                         Laurie Fleming, Tenzing / Daemons Ltd
    Date-written:                   April 2019
    Remarks:                        Gets the relevant information from lcf.object, and the high watermark
                                    from the journal or target.

    Modification History            (in reverse chronological order)
    Laurie Fleming                  Enhancement for stratification. For Change/Event/Record Batch Extract
    April-May 2020                  initial loads, split the journal load into multiple parts, to reduce load
                                    on the data repository servers.
    
    Laurie Fleming                  Use change_capture_timestamp for H1/H2/H4 specifically. Was failing for
    31 March 2020                   jobs with user-written SQL (crmextendedlog, account, etc)

    Laurie Fleming                  Checking of nk_column_names moved here from parse_parameters,
    17 March 2020                   for consistency.    
    
    Laurie Fleming                  Added new columns from lcf.object to check, along with nk_column_names
    12 March 2020                   and excluded_columns.
    
    Laurie Fleming                  Read excluded_columns from lcf.object, and parse the values so they can
    10 March 2020                   be put directly into a macro 'in' clause.
    
    Laurie Fleming                  Changed hwm calculation to not include future-dated records for P2H3.
    13 February 2020                Read data from journal where appropriate.
    
    Laurie Fleming                  First written
    April 2019
*/

/*
    Read the object table in LCF to get the target's object key, then read the target itself to get
    the highest effective-from date.
    
    HWM is set to yes when this code is executed from the High Watermark transformation.
*/
%local schema jnl_nobs pjnl_nobs tgt_nobs i word result columns max_stratify_timestamp;
%if %eval(%symexist(_nobs) = 0) %then %do;                  /* These variables won't exist if called from High Watermark transformation */
    %global _nobs;
    %end;
%if %eval(%symexist(debug) = 0) %then %do;              
    %global debug;
    %let debug = No;
    %end;
%if %eval(%symexist(history_type) = 0) %then %do;           /* If this macro is called from the high-water mark transformation, history_type won't exist */
    %local history_type;
    %let history_type = NA;
    %end;
%if &hwm = Yes %then %do;                                   /* Only if called from high-water mark transformation (HWM) */
    %local _target_engine _target_connect _target_library source_library hadoop_table
           jnl_schema jnl_auth pjnl_schema pjnl_auth;
    %let pattern = %unquote(&pattern);
    %let source_library =;
    %let _target_engine = &_input_engine;
    %let _target_connect= &_input_connect;
    %let _target_library = %sysfunc(scan(&_target, 1, %str(.)));
    %let jnl_library_connect = %nrquote(&jnl_library_connect);
    %let primary_jnl_library_connect = %nrquote(&primary_jnl_library_connect);
    data _null_;
    i = 0;
    prefix_array = 'tgt jnl pjnl';
    length prefix $ 4;
    do connect = "&_target_connect", "&jnl_library_connect", "&primary_jnl_library_connect";
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
    %let hadoop_table = `&_target_name`;
    %end;
%let object_key = 0;
%if %eval(%sysfunc(exist(&lcf))) = 0 %then %do;
    %rcset(8);
    %let status_msg = Object table doesn%str(%')t exist in LCF;
    %check_status;
    %goto EndMac;
    %end;

%let ingestion_mode = all;
data _null_;
set &lcf;
where 
%if &source_library ne %then %do;
    %if &source_library ne work and &source_library ne %then %do; /* For custom code, the source will be a work view */
        lowcase(sas_lib_ref) = "&source_library"
        and
        %end;
    %end;
       lowcase(target_object_name) = "&_target_name";
array columns nk_column_names excluded_columns load_pattern_name change_capture_timestamp_column ingestion_mode
              effective_from_timestamp_column effective_to_timestamp_column duplication_timestamp_grain;
call symput('object_key', strip(putn(object_key, 'best.'))); 
do over columns;
   call symput(vname(columns), strip(lowcase(compbl(translate(columns, '  ', ',' || '09'x)))));
   end;
run;
%if &ingestion_mode = %then
    %let ingestion_mode = all;
%if &pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) %then
/*
    Full Replacement doesn't (really) require an entry in the object table. All the rest do.
*/
    %if %eval(not &object_key) %then %do;
        %rcset(8);
        %let status_msg = Target &_target_name does not exist in Object;
        %check_status;
        %goto EndMac;
        %end;
%if &load_pattern_name = batchextract %then
    %let load_pattern_name = recordbatchextract;

%if %sysfunc(compress(%sysfunc(lowcase(&pattern)), %str( ))) ne &load_pattern_name %then %do;
    %rcset(8);
    %let status_msg = &pattern does not match &lcf%str(%')s &load_pattern_name;
    %check_status;
    %goto EndMac;
    %end;
%if &HWM = Yes %then
    %goto Calculate_HWM;

%if &pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract) %then %do;
    data _null_;
    rhs = compress("&key_order", ',');
    lhs = lowcase(compbl(translate(coalescec("&nk_column_names", strip(rhs)), '  ', ',' || '09'x)));
    call symput('keys_match', ifc(lhs = rhs, 'Yes', 'No'));
    run;
    %if &keys_match = No %then %do;
        %rcset(8);
        %let status_msg = Object keys &nk_column_names are not the same as &key_cols;
        %check_status;
        %goto EndMac;
        %end;
    %end;
    
%if &duplication_timestamp_grain ne %then %do;
/*
    Although the drop-down menu in the Change Extract transformation shows the grain in words, the value passed to the 
    transformation is in seconds. Convert one to the other, and check that it matches what's in lcf.object.
*/
    %let grain_value = 0;
    data _null_;
    array grain[7] $ 15 _temporary_ ('millisecond', 'second', 'two seconds', 'half minute', 'minute', 'half hour', 'hour');
    array grain_value[7] _temporary_ (0.001, 1, 2, 30, 60, 1800, 3600);
    found = 0;
    do i = 1 to dim(grain) until(found);
       if grain[i] ne "%sysfunc(translate(&duplication_timestamp_grain, %str( ), %str(-)))" then
          continue;
       call symput('grain_value', strip(putn(grain_value[i], 'best.')));
       found = 1;
       end;
    run;
    
    %if %eval(&grain_value ne &duplication_grain) %then %do;
        %rcset(8);
        %if %eval(&grain_value = 0)
            %then %let status_msg = Invalid duplication timestamp grain in &lcf: &duplication_timestamp_grain;
            %else %let status_msg = Duplication grain value &duplication_grain (seconds) doesn%str(%')t match &lcf%str(%')s &grain_value;
        %check_status;
        %goto EndMac;
        %end;
    %end;
%if &change_capture_timestamp ne %then %do;                                 /* Compulsory column in most pattern transformations */ 
    %let columns = change_capture_timestamp effective_column to_timestamp;
    %let object_columns = change_capture_timestamp_column effective_from_timestamp_column effective_to_timestamp_column;
    %let i = 0;
    %do %until(&word =);
        %let i = %eval(&i + 1);
        %let word = %sysfunc(scan(&columns, &i, %str( )));
        %if %eval(&i > 1 and (&history_type ne H3 and &pattern ne Record Batch Extract)) %then 
            %goto TimeStamp_End;
        %if &word ne %then %do;
            %let &word = %sysfunc(lowcase(%sysfunc(dequote(&&&word))));
            %let object_result = %sysfunc(scan(&object_columns, &i, %str( )));
            %if %eval(&&&word ne &&&object_result) %then %do;
                %rcset(8);
                %let status_msg = &word &&&word doesn%str(%')t match &lcf%str(%')s &object_result &&&object_result;
                %check_status;
                %goto EndMac;
                %end;
            %end;
        %TimeStamp_End:
        %end;
    %end;

%if %quote(&excluded_columns) ne %then
    %let excluded_columns = %sysfunc(translate(&excluded_columns, %str(,), %str( )));   /* Put the commas back */
%if %eval(not(&pattern in(Full Comparison, Change Extract, Event Extract, Record Batch Extract))) %then %do;  /* Full Replacement, currently */
    %put Bypassing HWM - &=pattern;
    %goto EndMac;
    %end;
    
%Calculate_HWM:
%let stratify_load = No;
/*
    The timestamp is read here to decide on where to start reading from the source.
    Full Comparison only uses the HWM to populate the object_run table for logging. 
*/
%let _nobs = 0;
%let pjnl_nobs = 0;
%let jnl_nobs = 0;
%count(dsn=&primary_jnl_library..&_target_name, dbms=impala, debug=&debug);
%let pjnl_nobs = &_nobs;                                        /* Primary journal rows */
%let _nobs = 0;
%count(dsn=&jnl_library..&_target_name, dbms=impala, debug=&debug);
%let jnl_nobs = &_nobs;                                         /* Environment journal rows */
%let _nobs = 0;
%count(dsn=&_target_library..&_target_name, dbms=impala, debug=&debug);
%let tgt_nobs = &_nobs;                                         /* Raw schema table rows */
/*
    Previously the check was for being on or after 1 Jan 1900. Some account/customer records are pre-1900 (I know!), especially for EDW.
    There are apparently none pre-1800.
*/
%if %eval(&pjnl_nobs ne 0 and &read_primary_journal = Yes) 
    %then %let schema = &pjnl_schema;
    %else %if %eval(&jnl_nobs ne 0)
    %then %let schema = &jnl_schema;
    %else %do;
          %if %eval(&tgt_nobs = 0) %then 
              %let max_timestamp = %sysevalf('1jan1800:0:0'dt);
          %let schema = &tgt_schema;
          %end;
          
%let stratify_column_name =;
%if     &pattern in(Change Extract, Event Extract, Record Batch Extract)
    and (&pjnl_nobs = 0 or &read_primary_journal = No)
    and &HWM ne Yes %then %do;          /* The stratify dataset is not known to the HWM transformation */
/*
    Read the stratify dataset to get the stratify column name. It doesn't need to be the change capture timestamp.
*/
    data _null_;
    set &stratify_dataset;
    where object_key = &object_key;
    call symput('stratify_column_name', strip(stratify_column_name));
    stop;
    run;
    %end;
%let max_stratify_timestamp =;
proc sql noprint;
connect to &_target_engine(&_target_connect);
/*
    Because this pass-through query is picking up one *or* two summary values, depending on whether the source table has an
    entry in the stratify table, it is easier to use 'select *' instead of the columns themselves. That makes the following
    data step, which spits the reformatted values as macro variables, easier to code.
*/
create view max_timestamp_v as
   select *
     from connection to &_target_engine
     (select coalesce(
%if &pattern = Full Comparison
    %then %do;
          max(`record_effective_timestamp`)                             /* Not used - just for documentary purposes in object_run */
          %end;
    %else %if %eval(&pattern in(Event Extract, Record Batch Extract) or (&pattern = Change Extract and &history_type ne H3)) %then %do;     /* H1/H2/H4 */
          max(`&change_capture_timestamp`)
          %end;
    %else %if &pattern = Change Extract and &history_type = H3 %then %do;
          max(`&effective_column`)
          %end;
          , '1800-01-01T00:00:00') as `max_timestamp`
%if &stratify_column_name ne and &HWM ne Yes %then %do;                 
          , coalesce(max(`&stratify_column_name`), '1800-01-01T00:00:00') as `max_stratify_timestamp`
    %end;
              from &schema..&hadoop_table
%if &pattern in(Change Extract, Event Extract, Record Batch Extract) %then %do;
    where 
    %if &pattern = Change Extract and &history_type = H3 
        %then %str(`&effective_column`);         /* &effective_column is (eg) date_created for P2H3 - qv dss_external_relationships */
        %else %str(`&change_capture_timestamp`);
        <= %tslit(%sysfunc(strip(%sysfunc(datetime(), is8601dt23.0))))
    %end;
    );
%check_status;
%if %eval(&job_rc > 4) %then
    %goto EndMac;
disconnect from &_target_engine;
quit;

data _null_;
set max_timestamp_v;
call symput('max_timestamp', strip(putn(floor(ifn(max_timestamp ne '1jan1800:0:0'dt, max_timestamp - 10, max_timestamp)), '23.3')));
put 'Max timestamp = ' max_timestamp datetime23.3;
%if &stratify_column_name ne and &HWM ne Yes %then %do;
    call symput('max_stratify_timestamp', 
                strip(putn(floor(ifn(max_stratify_timestamp ne '1jan1800:0:0'dt, max_stratify_timestamp - 10, max_stratify_timestamp)), '23.3')));
    put 'Max stratify timestamp = ' max_stratify_timestamp datetime23.3;
    %end;
stop;
run;
%if &HWM = Yes %then 
    %goto EndMac;
    
%Stratify:
/*
    Stratification is only done for these patterns, and when not reading from the production journal.
*/
%if    %eval(not(&pattern in(Change Extract, Event Extract, Record Batch Extract)))
    or %eval(&pjnl_nobs ne 0 and &read_primary_journal = Yes)
    or %quote(&max_stratify_timestamp) = %then
    %goto EndMac;
%count(dsn=&stratify_dataset, 
       where=object_key = &object_key and "%timestamp_display(sas_internal=&max_stratify_timestamp, dateformat=sas)"dt le min_value);
%if %eval(&_nobs < 1) %then                            /* 0 = no entry - journal timestamp already past the highest min_value */
    %goto EndMac; 
%let stratify_load = Yes;
%if &ingestion_mode = all %then
    %let ingestion_mode = jnl;
data _null_;
set &stratify_dataset;
by object_key percentile;                    /* Force the source to be read in this order - first entry found is the earliest */
where object_key = &object_key and "%timestamp_display(sas_internal=&max_stratify_timestamp, dateformat=sas)"dt le min_value;
format min_value max_value datetime23.3;
put percentile= min_value= max_value=;
call symput('percentile', strip(putn(percentile, 'best.')));
call symput('max_range_timestamp_display', strip(putn(max_value, 'datetime23.3')));
call symput('max_range_timestamp', strip(putn(max_value, '23.3')));
call symput('stratification_timestamp', strip(putn(stratification_timestamp, '23.3')));
stop;
run;

data _percentile_&percentile;
stop;
run;
%let max_timestamp = &max_stratify_timestamp;
%put Max timestamp = %timestamp_display(sas_internal=&max_timestamp, dateformat=sas);
%EndMac:
%mend get_object_and_timestamp;