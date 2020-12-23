%macro ct_impala_gen_skeys;

/*
Macro used by Custom Transformation "Impala Generate Skeys " to  generate a unique numeric key for each record 
based the composite primary key columns specified of the input source.   It will always look for the maximum number 
in the surrogate key column used in the target table and use the next set of number incrementally.

Usage:
Input: A dateset for which you want to generate a unique numeric id for each record.  
Output: The target table where you want to generate the new id against and append new records to.

Options: 
Primary Key Columns(key_cols):  The columns to uniquely identify a record in the source data set.
Surrogate Key Column(sk_col):  The column in the target table which you want to use to store the new surrogate key value.

@author				Max Wang <yang.wang@ird.govt.nz>
@first written		15/07/2019

*/
	%local sk_col_fmt imp_buffer_limit;


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

	%dip_ct_prep_cols(ignore_cols=%nrbquote('&sk_col1'));
	%if %eval(&job_rc > 4) %then %goto EXIT; 

	%let sk_col_fmt = %sysfunc(cats(`,&sk_col1,`));
	%put &=sk_col_fmt;


	proc sql noprint;
	connect to &_INPUT0_engine(&_INPUT_connect);
	execute (
		set buffer_pool_limit=&imp_buffer_limit;
	)	
	by &_INPUT0_engine;
	/* Create the target table if it doesn't exists.*/
	execute (
		create table if not exists &output_schema..&output_table stored as parquet
		as
		select cast(0 as bigint) as &sk_col_fmt
				,&mapped_cols_fmt
		from &input_schema..&input_table
		limit 0
		;
	  )
	  by &_INPUT0_engine;
	 /* Insert new roles to the sk map table.*/ 
	 execute (	  
	  	 insert into &output_schema..&output_table (&sk_col_fmt,&target_cols_fmt)
	     select
	     	/* New values will be allocated from the next available number of highest value of the existing sk.*/
	         cast(ROW_NUMBER() over (order by &key_cols_fmt) + ref.etl_last_sk as bigint) as &sk_col_fmt
	         ,&target_cols_fmt
	      from
	         (
	         	/* This sub-query works out the new PK values which do not exist in the target table. */
	            select distinct
	               &mapped_cols_fmt
	            from
	               &input_schema..&input_table l
	            where
	               not exists( select 1 from &output_schema..&output_table r where &key_join)
	         ) as main cross join 
	         (
	         	/* This sub-query works out the current highest sk value used in the target table. */
	            select
	               nvl(max(&sk_col_fmt),0) as etl_last_sk
	            from
	               &output_schema..&output_table
	         ) as ref
	        ;
	  )
	  by &_INPUT0_engine;
	/* Compute stats of the target table. */
	execute (
		compute stats &output_schema..&output_table
	)	
	by &_INPUT0_engine;	
	disconnect from &_INPUT0_engine;
	quit;

%EXIT: %mend ct_impala_gen_skeys;	