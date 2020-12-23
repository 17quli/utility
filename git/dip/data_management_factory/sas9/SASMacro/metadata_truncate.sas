%macro metadata_truncate / minoperator mindelimiter=',';
/*
    Name:                           metadata_truncate
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   18 October 2019
    Remarks:                        Walks through metadata folders, picking out jobs' Impala targets,
                                    and truncating them.
    Based on:                       metadata_compare.sas
                                    
    Method:
    data _null_;                    Get the email address from the control dataset, to populate
                                    the end-of-job email.
    data folders;                   Picks out the folders (and optionally the subfolders) from
                                    the DI job's options.
    data table(keep=job_name...     Walks through the folder(s), finding the libraries and tables
                                    in the jobs, and relevant characteristics.
    %do i = 1 %to &_nobs;           For each entry in tables, call the check_timestamps macro.
*/
%local i dsid rc source_library source_table _target_library target_table _source_memtype sas_table;
option nofullstimer compress=no ls=200 bufno=3000 bufsize=65535 ibufno=10000 ibufsize=32767;

/*
    The email address is passed on to the transformation for posting at the end of the job.
*/
/*
data _null_;
set &_input;
where key = 'DIP_ETL_EMAIL';
call symputx('email_address', strip(value), 'g');
stop;
run;
*/
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

data table(keep=job_name transformation target_library schema target_name target_libref 
           compress=binary);
retain m1 -1;
set folders;
array strings[*] $ 255 job_name target_name target_library target_libref attribute
       member_uri uri step_uri source_uri target_uri lib_uri root_uri transformation type value name prop
       schema id target_engine servercontext server conn_uri trans_uri sub_uri sub_value 
       substep_uri1-substep_uri3 value1-value2
       datasrc authdomain engine;
length ispreassigned $ 1;
/*
    If these variables weren't set to missing, there would be warning messages in the log. A straight SAS assignment
    is fine; however population via a function such as these requires more work.
*/
call missing(of strings[*], ispreassigned);
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
   rc = metadata_getnasn(step_uri, 'AssociatedObjects', n_steps, step_uri);  /* Read the last one */
   rc = metadata_getattr(step_uri, 'Name', transformation);
   if transformation notin('Full Comparison', 'Change Extract') then
      continue;
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
   output;
   end;
run;

proc sort data=table noequals;
by job_name;
run;

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
proc sql;
connect to impala(SCHEMA=dev_raw DSN=ClouderaImpala64);
%do i = 1 %to &nobs;
    %let rc = %sysfunc(fetchobs(&dsid, &i));
    %let _target_library = %sysfunc(lowcase(%sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, target_libref))))));
    %let target_name = %sysfunc(lowcase(%sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, target_name))))));
    %let schema = %sysfunc(getvarc(&dsid, %sysfunc(varnum(&dsid, schema))));
    execute (truncate table &schema..&target_name)
       by impala;
    %end;
disconnect from impala;
quit;
%let rc = %sysfunc(close(&dsid));
%EndMac:
%let rc = %sysfunc(close(1));
%mend metadata_truncate;