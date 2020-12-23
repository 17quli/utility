%macro refresh_libname(library_prefix=);
/*
    Name:                           Refresh Libname
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   December 2019
    Remarks:                        The Cloudera cluster unilaterally drops connections from
                                    SAS, and SAS can't detect that this has happened. By regularly
                                    calling this macro with various library references throughout the
                                    process, the libnames are forced to persist. 
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  First written
    December 2019
*/
%local word i;
%let i = 0;
/*
    Library_prefix contains something like "staging_library _target_library jnl_library primary_jnl_library",
    and this loop walks along it and resubmits the libname statements. &&&word contains the libname (eg impstg
    for the first one), &&&word.engine is always sasioimp, and &&&word.connect contains the schema (eg dev_staging).
*/
%do %until(&word =);
    %let i = %eval(&i + 1);
    %let word = %sysfunc(scan(&library_prefix, &i, %str( )));
    %if &word ne %then %do;
        libname &&&word &&&word._engine &&&word._connect;
        %check_status;
        %if %eval(&job_rc > 4) %then
            %goto EndMac;
        %end;
    %end;
%EndMac:
%mend refresh_libname;