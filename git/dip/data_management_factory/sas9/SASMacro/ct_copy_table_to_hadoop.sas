/*
Macro used by Custom Transformation "Copy Table To Hadoop" to
fast copy a source table to a Hive database

Usage:
It copies the source table specified from the source lib to the target lib.   If the table already exists in the target database, 
it will drop and recreate the table. 

Custom variables passed from the transformation:

options: 

Source Library(src_lib): Library for the source table 

Staging Hive Library(stg_hive_lib):  Hive Library to land the data.  It is defaulted to staging Hive.  Usually you don’t need to change it. 

Staging Impala Library(stg_impala_lib):  Impala Library to land the data.  It is defaulted to staging impala.  
										Usually you don’t need to change it. 

Target Impala Library(tgt_lib):  Target library to copy the source table.  It must be an impala library. 

Source Table to Copy(src_table): Name of the source table to copy. 

Prefix Added To target name(tgt_prefix): The value to prefix to the target table name.   Please note that if the concatenated value 
										is longer than 32 characters.  It will truncate the name to 32 chars long.    

Where Clause(where_clause):  Add a where clause to filter the records to be extracted.

Select the Full Access View Schema in Impala(vw_schema):  Specify a value if you want to create a full access security view for the table.

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		1/12/2019
06/04/2020 Nalaka Lamahewa added call to generate metadata for SAS source tables 

*/

