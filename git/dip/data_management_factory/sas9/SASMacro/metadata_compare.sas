%macro metadata_compare / minoperator mindelimiter=',';
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
    
    Modification History            (in reverse chronological order)
    Laurie Fleming                  Put names of problem tables in the generated email (populated in validate)
    9 April 2020
 
    Laurie Fleming                  Read lcf.object to pull out excluded_columns, so they are not
    6 March 2020                    reported upon.
    
    Laurie Fleming                  First written
    May 2019
*/
%local i dsid rc source_library source_table _target_library target_table _source_memtype sas_table
       excluded_columns;
%global warning_tables error_tables;
%let warning_tables = :;
%let error_tables = :;
option nofullstimer compress=no ls=200 bufno=3000 bufsize=65535 ibufno=10000 ibufsize=32767;

/*
    The email address is passed on to the transformation for posting at the end of the job.
*/
data _null_;
set &_dip_config;
where key = 'DIP_ETL_EMAIL_INTERNAL';
call symputx('email_address', strip(value), 'g');
stop;
run;

data object(index=(target_object_name / unique) compress=binary);
set &_object(keep=target_object_name excluded_columns);
where excluded_columns is not null;                                 /* Excluded columns - those not to be checked for mapping in the target */
target_object_name = lowcase(target_object_name);
excluded_columns = lowcase(compbl(translate(excluded_columns, '  ', ',' || '09'x)));
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
           if find(lowcase(value), 'template') then
              continue;
           folder = catx('/', root_folder, value);
           output;
           end;
        %end;
   %end;
keep folder;
run;

data table(keep=job_name source_library transformation schema source_name source_libref source_engine target_library 
                target_name target_libref column_names excluded_columns
           compress=binary)
     library(keep=library);
retain m1 -1;
set folders;
length job_name source_library source_libref source_name source_engine target_name target_library target_libref 
       member_uri uri step_uri source_uri target_uri lib_uri root_uri transformation type value name prop
       schema upasnuri id target_engine servercontext server propvalue conn_uri sub_uri sub_value
       datasrc authdomain engine column_uri $ 100
       column_name $ 32
       ispreassigned $ 1
       library $ 1000
       column_names excluded_columns $ 32767;
/*
    If these variables weren't set to missing, there would be warning messages in the log. A straight SAS assignment
    is fine; however population via a function such as these requires more work.
*/
call missing(name, root_uri, uri, step_uri, source_uri, target_uri, source_name, target_name, schema, transformation,
             job_name, source_library, source_engine, target_library, lib_uri, target_libref, type, member_uri, value,
             prop, upasnuri, id, target_engine, servercontext, server, propvalue, conn_uri, sub_uri, column_uri, column_name,
             authdomain, datasrc, source_libref, sub_value, ispreassigned, engine, column_names);
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
%*   if job_name ne: 'app_tblnz_accpso' then
      continue;
   rc = metadata_getnasn(member_uri, 'CustomAssociations', 1, uri); 
   n_steps = metadata_getnasn(uri, 'AssociatedObjects', 1, step_uri);   /* Find how many steps */
   rc = metadata_getnasn(uri, 'AssociatedObjects', n_steps, step_uri);  /* Read the last one */
   rc = metadata_getattr(step_uri, 'Name', transformation);
   if transformation notin('Full Replacement', 'Full Comparison', 'Change Extract', 'Event Extract', 'Record Batch Extract') then
      continue;
   uri = step_uri;
   rc = metadata_getnasn(uri, 'Transformations', 1, step_uri);
   rc = metadata_getnasn(step_uri, 'ClassifierSources', 1, source_uri);
   rc = metadata_getattr(source_uri, 'TableName', source_name);
   call missing(source_library, target_library);
   if metadata_getnasn(source_uri, 'TablePackage', 1, lib_uri) = -4 then            /* SAS work dataset */
      continue;
   link Datasets;
   set object(rename=target_object_name=target_name)                     /* Look up the object table for excluded columns */
       key=target_name / unique;
   if _iorc_ then do;
      _iorc_ = 0;
      _error_ = 0;
      call missing(excluded_columns);
      end;
   output table;
   end;
keep job_name source_library transformation schema source_name source_libref source_engine target_library target_name target_libref
     library column_names excluded_columns;
return;

Datasets:
 call missing(column_names);
 do j = 1 by 1 while(metadata_getnasn(source_uri, 'Columns', j, column_uri) > 0);
    rc = metadata_getattr(column_uri, 'ColumnName', column_name);
    column_names = catx(' ', column_names, lowcase(column_name));
    end;
 rc = metadata_getattr(lib_uri, 'Name', source_library);
 rc = metadata_getnasn(lib_uri, 'UsingPackages', 1, uri);           /* Never used - should be removed */
 rc = metadata_getattr(lib_uri, 'SchemaName', schema);
 rc = metadata_getnasn(lib_uri, 'UsedByPackages', 1, uri);
 rc = metadata_getattr(uri, 'Name', value);
 rc = metadata_getattr(uri, 'Libref', source_libref);
 rc = metadata_getattr(uri, 'Engine', source_engine);
 rc = metadata_getattr(uri, 'Datasrc', value);
 library = catx(' ', 'libname', source_libref, source_engine);
 link LibName;
 call missing(prop, value, authdomain);
 rc = metadata_getnasn(step_uri, 'ClassifierTargets', 1, target_uri);
 rc = metadata_getattr(target_uri, 'TableName', target_name);
 rc = metadata_getnasn(target_uri, 'TablePackage', 1, lib_uri);
 rc = metadata_getattr(lib_uri, 'Name', target_library);
 rc = metadata_getnasn(lib_uri, 'UsedByPackages', 1, uri);
 rc = metadata_getattr(uri, 'Libref', target_libref);
 rc = metadata_getattr(uri, 'Engine', target_engine);
 rc = metadata_getnasn(uri, 'UsingPackages', 1, sub_uri);
 rc = metadata_getattr(sub_uri, 'SchemaName', schema);
 library = catx(' ', 'libname', target_libref, target_engine);
 link LibName;
 if library =: 'libname Class' then do;
    put job_name=;
    stop;
    end;
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
    %check_status
    %if %eval(&job_rc > 4) %then 
        %goto EndMac;
    %end;
%let rc = %sysfunc(close(&dsid));
/*
    Read the table dataset to call the validate macro, one table at a time. This is the same macro that's called
    within each raw loading job; the setting of variables like _source_memtype is to simulate the setup
    of each job. It does a more thorough job than the internal call of %validate inside %pattern_common_setup,
    since this job naturally picks up all source columns, not just those that have been registered in the 
    individual jobs' metadata. (However "excluded_columns" processing is performed on them)
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
    %let source_columns = %sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, column_names))));
    %let excluded_columns = %sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, excluded_columns))));
    %let _staging_cols = &source_columns;
    %let sas_table = &target_name;
    %put &target_name;
    %if &excluded_columns ne %then
        %let excluded_columns = %sysfunc(translate(&excluded_columns, %str(,), %str( )));   /* Put the commas back */
    %validate()
    %end;
%let rc = %sysfunc(close(&dsid));
%EndMac:
%put &=warning_tables;
%if %quote(&warning_tables) ne : %then
    %let warning_tables = %sysfunc(substr(&warning_tables, 5));
%if &error_tables ne %str(:) %then
    %let error_tables = %sysfunc(substr(&error_tables, 5));
%let rc = %sysfunc(close(1));
%mend metadata_compare;