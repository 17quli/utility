%macro  ct_impala_serialise;


/*

Macro used by Custom Transformation to build a continuous timeline based on the natural key and 
effective from columns specified.   

Usage:
This transformation serialise individual timelines of the first input table.   
The second input table (which is usually main timeline table) is used as the reference to identify 
records for the “Records to include” option.


Options: 

Nature Key Columns(key_cols): This is usually the domain object key column.  
Effective from column(effective_from_col):  The column stored the record effective from timestamp.
Timescale(scale):  This is used in the effective to timestamp calculation.  
			The effective to values are always calculated from the previous effective from value - 1 
			unit of the time scale specified (except for the last record of the partition which uses 
			the value from the upper cut-off date column). 
Lower Cut-off Date(lower_cutoff):  All records below this boundary will be excluded.   Any slices step on the cut-off 
					date will be truncated with the cut-off date for the effective from timestamp.
Upper Cut-off Date(upper_cutoff):  All records above this boundary will be excluded.   Any slices step on the cut-off 
					date will be truncated with the cut-off date for the effective to timestamp.
Records to include(to_include): You should only include active records if the commit type to use is replace partition only.

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		01/07/2019

*/

	%local effective_from_col_fmt  trunc_stmt union_stmt origTableExists active_filter_stmt upper_cutoff_fmt 
			lower_cutoff_fmt imp_buffer_limit;


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
	
	
	%dip_ct_prep_cols(ignore_cols=%nrbquote('record_effective_timestamp','record_expiry_timestamp',
			'record_active_flag','insert_object_run_key','update_object_run_key','lower_cutoff','upper_cutoff'));
	%if %eval(&job_rc > 4) %then %goto EXIT; 
	
	/* Format the columnname with the impala escape char. */
	%let effective_from_col_fmt = %sysfunc(cats(`,&effective_from_col1,`));
	%let upper_cutoff_fmt=%sysfunc(cats(`,&upper_cutoff,`));
	%let lower_cutoff_fmt=%sysfunc(cats(`,&lower_cutoff,`));
	
	/* Prepare the date truncation statement based on the timescale specified.*/
	%let trunc_stmt = %nrbquote(case when date_trunc('&scale',&effective_from_col_fmt) = &effective_from_col_fmt  then &effective_from_col_fmt else &scale.s_add(date_trunc('&scale',&effective_from_col_fmt),1) end);
	%let origTableExists = %eval(%sysfunc(exist(&ref_lib..&ref_table, DATA))); 
	%if %eval(&job_rc > 4) %then %goto EXIT;
	
	%let union_stmt=;
	%let active_filter_stmt=;
	
	/* Prepare this statement if we only include active records. */
	%if %eval(&to_include = 1) %then %let active_filter_stmt=%nrbquote(where record_active_flag = 'Y');

	/* If the ref table exists, prepare the union statement to include records from it. */	
	%if (&origTableExists) %then
		%let union_stmt = %nrbquote(
								union
								select &target_cols_fmt,
										record_effective_timestamp,
										insert_object_run_key,
										update_object_run_key,
										lower_cutoff,
										upper_cutoff
								from &ref_schema..&ref_table		
								&active_filter_stmt		
							);		
	
	proc sql noprint;
	connect to &_INPUT0_engine(&_INPUT_connect);
	execute (
		set buffer_pool_limit=&imp_buffer_limit;
	)	
	by &_INPUT0_engine;	
	/* Drop the target table if exists. */
	execute (
		drop table if exists &output_schema..&output_table
		;
	)
	by &_INPUT0_engine;
	execute (
		create table &output_schema..&output_table stored as parquet
		as
		/* Combine all the effective timestamps for serialisation. */
		with all_dates as
		( 
			select distinct &target_cols_fmt,
	       		case 
	       		/*Replace the effective from timestmap if it steps on the lower cut-off */
	       			when &effective_from_col_fmt < &lower_cutoff_fmt 
	       			then &lower_cutoff_fmt 
	       		/*Otherwise, truncate the value to the scale specified. */
	       			else &trunc_stmt end 
	       		as &effective_from_col_fmt,
             	 &dip_object_run_key as insert_object_run_key,
             	 &dip_object_run_key as update_object_run_key,
             	 &lower_cutoff_fmt as lower_cutoff,
             	 &upper_cutoff_fmt as upper_cutoff
			from &input_schema..&input_table	
			where 
			/* exclude records out of the cut off boundaries */
			&effective_from_col_fmt < &upper_cutoff_fmt 
			and &lower_cutoff_fmt < &upper_cutoff_fmt
			/* include existings records from the ref table for serialisation. 
				Only for incremental loads. */
			&union_stmt
		),
		/*Deduplicate identical effective timestamps on the timeline by ranking them.*/
		dedup_all_dates AS
		(
			select &target_cols_fmt,
	       		 &effective_from_col_fmt,
				insert_object_run_key,
				update_object_run_key,
				lower_cutoff,
				upper_cutoff,
	       		DENSE_RANK() over (partition by &key_cols_fmt,&effective_from_col_fmt order by update_object_run_key desc) as rnk
			from all_dates
		),
		/*Work out the lead record change timestamps and run keys within each partition. */
		end_dates as
		(
			select &target_cols_fmt,
	            &effective_from_col_fmt,
	            insert_object_run_key,	 
	            update_object_run_key,
				lower_cutoff,
				upper_cutoff,
				lead(insert_object_run_key,1) over (partition by &key_cols_fmt order by &effective_from_col_fmt) as runkey_lead_value,
	            lead(&effective_from_col_fmt,1) over (partition by  &key_cols_fmt order by &effective_from_col_fmt) as lead_effective_from
	        from dedup_all_dates
	        where rnk = 1 /*Remove duplicates*/
		),
		/*Now, serialise each partitioned tiemline. */
		timeline as
		(
			select &target_cols_fmt,
            		&effective_from_col_fmt,
           			nvl(&scale.s_add(lead(&effective_from_col_fmt,1) 
           							over (partition by  &key_cols_fmt order by &effective_from_col_fmt),-1)
           					, upper_cutoff) as record_expiry_timestamp,  /* work out the expiry timestamp. */
					insert_object_run_key,  
					case when insert_object_run_key=&dip_object_run_key then insert_object_run_key	/* run key for new records. */
					     when runkey_lead_value is null then update_object_run_key					/* run key for the last record of the partition. */
						else runkey_lead_value end as update_object_run_key,
				lower_cutoff,
				upper_cutoff
      		from end_dates    
      		where &effective_from_col_fmt <> ifnull(&scale.s_add(lead_effective_from,-1),upper_cutoff) /* remove clashing time slices */
		)	
		select &mapped_cols_fmt,
				&effective_from_col_fmt as record_effective_timestamp,
				record_expiry_timestamp,
				cast(insert_object_run_key as int) as insert_object_run_key,
				cast(update_object_run_key as int) as update_object_run_key,
				/* set record_active_flag to Y if expiry timestamp is a future date. */
				cast(case when record_expiry_timestamp > now() then 'Y' else 'N' end as char(1)) as record_active_flag,
				lower_cutoff,
				upper_cutoff
		from timeline;
	  )
	  by &_INPUT0_engine;
	/* compute stats of the target table. */
	execute (
		compute stats &output_schema..&output_table
	)	
	by &_INPUT0_engine;	
	disconnect from &_INPUT0_engine;
	quit;	

%EXIT: %mend ct_impala_serialise;
