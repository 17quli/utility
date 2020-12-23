%macro ct_impala_table_loader;


/*

Macro used by Custom Transformation to load an input table to the output tables in one 
of the following approaches:

Replace Partition – It will replace the partition value specified with the input 
					table with the same filtering criterial and insert other records in 
					the other partition value specified. 
Replace Table – It first renames the target table with the prefix _old, and then renames 
				the input table as the target table. Finally, it drops the _old table.
Insert Only – It will insert all the records from the source table to the target.
Truncate Load – The target table will be truncated before new records are inserted. 

(Note: If the target table doesn’t exist in the database yet, it will create the table 
based on the source table definition.)

Options: 

Commit Type(commit_type): 1 – Replace Parition, 2 – Replace Table, 3 – Insert Only and 4 – Truncate Load.
Partition Column(partition_col): The name of the partition column when ‘Replace Partition’ is selected.   
Partition Value(partition_val): The value of the partition which will be dropped and replaced when 
								‘Replace Partition’ is selected.   
Partition Value Datatype(partition_date_type): The data type of the partition column when 
							‘Replace Partition’ is selected.   
The Other Partition Value To Refresh(other_value): The value of the other partition which we also want to 
							insert new records into with a filter (e.g. where record_active_flag = ‘N’) 
							when ‘Replace Partition’ is selected.  

Where Clause(where_clause):  Filtering criteria applied to the input table only available for insert only and truncate load).

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		15/07/2019

*/

	%local partition_col_fmt insert_others_stmt full_where_clause imp_buffer_limit;
	%global or_insert_cnt;
		
	%if %eval(&job_rc > 4) %then %goto EXIT;

	/* retrieve the refined impala buffer limit for the environment */
	proc sql noprint;
		select value
		into :imp_buffer_limit trimmed 
		from lcf.DIP_CONFIG
		where key="IMPALA_BUFFER_LIMIT_REFINED";
	quit;
	%rcSet(&sqlrc);
	
	%if %eval(&job_rc > 4) %then %goto EXIT; 	
	
	%dip_ct_prep_cols(ignore_cols=%nrbquote('&partition_col'));

	%if %eval(&job_rc > 4) %then %goto EXIT; 

	/* Prepare the where clause statement for type 2 and type 3 outter where clause. */
	%if &where_clause = %str() %then
		%let full_where_clause =  ;				
	%else
		%let full_where_clause =  %nrbquote(where &where_clause);

	/* Replace parition */		
	%if %eval(&commit_type =  1)  %then
	%do;
		%let partition_col_fmt = %sysfunc(cats(`,&partition_col,`));

		proc sql noprint;
		connect to &_OUTPUT0_engine(&_OUTPUT0_connect);
		execute (
			set buffer_pool_limit=&imp_buffer_limit;
		)	
		by &_INPUT0_engine;	
		/* create the table if it doesn't exists. */
		execute (
			create table if not exists &output_table partitioned by (&partition_col_fmt) stored as parquet as
			select &mapped_cols_fmt,&partition_col_fmt
			from &input_schema..&input_table limit 0;
		)
		by &_OUTPUT0_engine;
		/* Drop the existing partition. */		
		execute (
			alter table &output_schema..&output_table drop if exists partition (&partition_col_fmt=&partition_val);
		)
		by &_OUTPUT0_engine;
		/* Insert the new partition. */				
		execute (
			insert into &output_schema..&output_table 
			partition(&partition_col_fmt=cast(&partition_val as &partition_data_type))
			select &mapped_cols_fmt from &input_schema..&input_table
			where &partition_col_fmt=&partition_val;
		)
		by &_OUTPUT0_engine;
		/* Refresh the other partition. */						
		execute (
			insert into &output_schema..&output_table 
			partition(&partition_col_fmt=cast(&other_value as &partition_data_type))
			select &mapped_cols_fmt from &input_schema..&input_table
			where &partition_col_fmt=&other_value;
		)
		by &_OUTPUT0_engine;		
		/* Compute stats. */						
		execute (
			compute stats &output_table;
		)
		by &_OUTPUT0_engine;
		disconnect from &_OUTPUT0_engine;
		quit;
		%rcSet(&sqlrc);
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end;

	/* Replace table. */
	%if %eval(&commit_type =  2)  %then
	%do;	

		proc sql noprint;
		connect to &_OUTPUT0_engine(&_OUTPUT0_connect);
		execute (
			set buffer_pool_limit=&imp_buffer_limit;
		)	
		by &_INPUT0_engine;	
		/* create the table if it doesn't exists. */
		execute (
			create table if not exists &output_table stored as parquet as
			select &mapped_cols_fmt from &input_schema..&input_table limit 0;
		)
		by &_OUTPUT0_engine;
		/* Rename the current table to old. */						
		execute (
			alter table &output_table rename to &output_table._old;
		)
		by &_OUTPUT0_engine;
		/* Rename the new table to the original. */						
		execute (
			alter table &input_schema..&input_table rename to &output_table;
		)
		by &_OUTPUT0_engine;
		/* Compute stats. */						
		execute (
			compute stats &output_table;
		)
		by &_OUTPUT0_engine;
		/* Drop the old table. */								
		execute (
			drop table &output_table._old;
		)
		by &_OUTPUT0_engine;
		disconnect from &_OUTPUT0_engine;
		quit;
		%rcSet(&sqlrc);
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end;
	
	/* Insert only and Truncate load. */
	%if %eval(&commit_type = 3 or &commit_type = 4)  %then
	%do;	
	
		proc sql noprint;
		connect to &_OUTPUT0_engine(&_OUTPUT0_connect);
		execute (
			set buffer_pool_limit=&imp_buffer_limit;
		)	
		by &_INPUT0_engine;	
		/* Create the table if it doesn't exist. */		
		execute (
			create table if not exists &output_table stored as parquet as
			select &mapped_cols_fmt from &input_schema..&input_table limit 0;
		)
		by &_OUTPUT0_engine;
		/* Truncate the table if it is a truncate load. */		
		%if %eval(&commit_type = 4)  %then
		%do;
			execute (
				truncate table &output_table;
			)
			by &_OUTPUT0_engine;			
		%end;
		/* Truncate the table if it is a truncate load. */		
		execute (
			insert into &output_table 
			select &mapped_cols_fmt from &input_schema..&input_table
			&full_where_clause;
		)
		by &_OUTPUT0_engine;
		/* Compute stats. */				
		execute (
			compute stats &output_table;
		)
		by &_OUTPUT0_engine;	
		disconnect from &_OUTPUT0_engine;
		quit;
		%rcSet(&sqlrc);
		%if %eval(&job_rc > 4) %then %goto EXIT;
	%end;

	%if %eval(&commit_type =  2)  %then
	%do;
		proc sql noprint;
		   select
		         count(1) into:or_insert_cnt trimmed 
		   from &_OUTPUT
		   ;
		   %rcSet(&sqlrc);
		quit;
	%end;
	%else
	%do;
		proc sql noprint;
		   select
		         count(1) into:or_insert_cnt trimmed 
		   from &_INPUT
		   ;
		   %rcSet(&sqlrc);
		quit;
	%end;


%EXIT: 
%mend ct_impala_table_loader;