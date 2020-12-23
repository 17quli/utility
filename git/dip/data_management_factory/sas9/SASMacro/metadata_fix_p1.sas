%macro metadata_fix_p1 / minoperator mindelimiter=',';
/*
    Name:                           metadata_fix_p1
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   18 October 2019
    Remarks:                        Walks through metadata folders, picking out jobs' Impala targets
                                    for the Full Comparison pattern, and readjusting the initial 
                                    record_effective_timestamp where necessary.
    Based on:                       metadata_compare.sas
                                    
    Method:
    data _null_;                    Get the email address from the control dataset, to populate
                                    the end-of-job email. (Generic - not used by this process)
    data folders;                   Picks out the folders (and optionally the subfolders) from
                                    the DI job's options.
    data table(keep=job_name...     Walks through the folder(s), finding the libraries and tables
                                    in the jobs, and relevant characteristics.
    %do i = 1 %to &_nobs;           For each entry in tables, call the fix_p1 macro.
    
    Modification History            (in reverse chronological order)
    Laurie Fleming                  Correct extraction of natural key columns from the transformation
    11 May 2020                     to allow patching of first appearance of all natural keys, not just
                                    original ones.
                                    
    Laurie Fleming                  First written.
    18 October 2019
*/
%local i dsid rc source_library source_table _target_library target_table sas_table log lcf_schema
       task_label;
option nofullstimer compress=no ls=200 bufno=3000 bufsize=65535 ibufno=10000 ibufsize=32767;

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

data table(keep=job_name transformation target_library schema target_name target_libref key_columns
           compress=binary);
set folders;
array strings[*] $ 255 job_name target_name target_library target_libref attribute
       member_uri uri step_uri source_uri target_uri lib_uri root_uri transformation type value name prop
       schema id target_engine servercontext server conn_uri trans_uri sub_uri sub_value 
       substep_uri1-substep_uri3 value1-value2
       datasrc authdomain engine;
length ispreassigned $ 1
       library key_columns $ 32767;
/*
    If these variables weren't set to missing, there would be warning messages in the log. A straight SAS assignment
    is fine; however population via a function such as these requires more work.
*/
call missing(of strings[*], ispreassigned, library, key_columns);
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
   if reverse(strip(job_name)) ne: '1p' then
      continue;
%*   if job_name ne: 'ref_lannz_' then
      continue;
   rc = metadata_getnasn(member_uri, 'CustomAssociations', 1, uri); 
   n_steps = metadata_getnasn(uri, 'AssociatedObjects', 1, step_uri);   /* Find how many steps */
   rc = metadata_getnasn(uri, 'AssociatedObjects', n_steps, step_uri);  /* Read the last one */
   rc = metadata_getattr(step_uri, 'Name', transformation);
   if transformation ne 'Full Comparison' then
      continue;
   link Keys;
   uri = step_uri;
   call missing(target_library);
   rc = metadata_getnasn(step_uri, 'Transformations', 1, trans_uri);
   rc = metadata_getnasn(trans_uri, 'ClassifierTargets', 1, target_uri);
   rc = metadata_getattr(target_uri, 'TableName', target_name);
   rc = metadata_getnasn(target_uri, 'TablePackage', 1, lib_uri);
   rc = metadata_getattr(lib_uri, 'Name', target_library);
   rc = metadata_getnasn(lib_uri, 'UsedByPackages', 1, lib_uri);
   rc = metadata_getattr(lib_uri, 'Libref', target_libref);
   rc = metadata_getattr(lib_uri, 'Engine', target_engine);
   rc = metadata_getnasn(lib_uri, 'UsingPackages', 1, sub_uri);
   rc = metadata_getattr(sub_uri, 'SchemaName', schema);
   schema = tranwrd(schema, 'raw', 'jnl');
   output;
   end;
call symput('schema', strip(schema));
keep job_name transformation target_library schema target_name target_libref key_columns;
return;

Keys:
 call missing(key_columns);
 do j = 1 by 1 while(metadata_getnasn(step_uri, 'PropertySets', j, substep_uri1) > 0);
    rc = metadata_getattr(substep_uri1, 'Name', value1);
    if value1 ne 'MACROOPTIONS' then
       continue;
    do k = 1 by 1 while(metadata_getnasn(substep_uri1, 'Properties', k, substep_uri2) > 0);
       rc = metadata_getattr(substep_uri2, 'PropertyName', value1);
       rc = metadata_getattr(substep_uri2, 'Name', value2);
       if not(value1 = 'ep_key_cols' and value2 in:('Key columns', 'Natural')) then
          continue;
       rc = metadata_getnasn(substep_uri2, 'SpecTargetTransformations', 1, substep_uri2);
       do l = 1 by 1 while(metadata_getnasn(substep_uri2, 'SourceSpecifications', l, substep_uri3) > 0);
          rc = metadata_getnasn(substep_uri3, 'TargetFeatureMaps', 1, substep_uri3);
          rc = metadata_getattr(substep_uri3, 'Name', value1);
          key_columns = catx(' ', key_columns, lowcase(value1));
          end;
       end;
    end;
 return;
run;
 
proc sort data=table noequals;
by job_name;
run;
/*
    Read the table dataset to call the fix_p1 macro, one table at a time.
*/
libname impraw impala DBMAX_TEXT=32767 DATABASE=&schema DSN=ClouderaImpala64;

%let log = %qsysfunc(getoption(log));
%let dsid = %sysfunc(open(table));
%let nobs = %sysfunc(attrn(&dsid, nobs));
%let rc = %sysfunc(fetchobs(&dsid, 1));
%if &override_object_run_env = Yes
    %then %let lcf_schema = prod_raw;
    %else %let lcf_schema = &schema;
%do i = 1 %to &nobs;
    %let rc = %sysfunc(fetchobs(&dsid, &i));
    %let _target_library = %sysfunc(lowcase(%sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, target_libref))))));
    %let target_name = %sysfunc(lowcase(%sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, target_name))))));
    %let key_columns = %sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, key_columns))));
    %fix_p1(table=&target_name, key=&key_columns, schema=&schema);
    %if %eval(&job_rc > 4) %then
        %goto EndMac;
    %end;
%let rc = %sysfunc(close(&dsid));
%EndMac:
%let rc = %sysfunc(close(1));
%mend metadata_fix_p1;