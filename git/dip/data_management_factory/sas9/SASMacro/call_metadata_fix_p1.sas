/*
    Name:                           call_metadata_fix_p1
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   14 Feb 2020 
    Remarks:                        Walks through metadata folders, picking out jobs' Impala targets
                                    for the Full Comparison pattern, and readjusts the initial 
                                    record_effective_timestamp where necessary.
                                    The fancy stuff is in metadata_fix_p1. This code is simply a wrapper 
                                    for setting up the environment and executing it - based on generic
                                    DI initialisation code. 

                                    If the data in a non-production environment has been copied from production,
                                    set override_object_run_env = Yes;

                                    This code can be ran in any environment provided the "schema" has been defined.

    Based on:                       metadata_compare.sas
*/
%global schema override_object_run_env;
%let schema =;                      /* Set this to the schema where the table is to be updated. For example, prod_raw */
%let override_object_run_env = Yes; /* If the data in a non-production environment has been copied from production, set override_object_run_env = Yes
                                    otherwise set override_object_run_env =  anything other than Yes*/
option nofullstimer mprint notes;
/* Setup to capture return codes  */ 
%global job_rc trans_rc sqlrc;
%let sysrc = 0;
%let job_rc = 0;
%let trans_rc = 0;
%let sqlrc = 0;
%global etls_stepStartTime; 
/* initialize syserr to 0 */ 
data _null_; run;

%macro rcSet(error); 
   %if (&error gt &trans_rc) %then 
      %let trans_rc = &error;
   %if (&error gt &job_rc) %then 
      %let job_rc = &error;
%mend rcSet; 
%let status_msg =;
%let trans_rc = 0;
%let etls_stepStartTime = %sysfunc(datetime(), datetime20.); 

%let SYSLAST = %nrquote(lcf.DIP_CONFIG); 

%let _INPUT_count = 1; 
%let _INPUT = lcf.DIP_CONFIG;

%let _INPUT0 = lcf.DIP_CONFIG;

%let _OUTPUT_count = 0; 

%let folder = %nrquote(/IRD/DIP Data Management/5000 Processes/10 Raw Ingestion/10 Raw Ingestion Prod);
%let folder_count = %nrquote(1);
%let folder1 = %nrquote(/IRD/DIP Data Management/5000 Processes/10 Raw Ingestion/10 Raw Ingestion Prod);
%let subfolders = %nrquote(No);
%let debug = %nrquote(Yes);
%timer;
%metadata_fix_p1;
%timer;
