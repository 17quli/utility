%macro  ct_impala_filter;

/*
Macro used by Custom Transformation "Impala Filter" to  to filter records that are not needed for the refined build 
and capture changes for incremental loads.

Usage:
The first input of this transformation should be the source raw table and the second input is the main target table 
which the changes are applied to.   The second input is mainly used to define the high watermark column.    

Options: 

Where Clause(where_clause):  Filtering criteria applied to the first input table (in Impala syntax).

Incremental Type(incremental_type):
	Capture All Changes - Capture all changes above the high watermark. 
		Check HWM record counts between source and target?(check_hwm_diff) 
			Update Batch Key Column(update_batch_col):  This option should be used if we use > as HWM because we want to check there are no new later arriving 
														records at the hwm timestamp.

	Capture changes with wininng candidates – This option first captures all changes above hwm  and then it will go back to raw to extract
											all values of the same NKs to ensure a correct new winner is picked if the existing one is ceased.
					
	!!Initial Load for both incremental types: It ignores the target raw table and the change capture logic.  
	It will extract everything from the raw table with the filtering criteria

Source Effective Column(source_effective_col):  The source timestamp column to filter changes.
Target Effective Column(target_effective_col):  The target timestamp column to derive HWM.

High Watermark Comparison Operator(hwm_operator):   could be be ">" or ">="

Restore Backup Table(restore_backup):  Select Yes to restore the backup table if the commit type is “Replace Table”
								Backup Table Suffix(old_table_suffix): If yes is selected, specify the suffix for the backup table.

Use Global Config for Days to Backfill(use_gc_days_backfill): 
			Yes to use the value in DIP_CONFIG. 
			No to specify a custom value.
				Days To Backfill(days_to_backfill):	The custom value for days to backfill.

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		5/07/2019


*/

	/* This is passed to dip_object_run to abort the process explicitly */
	%global dip_manual_abort;
	%local src_effective_col_fmt tgt_effective_col_fmt  oldTableExists origTableExists 
	orig_table_cnt old_table_cnt rollback_stmt full_where_clause vars create_vars_stmt 
	new_src_effective_col_fmt hwm_batch_count hwm_value backfill_stmt record_effective_from_fmt record_effective_col_stmt
	record_effective_to_fmt ignore_key_cols type2_where_clause business_commence_fmt crw_update_ts_stmt check_hwm_stmt
	imp_buffer_limit;


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
	

	/* change to incremental type to 3 if nk count > 0 */
	%if %eval(&key_cols_count > 0 and &incremental_type = 1) %then
		%let incremental_type = 3;

			
	/* Throw an error if incremental type to 2 if nk count = 0 */
	%if &key_cols_count = 0 and &incremental_type = 2 %then
	%do;
			%put ERROR: at least 1 natural key column is required for the selected incremental type;
			%let job_rc = 5;
			%let sysrc = 2;
			%let dip_manual_abort = 1;	
			options nosyntaxcheck;
			options obs=0;
			%goto EXIT;
	%end;

	%if &incremental_type = 2 %then
	%do;
	/* If the incremental load type is "pick a new winner", we ignore the current record effective timestamp. */
			%let ignore_key_cols=%nrbquote(')%nrbquote(%sysfunc(tranwrd(&key_cols,%nrbquote( ),%nrbquote(','))))%nrbquote(');
			%dip_ct_prep_cols(ignore_cols=%nrbquote('&record_effective_from',&ignore_key_cols));
			%let record_effective_from_fmt =  %sysfunc(cats(`,&record_effective_from,`));
			%let record_effective_to_fmt =  %sysfunc(cats(`,&record_effective_to,`));
	%end;
	%else
	%do;
		%dip_ct_prep_cols;
	%end;
	%if %eval(&job_rc > 4) %then %goto EXIT; 

	/* Format the effective timestamp columns */
	%let src_effective_col_fmt = %sysfunc(cats(`,&source_effective_col,`));
	%let tgt_effective_col_fmt = %sysfunc(cats(`,&target_effective_col,`));
	
	/* Check if the old table( backup table) and the original table ( ref table) */
	%let oldTableExists = %eval(%sysfunc(exist(&ref_lib..&ref_table.&old_table_suffix, DATA))); 
	%let origTableExists = %eval(%sysfunc(exist(&ref_lib..&ref_table, DATA))); 

	%let orig_table_cnt=0;
	%let old_table_cnt=0;
	%let rollback_stmt=;

	/* Prepare the roll back statement if the old exists and the restore option is checked. */	
	%if %eval(&oldTableExists and &restore_backup) %then
 	%do;
		%let rollback_stmt = %nrbquote(
								execute (
									drop table if exists &ref_schema..&ref_table
								)	
								by &_INPUT0_engine%str(;)		
								execute (
									alter table &ref_schema..&ref_table.&old_table_suffix rename to &ref_schema..&ref_table
								)	
								by &_INPUT0_engine%str(;)			
							);	
			
		/* Get the row count for the old table. */	
		proc sql noprint;
		   select count(1) into:old_table_cnt trimmed 
		   from &ref_lib..&ref_table.&old_table_suffix;
		quit;	
		%rcSet(&sqlrc);
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end;
		


	/* Get the row count for the referecne table( 2nd input table). */
	%if (&origTableExists) %then
 	%do;
		proc sql noprint;
		   select count(1) into:orig_table_cnt trimmed 
		   from &ref_lib..&ref_table;
		quit;
		%rcSet(&sqlrc);
		%if %eval(&job_rc > 4) %then %goto EXIT; 
	%end; 
	
	/* Get the days_to_backfill value from DIP_CONFIG if global value is used.
		Otherwise, use the custom value.*/
	%if %eval(&use_gc_days_backfill) %then
	%do;
		proc sql noprint;
			select value
			into :new_days_to_backfill trimmed 
			from lcf.DIP_CONFIG
			where key="DAYS_TO_BACKFILL";
		quit;
		%rcSet(&sqlrc);
		%if %eval(&job_rc > 4) %then %goto EXIT; 			
	%end;
	%else %let new_days_to_backfill=&days_to_backfill;


	/* Prepare the statement for checking HWM with the days to back fill value. */	
	%if (&new_days_to_backfill = 0) %then 
		%do;
			%let backfill_stmt = %nrbquote(max(&tgt_effective_col_fmt));
		%end;
	%else	
		%do;	
			%let backfill_stmt = %nrbquote(nvl(days_add(max(&tgt_effective_col_fmt),-&new_days_to_backfill),'1400-01-01 00:00:00'));
		%end; 

	/* Prepare vars and statements if it is an initial load. */	
	%if (&old_table_cnt=0 and &orig_table_cnt=0) %then
	%do;
		/* If incremental type is pick a winner, unset the ignored column for initial load. */	
		%if &incremental_type = 2 %then %dip_ct_prep_cols;	
	
		%let create_vars_stmt=;
		%if &where_clause = %str() %then
			%let full_where_clause =;
		%else
			%let full_where_clause = %nrbquote(where &where_clause);
		%let vars=;
	%end;
	/* Prepare vars and statements for incremental loads. */	
	%else %do;
		/* Type 1 */
		%if &incremental_type = 1 %then 
		%do;
			/* Prepare statement for calculating the type 1 HWM. */
			%let create_vars_stmt=%nrbquote(
										with vars as
										(
											select &backfill_stmt as crw_hwm
											from &ref_schema..&ref_table
										)
									);
			/* Prepare the where clause statement and check if any additional crietrial is specified. */
			%if &where_clause = %str() %then
				%let full_where_clause =  %nrbquote(where &src_effective_col_fmt &hwm_operator vars.crw_hwm);
			%else
				%let full_where_clause =  %nrbquote(where &where_clause and &src_effective_col_fmt &hwm_operator vars.crw_hwm);
	
			%let vars=,vars;

		%end;

		/* Type 2 */
		%if &incremental_type = 2 %then 
		%do;
			/* Prepare different statement with / without business timestamps. */
			%let crw_update_ts_stmt = %nrbquote(&src_effective_col_fmt);
			%let check_hwm_stmt = %nrbquote(&src_effective_col_fmt > crw_hwm);
			%if %eval(&has_business_date) %then
			%do;
				%let business_commence_fmt =  %sysfunc(cats(`,&business_commence,`));
				%let crw_update_ts_stmt = %nrbquote(if(&src_effective_col_fmt > crw_hwm, &src_effective_col_fmt,&business_commence_fmt));
				%let check_hwm_stmt = %nrbquote((&src_effective_col_fmt > crw_hwm OR &business_commence_fmt > crw_hwm));
			%end;

			/* Prepare statement for calculating the type 2 HWM. */
			%let create_vars_stmt=%nrbquote(
										with vars as
										(
											select &backfill_stmt as crw_hwm
											from &ref_schema..&ref_table
										)
									);

			/* Prepare the where clause statement for type 2 where clauses. */
			%if &where_clause = %str() %then
				%let full_where_clause =  %nrbquote(where );				
			%else
				%let full_where_clause =  %nrbquote(where &where_clause and );

			%if &where_clause = %str() %then
				%let type2_subquery_where =  ;				
			%else
				%let type2_subquery_where =  %nrbquote(where &where_clause );

		%end;

		/* Type 3 */
		%if &incremental_type = 3 %then 
		%do;

			/* Prepare statement for calculating the type 3 HWM. */
			%let create_vars_stmt=%nrbquote(
										with r as 
										(
											select &key_cols_fmt,
											&backfill_stmt as crw_hwm
											from &ref_schema..&ref_table
											group by &key_cols_fmt
										)
									);		

			/* Prepare the where clause statement for type 3 outter where clause. */
			%if &where_clause = %str() %then
				%let full_where_clause =  %nrbquote(where );				
			%else
				%let full_where_clause =  %nrbquote(where &where_clause and );

		%end;

		/** If the operator is >, there is a potential risk for missing late arrival records at the same hwm timestamp.
			This following check is to ensure all records at the hwm belong to only one batch. **/	
		%if %eval(  &incremental_type = 1 and &hwm_operator=%str(>) and &check_hwm_diff) %then
		%do;

			/* Need to build the where clause for the check. */
			%if &where_clause = %str() %then
			%do;
				%let src_check_where_clause =  %nrbquote(where src.&src_effective_col_fmt = vars.crw_hwm);
			%end;
			%else
			%do;
				%let src_check_where_clause =  %nrbquote(where &where_clause and src.&src_effective_col_fmt = vars.crw_hwm);
			%end;
			%let hwm_cnt_diff=0;
			%let hwn_value=;
			
			/* Now count the total batches at hwm. */
			proc sql;
			   connect to &_INPUT0_engine
			   ( 
			       &_INPUT_connect
			   ); 
			   select
			      batch_count,hwm into :hwm_batch_count trimmed, :hwm_value trimmed
			   from connection to &_INPUT0_engine
			   (
					&create_vars_stmt
					,src as (
						select count(distinct &update_batch_col) as cnt
						from &input_schema..&input_table src &vars
						&src_check_where_clause	
					)
					select cnt as batch_count,cast(vars.crw_hwm as varchar(50)) as hwm from src,vars
				);
				%rcSet(&sqlrc);
				disconnect from &_INPUT0_engine; 
			quit;
			%if %eval(&job_rc > 4) %then %goto EXIT; 	
			
			/* Throw an error if batch count is more than 1. */
			%if %eval(&hwm_batch_count > 1 ) %then
			%do;
					%put ERROR: new records found in the source table at hwm: &hwm_value. (source cc column: &source_effective_col, target cc column: &target_effective_col);
					%let job_rc = 5;
					%let sysrc = 2;
					%let dip_manual_abort = 1;	
					options nosyntaxcheck;
					options obs=0;
					%goto EXIT;
			%end;
		%end;
		/** End: check missing records at hwm. **/
	
	%end;	



	/* Run the final impala query with all statements prepared. */
	proc sql noprint;
	connect to &_INPUT0_engine(&_INPUT_connect);
	execute (
		set buffer_pool_limit=&imp_buffer_limit;
	)	
	by &_INPUT0_engine;	
	&rollback_stmt
	execute (
		drop table if exists &output_schema..&output_table
	)	
	by &_INPUT0_engine;	
	/** Query for Initial Load or Type 1 Incremental */		
	%if (&old_table_cnt=0 and &orig_table_cnt=0) or &incremental_type = 1 %then
	%do;	
		execute (
			create table &output_schema..&output_table stored as parquet
			as
			&create_vars_stmt
			select &mapped_cols_fmt
			from &input_schema..&input_table as src &vars
			&full_where_clause	
		)
		by &_INPUT0_engine;
	%end;
	/** Query for Type 2 Incremental */				
	%else %if &incremental_type = 2 %then 
	%do;
		execute (
			create table &output_schema..&output_table stored as parquet
			as
			with r as (		
				&create_vars_stmt
				select
					&key_cols_fmt,min(&crw_update_ts_stmt) as crw_update_ts
				from &input_schema..&input_table, vars	
				&full_where_clause	
				&check_hwm_stmt
				group by &key_cols_fmt	
		    )			
			select &mapped_cols_fmt,
					&l_key_cols_fmt,
					if(r.crw_update_ts > l.&record_effective_from_fmt,
						r.crw_update_ts ,l.&record_effective_from_fmt) as &record_effective_from_fmt
			from (select * from &input_schema..&input_table &type2_subquery_where) as l, r
			where &key_join and l.&record_effective_to_fmt > r.crw_update_ts
		)
		by &_INPUT0_engine;	
	%end;
	/** Query for Type 3 Incremental */				
	%else %if &incremental_type = 3 %then 
	%do;
		execute (
			create table &output_schema..&output_table stored as parquet
			as
			&create_vars_stmt
			select
				&mapped_cols_fmt
			from &input_schema..&input_table as l
			&full_where_clause	
			exists (
				select 1
				from r
				where &key_join and l.&src_effective_col_fmt > r.crw_hwm
			) 
			union all
			select
				&mapped_cols_fmt
			from &input_schema..&input_table as l
			&full_where_clause	
			not exists (
				select 1
				from r
				where &key_join
			) 
		)
		by &_INPUT0_engine;	
	%end;
	/** Compute Stats. */	
	execute (
		compute stats &output_schema..&output_table
	)	
	by &_INPUT0_engine;	
	disconnect from &_INPUT0_engine;
	quit;

%EXIT: 
%mend ct_impala_filter;
