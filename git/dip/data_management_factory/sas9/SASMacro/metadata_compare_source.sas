%macro metadata_compare_source / minoperator mindelimiter=',';
/*
    Name:                           metadata_compare
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   May 2019
    Remarks:                        Walks through metadata folders, picking out ingestion jobs' sources and targets,
                                    looking for discrepancies.
                                    
    Method:
    data _null_;                    Get the email address from the control dataset, to populate
                                    the end-of-job email.
    data folders;                   Picks out the folders (and optionally the subfolders) from
                                    the DI job's options.
    data table(keep=job_name...     Walks through the folder(s), finding the libraries and tables
                                    in the jobs, and relevant characteristics.
    %do i = 1 %to &_nobs;           For each entry in tables, call the validate macro.
*/
%local i dsid rc source_library source_table _target_library target_table _source_memtype sas_table libname debug
       mprint notes;
%let debug = No;
option nofullstimer compress=no ls=200 bufno=3000 bufsize=65535 ibufno=10000 ibufsize=32767;
%let mprint = %sysfunc(getoption(mprint));
%let notes = %sysfunc(getoption(notes));

/*
    The email address is passed on to the transformation for posting at the end of the job.
*/
data _null_;
set &_input;
where key = 'DIP_ETL_EMAIL';
call symputx('email_address', strip(value), 'g');
stop;
run;

/*
    Close any open datasets. Just in case. Because it's tidier. And then delete the
    work datasets, in case this is run more than once in a session.
*/
%do i = 1 %to 10;
    %let rc = %sysfunc(close(&i));
    %end;

proc datasets lib=work nolist nowarn mt=(data view);
delete folders table library;
quit;

/*
    Create a dataset from the folder names. If the subfolders option is set to yes, go down a
    level (if such a thing exists).
*/
data folders;
attrib root_folder folder root_uri subtree_uri asn_uri type value attr sub_value length=$ 255;
call missing(root_uri, subtree_uri, asn_uri, type, value, attr, sub_value);
%do i = 1 %to &folder_count;
    root_folder = "&&folder&i";
    folder = root_folder;
    output;
    %if &subfolders = Yes %then %do;                                  /* By default, sub-folders aren't searched */
        rc = metadata_pathobj(' ', folder, 'Folder', type, root_uri); /* Get the root uri for the folder tree */
        do i = 1 by 1 while(metadata_getnasn(root_uri, 'SubTrees', i, subtree_uri) > 0); /* Find all the sub-folders */
           rc = metadata_getattr(subtree_uri, 'Name', value);         /* Get their names, and prefix them with the parent's name */
           folder = catx('/', root_folder, value);
           output;
           end;
        %end;
   %end;
keep folder;
run;

data table(keep=job_name source_library transformation schema source_name source_libref source_engine target_library target_name target_libref)
     library(keep=library);
retain m1 -1;
set folders;
length job_name source_library source_libref source_name source_engine target_name target_library target_libref 
       member_uri uri step_uri source_uri target_uri lib_uri root_uri transformation type value name prop
       schema upasnuri id target_engine servercontext server propvalue conn_uri sub_uri sub_value
       datasrc authdomain engine $ 100
       ispreassigned $ 1
       library $ 1000;
/*
    If these variables weren't set to missing, there would be warning messages in the log. A straight SAS assignment
    is fine; however population via a function such as these requires more work.
*/
call missing(name, root_uri, uri, step_uri, source_uri, target_uri, source_name, target_name, schema, transformation,
             job_name, source_library, source_engine, target_library, lib_uri, target_libref, type, member_uri, value,
             prop, upasnuri, id, target_engine, servercontext, server, propvalue, conn_uri, sub_uri,
             authdomain, datasrc, source_libref, sub_value, ispreassigned, engine);