%macro  ct_copy_table_to_hadoop;
		
	%local orig_tgt_table tgt_table stgTableExists tgtTableExists stg_schema tgt_schema;
	%global or_insert_cnt;

	/* Check if there is an input table specified and update the source table name accordingly */
	%if %eval(&_INPUT_count = 1) %then
	%do;
		%let input_table = %nrbquote(&_INPUT);
		%let src_lib_engine=&_INPUT_engine;
		%let src_lib_connect=&_INPUT_connect;
		%let src_lib = %sysfunc(scan(&_INPUT,1,"."));
		%if &src_table=%str() %then
		%do;
			%let src_table = %sysfunc(scan(&_INPUT,2,"."));
		%end; 
	%end;
	%else
	%do;
		%let input_table = %nrbquote(&src_lib..&src_table);
	%end;

	/* Modify the target table name based on prefix and SAS length limit.*/
	%if &tgt_prefix=%str() %then
		%let orig_tgt_table = &src_table;		
	%else
		%let orig_tgt_table = %sysfunc(cats(&tgt_prefix,&src_table));	

	%if %eval(%sysfunc(length(&orig_tgt_table)) > 32) %then
	%do;
		%let tgt_table = %sysfunc(substr(&orig_tgt_table,1,32));
	%end;
	%else 
	%do;
	   %let tgt_table=&orig_tgt_table; 
	%end;

	/* Modify the view name based on prefix and SAS length limit.*/

	%if &tgt_prefix = %str() %then
	%do;
	   %let tgt_prfx=%sysfunc(reverse(%sysfunc(substr(%sysfunc(reverse(&src_lib.)),1,3))));
       %let tgt_view=%lowcase(&tgt_prfx._&tgt_table);
	%end;
	%else 
	%do;
	    %let tgt_view=%lowcase(&tgt_table);
	%end;

	/* Format the where clause value. */
	%if &where_clause = %str() %then
		%let full_where_clause =;
	%else
		%let full_where_clause = %nrbquote(where &where_clause);

	/* Drop the staging and target tables if they exist. */
	%let stgTableExists = %eval(%sysfunc(exist(&stg_impala_lib..&tgt_table, DATA))); 
	%let tgtTableExists = %eval(%sysfunc(exist(&tgt_lib..&tgt_table, DATA))); 
		
	%if %eval(&stgTableExists) %then
	%do;
		proc sql;
			drop table &stg_impala_lib..&tgt_table ;
		quit;	
		%rcSet(&sqlrc);
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end;
		
	%if %eval(&tgtTableExists and ^&truncate_load) %then
	%do;
		proc sql;
			drop table &tgt_lib..&tgt_table;
		quit;	
		%rcSet(&sqlrc);
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end;

	
	/* Get the staging and taget hive db names. */
	proc sql noprint;
	   select
	         sysvalue into:stg_schema trimmed 
	   from dictionary.LIBNAMES
	      where libname = upcase("&stg_impala_lib") and sysname = 'Schema'
	   ;
	quit;
	%rcSet(&sqlrc);
	%if %eval(&job_rc > 4) %then %goto EXIT; 
		
	proc sql noprint;
	   select
	         sysvalue into:tgt_schema trimmed 
	   from dictionary.LIBNAMES
	      where libname = upcase("&tgt_lib") and sysname = 'Schema'
	   ;
	quit;
	%rcSet(&sqlrc);
	%if %eval(&job_rc > 4) %then %goto EXIT; 

	%if %eval(&src_lib_engine=) %then
	%do;
		%let src_lib_engine=SAS;
	%end;

 
	%if %eval(^&truncate_load or ^&tgtTableExists) %then
	%do;	
		/* Create the target table with explicity type mappings if the source is Oracle or SQL server. */
		%if %eval(&src_lib_engine = SQLSVR or &src_lib_engine = ORACLE or &src_lib_engine = SAS) %then
		%do;
			%create_target_table(src_engine=&src_lib_engine, src_connect =%nrbquote(&src_lib_connect),src_table=&src_table,
					tgt_engine=&tgt_lib_engine, tgt_connect=%nrbquote(&tgt_lib_connect),tgt_schema=&tgt_schema,tgt_table=&tgt_table);
			%rcSet(&sqlrc);
		%end;
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end;

	/* Create the staging table from the target table if the source is Oracle or SQL server. */
   	%if %eval(&src_lib_engine = SQLSVR or &src_lib_engine = ORACLE or &src_lib_engine = SAS) %then
	%do;
			proc sql;
		   connect to  &stg_impala_lib_engine
		   ( 
			  &stg_impala_lib_connect
		   ); 
		   	execute
		   (
				create table  &stg_schema..&tgt_table
				with SERDEPROPERTIES ('field.delim'='\u0006', 'line.delim'='\007', 'serializataion.format'='\u0006')
				STORED AS TEXTFILE
				as
				select *
				from  &tgt_schema..&tgt_table
				where 1=0
				;
		   ) by &stg_impala_lib_engine;
		   disconnect from &stg_impala_lib_engine;
		   quit; 
   %end;
	/* Create the staging table from the source table if the source is not Oracle or SQL server. */
   %else
   %do;
		proc sql;
		create table &stg_impala_lib..&tgt_table
		(  
		  DBCREATE_TABLE_OPTS = %unquote("WITH SERDEPROPERTIES ('field.delim'='\u0006', 'line.delim'='\007', 'serialization.format'='\u0006') STORED AS TEXTFILE") 
		)
		as 
		select * 
		from &input_table where 1=0;
		quit;
   %end;
	%rcSet(&sqlrc);
	%if %eval(&job_rc > 4) %then %goto EXIT;


	/* Load data to the staging table from the source table. */
	proc sql;
	insert into &stg_hive_lib..&tgt_table
	(   
		   Bulkload = Yes
	)
	select * 
	from &input_table
	%unquote(&full_where_clause);
	quit;
	%rcSet(&sqlrc);
	%if %eval(&job_rc > 4) %then %goto EXIT; 
	%let or_insert_cnt = &sqlobs;

	
	proc sql;
	   connect to  &stg_impala_lib_engine
	   ( 
		  &stg_impala_lib_connect
	   );    
	   	execute
	   (
			invalidate metadata &stg_schema..&tgt_table;
	   ) by &stg_impala_lib_engine; 
		execute
	   (
			refresh &stg_schema..&tgt_table;
	   ) by &stg_impala_lib_engine; 
	   /* Insert data into the target table if the source is Oracle or SQL server. */
		%if %eval(&src_lib_engine = SQLSVR or &src_lib_engine = ORACLE or &src_lib_engine = SAS or (&truncate_load and &tgtTableExists) ) %then
		%do;
		   execute
		   (
				insert overwrite &tgt_schema..&tgt_table
				select * from &stg_schema..&tgt_table;
		   ) by &stg_impala_lib_engine;
		%end;
	    /* Create the traget table with data from the staging table if the source is not Oracle or SQL server. */
		%else %do;
		   execute
		   (
				create table &tgt_schema..&tgt_table stored as parquet
				as
				select * from &stg_schema..&tgt_table;
		   ) by &stg_impala_lib_engine;
		%end;
       execute
	   (
			compute stats &tgt_schema..&tgt_table;
	   ) by &stg_impala_lib_engine; 
	   execute
	   (
			drop table if exists &stg_schema..&tgt_table
	   ) by &stg_impala_lib_engine; 
	   disconnect from &stg_impala_lib_engine;
	quit;

%EXIT: 
%mend ct_copy_table_to_hadoop;
