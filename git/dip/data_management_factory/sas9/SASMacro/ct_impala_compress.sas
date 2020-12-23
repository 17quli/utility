%macro  ct_impala_compress;

/*
Macro used by Custom Transformation "Impala Compress" to compress timelines and deduplicate records if required.

Usage:
This transformation compresses individual timelines of the first input table (which is usually the filtered table).   
The second input table (which is usually your main clean raw table) is used as the reference to 
identify records for the “Records to include” option.

Options: 

Nature Key Columns(key_cols):  Nature Key Columns for compressing timelines (or duplication if required).

Value Columns(value_cols):  Value Columns for compressing timelines.

Effective From Column(effective_from_col):  Effective from column for compressing timelines.

Effective To Column(effective_to_col): Effective To column for compressing timelines.

Time scale(scale): Time scale to calculate effective to column, The default value is Second.  

Records to Include(to_include): Based on the decision made at the filtering step, choose the following for Record to include:
		•	Replace the active partition -> Active Records
		•	Replace the whole table -> All Records

Duplication required(dedup_required): If required, it will perform deduplication before compressing the timelines 

	The following options are available if deduplications is enabled:

	Order Column(order_cols):  Specify the columns to use to order records within the same slice of a key partition in a descending order.   
							In Impala Syntax, it is equivalent to partition by nature key columns and order by order column 1, order columns 2…

	Order Reversed Column(order_reversed_cols):  Specify the order columns to reverse the sorting order.  
							For example. If order column is 1 and 2 and column 2 is set to be reversed, 
							The Impala statement will partition the table by the nature key columns and order by order column 1, order columns 2 des...
							!!!NOTE: Any columns reversed must already exist in the order column list.

	Records to Keep(keep_last):  Specify if you want to keep the first or last record within the same slice of the same partition.
	Rebuild Value Timeline(rebiuld_sk): This is only needed when deduplication is required as each individual SK avlue timeline needs to be rebuild during 
										the incremental load with the changed record ( by end-dating the active record) before the dedup.
										
	Calculate Slice Valid Duration(calc_pvd): This value is calculated with min(effective_to,bs_end) - max(effective_from,bs_start)

	Business Start Date Column(bs_start_col_fmt): The source column for business start / commence date

	Business End Date Column(bs_end_col_fmt): The source column for business end / cease date

	In addition,The insert_object_run_key is included as the last tie breaker by default (highest/newest first).  If no order columns are specified 
	and the target table is empty,the dedup step will not run.
			

Set Low Date(set_low_date): If required, the initial version of a timeline will be set up the default low-date value.
	Default Low Date Value(default_low_date):  The default low date value to be set to.

Set High Date(set_low_date): If required, the last version of a timeline will be set up the default high-date value.
	Default High Date Value(default_high_date):  The default high date value to be set to.

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		1/07/2019


*/

	%local effective_from_col_fmt effective_to_col_fmt origTableExists union_stmt add_stmt active_filter_stmt
	dedup_stmt clp_work_table include_runkey_order orig_table_cnt new_combined serialise_stmt
	first_eff_ts last_eff_ts include_runkey_order_dedup calc_pvd_stmt bs_start_col_fmt bs_end_col_fmt union_bs_dates_stmt
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


	/*Prepare DI column information used in this transformation. */
	%dip_ct_prep_cols(ignore_cols=%nrbquote('record_effective_timestamp','record_expiry_timestamp',
				'record_active_flag','insert_object_run_key','update_object_run_key','number_of_valid_seconds'));


	%if %eval(&job_rc > 4) %then %goto EXIT; 
	
	/*Format effective columns. */	
	%let effective_from_col_fmt = %sysfunc(cats(`,&effective_from_col,`));
	%let effective_to_col_fmt = %sysfunc(cats(`,&effective_to_col,`));


	/*Initialise statement variables. */	
	%let union_stmt=;
	%let active_filter_stmt=;

	/*Set filter based on records to be included. */	
	%if %eval(&to_include = 1) %then %let active_filter_stmt=%nrbquote(where record_active_flag = 'Y');

	/* Check if set low date option is set and use different statement for the first timestamp. */	
	%if %eval(&set_low_date) %then
		%let first_eff_ts = %nrbquote('&default_low_date');
	%else
		%let first_eff_ts = %nrbquote(	first_value(record_effective_timestamp) over (partition by  &key_cols_fmt  
											order by record_effective_timestamp));

	/* Check if set high date option is set and use different statement for the first timestamp. */	
	%if %eval(&set_high_date) %then
		%let last_eff_ts = %nrbquote('&default_high_date');
	%else
		%let last_eff_ts = %nrbquote(record_expiry_timestamp);


	/*Check if the clean raw table exists. */	
	%let origTableExists = %eval(%sysfunc(exist(&ref_lib..&ref_table, DATA))); 
	%if (&origTableExists) %then
 	%do;

		/*Check if the clean raw table exists and prepare the union statement used in the query accordingly */
		%let union_stmt = %nrbquote(
								union all
								select &target_cols_fmt,
										record_effective_timestamp,
										record_expiry_timestamp,
										insert_object_run_key,
										update_object_run_key,
										&value_concat_stmt as val_str
								from &ref_schema..&ref_table		
								&active_filter_stmt		
							);	
		
		
		/*If the table exists, we need to add the insert object run key as part of the partition ordering statement
			Can't include it for the initial load because the column has one value and it is not allowed in the order statement.*/
		
		%let orig_table_cnt=0;
		
		proc sql noprint;
		   select count(1) into:orig_table_cnt trimmed 
		   from &ref_lib..&ref_table
		   where insert_object_run_key <> &dip_object_run_key
		   ;
		quit;
		%rcSet(&sqlrc);
		%if %eval(&job_rc > 4) %then %goto EXIT; 		
	
		%if %eval(&orig_table_cnt > 0) %then
		%do;
			
			%let include_runkey_order = ,insert_object_run_key;
			

			%if &keep_last %then
				%let include_runkey_order_dedup = insert_object_run_key;
			%else
				%let include_runkey_order_dedup = insert_object_run_key desc;

			%if %eval(&order_cols_count) > 0 %then
				%let include_runkey_order_dedup = ,&include_runkey_order_dedup;
				
			/* Unset the default low date value if  */	
			%let first_eff_ts = %nrbquote(	first_value(record_effective_timestamp) over (partition by  &key_cols_fmt  
												order by record_effective_timestamp));

		%end;
		
		/* Unset dedup_required if no order columns are specified and the target table is empty.  */	
		%if %eval(&orig_table_cnt = 0 and &order_cols_count = 0) %then %let dedup_required = 0;
	%end; 
	

	/*Check if dedup is required and prepare the dedup statement used in the query accordingly */
	%if %eval(&dedup_required) %then
	%do;	

		/*set the default combined table alias to combined. */
		%let new_combined=combined;
		
		%if %eval(&rebuild_sk) %then	
		%do;

			/*set the default combined table alias to serialised because dedup now uses the result from serialisation. */
			%let new_combined=serialised;

			/*Check if value serialisation is required and prepare the serialisation statement used in the query accordingly 
			 This statement end dates the active value sk record if a changed record is found.*/
			%let serialise_stmt = %nrbquote(
										serialised as
										(
											select 
												&source_cols_fmt,
												record_effective_timestamp,
												ifnull(&scale.s_add(
															lead(record_effective_timestamp,1) over (partition by  &val_sk_cols_fmt 
																	order by	record_effective_timestamp,record_expiry_timestamp) 
														,-1), record_expiry_timestamp)  record_expiry_timestamp,	
												insert_object_run_key,
												update_object_run_key,
												val_str
											from combined
										),		
									);		
		%end;
	
		/* Prepare statement for calculating business valid duration. */
		%let calc_pvd_stmt = ;
		%let union_bs_dates_stmt = ;
		%if %eval(&calc_pvd) %then
		%do;
			%let bs_start_col_fmt = %sysfunc(cats(`,&bs_start_col,`));
			%let bs_end_col_fmt = %sysfunc(cats(`,&bs_end_col,`));
			%let calc_pvd_stmt = %nrbquote(
										,unix_timestamp(if(l.&bs_end_col_fmt < clpdup_effective_to_ts, l.&bs_end_col_fmt,clpdup_effective_to_ts))- 
										unix_timestamp(if(l.&bs_start_col_fmt > clpdup_effective_from_ts, l.&bs_start_col_fmt,clpdup_effective_from_ts)) as number_of_valid_seconds
									);
			%let union_bs_dates_stmt = %nrbquote(
									union
										select &key_cols_fmt,if(&bs_start_col_fmt<'1800-01-01','1800-01-01',&bs_start_col_fmt)
										from &new_combined
									union
										select &key_cols_fmt,if(&bs_end_col_fmt>'9000-12-31','9000-12-31',&bs_end_col_fmt)
										from &new_combined
									);
		%end;
		 
			


		/* prepare the dedup statement  */
		%let dedup_stmt = %nrbquote(
									/* Run the serialisation statement first if set */
									&serialise_stmt
									/* Extract all effective and expiry timestamps from the input dataset */
									all_dates as
									(
											select &key_cols_fmt,&effective_from_col_fmt
											from &new_combined
											union 
											select &key_cols_fmt,&effective_to_col_fmt
											from &new_combined	
											&union_bs_dates_stmt	
									),
									/* serialise all dates collected */
									all_blocks as
									(
										select &key_cols_fmt,
												&effective_from_col_fmt as clpdup_effective_from_ts,
												case when lead(&effective_from_col_fmt,2) over 
													(partition by &key_cols_fmt order by &effective_from_col_fmt) is not null
												then 
													&scale.s_add(lead(&effective_from_col_fmt,1) over 
													(partition by &key_cols_fmt order by &effective_from_col_fmt),-1)
												else 
													lead(&effective_from_col_fmt,1) over 
													(partition by &key_cols_fmt order by &effective_from_col_fmt)
												end as clpdup_effective_to_ts
										from all_dates
									),
									/* Now join all dates back to the date set to get all possible slices of all the time ranges */
									expanded as
									(
										select l.*,
												clpdup_effective_from_ts,
												clpdup_effective_to_ts
												&calc_pvd_stmt
										from &new_combined l
										inner join all_blocks r on &key_join and &effective_from_col_fmt <= clpdup_effective_from_ts
										and &effective_to_col_fmt >= clpdup_effective_to_ts
										and clpdup_effective_from_ts <> clpdup_effective_to_ts
										and clpdup_effective_to_ts is not null
									),	
									/* Rank them based on the dedup rules defined in the transofrmation. */	
									ranked as
									(
										select *,
										       DENSE_RANK() over 
										       		(partition by &key_cols_fmt,clpdup_effective_from_ts 
										       		order by &order_cols_fmt &include_runkey_order_dedup) as crw_rnk
										from expanded
									),
									/* Keep only the winner for each slice. */
									deduped as(
										select 
											&source_cols_fmt,
											clpdup_effective_from_ts as record_effective_timestamp,
											clpdup_effective_to_ts as record_expiry_timestamp,
 											insert_object_run_key,
											update_object_run_key,
											val_str
										from ranked 
										where crw_rnk = 1 
										/* ignore any future time slices. */
										and clpdup_effective_from_ts < now()
									),		
		);
		/* If dedup is required, the compress step should use the deduped statement output as source. */
		%let clp_work_table=deduped;
	%end;
	/* If dedup is not required, use the original combined table as source. */
	%else %let clp_work_table=combined;
	



	/* Prepare the final query and run it. */
	proc sql noprint;
	connect to &_INPUT0_engine(&_INPUT_connect);
	execute (
		set buffer_pool_limit=&imp_buffer_limit;
	)	
	by &_INPUT0_engine;	
	execute (
		/* Drop the work table if it already exists. */
		drop table if exists &output_schema..&output_table;
	)	
	by &_INPUT0_engine;	
	execute (
		create table &output_schema..&output_table stored as parquet
		as
		with 
		/* Combined the new records with current active records if option is selected. */
		combined as
		(
			select &source_cols_fmt,
					&effective_from_col_fmt as record_effective_timestamp,
					&effective_to_col_fmt as record_expiry_timestamp,
					&dip_object_run_key as insert_object_run_key,
					&dip_object_run_key as update_object_run_key,
					&value_concat_stmt as val_str
			from &input_schema..&input_table
			&union_stmt
		),
		/* Inject the dedup statement if needed. */
		&dedup_stmt
		/* Work out the lead values for compression. */
		leaded as
		(
			select &source_cols_fmt,
				record_effective_timestamp,
				record_expiry_timestamp,
				insert_object_run_key,
				update_object_run_key,	
				/* Lead value string. */
				lead(val_str,1) over (partition by  &key_cols_fmt	
							order by record_effective_timestamp &include_runkey_order) as lead_val,
				/* Lead effective timestamp. */
				lead(record_effective_timestamp,1) over (partition by  &key_cols_fmt 
							order by	record_effective_timestamp) as lead_eff_ts,
				/* Initial version effecrive timestamp. */
				&first_eff_ts as first_eff_ts,
				/* Initial version insert object run key. */
				first_value(insert_object_run_key) over (partition by &key_cols_fmt,val_str 
							order by record_effective_timestamp &include_runkey_order) as first_insert_rk,
				val_str						
			from &clp_work_table 
		),
		/* Remove value duplicates and rebuild the compressed timeline. */
		lagged as
		(
			select &source_cols_fmt,
				record_effective_timestamp,
				record_expiry_timestamp,
				insert_object_run_key,
				update_object_run_key,
				/* Lag Effective timestamp as the current expiry timestamp. */
				lag(lead_eff_ts,1) over (partition by &key_cols_fmt 
							order by record_effective_timestamp) as lag_eff_ts,
				/* Initial version insert object run key. */
				lead(first_insert_rk,1) over (partition by &key_cols_fmt 
							order by record_effective_timestamp &include_runkey_order) as lead_first_insert_rk,
				lead_eff_ts,
				first_eff_ts,
				first_insert_rk,
				lead_val
			from leaded 
			 where val_str <> nvl(lead_val,'^~N-U-L-L$#')
		),
		/* Work out the correct timestamps and auditing values. */
		collapsed as
		(
			select &source_cols_fmt, 		
					ifnull(lag_eff_ts,first_eff_ts) as record_effective_timestamp,
					ifnull(&scale.s_add(lead_eff_ts,-1), &last_eff_ts)  record_expiry_timestamp,	
					first_insert_rk as insert_object_run_key,
					ifnull(lead_first_insert_rk,update_object_run_key ) as update_object_run_key,
					cast(case when lead_val is null and record_expiry_timestamp > now() 
						then 'Y' else 'N' end as char(1)) as record_active_flag			
	    	from lagged
		)
		/* Return the final result table. */
		select &mapped_cols_fmt,
				record_effective_timestamp,
				if(record_expiry_timestamp>'9000-12-31',
					'9000-12-31',record_expiry_timestamp) as record_expiry_timestamp,
				cast(insert_object_run_key as int) as insert_object_run_key,
				cast(update_object_run_key as int) as update_object_run_key,
				record_active_flag
		from collapsed
	  )
	  by &_INPUT0_engine;
	  execute (
		compute stats &output_schema..&output_table
	  )	
	  by &_INPUT0_engine;
	disconnect from &_INPUT0_engine;
	quit;
	

%EXIT: 
%mend ct_impala_compress;