rc = metadata_pathobj(' ', folder, 'Folder', type, root_uri);
/*
    The only association for each folder that's required is Members. This returns the nth entry in the folder.
*/
do i = 1 by 1 while(metadata_getnasn(root_uri, 'Members', i, member_uri) > 0);
   rc = metadata_getattr(member_uri, 'PublicType', value);  /* The only public type required is Job */
   if value ne 'Job' then
      continue;
   rc = metadata_getattr(member_uri, 'Name', job_name);
   job_name = lowcase(job_name);
   rc = metadata_getnasn(member_uri, 'CustomAssociations', 1, uri); 
   n_steps = metadata_getnasn(uri, 'AssociatedObjects', 1, step_uri);   /* Find how many steps */
   rc = metadata_getnasn(uri, 'AssociatedObjects', n_steps, step_uri);  /* Read the last one */
   rc = metadata_getattr(step_uri, 'Name', transformation);
   if transformation notin('Full Replacement', 'Full Comparison', 'Change Extract', 'Event Extract') then
      continue;
   uri = step_uri;
   rc = metadata_getnasn(uri, 'Transformations', 1, step_uri);
   rc = metadata_getnasn(step_uri, 'ClassifierSources', 1, source_uri);
   rc = metadata_getattr(source_uri, 'TableName', source_name);
   call missing(source_library, target_library);
   if metadata_getnasn(source_uri, 'TablePackage', 1, lib_uri) = -4 then            /* SAS work dataset */
      continue;
   link Datasets;
   if source_engine = 'SQLSVR' then
      output table;
   end;
keep job_name source_library transformation schema source_name source_libref source_engine target_library target_name target_libref
     library;
return;

Datasets:
 rc = metadata_getattr(lib_uri, 'Name', source_library);
 rc = metadata_getnasn(lib_uri, 'UsingPackages', 1, uri);           /* Never used - should be removed */
 rc = metadata_getattr(lib_uri, 'SchemaName', schema);
 rc = metadata_getnasn(lib_uri, 'UsedByPackages', 1, uri);
 rc = metadata_getattr(uri, 'Engine', source_engine);
 if source_engine ne 'SQLSVR' then
    return;
 rc = metadata_getattr(uri, 'Name', value);
 rc = metadata_getattr(uri, 'Libref', source_libref);
 rc = metadata_getattr(uri, 'Engine', source_engine);
 rc = metadata_getattr(uri, 'Datasrc', value);
 library = catx(' ', 'libname', source_libref, source_engine);
 link LibName;
 target_libref = tranwrd(source_libref, 'str', 'p');
 target_engine = source_engine;
 target_name = source_name;
 return;

LibName:
/*
    For both source and target libraries, get all the components to reconstruct the libname statement.
    Most are represented exactly by the attributes, except for the OptionString, which contains the
    optional extras. This has to be separated from the OptionString attribute, and presented
    simply as 'subvalue', instead of 'prop = subvalue'.
*/
 call missing(ispreassigned);
 rc = metadata_getattr(uri, 'IsPreassigned', ispreassigned);
 if ispreassigned = '1' then
    return;
 rc = metadata_getnasn(uri, 'LibraryConnection', 1, conn_uri);
 rc = metadata_getattr(uri, 'Engine', engine);
 if engine ne 'SASIOIMP' then do;
    rc = metadata_getnasn(conn_uri, 'Domain', 1, sub_uri);
    rc = metadata_getattr(sub_uri, 'Name', authdomain);
    end;
 if not missing(authdomain) then
    authdomain = 'authdomain=' || quote(strip(authdomain));
 rc = metadata_getnasn(conn_uri, 'Properties', 1, sub_uri);
 rc = metadata_getattr(sub_uri, 'PropertyName', datasrc);
 rc = metadata_getattr(sub_uri, 'DefaultValue', value);
 datasrc = catx('=', datasrc, value);
 do j = 1 by 1 while(metadata_getnasn(uri, 'Properties', j, sub_uri) > 0);
    rc = metadata_getattr(sub_uri, 'PropertyName', prop);
    rc = metadata_getattr(sub_uri, 'DefaultValue', sub_value);
    if prop ne 'OptionString' 
       then prop = catx('=', prop, sub_value);
       else prop = sub_value;
    library = catx(' ', library, prop);
    end;
 library = catx(' ', library, cats('schema=', schema), datasrc, authdomain);
 output library;
 library = tranwrd(library, 'libname str', 'libname p');
 library = tranwrd(library, "Datasrc=NZO", "Datasrc=NZP");
 library = tranwrd(library, 'start_operations', 'start_prod');
 output library;
 return;
