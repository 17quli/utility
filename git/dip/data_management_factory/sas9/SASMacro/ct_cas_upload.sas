%macro ct_cas_upload;

/*
Macro used by Custom Transformation "CAS Upload" to
upload a table from a CAS Library into CAS Memory  

Usage:
There are a few issues out of box transformation "Cloud Analytics Services Table Loader".  THe major one is that the CAS lib is 
hard coded in the transformation and the value remains unchanged when we migrate the jobs to another environment.   Therefore, 
this new custom transformaiton is written to resolve these issues.

Custom variables passed from the transformation:

options: This is a free text field which is used to specify all the options and properties required for proc cas load

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		1/06/2019

20/05/2020			Nataliya Alkhimova
					Added code to capture number of records loaded into CAS table into a macro varibale or_insert_cnt.
					That will be used for writing into LCF.dip_object_run_table.

*/


%if %eval(&job_rc > 4) %then %goto EXIT; 

/* Declare global variable that will capture the number of records loaded into CAS table*/
%global or_insert_cnt;
%let or_insert_cnt=.;


/* Create a work table with the same name as the target table
	if an input table is specified. */ 
%if %eval(&is_view) %then
%do;

	proc sql noprint;
	   select
	         sysvalue into:input_schema trimmed 
	   from dictionary.LIBNAMES
	      where libname = upcase("&impala_view_lib") and sysname = 'Schema'
	   ;
	%rcSet(&sqlrc);  
	quit;
	%if %eval(&job_rc > 4) %then %goto EXIT; 


	proc sql;
	   connect to  &impala_view_lib_engine
	   ( 
		  &impala_view_lib_connect
	   );  
		/* Drop the work table if it already exists. */ 
	   	execute
	   (
			drop table if exists &input_schema..&cas_upload_table;
	   ) by &impala_view_lib_engine;
		/* Create a new table from the view. */ 
	   execute
	   (
			create table &input_schema..&cas_upload_table stored as parquet
			as
			select * from &input_schema..&cas_upload_source_view;
	   ) by &impala_view_lib_engine;
	   execute
	   (
			compute stats &input_schema..&cas_upload_table;
	   ) by &impala_view_lib_engine; 
	   disconnect from &impala_view_lib_engine;
	quit;
	%if %eval(&job_rc > 4) %then %goto EXIT; 	
%end;

/* Create a unique ref for the cas session. */ 
%let cas_ref=sas9_di_%sysfunc(tranwrd(%sysfunc(uuidgen(),$36.),-,_));

/* Get the cas lib name from the dictionary. */ 
proc sql noprint;
   select
        sysvalue into:cas_lib_name trimmed
   from dictionary.LIBNAMES
      where libname = upcase("&cas_upload_lib") and sysname = 'Caslib'
   ;
quit;
%rcSet(&sqlrc);
%if %eval(&job_rc > 4) %then %goto EXIT; 

/* Save CAS session reference  */ 
%global sessref_option;
%let sessref_option=%sysfunc(getoption(SESSREF));

/* Create CAS session  */ 
cas &cas_ref &cas_upload_lib_connect;

/* Replace target table requested: Drop session table  */ 
proc casutil sessref=&cas_ref;
   droptable casdata="&cas_upload_table" incaslib="&cas_lib_name" quiet;
quit;
%rcSet(&sqlrc);
%if %eval(&job_rc > 4) %then %goto EXIT;
	
/* Replace target table requested: Drop global table  */ 
proc casutil sessref=&cas_ref;
   droptable casdata='&cas_upload_table' incaslib="&cas_lib_name" quiet;
quit;
%rcSet(&sqlrc);
%if %eval(&job_rc > 4) %then %goto EXIT;

/* PROC CASUTIL: LOAD CASDATA  */ 
proc casutil incaslib="&cas_lib_name" outcaslib="&cas_lib_name" sessref=&cas_ref;
             load casdata="&cas_upload_table"
             casout="&cas_upload_table"
             importoptions=(filetype="AUTO")
             &options;
quit;

/* Identify number of records loaded into CAS table */
ods exclude all;
ods output tableinfo=work.mytableinfo;

proc casutil;
	contents casdata="&cas_upload_table" incaslib="&cas_lib_name";
quit;

proc sql  noprint;
	select rows into :records_count
	from work.mytableinfo;
quit;

ods exclude none;

%put records_count=&records_count;
%let or_insert_cnt = %trim(&records_count);
%put or_insert_cnt=&or_insert_cnt;

%rcSet(&sqlrc);
%if %eval(&job_rc > 4) %then %goto EXIT;

/* Terminate CAS session  */ 
cas &cas_ref terminate;

/* Re-set CAS session reference  */ 
options sessref=&sessref_option.;
%let _SESSREF_=&sessref_option.;
%symdel sessref_option;

%EXIT: %mend ct_cas_upload;