run;

proc sort data=table noequals;
by job_name;
run;

/*
    There are library references for every table. Only the unique ones need to be called. Of course.
*/
proc sort data=library noequals nodupkey;
by library;
run;
/*
    Read the library dataset to generate the libname statements.
*/
%let dsid = %sysfunc(open(library));
%do i = 1 %to %sysfunc(attrn(&dsid, nobs));
    %let rc = %sysfunc(fetchobs(&dsid, &i));
    %sysfunc(strip(%sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, library))))));            /* Issue all the libname statements */
    %check_status;
    %if %eval(&job_rc > 4) %then 
        %goto EndMac;
    %end;
%let rc = %sysfunc(close(&dsid));
%Compare:
%if &debug = No %then %do;
    option nomprint nonotes;
    %end;
/*
    Read the table dataset to call the validate macro, one table at a time. This is the same macro that's called
    within each raw loading job; the setting of variables like _source_memtype is to simulate the setup
    of each job. It does a more thorough job than the internal call of %validate inside %pattern_common_setup,
    since this job naturally picks up all source columns, not just those that have been registered in the 
    individual jobs' metadata.
*/
%let dsid = %sysfunc(open(table));
%let nobs = %sysfunc(attrn(&dsid, nobs));
%let _source_memtype = DATA;
%let task_label = Metadata Compare;
%do i = 1 %to &nobs;
    %let rc = %sysfunc(fetchobs(&dsid, &i));
    %let source_library = %sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, source_libref))));
    %let source_table = %sysfunc(lowcase(%sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, source_name))))));
    %let _source_engine = %sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, source_engine))));
    %let _target_library = %sysfunc(lowcase(%sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, target_libref))))));
    %let target_name = %sysfunc(lowcase(%sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, target_name))))));
    %let sas_table = &target_name;
    proc sql noprint;
    select name
      into :source_columns separated by ' '
      from dictionary.columns
     where libname = "%sysfunc(upcase(&source_library))"
       and lowcase(memname) = "&source_table"
       and lowcase(name) ne 'batch_key';
    select name 
      into :_staging_cols separated by ' '
      from dictionary.columns
     where libname = "%sysfunc(upcase(&_target_library))"
       and lowcase(memname) = "&target_name"
       and lowcase(name) notin('record_effective_timestamp', 'record_expiry_timestamp', 'checksum', 'record_active_flag',
                               'record_deleted_flag', 'insert_object_run_key', 'update_object_run_key', 'batch_key');
    quit;
    %validate();
    %end;
%Clear_Libname:
%if &debug = No %then %do;
    option &mprint &notes;
    %end;
%let rc = %sysfunc(close(&dsid));
%let dsid = %sysfunc(open(library));
%do i = 1 %to %sysfunc(attrn(&dsid, nobs));
    %let rc = %sysfunc(fetchobs(&dsid, &i));
    %let libname = %sysfunc(strip(%sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, library))))));
    %sysfunc(scan(&libname, 1, %str( ))) %sysfunc(scan(&libname, 2, %str( ))) clear;
    %check_status;
    %if %eval(&job_rc > 4) %then 
        %goto EndMac;
    %end;
%let rc = %sysfunc(close(&dsid));
%EndMac:
%let rc = %sysfunc(close(1));
%mend metadata_compare_source;